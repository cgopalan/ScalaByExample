{\rtf1\ansi\ansicpg1252\cocoartf1138\cocoasubrtf470
{\fonttbl\f0\fmodern\fcharset0 Courier-Bold;\f1\fmodern\fcharset0 Courier;}
{\colortbl;\red255\green255\blue255;\red51\green69\blue115;\red49\green133\blue134;\red193\green37\blue55;
}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720

\f0\b\fs24 \cf0 object
\f1\b0  
\f0\b \cf2 TailRecursiveFactorial
\f1\b0 \cf0  
\f0\b \{
\f1\b0 \
\'a0\'a0\'a0
\f0\b def
\f1\b0  factorial
\f0\b (
\f1\b0 n
\f0\b :
\f1\b0  
\f0\b \cf2 Int\cf0 ,
\f1\b0  product
\f0\b :
\f1\b0  
\f0\b \cf2 Int\cf0 ):
\f1\b0  
\f0\b \cf2 Int
\f1\b0 \cf0  
\f0\b =
\f1\b0  \
\'a0\'a0\'a0\'a0\'a0\'a0
\f0\b if
\f1\b0  
\f0\b (
\f1\b0 n 
\f0\b ==
\f1\b0  \cf3 1
\f0\b \cf0 )
\f1\b0  product 
\f0\b else
\f1\b0  factorial
\f0\b (
\f1\b0 n 
\f0\b -
\f1\b0  \cf3 1
\f0\b \cf0 ,
\f1\b0  n 
\f0\b *
\f1\b0  product
\f0\b )
\f1\b0 \
\'a0\'a0\'a0\
\'a0\'a0\'a0
\f0\b def
\f1\b0  main
\f0\b (
\f1\b0 args
\f0\b :
\f1\b0  
\f0\b \cf2 Array\cf0 [\cf2 String\cf0 ])
\f1\b0  
\f0\b \{
\f1\b0 \
\'a0\'a0\'a0println
\f0\b (
\f1\b0 \cf4 "Factorial of 8 is: "\cf0  
\f0\b +
\f1\b0  factorial
\f0\b (
\f1\b0 \cf3 8
\f0\b \cf0 ,
\f1\b0 \cf3 1
\f0\b \cf0 ))
\f1\b0 \
\'a0\'a0\'a0
\f0\b \}
\f1\b0 \

\f0\b \}}