package typingsJapgolly.reactSyntaxHighlighter

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSyntaxHighlighter.mod.SyntaxHighlighterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-syntax-highlighter/dist/cjs/prism-async-light", JSImport.Namespace)
@js.native
object prismAsyncLightMod extends js.Object {
  @js.native
  class default ()
    extends Component[SyntaxHighlighterProps, js.Object, js.Any]
  
  /* static members */
  @js.native
  object default extends js.Object {
    def registerLanguage(name: String, func: js.Any): Unit = js.native
  }
  
  type SyntaxHighlighter = japgolly.scalajs.react.raw.React.Component[SyntaxHighlighterProps with js.Object, js.Object]
}

