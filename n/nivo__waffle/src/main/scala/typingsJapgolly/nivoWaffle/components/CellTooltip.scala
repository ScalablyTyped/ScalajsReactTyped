package typingsJapgolly.nivoWaffle.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoWaffle.distTypesCellTooltipMod.TooltipProps
import typingsJapgolly.nivoWaffle.distTypesTypesMod.DataCell
import typingsJapgolly.nivoWaffle.distTypesTypesMod.Datum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CellTooltip {
  
  inline def apply[RawDatum /* <: Datum */](cell: DataCell[RawDatum]): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[TooltipProps[RawDatum]]))
  }
  
  @JSImport("@nivo/waffle/dist/types/CellTooltip", "CellTooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum /* <: Datum */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[RawDatum /* <: Datum */](p: TooltipProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
