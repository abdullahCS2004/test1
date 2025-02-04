JAVAC = javac
JAVA = java
SRC = Main.java Graph.java
CLASS = Main.class Graph.class

all: $(CLASS)


%.class: %.java
	$(JAVAC) $<


test: $(CLASS)
	$(JAVA) Main

clean:
	rm -f *.class
