package typingsJapgolly.nivoSunburst.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoArcs.distTypesTypesMod.Arc
import typingsJapgolly.nivoSunburst.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoSunburst.distTypesTypesMod.DatumId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SunburstTooltip {
  
  inline def apply[RawDatum](
    arc: Arc,
    color: String,
    data: RawDatum,
    depth: Double,
    formattedValue: String,
    height: Double,
    id: DatumId,
    path: js.Array[DatumId],
    percentage: Double,
    value: Double
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[ComputedDatum[RawDatum]]))
  }
  
  @JSImport("@nivo/sunburst/dist/types/SunburstTooltip", "SunburstTooltip")
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
