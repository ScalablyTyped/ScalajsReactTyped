package typingsJapgolly.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestProxyMod {
  
  @JSImport("twilio/lib/rest/Proxy", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Proxy {
    /**
      * Initialize proxy domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typingsJapgolly.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Proxy
    extends typingsJapgolly.twilio.libBaseDomainMod.^ {
    
    val services: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any = js.native
    
    val v1: typingsJapgolly.twilio.libRestProxyV1Mod.^ = js.native
  }
}
