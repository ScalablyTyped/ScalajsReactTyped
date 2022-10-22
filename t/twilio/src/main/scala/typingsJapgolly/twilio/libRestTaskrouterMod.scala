package typingsJapgolly.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestTaskrouterMod {
  
  @JSImport("twilio/lib/rest/Taskrouter", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Taskrouter {
    /**
      * Initialize taskrouter domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typingsJapgolly.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Taskrouter
    extends typingsJapgolly.twilio.libBaseDomainMod.^ {
    
    val v1: typingsJapgolly.twilio.libRestTaskrouterV1Mod.^ = js.native
    
    val workspaces: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WorkspaceListInstance */ Any = js.native
  }
}
