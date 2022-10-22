package typingsJapgolly.reactSyntaxHighlighter.components

import typingsJapgolly.reactSyntaxHighlighter.distEsmDefaultHighlightMod.default
import typingsJapgolly.reactSyntaxHighlighter.mod.SyntaxHighlighterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultHighlight {
  
  inline def apply(children: String | js.Array[String]): SharedBuilder_SyntaxHighlighterProps747756637[default] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_SyntaxHighlighterProps747756637[default](js.Array(this.component, __props.asInstanceOf[SyntaxHighlighterProps]))
  }
  
  @JSImport("react-syntax-highlighter/dist/esm/default-highlight", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SyntaxHighlighterProps): SharedBuilder_SyntaxHighlighterProps747756637[default] = new SharedBuilder_SyntaxHighlighterProps747756637[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
