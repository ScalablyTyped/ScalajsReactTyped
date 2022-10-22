package typingsJapgolly.nivoStream.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoStream.distTypesTypesMod.StackTooltipProps
import typingsJapgolly.nivoStream.distTypesTypesMod.StreamSliceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StackTooltip {
  
  inline def apply(slice: StreamSliceData): Default[js.Object] = {
    val __props = js.Dynamic.literal(slice = slice.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[StackTooltipProps]))
  }
  
  @JSImport("@nivo/stream/dist/types/StackTooltip", "StackTooltip")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: StackTooltipProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
