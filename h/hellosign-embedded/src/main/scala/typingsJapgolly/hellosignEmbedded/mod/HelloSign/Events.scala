package typingsJapgolly.hellosignEmbedded.mod.HelloSign

import typingsJapgolly.hellosignEmbedded.hellosignEmbeddedStrings.cancel
import typingsJapgolly.hellosignEmbedded.hellosignEmbeddedStrings.close
import typingsJapgolly.hellosignEmbedded.hellosignEmbeddedStrings.createTemplate
import typingsJapgolly.hellosignEmbedded.hellosignEmbeddedStrings.decline
import typingsJapgolly.hellosignEmbedded.hellosignEmbeddedStrings.error
import typingsJapgolly.hellosignEmbedded.hellosignEmbeddedStrings.finish
import typingsJapgolly.hellosignEmbedded.hellosignEmbeddedStrings.message
import typingsJapgolly.hellosignEmbedded.hellosignEmbeddedStrings.open
import typingsJapgolly.hellosignEmbedded.hellosignEmbeddedStrings.ready
import typingsJapgolly.hellosignEmbedded.hellosignEmbeddedStrings.reassign
import typingsJapgolly.hellosignEmbedded.hellosignEmbeddedStrings.send
import typingsJapgolly.hellosignEmbedded.hellosignEmbeddedStrings.sign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  var CANCEL: cancel
  
  var CLOSE: close
  
  var CREATE_TEMPLATE: createTemplate
  
  var DECLINE: decline
  
  var ERROR: error
  
  var FINISH: finish
  
  var MESSAGE: message
  
  var OPEN: open
  
  var READY: ready
  
  var REASSIGN: reassign
  
  var SEND: send
  
  var SIGN: sign
}
object Events {
  
  inline def apply(): Events = {
    val __obj = js.Dynamic.literal(CANCEL = "cancel", CLOSE = "close", CREATE_TEMPLATE = "createTemplate", DECLINE = "decline", ERROR = "error", FINISH = "finish", MESSAGE = "message", OPEN = "open", READY = "ready", REASSIGN = "reassign", SEND = "send", SIGN = "sign")
    __obj.asInstanceOf[Events]
  }
  
  extension [Self <: Events](x: Self) {
    
    inline def setCANCEL(value: cancel): Self = StObject.set(x, "CANCEL", value.asInstanceOf[js.Any])
    
    inline def setCLOSE(value: close): Self = StObject.set(x, "CLOSE", value.asInstanceOf[js.Any])
    
    inline def setCREATE_TEMPLATE(value: createTemplate): Self = StObject.set(x, "CREATE_TEMPLATE", value.asInstanceOf[js.Any])
    
    inline def setDECLINE(value: decline): Self = StObject.set(x, "DECLINE", value.asInstanceOf[js.Any])
    
    inline def setERROR(value: error): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setFINISH(value: finish): Self = StObject.set(x, "FINISH", value.asInstanceOf[js.Any])
    
    inline def setMESSAGE(value: message): Self = StObject.set(x, "MESSAGE", value.asInstanceOf[js.Any])
    
    inline def setOPEN(value: open): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
    
    inline def setREADY(value: ready): Self = StObject.set(x, "READY", value.asInstanceOf[js.Any])
    
    inline def setREASSIGN(value: reassign): Self = StObject.set(x, "REASSIGN", value.asInstanceOf[js.Any])
    
    inline def setSEND(value: send): Self = StObject.set(x, "SEND", value.asInstanceOf[js.Any])
    
    inline def setSIGN(value: sign): Self = StObject.set(x, "SIGN", value.asInstanceOf[js.Any])
  }
}
