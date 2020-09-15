# Java Übung 8: Einfach verkettete Liste (Linked List)

Java-Klassen und Arrays sind sogenannte Referenz-Datentypen. Das bedeutet, dass im Gegensatz zu primitiven Datentypen wie int, char, byte, etc. der Wert nicht direkt in der Variable gespeichert ist, sondern lediglich die Referenz zum jeweiligen Bereich im Speicher, wo sich das Objekt befindet.

Eine Liste ist ein Container für Objekte desselben Typs und kann im Gegensatz zu Arrays beliebig lang werden. Eine Liste besteht aus einzelnen Elementen, den Knoten (in Englisch "Nodes"). Bei einer einfach verketteten Liste kennt bis auf das letzte Element jeder Knoten seinen Nachfolger, besitzt somit also eine Referenz auf das nächste Objekt. Die Referenz auf den nächsten Knoten wird im "next" - Zeiger gespeichert:



Bei einer leeren Liste beinhaltet der head-Zeiger die Referenz "null", zeigt also auf keinen Knoten.

Deine Mission, solltest du sie annehmen, lautet, eine verkettete Liste zur Speicherung von Strings zu implementieren. Folgende Methoden sollen implementiert werden:
* add(int index, String val) : Fügt einen beliebigen String(-knoten) an eine beliebige Stelle in die Liste ein. Wenn der index größer ist als die Listenlänge, hänge den Knoten an das Ende der Liste.
* append(String val): Hängt einen Stringknoten an das Ende der Liste an.
* remove(String val): Löscht alle Knoten mit dem übergebenen String. Gibt den Wert true (mindestens ein Knoten gelöscht) oder false (kein Knoten gelöscht) zurück.
* remove(int index): Löschte den Knoten mit übergebenen Index (0...n). Gibt den Wert true (mindestens ein Knoten gelöscht) oder false (kein Knoten gelöscht) zurück.
* size(): Gibt die Länge der Liste zurück.
* get(int index): Gibt den String an Position "index" (0...n) in der Liste zurück. Falls der index außerhalb der Range liegt, wird null zurückgegeben
* indexOf(String val): Gibt den Index des ersten gefundenen Knotens mit String "val" zurück. Falls der Striing nicht gefunden wurde, wird -1 ausgegeben.
Verwende die angehängten Java - Klassen als Grundstruktur:

Die Klasse LinkedList ist die Liste selbst und beinhaltet alle oben beschriebenen Methoden zum Modifizieren der Liste. Die Klasse StringElement  repräsentiert die Klasse für die Knoten. Die Klasse TestBed integriert die main - Methode zum Testen deiner verketteten Liste. Ziel ist, dass der String ""Congratulations!!!! Your implementation is correct." ausgegeben wird. Sobald das der Fall ist, ist deine Implementierung richtig.

Hinweis: Es ist ausreichend, wenn du die Datei LinkedList.java abgibst. Die anderen Dateien werden nicht benötigt
