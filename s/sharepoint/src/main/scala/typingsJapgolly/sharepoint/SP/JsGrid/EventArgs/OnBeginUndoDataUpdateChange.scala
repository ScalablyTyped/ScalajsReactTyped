package typingsJapgolly.sharepoint.SP.JsGrid.EventArgs

import typingsJapgolly.sharepoint.SP.JsGrid.IChangeKey
import typingsJapgolly.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBeginUndoDataUpdateChange
  extends StObject
     with IEventArgs {
  
  var changeKey: IChangeKey
}
object OnBeginUndoDataUpdateChange {
  
  inline def apply(changeKey: IChangeKey): OnBeginUndoDataUpdateChange = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeginUndoDataUpdateChange]
  }
  
  extension [Self <: OnBeginUndoDataUpdateChange](x: Self) {
    
    inline def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
  }
}
