package typingsJapgolly.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thread extends StObject {
  
  /** Resource name, in the form "spaces/ *‍/threads/ *". Example: spaces/AAAAAAAAAAA/threads/TTTTTTTTTTT */
  var name: js.UndefOr[String] = js.undefined
}
object Thread {
  
  inline def apply(): Thread = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thread]
  }
  
  extension [Self <: Thread](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
