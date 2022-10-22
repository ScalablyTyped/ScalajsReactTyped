package typingsJapgolly.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestNotifyV1Mod {
  
  @JSImport("twilio/lib/rest/notify/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Notify
      *
      * @param domain - The twilio domain
      */
    def this(domain: typingsJapgolly.twilio.libRestNotifyMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typingsJapgolly.twilio.libBaseVersionMod.^ {
    
    val credentials: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CredentialListInstance */ Any = js.native
    
    val services: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any = js.native
  }
}
