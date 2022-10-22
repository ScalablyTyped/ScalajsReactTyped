package typingsJapgolly.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestLookupsMod {
  
  @JSImport("twilio/lib/rest/Lookups", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Lookups {
    /**
      * Initialize lookups domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typingsJapgolly.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Lookups
    extends typingsJapgolly.twilio.libBaseDomainMod.^ {
    
    val phoneNumbers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PhoneNumberListInstance */ Any = js.native
    
    val v1: typingsJapgolly.twilio.libRestLookupsV1Mod.^ = js.native
    
    val v2: typingsJapgolly.twilio.libRestLookupsV2Mod.^ = js.native
  }
}
