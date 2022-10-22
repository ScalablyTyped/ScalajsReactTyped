package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes how to sort a single {@link DataPilotField} */
trait DataPilotFieldSortInfo extends StObject {
  
  /** contains the data field to sort by if the Mode is DATA */
  var Field: String
  
  /** `TRUE` if data are sorted in ascending order, `FALSE` if in descending order. */
  var IsAscending: Boolean
  
  /**
    * contains the sort mode
    * @see com.sun.star.sheet.DataPilotFieldSortMode
    */
  var Mode: Double
}
object DataPilotFieldSortInfo {
  
  inline def apply(Field: String, IsAscending: Boolean, Mode: Double): DataPilotFieldSortInfo = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any], IsAscending = IsAscending.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotFieldSortInfo]
  }
  
  extension [Self <: DataPilotFieldSortInfo](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    inline def setIsAscending(value: Boolean): Self = StObject.set(x, "IsAscending", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Double): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
  }
}
