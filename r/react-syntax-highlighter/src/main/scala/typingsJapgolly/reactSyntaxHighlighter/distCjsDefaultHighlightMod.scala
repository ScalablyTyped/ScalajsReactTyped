package typingsJapgolly.reactSyntaxHighlighter

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSyntaxHighlighter.mod.SyntaxHighlighterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// esm end
// cjs start
object distCjsDefaultHighlightMod {
  
  @JSImport("react-syntax-highlighter/dist/cjs/default-highlight", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SyntaxHighlighterProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("react-syntax-highlighter/dist/cjs/default-highlight", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-syntax-highlighter/dist/cjs/default-highlight", "default.supportedLanguages")
    @js.native
    def supportedLanguages: js.Array[String] = js.native
    inline def supportedLanguages_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedLanguages")(x.asInstanceOf[js.Any])
  }
  
  type SyntaxHighlighter = japgolly.scalajs.react.facade.React.Component[SyntaxHighlighterProps & js.Object, js.Object]
}
