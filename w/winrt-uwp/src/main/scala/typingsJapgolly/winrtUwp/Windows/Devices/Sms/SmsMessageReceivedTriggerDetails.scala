package typingsJapgolly.winrtUwp.Windows.Devices.Sms

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event details for the event raised when an SMS message is received. */
trait SmsMessageReceivedTriggerDetails extends StObject {
  
  /** Delivers the filtered message to the messaging app. */
  def accept(): Unit
  
  /** When MessageType is App, the message details for the message. */
  var appMessage: SmsAppMessage
  
  /** When MessageType is Broadcast, the message details for the message. */
  var broadcastMessage: SmsBroadcastMessage
  
  /** Drops the filtered message, so that it is not passed on to the messaging app. */
  def drop(): Unit
  
  /** The SmsMessageType of the received message. */
  var messageType: SmsMessageType
  
  /** When MessageType is Status, the message details for the message. */
  var statusMessage: SmsStatusMessage
  
  /** When MessageType is Text, the message details for the message. */
  var textMessage: SmsTextMessage2
  
  /** When MessageType is Voicemail, the message details for the message. */
  var voicemailMessage: SmsVoicemailMessage
  
  /** When MessageType is Wap, the message details for the message. */
  var wapMessage: SmsWapMessage
}
object SmsMessageReceivedTriggerDetails {
  
  inline def apply(
    accept: Callback,
    appMessage: SmsAppMessage,
    broadcastMessage: SmsBroadcastMessage,
    drop: Callback,
    messageType: SmsMessageType,
    statusMessage: SmsStatusMessage,
    textMessage: SmsTextMessage2,
    voicemailMessage: SmsVoicemailMessage,
    wapMessage: SmsWapMessage
  ): SmsMessageReceivedTriggerDetails = {
    val __obj = js.Dynamic.literal(accept = accept.toJsFn, appMessage = appMessage.asInstanceOf[js.Any], broadcastMessage = broadcastMessage.asInstanceOf[js.Any], drop = drop.toJsFn, messageType = messageType.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], textMessage = textMessage.asInstanceOf[js.Any], voicemailMessage = voicemailMessage.asInstanceOf[js.Any], wapMessage = wapMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsMessageReceivedTriggerDetails]
  }
  
  extension [Self <: SmsMessageReceivedTriggerDetails](x: Self) {
    
    inline def setAccept(value: Callback): Self = StObject.set(x, "accept", value.toJsFn)
    
    inline def setAppMessage(value: SmsAppMessage): Self = StObject.set(x, "appMessage", value.asInstanceOf[js.Any])
    
    inline def setBroadcastMessage(value: SmsBroadcastMessage): Self = StObject.set(x, "broadcastMessage", value.asInstanceOf[js.Any])
    
    inline def setDrop(value: Callback): Self = StObject.set(x, "drop", value.toJsFn)
    
    inline def setMessageType(value: SmsMessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: SmsStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setTextMessage(value: SmsTextMessage2): Self = StObject.set(x, "textMessage", value.asInstanceOf[js.Any])
    
    inline def setVoicemailMessage(value: SmsVoicemailMessage): Self = StObject.set(x, "voicemailMessage", value.asInstanceOf[js.Any])
    
    inline def setWapMessage(value: SmsWapMessage): Self = StObject.set(x, "wapMessage", value.asInstanceOf[js.Any])
  }
}
