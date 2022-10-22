package typingsJapgolly.cheerio

import typingsJapgolly.cheerio.libCheerioMod.Cheerio
import typingsJapgolly.domhandler.libNodeMod.AnyNode
import typingsJapgolly.std.Uppercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  type AcceptedElems[T /* <: AnyNode */] = BasicAcceptedElems[T] | (js.ThisFunction2[/* this */ T, /* i */ Double, /* el */ T, BasicAcceptedElems[T]])
  
  type AcceptedFilters[T] = String | FilterFunction[T] | T | Cheerio[T]
  
  type AlphaNumeric = LowercaseLetters | Uppercase[LowercaseLetters] | (/* template literal string: ${number} */ String)
  
  type BasicAcceptedElems[T /* <: AnyNode */] = Cheerio[T] | js.Array[T] | T | String
  
  type FilterFunction[T] = js.ThisFunction2[/* this */ T, /* i */ Double, /* el */ T, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cheerio.cheerioStrings.a
    - typingsJapgolly.cheerio.cheerioStrings.b
    - typingsJapgolly.cheerio.cheerioStrings.c
    - typingsJapgolly.cheerio.cheerioStrings.d
    - typingsJapgolly.cheerio.cheerioStrings.e
    - typingsJapgolly.cheerio.cheerioStrings.f
    - typingsJapgolly.cheerio.cheerioStrings.g
    - typingsJapgolly.cheerio.cheerioStrings.h
    - typingsJapgolly.cheerio.cheerioStrings.i
    - typingsJapgolly.cheerio.cheerioStrings.j
    - typingsJapgolly.cheerio.cheerioStrings.k
    - typingsJapgolly.cheerio.cheerioStrings.l
    - typingsJapgolly.cheerio.cheerioStrings.m
    - typingsJapgolly.cheerio.cheerioStrings.n
    - typingsJapgolly.cheerio.cheerioStrings.o
    - typingsJapgolly.cheerio.cheerioStrings.p
    - typingsJapgolly.cheerio.cheerioStrings.q
    - typingsJapgolly.cheerio.cheerioStrings.r
    - typingsJapgolly.cheerio.cheerioStrings.s
    - typingsJapgolly.cheerio.cheerioStrings.t
    - typingsJapgolly.cheerio.cheerioStrings.u
    - typingsJapgolly.cheerio.cheerioStrings.v
    - typingsJapgolly.cheerio.cheerioStrings.w
    - typingsJapgolly.cheerio.cheerioStrings.x
    - typingsJapgolly.cheerio.cheerioStrings.y
    - typingsJapgolly.cheerio.cheerioStrings.z
  */
  trait LowercaseLetters extends StObject
  object LowercaseLetters {
    
    inline def a: typingsJapgolly.cheerio.cheerioStrings.a = "a".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.a]
    
    inline def b: typingsJapgolly.cheerio.cheerioStrings.b = "b".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.b]
    
    inline def c: typingsJapgolly.cheerio.cheerioStrings.c = "c".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.c]
    
    inline def d: typingsJapgolly.cheerio.cheerioStrings.d = "d".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.d]
    
    inline def e: typingsJapgolly.cheerio.cheerioStrings.e = "e".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.e]
    
    inline def f: typingsJapgolly.cheerio.cheerioStrings.f = "f".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.f]
    
    inline def g: typingsJapgolly.cheerio.cheerioStrings.g = "g".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.g]
    
    inline def h: typingsJapgolly.cheerio.cheerioStrings.h = "h".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.h]
    
    inline def i: typingsJapgolly.cheerio.cheerioStrings.i = "i".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.i]
    
    inline def j: typingsJapgolly.cheerio.cheerioStrings.j = "j".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.j]
    
    inline def k: typingsJapgolly.cheerio.cheerioStrings.k = "k".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.k]
    
    inline def l: typingsJapgolly.cheerio.cheerioStrings.l = "l".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.l]
    
    inline def m: typingsJapgolly.cheerio.cheerioStrings.m = "m".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.m]
    
    inline def n: typingsJapgolly.cheerio.cheerioStrings.n = "n".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.n]
    
    inline def o: typingsJapgolly.cheerio.cheerioStrings.o = "o".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.o]
    
    inline def p: typingsJapgolly.cheerio.cheerioStrings.p = "p".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.p]
    
    inline def q: typingsJapgolly.cheerio.cheerioStrings.q = "q".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.q]
    
    inline def r: typingsJapgolly.cheerio.cheerioStrings.r = "r".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.r]
    
    inline def s: typingsJapgolly.cheerio.cheerioStrings.s = "s".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.s]
    
    inline def t: typingsJapgolly.cheerio.cheerioStrings.t = "t".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.t]
    
    inline def u: typingsJapgolly.cheerio.cheerioStrings.u = "u".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.u]
    
    inline def v: typingsJapgolly.cheerio.cheerioStrings.v = "v".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.v]
    
    inline def w: typingsJapgolly.cheerio.cheerioStrings.w = "w".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.w]
    
    inline def x: typingsJapgolly.cheerio.cheerioStrings.x = "x".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.x]
    
    inline def y: typingsJapgolly.cheerio.cheerioStrings.y = "y".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.y]
    
    inline def z: typingsJapgolly.cheerio.cheerioStrings.z = "z".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.z]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cheerio.cheerioStrings.Dot
    - typingsJapgolly.cheerio.cheerioStrings.Numbersign
    - typingsJapgolly.cheerio.cheerioStrings.Colon
    - typingsJapgolly.cheerio.cheerioStrings.Verticalline
    - typingsJapgolly.cheerio.cheerioStrings.Greaterthansign
    - typingsJapgolly.cheerio.cheerioStrings.Plussign
    - typingsJapgolly.cheerio.cheerioStrings.Tilde
    - typingsJapgolly.cheerio.cheerioStrings.`[`
  */
  trait SelectorSpecial extends StObject
  object SelectorSpecial {
    
    inline def Colon: typingsJapgolly.cheerio.cheerioStrings.Colon = ":".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.Colon]
    
    inline def Dot: typingsJapgolly.cheerio.cheerioStrings.Dot = ".".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.Dot]
    
    inline def Greaterthansign: typingsJapgolly.cheerio.cheerioStrings.Greaterthansign = ">".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.Greaterthansign]
    
    inline def Numbersign: typingsJapgolly.cheerio.cheerioStrings.Numbersign = "#".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.Numbersign]
    
    inline def Plussign: typingsJapgolly.cheerio.cheerioStrings.Plussign = "+".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.Plussign]
    
    inline def Tilde: typingsJapgolly.cheerio.cheerioStrings.Tilde = "~".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.Tilde]
    
    inline def Verticalline: typingsJapgolly.cheerio.cheerioStrings.Verticalline = "|".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.Verticalline]
    
    inline def `[`: typingsJapgolly.cheerio.cheerioStrings.`[` = "[".asInstanceOf[typingsJapgolly.cheerio.cheerioStrings.`[`]
  }
  
  type SelectorType = /* template literal string: ${SelectorSpecial}${AlphaNumeric}${string} */ String
}
