package typingsJapgolly.reactTable.mod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseTableRowProps[D /* <: js.Object */] extends StObject {
  
  var allCells: js.Array[Cell[D, Any]] = js.native
  
  var cells: js.Array[Cell[D, Any]] = js.native
  
  def getRowProps(): TableRowProps = js.native
  def getRowProps(propGetter: RowPropGetter[D]): TableRowProps = js.native
  
  var id: String = js.native
  
  var index: Double = js.native
  
  var original: D = js.native
  
  var subRows: js.Array[Row[D]] = js.native
  
  var values: Record[IdType[D], CellValue[Any]] = js.native
}
