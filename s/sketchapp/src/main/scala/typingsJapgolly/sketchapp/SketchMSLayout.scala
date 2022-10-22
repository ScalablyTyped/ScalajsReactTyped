package typingsJapgolly.sketchapp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sketchapp.SketchMSLayoutGrid
  - typingsJapgolly.sketchapp.SketchMSLayoutSimpleGrid
*/
trait SketchMSLayout extends StObject
object SketchMSLayout {
  
  inline def SketchMSLayoutGrid(
    columnWidth: Double,
    drawHorizontal: Boolean,
    drawHorizontalLines: Boolean,
    drawVertical: Boolean,
    gutterHeight: Double,
    gutterWidth: Double,
    guttersOutside: Boolean,
    horizontalOffset: Double,
    isEnabled: Boolean,
    numberOfColumns: Double,
    rowHeightMultiplication: Double,
    totalWidth: Double
  ): typingsJapgolly.sketchapp.SketchMSLayoutGrid = {
    val __obj = js.Dynamic.literal(_class = "layoutGrid", columnWidth = columnWidth.asInstanceOf[js.Any], drawHorizontal = drawHorizontal.asInstanceOf[js.Any], drawHorizontalLines = drawHorizontalLines.asInstanceOf[js.Any], drawVertical = drawVertical.asInstanceOf[js.Any], gutterHeight = gutterHeight.asInstanceOf[js.Any], gutterWidth = gutterWidth.asInstanceOf[js.Any], guttersOutside = guttersOutside.asInstanceOf[js.Any], horizontalOffset = horizontalOffset.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], numberOfColumns = numberOfColumns.asInstanceOf[js.Any], rowHeightMultiplication = rowHeightMultiplication.asInstanceOf[js.Any], totalWidth = totalWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchapp.SketchMSLayoutGrid]
  }
  
  inline def SketchMSLayoutSimpleGrid(gridSize: Double, isEnabled: Double, thickGridTimes: Double): typingsJapgolly.sketchapp.SketchMSLayoutSimpleGrid = {
    val __obj = js.Dynamic.literal(_class = "simpleGrid", gridSize = gridSize.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], thickGridTimes = thickGridTimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.sketchapp.SketchMSLayoutSimpleGrid]
  }
}
