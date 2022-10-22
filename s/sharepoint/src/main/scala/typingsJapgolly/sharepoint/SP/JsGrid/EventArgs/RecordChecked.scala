package typingsJapgolly.sharepoint.SP.JsGrid.EventArgs

import typingsJapgolly.sharepoint.SP.JsGrid.IEventArgs
import typingsJapgolly.sharepoint.SP.Utilities.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordChecked
  extends StObject
     with IEventArgs {
  
  var bChecked: Boolean
  
  var recordKeySet: Set
}
object RecordChecked {
  
  inline def apply(bChecked: Boolean, recordKeySet: Set): RecordChecked = {
    val __obj = js.Dynamic.literal(bChecked = bChecked.asInstanceOf[js.Any], recordKeySet = recordKeySet.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordChecked]
  }
  
  extension [Self <: RecordChecked](x: Self) {
    
    inline def setBChecked(value: Boolean): Self = StObject.set(x, "bChecked", value.asInstanceOf[js.Any])
    
    inline def setRecordKeySet(value: Set): Self = StObject.set(x, "recordKeySet", value.asInstanceOf[js.Any])
  }
}
