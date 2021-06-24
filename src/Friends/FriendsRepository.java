package Friends;
import java.util.ArrayList;
import java.util.List;

public class FriendsRepository {
    private List<Friend> repository;

    public FriendsRepository() {
        this.repository = new ArrayList();
    }

    public void addFriend(Friend friend) {
        this.repository.add(friend);
    }

    public void deleteFriend(Friend friend)
    {
        this.repository.remove(friend);
    }

    public List<Friend> getFriend(String query) {
        List<Friend> res = new ArrayList<>();
        repository.forEach(currentFriend -> {
            if(currentFriend.getLives().equals(query) || currentFriend.getName().equals(query)) res.add(currentFriend);
        });
        return res;
    }

    public List<Friend> getAllFriends(){
        return new ArrayList<Friend>(repository);
    }
}