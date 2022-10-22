package typingsJapgolly.markdownToJsx.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.markdownToJsx.anon.Dictkey
import typingsJapgolly.markdownToJsx.mod.MarkdownToJSX.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MarkdownToJsx {
  
  inline def apply(children: String): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Dictkey]))
  }
  
  @JSImport("markdown-to-jsx", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def options(value: Options): this.type = set("options", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Dictkey): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
