package typingsJapgolly.prismReactRenderer.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.prismReactRenderer.mod.HighlightProps
import typingsJapgolly.prismReactRenderer.mod.Language
import typingsJapgolly.prismReactRenderer.mod.PrismLib
import typingsJapgolly.prismReactRenderer.mod.PrismTheme
import typingsJapgolly.prismReactRenderer.mod.RenderProps
import typingsJapgolly.prismReactRenderer.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PrismReactRenderer {
  
  inline def apply(Prism: PrismLib, children: RenderProps => Node, code: String, language: Language): Builder = {
    val __props = js.Dynamic.literal(Prism = Prism.asInstanceOf[js.Any], children = js.Any.fromFunction1(children), code = code.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HighlightProps]))
  }
  
  @JSImport("prism-react-renderer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def theme(value: PrismTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HighlightProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
