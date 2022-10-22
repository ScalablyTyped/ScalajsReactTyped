package typingsJapgolly.figma.mod.global

import typingsJapgolly.figma.figmaStrings.CENTER
import typingsJapgolly.figma.figmaStrings.COLUMNS
import typingsJapgolly.figma.figmaStrings.MAX
import typingsJapgolly.figma.figmaStrings.MIN
import typingsJapgolly.figma.figmaStrings.ROWS
import typingsJapgolly.figma.figmaStrings.STRETCH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.figma.mod.global.RowsColsLayoutGrid
  - typingsJapgolly.figma.mod.global.GridLayoutGrid
*/
trait LayoutGrid extends StObject
object LayoutGrid {
  
  inline def GridLayoutGrid(sectionSize: Double): typingsJapgolly.figma.mod.global.GridLayoutGrid = {
    val __obj = js.Dynamic.literal(pattern = "GRID", sectionSize = sectionSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.figma.mod.global.GridLayoutGrid]
  }
  
  inline def RowsColsLayoutGrid(
    alignment: MIN | MAX | STRETCH | CENTER,
    count: Double,
    gutterSize: Double,
    pattern: ROWS | COLUMNS
  ): typingsJapgolly.figma.mod.global.RowsColsLayoutGrid = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], gutterSize = gutterSize.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.figma.mod.global.RowsColsLayoutGrid]
  }
}
