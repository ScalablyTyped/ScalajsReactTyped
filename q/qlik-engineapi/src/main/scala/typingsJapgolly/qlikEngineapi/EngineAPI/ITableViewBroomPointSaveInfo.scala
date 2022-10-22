package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TableViewBroomPointSaveInfo...
  */
trait ITableViewBroomPointSaveInfo extends StObject {
  
  /**
    * List of fields in the table.
    */
  var qFields: js.Array[String]
  
  /**
    * Information about the position of the broom point.
    */
  var qPos: IPoint
  
  /**
    * Name of the table.
    */
  var qTable: String
}
object ITableViewBroomPointSaveInfo {
  
  inline def apply(qFields: js.Array[String], qPos: IPoint, qTable: String): ITableViewBroomPointSaveInfo = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qPos = qPos.asInstanceOf[js.Any], qTable = qTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableViewBroomPointSaveInfo]
  }
  
  extension [Self <: ITableViewBroomPointSaveInfo](x: Self) {
    
    inline def setQFields(value: js.Array[String]): Self = StObject.set(x, "qFields", value.asInstanceOf[js.Any])
    
    inline def setQFieldsVarargs(value: String*): Self = StObject.set(x, "qFields", js.Array(value*))
    
    inline def setQPos(value: IPoint): Self = StObject.set(x, "qPos", value.asInstanceOf[js.Any])
    
    inline def setQTable(value: String): Self = StObject.set(x, "qTable", value.asInstanceOf[js.Any])
  }
}
