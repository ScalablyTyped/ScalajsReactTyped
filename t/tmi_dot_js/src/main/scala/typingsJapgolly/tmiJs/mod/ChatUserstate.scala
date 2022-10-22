package typingsJapgolly.tmiJs.mod

import typingsJapgolly.tmiJs.tmiJsStrings.action
import typingsJapgolly.tmiJs.tmiJsStrings.chat
import typingsJapgolly.tmiJs.tmiJsStrings.whisper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatUserstate
  extends StObject
     with CommonUserstate
     with Userstate {
  
  var bits: js.UndefOr[String] = js.undefined
  
  var `message-type`: js.UndefOr[chat | action | whisper] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object ChatUserstate {
  
  inline def apply(): ChatUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatUserstate]
  }
  
  extension [Self <: ChatUserstate](x: Self) {
    
    inline def setBits(value: String): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    
    inline def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
    
    inline def `setMessage-type`(value: chat | action | whisper): Self = StObject.set(x, "message-type", value.asInstanceOf[js.Any])
    
    inline def `setMessage-typeUndefined`: Self = StObject.set(x, "message-type", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
