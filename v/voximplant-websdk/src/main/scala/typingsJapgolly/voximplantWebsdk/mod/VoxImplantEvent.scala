package typingsJapgolly.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait VoxImplantEvent extends js.Object

object VoxImplantEvent {
  @scala.inline
  def AuthResult(
    result: Boolean,
    code: Int | Double = null,
    displayName: String = null,
    key: String = null,
    options: js.Object = null
  ): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantEvent]
  }
  @scala.inline
  def NetStatsReceived(stats: NetworkInfo): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantEvent]
  }
  @scala.inline
  def ConnectionFailed(message: String): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantEvent]
  }
  @scala.inline
  def IncomingCall(call: Call, headers: js.Object = null): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantEvent]
  }
  @scala.inline
  def SDKReady(version: String): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantEvent]
  }
  @scala.inline
  def MicAccessResult(result: Boolean): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantEvent]
  }
}

