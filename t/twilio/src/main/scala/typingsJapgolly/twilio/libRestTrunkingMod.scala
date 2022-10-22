package typingsJapgolly.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestTrunkingMod {
  
  @JSImport("twilio/lib/rest/Trunking", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Trunking {
    /**
      * Initialize trunking domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typingsJapgolly.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Trunking
    extends typingsJapgolly.twilio.libBaseDomainMod.^ {
    
    val trunks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TrunkListInstance */ Any = js.native
    
    val v1: typingsJapgolly.twilio.libRestTrunkingV1Mod.^ = js.native
  }
}
