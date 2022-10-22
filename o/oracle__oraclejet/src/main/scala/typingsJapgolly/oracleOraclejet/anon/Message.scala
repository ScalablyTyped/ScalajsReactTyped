package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var message: typingsJapgolly.oracleOraclejet.ojmessageMod.ojMessage.Message
}
object Message {
  
  inline def apply(message: typingsJapgolly.oracleOraclejet.ojmessageMod.ojMessage.Message): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setMessage(value: typingsJapgolly.oracleOraclejet.ojmessageMod.ojMessage.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
