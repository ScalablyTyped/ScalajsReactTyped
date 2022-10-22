package typingsJapgolly.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Chat room
  */
trait ChatRoom extends StObject {
  
  /**
    * Chat room id
    */
  var id: String
  
  /**
    * Chat room password
    */
  var pass: String
}
object ChatRoom {
  
  inline def apply(id: String, pass: String): ChatRoom = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoom]
  }
  
  extension [Self <: ChatRoom](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
  }
}
