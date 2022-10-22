package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.WorksheetDeactivated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the worksheet that raised the deactivated event.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
trait WorksheetDeactivatedEventArgs extends StObject {
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var `type`: WorksheetDeactivated
  
  /**
    * Gets the ID of the worksheet that is deactivated.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
}
object WorksheetDeactivatedEventArgs {
  
  inline def apply(worksheetId: String): WorksheetDeactivatedEventArgs = {
    val __obj = js.Dynamic.literal(worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WorksheetDeactivated")
    __obj.asInstanceOf[WorksheetDeactivatedEventArgs]
  }
  
  extension [Self <: WorksheetDeactivatedEventArgs](x: Self) {
    
    inline def setType(value: WorksheetDeactivated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
