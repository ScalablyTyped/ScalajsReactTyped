package typingsJapgolly.nivoStream.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoStream.distTypesStreamDotsItemMod.StreamDotsItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StreamDotsItem {
  
  inline def apply(borderColor: String, borderWidth: Double, color: String, size: Double, x: Double, y: Double): Default[js.Object] = {
    val __props = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[StreamDotsItemProps]))
  }
  
  @JSImport("@nivo/stream/dist/types/StreamDotsItem", "StreamDotsItem")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: StreamDotsItemProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
