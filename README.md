# 4Clojure solutions

Zenius attempts to 4clojure.com problems, Use expectations from jayfields to make the workflow 
smoother. 

## Usage

All codes are based in test/forclojure. Add a directory of your own in that directory based on
your 4clojure username. Thus namespacing every file you make under that directory.

example of ns form 

	(ns forclojure.squest.f172
    	    (:use [expectations]))

Example of test-case usage

4Clojure style:

	 (= 3 (+ 1 2))

	 (= 12 (square 3))

Change this to 

       (expect 3 (+ 1 2))

       (expect 12 (square 4))

## Typical workflow

+ Create a file in your folder and namespacing it according to the rules
+ Copy-paste 4clojure test cases to the file
+ Replace "__" with the function name you create for that particular problem (or simply name your function __)
+ Replace "=" with "expect"
+ and you're good to go...

## Helping others with the chores

+ You might as well create a file in resources directory, and fill it with copased test-cases for a particular problem :)
+ Or perhaps find the gist for that problem

## Running the test cases

From project folder, run "lein expectations"

## Caveat

We're in this together, one made a mistake the failure/error will be shown to all :)

## License

Copyright © 2014 Clojurist-wannabes at Zenius Education

Distributed under the Eclipse Public License v 1.0 same as clojure & 4clojure.
