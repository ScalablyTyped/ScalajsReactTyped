package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.Blob
import org.scalajs.dom.File
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.JQueryPromise
import typingsJapgolly.kendoUi.kendo.spreadsheet.Sheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spreadsheet
  extends StObject
     with Widget {
  
  def activeSheet(): Sheet = js.native
  def activeSheet(sheet: Sheet): Unit = js.native
  @JSName("activeSheet")
  def activeSheet_Unit(): Unit = js.native
  
  def cellContextMenu(): ContextMenu = js.native
  
  def colHeaderContextMenu(): ContextMenu = js.native
  
  def defineName(name: String, value: String, hidden: Boolean): Unit = js.native
  
  def fromFile(blob: Blob): JQueryPromise[Any] = js.native
  def fromFile(blob: File): JQueryPromise[Any] = js.native
  
  def fromJSON(data: Any): Unit = js.native
  
  def insertSheet(options: Any): Sheet = js.native
  
  def moveSheetToIndex(sheet: Sheet, index: Double): Unit = js.native
  
  @JSName("options")
  var options_Spreadsheet: SpreadsheetOptions = js.native
  
  def refresh(): Unit = js.native
  
  def removeSheet(sheet: Sheet): Unit = js.native
  
  def renameSheet(sheet: Sheet, newSheetName: String): Sheet = js.native
  
  def rowHeaderContextMenu(): ContextMenu = js.native
  
  def saveAsExcel(): Unit = js.native
  
  def saveAsPDF(): JQueryPromise[Any] = js.native
  
  def saveJSON(): JQueryPromise[Any] = js.native
  
  def sheetByIndex(index: Double): Sheet = js.native
  
  def sheetByName(name: String): Sheet = js.native
  
  def sheetIndex(sheet: Sheet): Double = js.native
  
  def sheets(): Any = js.native
  
  def toJSON(): Any = js.native
  
  def undefineName(name: String): Unit = js.native
  
  var wrapper: JQuery = js.native
}
