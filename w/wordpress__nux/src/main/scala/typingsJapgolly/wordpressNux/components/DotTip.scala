package typingsJapgolly.wordpressNux.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressNux.componentsDotTipMod.DotTip.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DotTip {
  
  inline def apply(tipId: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(tipId = tipId.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/nux", "DotTip")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
