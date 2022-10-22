package typingsJapgolly.hmscoreReactNativeHmsPush

import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.collapseKey
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.data
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.messageId
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.messageType
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.receiptMode
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.sendMode
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.to
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ttl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRemoteMessageBuilderMod {
  
  trait RemoteMessageBuilderInterface extends StObject {
    
    var COLLAPSE_KEY: collapseKey
    
    var DATA: data
    
    var MESSAGE_ID: messageId
    
    var MESSAGE_TYPE: messageType
    
    var RECEIPT_MODE: receiptMode
    
    var SEND_MODE: sendMode
    
    var TO: to
    
    var TTL: ttl
  }
  object RemoteMessageBuilderInterface {
    
    inline def apply(): RemoteMessageBuilderInterface = {
      val __obj = js.Dynamic.literal(COLLAPSE_KEY = "collapseKey", DATA = "data", MESSAGE_ID = "messageId", MESSAGE_TYPE = "messageType", RECEIPT_MODE = "receiptMode", SEND_MODE = "sendMode", TO = "to", TTL = "ttl")
      __obj.asInstanceOf[RemoteMessageBuilderInterface]
    }
    
    extension [Self <: RemoteMessageBuilderInterface](x: Self) {
      
      inline def setCOLLAPSE_KEY(value: collapseKey): Self = StObject.set(x, "COLLAPSE_KEY", value.asInstanceOf[js.Any])
      
      inline def setDATA(value: data): Self = StObject.set(x, "DATA", value.asInstanceOf[js.Any])
      
      inline def setMESSAGE_ID(value: messageId): Self = StObject.set(x, "MESSAGE_ID", value.asInstanceOf[js.Any])
      
      inline def setMESSAGE_TYPE(value: messageType): Self = StObject.set(x, "MESSAGE_TYPE", value.asInstanceOf[js.Any])
      
      inline def setRECEIPT_MODE(value: receiptMode): Self = StObject.set(x, "RECEIPT_MODE", value.asInstanceOf[js.Any])
      
      inline def setSEND_MODE(value: sendMode): Self = StObject.set(x, "SEND_MODE", value.asInstanceOf[js.Any])
      
      inline def setTO(value: to): Self = StObject.set(x, "TO", value.asInstanceOf[js.Any])
      
      inline def setTTL(value: ttl): Self = StObject.set(x, "TTL", value.asInstanceOf[js.Any])
    }
  }
}
