package typingsJapgolly.mjmlReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.mjmlReact.anon.Html
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlHtml {
  
  inline def apply(html: String): Builder = {
    val __props = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Html]))
  }
  
  @JSImport("mjml-react/extensions", "MjmlHtml")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.mjmlReact.extensionsMod.MjmlHtml] {
    
    inline def tag(value: String): this.type = set("tag", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Html): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
