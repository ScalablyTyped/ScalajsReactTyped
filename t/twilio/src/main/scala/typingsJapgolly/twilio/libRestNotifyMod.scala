package typingsJapgolly.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestNotifyMod {
  
  @JSImport("twilio/lib/rest/Notify", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Notify {
    /**
      * Initialize notify domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typingsJapgolly.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Notify
    extends typingsJapgolly.twilio.libBaseDomainMod.^ {
    
    val credentials: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CredentialListInstance */ Any = js.native
    
    val services: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any = js.native
    
    val v1: typingsJapgolly.twilio.libRestNotifyV1Mod.^ = js.native
  }
}
