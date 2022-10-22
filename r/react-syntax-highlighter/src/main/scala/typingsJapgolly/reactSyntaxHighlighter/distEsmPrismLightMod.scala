package typingsJapgolly.reactSyntaxHighlighter

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSyntaxHighlighter.mod.SyntaxHighlighterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmPrismLightMod {
  
  @JSImport("react-syntax-highlighter/dist/esm/prism-light", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SyntaxHighlighterProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("react-syntax-highlighter/dist/esm/prism-light", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def registerLanguage(name: String, func: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  type SyntaxHighlighter = japgolly.scalajs.react.facade.React.Component[SyntaxHighlighterProps & js.Object, js.Object]
}
