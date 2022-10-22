package typingsJapgolly.nivoWaffle.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoWaffle.anon.X
import typingsJapgolly.nivoWaffle.distTypesCellsSvgMod.CellsSvgProps
import typingsJapgolly.nivoWaffle.distTypesTypesMod.Cell
import typingsJapgolly.nivoWaffle.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoWaffle.distTypesTypesMod.Datum
import typingsJapgolly.nivoWaffle.distTypesTypesMod.EmptyCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CellsSvg {
  
  inline def apply[RawDatum /* <: Datum */](
    borderWidth: Double,
    cellSize: Double,
    cells: js.Array[EmptyCell],
    computedData: js.Array[ComputedDatum[RawDatum]],
    getBorderColor: Cell[RawDatum] => String,
    origin: X
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], cellSize = cellSize.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], computedData = computedData.asInstanceOf[js.Any], getBorderColor = js.Any.fromFunction1(getBorderColor), origin = origin.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[CellsSvgProps[RawDatum]]))
  }
  
  @JSImport("@nivo/waffle/dist/types/CellsSvg", "CellsSvg")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum /* <: Datum */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[RawDatum /* <: Datum */](p: CellsSvgProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
