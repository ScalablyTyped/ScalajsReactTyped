package typingsJapgolly.nivoBar.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoBar.distTypesTypesMod.BarTooltipProps
import typingsJapgolly.nivoBar.nivoBarBooleans.`false`
import typingsJapgolly.nivoBar.nivoBarInts.`0`
import typingsJapgolly.nivoBar.nivoBarStrings._empty
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BarTooltip {
  
  inline def apply[RawDatum](
    color: String,
    data: Exclude[RawDatum, js.UndefOr[Null | `false` | _empty | `0`]],
    formattedValue: String,
    hidden: Boolean,
    id: String | Double,
    index: Double,
    indexValue: String | Double,
    label: String,
    value: Double
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexValue = indexValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[BarTooltipProps[RawDatum]]))
  }
  
  @JSImport("@nivo/bar/dist/types/BarTooltip", "BarTooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
  }
  
  def withProps[RawDatum](p: BarTooltipProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
