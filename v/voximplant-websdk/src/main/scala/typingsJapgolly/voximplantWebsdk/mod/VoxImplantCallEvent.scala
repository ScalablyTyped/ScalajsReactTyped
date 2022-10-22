package typingsJapgolly.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.Connected
  - typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.Disconnected
  - typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.Failed
  - typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.InfoReceived
  - typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.MessageReceived
  - typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.ProgressToneStart
  - typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.ProgressToneStop
  - typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.TransferComplete
  - typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.TransferFailed
*/
trait VoxImplantCallEvent extends StObject
object VoxImplantCallEvent {
  
  inline def Connected(call: Call): typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.Connected = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.Connected]
  }
  
  inline def Disconnected(call: Call): typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.Disconnected = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.Disconnected]
  }
  
  inline def Failed(call: Call, code: Double, reason: String): typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.Failed = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.Failed]
  }
  
  inline def InfoReceived(body: String, call: Call, mimeType: String): typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.InfoReceived = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], call = call.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.InfoReceived]
  }
  
  inline def MessageReceived(call: Call, text: String): typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.MessageReceived = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.MessageReceived]
  }
  
  inline def ProgressToneStart(call: Call): typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.ProgressToneStart = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.ProgressToneStart]
  }
  
  inline def ProgressToneStop(call: Call): typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.ProgressToneStop = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.ProgressToneStop]
  }
  
  inline def TransferComplete(call: Call): typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.TransferComplete = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.TransferComplete]
  }
  
  inline def TransferFailed(call: Call): typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.TransferFailed = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.CallEventTypes.TransferFailed]
  }
}
