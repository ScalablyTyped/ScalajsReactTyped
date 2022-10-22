package typingsJapgolly.pegjs

import typingsJapgolly.pegjs.mod.OutputFormatAmdCommonjs
import typingsJapgolly.pegjs.mod.OutputFormatBare
import typingsJapgolly.pegjs.mod.OutputFormatGlobals
import typingsJapgolly.pegjs.mod.OutputFormatUmd
import typingsJapgolly.pegjs.mod.ParserBuildOptions
import typingsJapgolly.pegjs.mod.Parser_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object PEG {
    
    @JSGlobal("PEG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("PEG.GrammarError")
    @js.native
    def GrammarError: Any = js.native
    inline def GrammarError_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GrammarError")(x.asInstanceOf[js.Any])
    
    inline def generate(grammar: String): Parser_ = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(grammar.asInstanceOf[js.Any]).asInstanceOf[Parser_]
    inline def generate(grammar: String, options: OutputFormatAmdCommonjs): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(grammar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generate(grammar: String, options: OutputFormatBare): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(grammar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generate(grammar: String, options: OutputFormatGlobals): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(grammar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generate(grammar: String, options: OutputFormatUmd): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(grammar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def generate(grammar: String, options: ParserBuildOptions): Parser_ = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(grammar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser_]
    
    object parser {
      
      @JSGlobal("PEG.parser")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("PEG.parser.SyntaxError")
      @js.native
      def SyntaxError: Any = js.native
      inline def SyntaxError_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SyntaxError")(x.asInstanceOf[js.Any])
    }
  }
}
