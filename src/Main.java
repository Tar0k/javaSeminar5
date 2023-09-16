public class Main {
    public static void main(String[] args) {
        var book = new Phonebook();
        book.Add("Smith", 634643);
        book.Add("Wesson", 3425235);
        book.Add("Mauser", 11414215);
        book.Add("Smith", 523532623);
        book.Add("Anderson", 54634643);
        book.Add("Smith", 434232623);
        book.Add("Mauser", 444215);
        book.Print();
    }
}