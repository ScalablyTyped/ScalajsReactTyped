package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.officeJsStrings.ShapeActivated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the shape that raised the activated event.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait ShapeActivatedEventArgs extends StObject {
  
  /**
    * Gets the ID of the activated shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var shapeId: String
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var `type`: ShapeActivated
  
  /**
    * Gets the ID of the worksheet in which the shape is activated.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String
}
object ShapeActivatedEventArgs {
  
  inline def apply(shapeId: String, worksheetId: String): ShapeActivatedEventArgs = {
    val __obj = js.Dynamic.literal(shapeId = shapeId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ShapeActivated")
    __obj.asInstanceOf[ShapeActivatedEventArgs]
  }
  
  extension [Self <: ShapeActivatedEventArgs](x: Self) {
    
    inline def setShapeId(value: String): Self = StObject.set(x, "shapeId", value.asInstanceOf[js.Any])
    
    inline def setType(value: ShapeActivated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
