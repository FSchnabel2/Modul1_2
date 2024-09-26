Hier werden alle Klassen dieses Programms analysiert.
# App
1. Es wird ein Medienbibliothek-Objekt erzeugt, ein VHS, ein Cartridge und ein Buch.
2. Alle werden zur Medienbibliothek hinzugefügt
3. Zum Schluss werden zuerst alle Medien der Medienbibliothek ausgegeben, dann alle VHS der Medienbibliothek ausgegeben.

# Buch
1. Die Klasse Buch erbt von Medium.
2. Sie hat ein Datenfeld isbn, einen Konstruktor mit super-Aufruf
3. Sie hat eine Getter- und eine Setter-Methode. 
4. Dann überschreibt sie noch die Methode anzeigen(). Diese gibt des isbn aus.

# Cartridge
1. Die Klasse Cartridge hat drei Datenfelder (vollstaendigesSet, entwicklerstudio, konsole), einen Konstruktor mit 6 Parameter und Mutterklassenaufruf.
2. Dann hat sie jeweils 3 Getter und Setter, eine isVollstaendigesSet die boolean zurückgibt.
3. Sie überschreibt ebenfalls die Methode anzeigen().