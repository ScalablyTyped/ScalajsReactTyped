package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMailMailMessageMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/mail/MailMessage", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MailMessage {
    
    /* CompleteClass */
    override def decode(mailSource: String): Unit = js.native
    
    /* CompleteClass */
    var header: MailMessageHeader = js.native
    
    /* CompleteClass */
    var messagesParts: js.Array[Any] = js.native
  }
  @JSImport("@nginstack/engine/lib/mail/MailMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MailMessage extends StObject {
    
    def decode(mailSource: String): Unit
    
    var header: MailMessageHeader
    
    var messagesParts: js.Array[Any]
  }
  object MailMessage {
    
    inline def apply(decode: String => Callback, header: MailMessageHeader, messagesParts: js.Array[Any]): MailMessage = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1((t0: String) => decode(t0).runNow()), header = header.asInstanceOf[js.Any], messagesParts = messagesParts.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailMessage]
    }
    
    extension [Self <: MailMessage](x: Self) {
      
      inline def setDecode(value: String => Callback): Self = StObject.set(x, "decode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setHeader(value: MailMessageHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setMessagesParts(value: js.Array[Any]): Self = StObject.set(x, "messagesParts", value.asInstanceOf[js.Any])
      
      inline def setMessagesPartsVarargs(value: Any*): Self = StObject.set(x, "messagesParts", js.Array(value*))
    }
  }
  
  type MailMessageHeader = typingsJapgolly.nginstackEngine.libMailMailMessageHeaderMod.^
}
