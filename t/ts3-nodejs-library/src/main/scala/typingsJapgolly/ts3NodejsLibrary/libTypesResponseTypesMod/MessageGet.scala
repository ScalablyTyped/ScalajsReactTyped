package typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod

import typingsJapgolly.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageGet
  extends StObject
     with ResponseEntry {
  
  var cluid: String
  
  var message: String
  
  var msgid: String
  
  var subject: String
  
  var timestamp: Double
}
object MessageGet {
  
  inline def apply(cluid: String, message: String, msgid: String, subject: String, timestamp: Double): MessageGet = {
    val __obj = js.Dynamic.literal(cluid = cluid.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], msgid = msgid.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageGet]
  }
  
  extension [Self <: MessageGet](x: Self) {
    
    inline def setCluid(value: String): Self = StObject.set(x, "cluid", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMsgid(value: String): Self = StObject.set(x, "msgid", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
