# Expression Problem in Java 8

[![Public Domain](http://i.creativecommons.org/p/zero/1.0/80x15.png)](http://creativecommons.org/publicdomain/zero/1.0/)

This repository contains an implementation of the [expression problem](https://en.wikipedia.org/wiki/Expression_problem)
using Java 8 interfaces as mixins. I'm sure there have been many people doing this already, but my inspiration comes
from the book [The Dart Programming Language](http://www.informit.com/store/dart-programming-language-9780321927705)
by Gilad Bracha.

The ability to add new expression forms and new operations over the expressions without recompiling existing code
and without compromising type safety is shown by structuring the project into Maven modules. This is of course
overkill, but who cares in the Java world? The modules are:

## Core

This module contains these expression forms:

- integer constant
- addition

And these operations:

- evaluation

## Format

This module contains one additional operation:

- formatting

## Multiplication

This module contains one additional expression form:

- multiplication

## Multiplication Format

This module combines the previous modules _Format_ and _Multiplication_.
