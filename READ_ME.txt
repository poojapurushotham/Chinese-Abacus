READ-ME
=======

Problem Statement : 
------------------
Add 2 Roman Numerals without converting it to any other Base in the Number System.

Solution:
---------
This application adds 2 Roman Numerals after validating them.

Implementation Steps:
--------------------
1. I have implemented an Abacus using hashmap to store each of the values in the columns of the Abacus. 
The Abacus I have used is as shown in the below image.
https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSxuBga8CvvD6hE-DtfdsEQyn3jmVaVjw5gpKmIBr3jmlfMM4wM
2. RomanNumeralsAdder - Has the driver function to Add 2 numbers by taking in the inputs from user
   Validator - Has the pattern to match to validate the Roman Numeral
   Abacus - Interface for Abacus
   RomanAbacus - Abacus interface implementation by tweaking the methods to work for Roman Numerals
   