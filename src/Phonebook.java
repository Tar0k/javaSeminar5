import java.util.*;

public class Phonebook {
    HashMap<String, ArrayList<Integer>>  book = new HashMap<>();


    public void Add(String person, Integer phone) {
        ArrayList<Integer> temp;
        if (book.containsKey(person)){
            temp = book.get(person);
            temp.add(phone);
        }
        else {
            temp = new ArrayList<Integer>(Collections.singletonList(phone));
            book.put(person, temp);
        }
    }

    public void Remove(String person) {
        book.remove(person);
    }

    public void Clear() {
        book.clear();
    }

    public void Print() {
        TreeMap<Integer, ArrayList<String>> SortedKeysByLength = new TreeMap<>();

        for (var record : book.entrySet()) {
            ArrayList<String> temp;
            if (SortedKeysByLength.containsKey(record.getValue().size())) {
                temp = SortedKeysByLength.get(record.getValue().size());
                temp.add(record.getKey());
            }
            else {
                temp = new ArrayList<String>(Collections.singletonList(record.getKey()));
            }
            SortedKeysByLength.put(record.getValue().size(), temp);
        }

        System.out.println(SortedKeysByLength.descendingMap());

        for (var keys : SortedKeysByLength.descendingMap().values()) {
            for (var key : keys) {
                System.out.println(key + ": " + book.get(key));
            }
        }

    }

}
