package typingsJapgolly.reactSyntaxHighlighter.components

import typingsJapgolly.reactSyntaxHighlighter.mod.SyntaxHighlighterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Prism {
  
  inline def apply(children: String | js.Array[String]): SharedBuilder_SyntaxHighlighterProps747756637[typingsJapgolly.reactSyntaxHighlighter.mod.Prism] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_SyntaxHighlighterProps747756637[typingsJapgolly.reactSyntaxHighlighter.mod.Prism](js.Array(this.component, __props.asInstanceOf[SyntaxHighlighterProps]))
  }
  
  @JSImport("react-syntax-highlighter", "Prism")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SyntaxHighlighterProps): SharedBuilder_SyntaxHighlighterProps747756637[typingsJapgolly.reactSyntaxHighlighter.mod.Prism] = new SharedBuilder_SyntaxHighlighterProps747756637[typingsJapgolly.reactSyntaxHighlighter.mod.Prism](js.Array(this.component, p.asInstanceOf[js.Any]))
}
