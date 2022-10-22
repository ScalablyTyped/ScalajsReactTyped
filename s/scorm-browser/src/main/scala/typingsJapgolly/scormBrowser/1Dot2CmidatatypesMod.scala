package typingsJapgolly.scormBrowser

import typingsJapgolly.scormBrowser.scormBrowserStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `1Dot2CmidatatypesMod` {
  
  type CMIBlank = _empty
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.scormBrowser.scormBrowserStrings.`true`
    - typingsJapgolly.scormBrowser.scormBrowserStrings.`false`
  */
  trait CMIBoolean extends StObject
  object CMIBoolean {
    
    inline def `false`: typingsJapgolly.scormBrowser.scormBrowserStrings.`false` = "false".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.`false`]
    
    inline def `true`: typingsJapgolly.scormBrowser.scormBrowserStrings.`true` = "true".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.`true`]
  }
  
  type CMIDecimal = /* template literal string: ${string} */ String
  
  type CMIFeedback = CMIFeedbackTrueFalse | CMIFeedbackChoice | CMIFeedbackFillIn | CMIFeedbackNumeric | CMIFeedbackLikert | CMIFeedbackMatching | CMIFeedbackPerformance
  
  type CMIFeedbackChoice = /* template literal string: {${string}} */ String
  
  type CMIFeedbackFillIn = String
  
  type CMIFeedbackLikert = Char
  
  type CMIFeedbackMatching = /* template literal string: {${string}} */ String
  
  type CMIFeedbackNumeric = CMIDecimal
  
  type CMIFeedbackPerformance = String
  
  type CMIFeedbackSequencing = String
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.scormBrowser.scormBrowserStrings.`0`
    - typingsJapgolly.scormBrowser.scormBrowserStrings.`1`
    - typingsJapgolly.scormBrowser.scormBrowserStrings.t
    - typingsJapgolly.scormBrowser.scormBrowserStrings.f
  */
  trait CMIFeedbackTrueFalse extends StObject
  object CMIFeedbackTrueFalse {
    
    inline def `0`: typingsJapgolly.scormBrowser.scormBrowserStrings.`0` = "0".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.`0`]
    
    inline def `1`: typingsJapgolly.scormBrowser.scormBrowserStrings.`1` = "1".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.`1`]
    
    inline def f: typingsJapgolly.scormBrowser.scormBrowserStrings.f = "f".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.f]
    
    inline def t: typingsJapgolly.scormBrowser.scormBrowserStrings.t = "t".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.t]
  }
  
  type CMIIdentifier = String
  
  type CMIInteger = String
  
  type CMISInteger = String
  
  type CMIString255 = String
  
  type CMIString4096 = String
  
  type CMITime = /* template literal string: ${string}:${string}:${string} */ String
  
  type CMITimeSpan = /* template literal string: ${string}:${string}:${string} */ String
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.scormBrowser.scormBrowserStrings.`0`
    - typingsJapgolly.scormBrowser.scormBrowserStrings.`1`
    - typingsJapgolly.scormBrowser.scormBrowserStrings.`2`
    - typingsJapgolly.scormBrowser.scormBrowserStrings.`3`
    - typingsJapgolly.scormBrowser.scormBrowserStrings.`4`
    - typingsJapgolly.scormBrowser.scormBrowserStrings.`5`
    - typingsJapgolly.scormBrowser.scormBrowserStrings.`6`
    - typingsJapgolly.scormBrowser.scormBrowserStrings.`7`
    - typingsJapgolly.scormBrowser.scormBrowserStrings.`8`
    - typingsJapgolly.scormBrowser.scormBrowserStrings.`9`
    - typingsJapgolly.scormBrowser.scormBrowserStrings.a
    - typingsJapgolly.scormBrowser.scormBrowserStrings.b
    - typingsJapgolly.scormBrowser.scormBrowserStrings.c
    - typingsJapgolly.scormBrowser.scormBrowserStrings.d
    - typingsJapgolly.scormBrowser.scormBrowserStrings.e
    - typingsJapgolly.scormBrowser.scormBrowserStrings.f
    - typingsJapgolly.scormBrowser.scormBrowserStrings.g
    - typingsJapgolly.scormBrowser.scormBrowserStrings.h
    - typingsJapgolly.scormBrowser.scormBrowserStrings.i
    - typingsJapgolly.scormBrowser.scormBrowserStrings.j
    - typingsJapgolly.scormBrowser.scormBrowserStrings.k
    - typingsJapgolly.scormBrowser.scormBrowserStrings.l
    - typingsJapgolly.scormBrowser.scormBrowserStrings.m
    - typingsJapgolly.scormBrowser.scormBrowserStrings.n
    - typingsJapgolly.scormBrowser.scormBrowserStrings.o
    - typingsJapgolly.scormBrowser.scormBrowserStrings.p
    - typingsJapgolly.scormBrowser.scormBrowserStrings.q
    - typingsJapgolly.scormBrowser.scormBrowserStrings.r
    - typingsJapgolly.scormBrowser.scormBrowserStrings.s
    - typingsJapgolly.scormBrowser.scormBrowserStrings.t
    - typingsJapgolly.scormBrowser.scormBrowserStrings.u
    - typingsJapgolly.scormBrowser.scormBrowserStrings.v
    - typingsJapgolly.scormBrowser.scormBrowserStrings.w
    - typingsJapgolly.scormBrowser.scormBrowserStrings.x
    - typingsJapgolly.scormBrowser.scormBrowserStrings.y
    - typingsJapgolly.scormBrowser.scormBrowserStrings.z
  */
  trait Char extends StObject
  object Char {
    
    inline def `0`: typingsJapgolly.scormBrowser.scormBrowserStrings.`0` = "0".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.`0`]
    
    inline def `1`: typingsJapgolly.scormBrowser.scormBrowserStrings.`1` = "1".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.`1`]
    
    inline def `2`: typingsJapgolly.scormBrowser.scormBrowserStrings.`2` = "2".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.`2`]
    
    inline def `3`: typingsJapgolly.scormBrowser.scormBrowserStrings.`3` = "3".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.`3`]
    
    inline def `4`: typingsJapgolly.scormBrowser.scormBrowserStrings.`4` = "4".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.`4`]
    
    inline def `5`: typingsJapgolly.scormBrowser.scormBrowserStrings.`5` = "5".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.`5`]
    
    inline def `6`: typingsJapgolly.scormBrowser.scormBrowserStrings.`6` = "6".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.`6`]
    
    inline def `7`: typingsJapgolly.scormBrowser.scormBrowserStrings.`7` = "7".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.`7`]
    
    inline def `8`: typingsJapgolly.scormBrowser.scormBrowserStrings.`8` = "8".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.`8`]
    
    inline def `9`: typingsJapgolly.scormBrowser.scormBrowserStrings.`9` = "9".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.`9`]
    
    inline def a: typingsJapgolly.scormBrowser.scormBrowserStrings.a = "a".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.a]
    
    inline def b: typingsJapgolly.scormBrowser.scormBrowserStrings.b = "b".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.b]
    
    inline def c: typingsJapgolly.scormBrowser.scormBrowserStrings.c = "c".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.c]
    
    inline def d: typingsJapgolly.scormBrowser.scormBrowserStrings.d = "d".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.d]
    
    inline def e: typingsJapgolly.scormBrowser.scormBrowserStrings.e = "e".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.e]
    
    inline def f: typingsJapgolly.scormBrowser.scormBrowserStrings.f = "f".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.f]
    
    inline def g: typingsJapgolly.scormBrowser.scormBrowserStrings.g = "g".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.g]
    
    inline def h: typingsJapgolly.scormBrowser.scormBrowserStrings.h = "h".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.h]
    
    inline def i: typingsJapgolly.scormBrowser.scormBrowserStrings.i = "i".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.i]
    
    inline def j: typingsJapgolly.scormBrowser.scormBrowserStrings.j = "j".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.j]
    
    inline def k: typingsJapgolly.scormBrowser.scormBrowserStrings.k = "k".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.k]
    
    inline def l: typingsJapgolly.scormBrowser.scormBrowserStrings.l = "l".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.l]
    
    inline def m: typingsJapgolly.scormBrowser.scormBrowserStrings.m = "m".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.m]
    
    inline def n: typingsJapgolly.scormBrowser.scormBrowserStrings.n = "n".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.n]
    
    inline def o: typingsJapgolly.scormBrowser.scormBrowserStrings.o = "o".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.o]
    
    inline def p: typingsJapgolly.scormBrowser.scormBrowserStrings.p = "p".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.p]
    
    inline def q: typingsJapgolly.scormBrowser.scormBrowserStrings.q = "q".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.q]
    
    inline def r: typingsJapgolly.scormBrowser.scormBrowserStrings.r = "r".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.r]
    
    inline def s: typingsJapgolly.scormBrowser.scormBrowserStrings.s = "s".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.s]
    
    inline def t: typingsJapgolly.scormBrowser.scormBrowserStrings.t = "t".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.t]
    
    inline def u: typingsJapgolly.scormBrowser.scormBrowserStrings.u = "u".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.u]
    
    inline def v: typingsJapgolly.scormBrowser.scormBrowserStrings.v = "v".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.v]
    
    inline def w: typingsJapgolly.scormBrowser.scormBrowserStrings.w = "w".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.w]
    
    inline def x: typingsJapgolly.scormBrowser.scormBrowserStrings.x = "x".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.x]
    
    inline def y: typingsJapgolly.scormBrowser.scormBrowserStrings.y = "y".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.y]
    
    inline def z: typingsJapgolly.scormBrowser.scormBrowserStrings.z = "z".asInstanceOf[typingsJapgolly.scormBrowser.scormBrowserStrings.z]
  }
}
