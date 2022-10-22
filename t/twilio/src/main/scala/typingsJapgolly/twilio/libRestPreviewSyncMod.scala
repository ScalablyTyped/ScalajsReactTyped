package typingsJapgolly.twilio

import typingsJapgolly.twilio.libRestPreviewSyncServiceMod.ServiceContext
import typingsJapgolly.twilio.libRestPreviewSyncServiceMod.ServiceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewSyncMod {
  
  @JSImport("twilio/lib/rest/preview/Sync", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Sync {
    /**
      * Initialize the Sync version of Preview
      *
      * @param domain - The twilio domain
      */
    def this(domain: typingsJapgolly.twilio.libRestPreviewMod.^) = this()
  }
  
  @js.native
  trait Sync
    extends typingsJapgolly.twilio.libBaseVersionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def services(sid: String): ServiceContext = js.native
    @JSName("services")
    val services_Original: ServiceListInstance = js.native
  }
}
