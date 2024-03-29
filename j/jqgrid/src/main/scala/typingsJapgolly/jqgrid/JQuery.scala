package typingsJapgolly.jqgrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * Populates a grid with the passed data (an array)
    * @param data 
    * @returns {} 
    */
  def addJSONData(data: js.Array[Any]): Unit = js.native
  
  /**
    * Edits the row specified by rowid.
    * keys is a boolean value, indicating if to use the Enter key to accept the value ane Esc to cancel the edit, or not.
    * @param rowid the id of the row to edit
    * @param keys when set to true we can use [Enter] key to save the row and [Esc] to cancel editing
    * @returns {} 
    */
  def editRow(rowid: Any): Unit = js.native
  def editRow(rowid: Any, keys: Boolean): Unit = js.native
  
  /**
    * Returns the value of the requested parameter. name is the name from the options array. If the name is not set, the entry options are returned.
    * @param name 
    * @returns {} 
    */
  def getGridParam(name: String): Any = js.native
  
  var jqGrid: js.UndefOr[JQueryJqGridStatic] = js.native
  
  /**
    * This method restores the data to original values before the editing of the row
    * @param rowId the row to restore
    * @param afterRestoreFunc if defined this function is called in after the row is restored.
    * @returns {} 
    */
  def restoreRow(rowId: Any): Unit = js.native
  def restoreRow(rowId: Any, afterRestoreFunc: js.Function1[/* response */ Any, Unit]): Unit = js.native
  
  /**
    * Saves the edited row.
    * @param rowid the id of the row to save
    * @param successfunc 
    * @param url if defined, this parameter replaces the editurl parameter from the options array. If set to 'clientArray', the data is not posted to the server but rather is saved only to the grid (presumably for later manual saving).
    * @param extraparam an array of type name: value. When set these values are posted along with the other values to the server.
    * @returns {} 
    */
  def saveRow(rowid: String): Unit = js.native
  def saveRow(rowid: String, successfunc: js.Function1[/* response */ Any, Boolean]): Unit = js.native
  def saveRow(rowid: String, successfunc: js.Function1[/* response */ Any, Boolean], url: String): Unit = js.native
  def saveRow(
    rowid: String,
    successfunc: js.Function1[/* response */ Any, Boolean],
    url: String,
    extraparam: Any
  ): Unit = js.native
  def saveRow(rowid: String, successfunc: js.Function1[/* response */ Any, Boolean], url: Unit, extraparam: Any): Unit = js.native
  def saveRow(rowid: String, successfunc: Boolean): Unit = js.native
  def saveRow(rowid: String, successfunc: Boolean, url: String): Unit = js.native
  def saveRow(rowid: String, successfunc: Boolean, url: String, extraparam: Any): Unit = js.native
  def saveRow(rowid: String, successfunc: Boolean, url: Unit, extraparam: Any): Unit = js.native
  def saveRow(rowid: String, successfunc: Unit, url: String): Unit = js.native
  def saveRow(rowid: String, successfunc: Unit, url: String, extraparam: Any): Unit = js.native
  def saveRow(rowid: String, successfunc: Unit, url: Unit, extraparam: Any): Unit = js.native
  
  /**
    * Sets a particular parameter.
    * Note - for some parameters to take effect a trigger("reloadGrid") should be executed.
    * Note that with this method we can override events.
    * The name (in the name:value pair) is the name from options array
    * @param obj 
    * @returns {} 
    */
  def setGridParam(obj: Any): Unit = js.native
}
