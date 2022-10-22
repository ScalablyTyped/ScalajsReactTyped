package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.WorksheetActivated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the worksheet that raised the activated event.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
trait WorksheetActivatedEventArgs extends StObject {
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var `type`: WorksheetActivated
  
  /**
    * Gets the ID of the worksheet that is activated.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
}
object WorksheetActivatedEventArgs {
  
  inline def apply(worksheetId: String): WorksheetActivatedEventArgs = {
    val __obj = js.Dynamic.literal(worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WorksheetActivated")
    __obj.asInstanceOf[WorksheetActivatedEventArgs]
  }
  
  extension [Self <: WorksheetActivatedEventArgs](x: Self) {
    
    inline def setType(value: WorksheetActivated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
