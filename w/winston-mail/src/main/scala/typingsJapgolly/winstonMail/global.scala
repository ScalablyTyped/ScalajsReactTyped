package typingsJapgolly.winstonMail

import typingsJapgolly.winstonMail.mod.MailTransportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object winstonMail {
    
    @JSGlobal("winstonMail.Mail")
    @js.native
    open class Mail protected ()
      extends typingsJapgolly.winstonMail.mod.Mail {
      def this(options: MailTransportOptions) = this()
    }
    
    /* augmented module */
    object winstonMod {
      
      trait Transports extends StObject {
        
        var Mail: typingsJapgolly.winstonMail.mod.Mail
      }
      object Transports {
        
        inline def apply(Mail: typingsJapgolly.winstonMail.mod.Mail): Transports = {
          val __obj = js.Dynamic.literal(Mail = Mail.asInstanceOf[js.Any])
          __obj.asInstanceOf[Transports]
        }
        
        extension [Self <: Transports](x: Self) {
          
          inline def setMail(value: typingsJapgolly.winstonMail.mod.Mail): Self = StObject.set(x, "Mail", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
