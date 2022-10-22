package typingsJapgolly.nivoHeatmap

import japgolly.scalajs.react.ReactMouseEventFrom
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.CellComponent
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.CellShape
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.ComputedCell
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.TooltipComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeatMapCellsMod {
  
  @JSImport("@nivo/heatmap/dist/types/HeatMapCells", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def HeatMapCells[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */](
    hasCellsCellComponentBorderRadiusBorderWidthIsInteractiveSetActiveCellOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltipEnableLabels: HeatMapCellsProps[Datum, ExtraProps]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeatMapCells")(hasCellsCellComponentBorderRadiusBorderWidthIsInteractiveSetActiveCellOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltipEnableLabels.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait HeatMapCellsProps[Datum /* <: HeatMapDatum */, ExtraProps /* <: js.Object */] extends StObject {
    
    var borderRadius: NonNullable[js.UndefOr[Double]] = js.native
    
    var borderWidth: NonNullable[js.UndefOr[Double]] = js.native
    
    var cellComponent: NonNullable[js.UndefOr[CellShape | CellComponent[Datum]]] = js.native
    
    var cells: js.Array[ComputedCell[Datum]] = js.native
    
    var enableLabels: NonNullable[js.UndefOr[Boolean]] = js.native
    
    var isInteractive: NonNullable[js.UndefOr[Boolean]] = js.native
    
    var onClick: js.UndefOr[
        js.Function2[
          /* cell */ ComputedCell[Datum], 
          /* event */ ReactMouseEventFrom[org.scalajs.dom.Element], 
          Unit
        ]
      ] = js.native
    
    var onMouseEnter: js.UndefOr[
        js.Function2[
          /* cell */ ComputedCell[Datum], 
          /* event */ ReactMouseEventFrom[org.scalajs.dom.Element], 
          Unit
        ]
      ] = js.native
    
    var onMouseLeave: js.UndefOr[
        js.Function2[
          /* cell */ ComputedCell[Datum], 
          /* event */ ReactMouseEventFrom[org.scalajs.dom.Element], 
          Unit
        ]
      ] = js.native
    
    var onMouseMove: js.UndefOr[
        js.Function2[
          /* cell */ ComputedCell[Datum], 
          /* event */ ReactMouseEventFrom[org.scalajs.dom.Element], 
          Unit
        ]
      ] = js.native
    
    def setActiveCell(): Unit = js.native
    def setActiveCell(cell: ComputedCell[Datum]): Unit = js.native
    
    var tooltip: NonNullable[js.UndefOr[TooltipComponent[Datum]]] = js.native
  }
}
