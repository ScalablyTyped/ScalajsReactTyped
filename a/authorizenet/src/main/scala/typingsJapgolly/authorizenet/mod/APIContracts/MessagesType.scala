package typingsJapgolly.authorizenet.mod.APIContracts

import typingsJapgolly.authorizenet.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.MessagesType")
@js.native
open class MessagesType () extends StObject {
  def this(obj: typingsJapgolly.authorizenet.anon.Message) = this()
  
  def getMessage(): js.Array[typingsJapgolly.authorizenet.mod.APIContracts.MessagesType.Message] = js.native
  
  def getResultCode(): String | Null = js.native
  
  var message: js.Array[typingsJapgolly.authorizenet.mod.APIContracts.MessagesType.Message] = js.native
  
  var resultCode: String | Null = js.native
  
  def setMessage(p_message: js.Array[typingsJapgolly.authorizenet.mod.APIContracts.MessagesType.Message]): Unit = js.native
  
  def setResultCode(p_resultCode: String): Unit = js.native
}
object MessagesType {
  
  @JSImport("authorizenet", "APIContracts.MessagesType.Message")
  @js.native
  open class Message () extends StObject {
    def this(obj: Text) = this()
    
    var code: String | Null = js.native
    
    def getCode(): String | Null = js.native
    
    def getText(): String | Null = js.native
    
    def setCode(p_code: String): Unit = js.native
    
    def setText(p_text: String): Unit = js.native
    
    var text: String | Null = js.native
  }
}
