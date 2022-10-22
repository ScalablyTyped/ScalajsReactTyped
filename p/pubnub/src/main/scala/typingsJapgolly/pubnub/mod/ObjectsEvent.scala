package typingsJapgolly.pubnub.mod

import typingsJapgolly.pubnub.anon.DataCustom
import typingsJapgolly.pubnub.anon.DataEvent
import typingsJapgolly.pubnub.anon.DataEventType
import typingsJapgolly.pubnub.anon.DataUUIDMetadataObject
import typingsJapgolly.pubnub.anon.Event
import typingsJapgolly.pubnub.anon.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pubnub.mod.SetUUIDMetadataEvent[UUIDCustom]
  - typingsJapgolly.pubnub.mod.RemoveUUIDMetadataEvent
  - typingsJapgolly.pubnub.mod.SetChannelMetadataEvent[ChannelCustom]
  - typingsJapgolly.pubnub.mod.RemoveChannelMetadataEvent
  - typingsJapgolly.pubnub.mod.SetMembershipEvent[MembershipCustom]
  - typingsJapgolly.pubnub.mod.RemoveMembershipEvent
*/
trait ObjectsEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */] extends StObject
object ObjectsEvent {
  
  inline def RemoveChannelMetadataEvent(channel: String, message: Event, timetoken: Double): typingsJapgolly.pubnub.mod.RemoveChannelMetadataEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[typingsJapgolly.pubnub.mod.RemoveChannelMetadataEvent]
  }
  
  inline def RemoveMembershipEvent(channel: String, message: DataEvent, timetoken: Double): typingsJapgolly.pubnub.mod.RemoveMembershipEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[typingsJapgolly.pubnub.mod.RemoveMembershipEvent]
  }
  
  inline def RemoveUUIDMetadataEvent(channel: String, message: EventType, timetoken: Double): typingsJapgolly.pubnub.mod.RemoveUUIDMetadataEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[typingsJapgolly.pubnub.mod.RemoveUUIDMetadataEvent]
  }
  
  inline def SetChannelMetadataEvent[ChannelCustom /* <: ObjectCustom */](channel: String, message: DataEventType[ChannelCustom], timetoken: Double): typingsJapgolly.pubnub.mod.SetChannelMetadataEvent[ChannelCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[typingsJapgolly.pubnub.mod.SetChannelMetadataEvent[ChannelCustom]]
  }
  
  inline def SetMembershipEvent[MembershipCustom /* <: ObjectCustom */](channel: String, message: DataCustom[MembershipCustom], timetoken: Double): typingsJapgolly.pubnub.mod.SetMembershipEvent[MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[typingsJapgolly.pubnub.mod.SetMembershipEvent[MembershipCustom]]
  }
  
  inline def SetUUIDMetadataEvent[UUIDCustom /* <: ObjectCustom */](channel: String, message: DataUUIDMetadataObject[UUIDCustom], timetoken: Double): typingsJapgolly.pubnub.mod.SetUUIDMetadataEvent[UUIDCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[typingsJapgolly.pubnub.mod.SetUUIDMetadataEvent[UUIDCustom]]
  }
}
