package typingsJapgolly.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestStudioMod {
  
  @JSImport("twilio/lib/rest/Studio", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Studio {
    /**
      * Initialize studio domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typingsJapgolly.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Studio
    extends typingsJapgolly.twilio.libBaseDomainMod.^ {
    
    val flowValidate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FlowValidateListInstance */ Any = js.native
    
    val flows: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FlowListInstance */ Any = js.native
    
    val v1: typingsJapgolly.twilio.libRestStudioV1Mod.^ = js.native
    
    val v2: typingsJapgolly.twilio.libRestStudioV2Mod.^ = js.native
  }
}
