package typingsJapgolly.googleVisualization.google.visualization

import typingsJapgolly.googleVisualization.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTable extends StObject {
  
  def addColumn(descriptionObject: DataTableColumnDescription): Double = js.native
  def addColumn(`type`: String): Double = js.native
  def addColumn(`type`: String, label: String): Double = js.native
  def addColumn(`type`: String, label: String, id: String): Double = js.native
  def addColumn(`type`: String, label: Unit, id: String): Double = js.native
  
  def addRow(): Double = js.native
  def addRow(cellArray: js.Array[Any]): Double = js.native
  def addRow(cellObject: DataObjectCell): Double = js.native
  
  def addRows(numberOfEmptyRows: Double): Double = js.native
  def addRows(rows: js.Array[js.Array[Any | DataObjectCell]]): Double = js.native
  
  def getColumnId(columnIndex: Double): String = js.native
  
  def getColumnIndex(columnIdentifier: String): Double = js.native
  def getColumnIndex(columnIdentifier: Double): Double = js.native
  
  def getColumnLabel(columnIndex: Double): String = js.native
  
  def getColumnPattern(columnIndex: Double): String = js.native
  
  def getColumnProperties(columnIndex: Double): Properties = js.native
  
  def getColumnProperty(columnIndex: Double, name: String): Any = js.native
  
  def getColumnRange(columnIndex: Double): Max = js.native
  
  def getColumnRole(columnIndex: Double): String = js.native
  
  def getColumnType(columnIndex: Double): String = js.native
  
  def getDistinctValues(columnIndex: Double): js.Array[Any] = js.native
  
  def getFilteredRows(filters: js.Array[DataTableCellFilter]): js.Array[Double] = js.native
  
  def getFormattedValue(rowIndex: Double, columnIndex: Double): String = js.native
  
  def getNumberOfColumns(): Double = js.native
  
  def getNumberOfRows(): Double = js.native
  
  def getProperties(rowIndex: Double, columnIndex: Double): Properties = js.native
  
  def getProperty(rowIndex: Double, columnIndex: Double, name: String): Any = js.native
  
  def getRowProperties(rowIndex: Double): Properties = js.native
  
  def getRowProperty(rowIndex: Double, name: String): Any = js.native
  
  def getSortedRows(sortColumn: Double): js.Array[Double] = js.native
  def getSortedRows(sortColumns: js.Array[Double | SortByColumn]): js.Array[Double] = js.native
  def getSortedRows(sortColumn: SortByColumn): js.Array[Double] = js.native
  
  def getTableProperties(): Properties = js.native
  
  def getTableProperty(name: String): Any = js.native
  
  def getValue(rowIndex: Double, columnIndex: Double): Any = js.native
  
  def insertColumn(columnIndex: Double, `type`: String): Unit = js.native
  def insertColumn(columnIndex: Double, `type`: String, label: String): Unit = js.native
  def insertColumn(columnIndex: Double, `type`: String, label: String, id: String): Unit = js.native
  def insertColumn(columnIndex: Double, `type`: String, label: Unit, id: String): Unit = js.native
  
  def insertRows(rowIndex: Double, numberOfEmptyRows: Double): Unit = js.native
  def insertRows(rowIndex: Double, rows: js.Array[js.Array[Any | DataObjectCell]]): Unit = js.native
  
  def removeColumn(columnIndex: Double): Unit = js.native
  
  def removeColumns(columnIndex: Double, numberOfColumns: Double): Unit = js.native
  
  def removeRow(rowIndex: Double): Unit = js.native
  
  def removeRows(rowIndex: Double, numberOfRows: Double): Unit = js.native
  
  def setCell(rowIndex: Double, columnIndex: Double): Unit = js.native
  def setCell(rowIndex: Double, columnIndex: Double, value: Any): Unit = js.native
  def setCell(rowIndex: Double, columnIndex: Double, value: Any, formattedValue: String): Unit = js.native
  def setCell(rowIndex: Double, columnIndex: Double, value: Any, formattedValue: String, properties: Properties): Unit = js.native
  def setCell(rowIndex: Double, columnIndex: Double, value: Any, formattedValue: Unit, properties: Properties): Unit = js.native
  def setCell(rowIndex: Double, columnIndex: Double, value: Unit, formattedValue: String): Unit = js.native
  def setCell(rowIndex: Double, columnIndex: Double, value: Unit, formattedValue: String, properties: Properties): Unit = js.native
  def setCell(rowIndex: Double, columnIndex: Double, value: Unit, formattedValue: Unit, properties: Properties): Unit = js.native
  
  def setColumnLabel(columnIndex: Double, label: String): Unit = js.native
  
  def setColumnProperties(columnIndex: Double, properties: Properties): Unit = js.native
  
  def setColumnProperty(columnIndex: Double, name: String, value: Any): Unit = js.native
  
  def setFormattedValue(rowIndex: Double, columnIndex: Double): Unit = js.native
  def setFormattedValue(rowIndex: Double, columnIndex: Double, formattedValue: String): Unit = js.native
  
  def setProperties(rowIndex: Double, columnIndex: Double, properties: Properties): Unit = js.native
  
  def setProperty(rowIndex: Double, columnIndex: Double, name: String, value: Any): Unit = js.native
  
  def setRowProperties(rowIndex: Double, properties: Properties): Unit = js.native
  
  def setRowProperty(rowIndex: Double, name: String, value: Any): Unit = js.native
  
  def setTableProperties(properties: Properties): Unit = js.native
  
  def setTableProperty(name: String, value: Any): Unit = js.native
  
  def setValue(rowIndex: Double, columnIndex: Double, value: Any): Unit = js.native
  
  def sort(sortColumn: Double): js.Array[Double] = js.native
  def sort(sortColumns: js.Array[Double | SortByColumn]): js.Array[Double] = js.native
  def sort(sortColumn: SortByColumn): js.Array[Double] = js.native
  
  def toJSON(): String = js.native
}
