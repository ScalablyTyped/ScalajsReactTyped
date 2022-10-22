package typingsJapgolly.sharepoint.SP.JsGrid.EventArgs

import typingsJapgolly.sharepoint.SP.JsGrid.IChangeKey
import typingsJapgolly.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnRecordsReordered
  extends StObject
     with IEventArgs {
  
  var changeKey: IChangeKey
  
  var reorderedKeys: js.Array[String]
}
object OnRecordsReordered {
  
  inline def apply(changeKey: IChangeKey, reorderedKeys: js.Array[String]): OnRecordsReordered = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any], reorderedKeys = reorderedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRecordsReordered]
  }
  
  extension [Self <: OnRecordsReordered](x: Self) {
    
    inline def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    inline def setReorderedKeys(value: js.Array[String]): Self = StObject.set(x, "reorderedKeys", value.asInstanceOf[js.Any])
    
    inline def setReorderedKeysVarargs(value: String*): Self = StObject.set(x, "reorderedKeys", js.Array(value*))
  }
}
