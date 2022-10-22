package typingsJapgolly.azdata.mod.nb

import typingsJapgolly.azdata.azdataStrings.iopub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIOPubMessage
  extends StObject
     with IMessage {
  
  var channel: iopub
}
object IIOPubMessage {
  
  inline def apply(content: Any, `type`: Channel): IIOPubMessage = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIOPubMessage]
  }
  
  extension [Self <: IIOPubMessage](x: Self) {
    
    inline def setChannel(value: iopub): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
