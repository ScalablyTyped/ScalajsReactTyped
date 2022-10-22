package typingsJapgolly.nivoCirclePacking.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.ComputedDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CirclePackingTooltip {
  
  inline def apply[RawDatum](
    color: String,
    data: RawDatum,
    depth: Double,
    formattedValue: String,
    height: Double,
    id: String,
    path: js.Array[String],
    percentage: Double,
    radius: Double,
    value: Double,
    x: Double,
    y: Double
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[ComputedDatum[RawDatum]]))
  }
  
  @JSImport("@nivo/circle-packing/dist/types/CirclePackingTooltip", "CirclePackingTooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def parent(value: ComputedDatum[RawDatum]): this.type = set("parent", value.asInstanceOf[js.Any])
  }
  
  def withProps[RawDatum](p: ComputedDatum[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
