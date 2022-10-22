package typingsJapgolly.nivoWaffle

import typingsJapgolly.nivoWaffle.anon.CellSize
import typingsJapgolly.nivoWaffle.anon.ComputedData
import typingsJapgolly.nivoWaffle.anon.Height
import typingsJapgolly.nivoWaffle.distTypesTypesMod.Cell
import typingsJapgolly.nivoWaffle.distTypesTypesMod.CommonProps
import typingsJapgolly.nivoWaffle.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoWaffle.distTypesTypesMod.DataProps
import typingsJapgolly.nivoWaffle.distTypesTypesMod.Datum
import typingsJapgolly.nivoWaffle.distTypesTypesMod.EmptyCell
import typingsJapgolly.nivoWaffle.distTypesTypesMod.FillDirection
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.borderColor
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.colors
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.emptyColor
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.fillDirection
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.padding
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.valueFormat
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/waffle/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeCellSize(width: Double, height: Double, rows: Double, columns: Double, padding: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCellSize")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def computeGrid(
    width: Double,
    height: Double,
    rows: Double,
    columns: Double,
    fillDirection: FillDirection,
    padding: Double,
    emptyColor: String
  ): CellSize = (^.asInstanceOf[js.Dynamic].applyDynamic("computeGrid")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], fillDirection.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], emptyColor.asInstanceOf[js.Any])).asInstanceOf[CellSize]
  
  inline def mergeCellsData[RawDatum /* <: Datum */](cells: js.Array[EmptyCell], data: js.Array[ComputedDatum[RawDatum]]): js.Array[Cell[RawDatum]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCellsData")(cells.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell[RawDatum]]]
  
  inline def useMergeCellsData[RawDatum /* <: Datum */](cells: js.Array[EmptyCell], data: js.Array[ComputedDatum[RawDatum]]): js.Array[Cell[RawDatum]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMergeCellsData")(cells.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell[RawDatum]]]
  
  inline def useWaffle[RawDatum /* <: Datum */](
    hasWidthHeightDataValueFormatTotalRowsColumnsFillDirectionPaddingColorsEmptyColorBorderColor: (Pick[
      CommonProps[RawDatum], 
      valueFormat | fillDirection | padding | colors | emptyColor | borderColor
    ]) & DataProps[RawDatum] & Height
  ): ComputedData[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useWaffle")(hasWidthHeightDataValueFormatTotalRowsColumnsFillDirectionPaddingColorsEmptyColorBorderColor.asInstanceOf[js.Any]).asInstanceOf[ComputedData[RawDatum]]
}
