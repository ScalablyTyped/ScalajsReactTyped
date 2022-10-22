package typingsJapgolly.nearley

import typingsJapgolly.nearley.mod.CompiledRules
import typingsJapgolly.nearley.mod.ParserOptions
import typingsJapgolly.nearley.mod.Postprocessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object nearley {
    
    @JSGlobal("nearley.Grammar")
    @js.native
    open class Grammar protected ()
      extends typingsJapgolly.nearley.mod.Grammar {
      def this(rules: js.Array[typingsJapgolly.nearley.mod.Rule]) = this()
    }
    /* static members */
    object Grammar {
      
      @JSGlobal("nearley.Grammar")
      @js.native
      val ^ : js.Any = js.native
      
      inline def fromCompiled(rules: CompiledRules): typingsJapgolly.nearley.mod.Grammar = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCompiled")(rules.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nearley.mod.Grammar]
    }
    
    @JSGlobal("nearley.Parser")
    @js.native
    open class Parser protected ()
      extends typingsJapgolly.nearley.mod.Parser {
      def this(grammar: typingsJapgolly.nearley.mod.Grammar) = this()
      def this(grammar: typingsJapgolly.nearley.mod.Grammar, options: ParserOptions) = this()
    }
    /* static members */
    object Parser {
      
      @JSGlobal("nearley.Parser")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Reserved token for indicating a parse fail.
        */
      @JSGlobal("nearley.Parser.fail")
      @js.native
      def fail: js.Object = js.native
      inline def fail_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fail")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("nearley.Rule")
    @js.native
    open class Rule protected ()
      extends typingsJapgolly.nearley.mod.Rule {
      def this(name: String, symbols: js.Array[Any]) = this()
      def this(name: String, symbols: js.Array[Any], postprocess: Postprocessor) = this()
    }
    /* static members */
    object Rule {
      
      @JSGlobal("nearley.Rule")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("nearley.Rule.highestId")
      @js.native
      def highestId: Double = js.native
      inline def highestId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highestId")(x.asInstanceOf[js.Any])
    }
  }
}
