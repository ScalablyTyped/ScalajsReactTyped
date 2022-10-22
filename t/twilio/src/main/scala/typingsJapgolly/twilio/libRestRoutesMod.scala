package typingsJapgolly.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestRoutesMod {
  
  @JSImport("twilio/lib/rest/Routes", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Routes {
    /**
      * Initialize routes domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typingsJapgolly.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Routes
    extends typingsJapgolly.twilio.libBaseDomainMod.^ {
    
    val phoneNumbers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PhoneNumberListInstance */ Any = js.native
    
    val sipDomains: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SipDomainListInstance */ Any = js.native
    
    val trunks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TrunkListInstance */ Any = js.native
    
    val v2: typingsJapgolly.twilio.libRestRoutesV2Mod.^ = js.native
  }
}
