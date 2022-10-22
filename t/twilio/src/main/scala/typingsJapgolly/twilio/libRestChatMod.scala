package typingsJapgolly.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestChatMod {
  
  @JSImport("twilio/lib/rest/Chat", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Chat {
    /**
      * Initialize chat domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typingsJapgolly.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Chat
    extends typingsJapgolly.twilio.libBaseDomainMod.^ {
    
    val channels: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChannelListInstance */ Any = js.native
    
    val credentials: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CredentialListInstance */ Any = js.native
    
    val services: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any = js.native
    
    val v1: typingsJapgolly.twilio.libRestChatV1Mod.^ = js.native
    
    val v2: typingsJapgolly.twilio.libRestChatV2Mod.^ = js.native
    
    val v3: typingsJapgolly.twilio.libRestChatV3Mod.^ = js.native
  }
}
