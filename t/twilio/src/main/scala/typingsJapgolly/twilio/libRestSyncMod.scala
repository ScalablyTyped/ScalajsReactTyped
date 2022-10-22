package typingsJapgolly.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestSyncMod {
  
  @JSImport("twilio/lib/rest/Sync", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Sync {
    /**
      * Initialize sync domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typingsJapgolly.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Sync
    extends typingsJapgolly.twilio.libBaseDomainMod.^ {
    
    val services: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any = js.native
    
    val v1: typingsJapgolly.twilio.libRestSyncV1Mod.^ = js.native
  }
}
