package typingsJapgolly.websocket.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.websocket.mod.IUtf8Message
  - typingsJapgolly.websocket.mod.IBinaryMessage
*/
trait Message extends StObject
object Message {
  
  inline def IBinaryMessage(binaryData: Buffer): typingsJapgolly.websocket.mod.IBinaryMessage = {
    val __obj = js.Dynamic.literal(binaryData = binaryData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("binary")
    __obj.asInstanceOf[typingsJapgolly.websocket.mod.IBinaryMessage]
  }
  
  inline def IUtf8Message(utf8Data: String): typingsJapgolly.websocket.mod.IUtf8Message = {
    val __obj = js.Dynamic.literal(utf8Data = utf8Data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("utf8")
    __obj.asInstanceOf[typingsJapgolly.websocket.mod.IUtf8Message]
  }
}
