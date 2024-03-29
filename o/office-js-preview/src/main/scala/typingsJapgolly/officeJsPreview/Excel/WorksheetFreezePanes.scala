package typingsJapgolly.officeJsPreview.Excel

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait WorksheetFreezePanes
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_WorksheetFreezePanes: RequestContext = js.native
  
  def freezeAt(frozenRange: String): Unit = js.native
  /**
    * Sets the frozen cells in the active worksheet view.
    The range provided corresponds to cells that will be frozen in the top- and left-most pane.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @param frozenRange A range that represents the cells to be frozen, or `null` to remove all frozen panes.
    */
  def freezeAt(frozenRange: Range): Unit = js.native
  
  /**
    * Freeze the first column or columns of the worksheet in place.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @param count Optional number of columns to freeze, or zero to unfreeze all columns
    */
  def freezeColumns(): Unit = js.native
  def freezeColumns(count: Double): Unit = js.native
  
  /**
    * Freeze the top row or rows of the worksheet in place.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @param count Optional number of rows to freeze, or zero to unfreeze all rows
    */
  def freezeRows(): Unit = js.native
  def freezeRows(count: Double): Unit = js.native
  
  /**
    * Gets a range that describes the frozen cells in the active worksheet view.
    The frozen range corresponds to cells that are frozen in the top- and left-most pane.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  def getLocation(): Range = js.native
  
  /**
    * Gets a range that describes the frozen cells in the active worksheet view.
    The frozen range corresponds to cells that are frozen in the top- and left-most pane.
    If there is no frozen pane, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  def getLocationOrNullObject(): Range = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.WorksheetFreezePanes object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorksheetFreezePanesData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): StringDictionary[String] = js.native
  
  /**
    * Removes all frozen panes in the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  def unfreeze(): Unit = js.native
}
