package typingsJapgolly.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.voximplantWebsdk.mod.EventTypes.AuthResult
  - typingsJapgolly.voximplantWebsdk.mod.EventTypes.ConnectionClosed
  - typingsJapgolly.voximplantWebsdk.mod.EventTypes.ConnectionEstablished
  - typingsJapgolly.voximplantWebsdk.mod.EventTypes.ConnectionFailed
  - typingsJapgolly.voximplantWebsdk.mod.EventTypes.IncomingCall
  - typingsJapgolly.voximplantWebsdk.mod.EventTypes.MicAccessResult
  - typingsJapgolly.voximplantWebsdk.mod.EventTypes.NetStatsReceived
  - typingsJapgolly.voximplantWebsdk.mod.EventTypes.PlaybackFinished
  - typingsJapgolly.voximplantWebsdk.mod.EventTypes.SDKReady
  - typingsJapgolly.voximplantWebsdk.mod.EventTypes.SourcesInfoUpdated
*/
trait VoxImplantEvent extends StObject
object VoxImplantEvent {
  
  inline def AuthResult(result: Boolean): typingsJapgolly.voximplantWebsdk.mod.EventTypes.AuthResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.EventTypes.AuthResult]
  }
  
  inline def ConnectionFailed(message: String): typingsJapgolly.voximplantWebsdk.mod.EventTypes.ConnectionFailed = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.EventTypes.ConnectionFailed]
  }
  
  inline def IncomingCall(call: Call): typingsJapgolly.voximplantWebsdk.mod.EventTypes.IncomingCall = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.EventTypes.IncomingCall]
  }
  
  inline def MicAccessResult(result: Boolean): typingsJapgolly.voximplantWebsdk.mod.EventTypes.MicAccessResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.EventTypes.MicAccessResult]
  }
  
  inline def NetStatsReceived(stats: NetworkInfo): typingsJapgolly.voximplantWebsdk.mod.EventTypes.NetStatsReceived = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.EventTypes.NetStatsReceived]
  }
  
  inline def SDKReady(version: String): typingsJapgolly.voximplantWebsdk.mod.EventTypes.SDKReady = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.voximplantWebsdk.mod.EventTypes.SDKReady]
  }
}
