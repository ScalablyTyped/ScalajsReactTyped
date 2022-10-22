package typingsJapgolly.sharepoint.SP.JsGrid.EventArgs

import typingsJapgolly.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowFocusChanged
  extends StObject
     with IEventArgs {
  
  var newRecordKey: Double
  
  var oldRecordKey: Double
}
object RowFocusChanged {
  
  inline def apply(newRecordKey: Double, oldRecordKey: Double): RowFocusChanged = {
    val __obj = js.Dynamic.literal(newRecordKey = newRecordKey.asInstanceOf[js.Any], oldRecordKey = oldRecordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowFocusChanged]
  }
  
  extension [Self <: RowFocusChanged](x: Self) {
    
    inline def setNewRecordKey(value: Double): Self = StObject.set(x, "newRecordKey", value.asInstanceOf[js.Any])
    
    inline def setOldRecordKey(value: Double): Self = StObject.set(x, "oldRecordKey", value.asInstanceOf[js.Any])
  }
}
