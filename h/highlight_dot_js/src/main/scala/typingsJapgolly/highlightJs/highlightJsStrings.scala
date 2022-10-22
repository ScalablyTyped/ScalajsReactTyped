package typingsJapgolly.highlightJs

import typingsJapgolly.highlightJs.mod.PluginEvent
import typingsJapgolly.highlightJs.privateMod.MatchType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightJsStrings {
  
  @js.native
  sealed trait afterColonhighlight
    extends StObject
       with PluginEvent
  inline def afterColonhighlight: afterColonhighlight = "after:highlight".asInstanceOf[afterColonhighlight]
  
  @js.native
  sealed trait afterColonhighlightBlock
    extends StObject
       with PluginEvent
  inline def afterColonhighlightBlock: afterColonhighlightBlock = "after:highlightBlock".asInstanceOf[afterColonhighlightBlock]
  
  @js.native
  sealed trait afterColonhighlightElement
    extends StObject
       with PluginEvent
  inline def afterColonhighlightElement: afterColonhighlightElement = "after:highlightElement".asInstanceOf[afterColonhighlightElement]
  
  @js.native
  sealed trait beforeColonhighlight
    extends StObject
       with PluginEvent
  inline def beforeColonhighlight: beforeColonhighlight = "before:highlight".asInstanceOf[beforeColonhighlight]
  
  @js.native
  sealed trait beforeColonhighlightBlock
    extends StObject
       with PluginEvent
  inline def beforeColonhighlightBlock: beforeColonhighlightBlock = "before:highlightBlock".asInstanceOf[beforeColonhighlightBlock]
  
  @js.native
  sealed trait beforeColonhighlightElement
    extends StObject
       with PluginEvent
  inline def beforeColonhighlightElement: beforeColonhighlightElement = "before:highlightElement".asInstanceOf[beforeColonhighlightElement]
  
  @js.native
  sealed trait begin
    extends StObject
       with MatchType
  inline def begin: begin = "begin".asInstanceOf[begin]
  
  @js.native
  sealed trait end
    extends StObject
       with MatchType
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait illegal
    extends StObject
       with MatchType
  inline def illegal: illegal = "illegal".asInstanceOf[illegal]
  
  @js.native
  sealed trait second_best extends StObject
  inline def second_best: second_best = "second_best".asInstanceOf[second_best]
  
  @js.native
  sealed trait self extends StObject
  inline def self: self = "self".asInstanceOf[self]
}
