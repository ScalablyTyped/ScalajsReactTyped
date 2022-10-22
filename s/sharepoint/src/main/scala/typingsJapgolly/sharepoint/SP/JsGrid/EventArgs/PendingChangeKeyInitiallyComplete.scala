package typingsJapgolly.sharepoint.SP.JsGrid.EventArgs

import typingsJapgolly.sharepoint.SP.JsGrid.IChangeKey
import typingsJapgolly.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingChangeKeyInitiallyComplete
  extends StObject
     with IEventArgs {
  
  var changeKey: IChangeKey
}
object PendingChangeKeyInitiallyComplete {
  
  inline def apply(changeKey: IChangeKey): PendingChangeKeyInitiallyComplete = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingChangeKeyInitiallyComplete]
  }
  
  extension [Self <: PendingChangeKeyInitiallyComplete](x: Self) {
    
    inline def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
  }
}
