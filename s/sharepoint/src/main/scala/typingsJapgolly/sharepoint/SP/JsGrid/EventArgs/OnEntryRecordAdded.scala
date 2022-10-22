package typingsJapgolly.sharepoint.SP.JsGrid.EventArgs

import typingsJapgolly.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnEntryRecordAdded
  extends StObject
     with IEventArgs {
  
  var recordKey: Double
}
object OnEntryRecordAdded {
  
  inline def apply(recordKey: Double): OnEntryRecordAdded = {
    val __obj = js.Dynamic.literal(recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEntryRecordAdded]
  }
  
  extension [Self <: OnEntryRecordAdded](x: Self) {
    
    inline def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
