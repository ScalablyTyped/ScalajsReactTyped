package typingsJapgolly.wordpressElement.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressElement.buildTypesRawHtmlMod.RawHTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RawHTML {
  
  inline def apply(children: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[RawHTMLProps]))
  }
  
  @JSImport("@wordpress/element", "RawHTML")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RawHTMLProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
