package typingsJapgolly.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestIpMessagingMod {
  
  @JSImport("twilio/lib/rest/IpMessaging", JSImport.Namespace)
  @js.native
  open class ^ protected () extends IpMessaging {
    /**
      * Initialize ip_messaging domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typingsJapgolly.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait IpMessaging
    extends typingsJapgolly.twilio.libBaseDomainMod.^ {
    
    val credentials: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CredentialListInstance */ Any = js.native
    
    val services: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any = js.native
    
    val v1: typingsJapgolly.twilio.libRestIpMessagingV1Mod.^ = js.native
    
    val v2: typingsJapgolly.twilio.libRestIpMessagingV2Mod.^ = js.native
  }
}
