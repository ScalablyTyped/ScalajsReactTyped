package typingsJapgolly.htmlhint

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.htmlhint.mod.HTMLHintCore
import typingsJapgolly.htmlhint.typesMod.Rule
import typingsJapgolly.htmlhint.typesMod.Ruleset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object HTMLHint {
    
    @JSGlobal("HTMLHint.HTMLHint")
    @js.native
    val HTMLHint: HTMLHintCore = js.native
    
    @JSGlobal("HTMLHint.HTMLParser")
    @js.native
    open class HTMLParser ()
      extends typingsJapgolly.htmlhint.mod.HTMLParser
    
    object HTMLRules extends Shortcut {
      
      @JSGlobal("HTMLHint.HTMLRules.default")
      @js.native
      val default: js.Array[Rule] = js.native
      
      type _To = js.Array[Rule]
      
      /* This means you don't have to write `default`, but can instead just say `HTMLRules.foo` */
      override def _to: js.Array[Rule] = default
    }
    
    @JSGlobal("HTMLHint.Reporter")
    @js.native
    open class Reporter protected ()
      extends typingsJapgolly.htmlhint.mod.Reporter {
      def this(html: String, ruleset: Ruleset) = this()
    }
  }
}
