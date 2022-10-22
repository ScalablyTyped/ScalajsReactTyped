package typingsJapgolly.w3cWebNfc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NDEFMessageInit extends StObject {
  
  var records: js.Array[NDEFRecordInit]
}
object NDEFMessageInit {
  
  inline def apply(records: js.Array[NDEFRecordInit]): NDEFMessageInit = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[NDEFMessageInit]
  }
  
  extension [Self <: NDEFMessageInit](x: Self) {
    
    inline def setRecords(value: js.Array[NDEFRecordInit]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRecordsVarargs(value: NDEFRecordInit*): Self = StObject.set(x, "records", js.Array(value*))
  }
}
