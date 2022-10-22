package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidewalkSendDataToDevice extends StObject {
  
  /**
    * The duration of time in seconds for which you want to retry sending the ACK.
    */
  var AckModeRetryDurationSecs: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.AckModeRetryDurationSecs] = js.undefined
  
  var MessageType: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.MessageType] = js.undefined
  
  /**
    * The sequence number.
    */
  var Seq: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.Seq] = js.undefined
}
object SidewalkSendDataToDevice {
  
  inline def apply(): SidewalkSendDataToDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidewalkSendDataToDevice]
  }
  
  extension [Self <: SidewalkSendDataToDevice](x: Self) {
    
    inline def setAckModeRetryDurationSecs(value: AckModeRetryDurationSecs): Self = StObject.set(x, "AckModeRetryDurationSecs", value.asInstanceOf[js.Any])
    
    inline def setAckModeRetryDurationSecsUndefined: Self = StObject.set(x, "AckModeRetryDurationSecs", js.undefined)
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
    
    inline def setSeq(value: Seq): Self = StObject.set(x, "Seq", value.asInstanceOf[js.Any])
    
    inline def setSeqUndefined: Self = StObject.set(x, "Seq", js.undefined)
  }
}
