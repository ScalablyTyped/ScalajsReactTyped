package typingsJapgolly.twilio

import typingsJapgolly.twilio.libRestPreviewWirelessCommandMod.CommandContext
import typingsJapgolly.twilio.libRestPreviewWirelessCommandMod.CommandListInstance
import typingsJapgolly.twilio.libRestPreviewWirelessRatePlanMod.RatePlanContext
import typingsJapgolly.twilio.libRestPreviewWirelessRatePlanMod.RatePlanListInstance
import typingsJapgolly.twilio.libRestPreviewWirelessSimMod.SimContext
import typingsJapgolly.twilio.libRestPreviewWirelessSimMod.SimListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewWirelessMod {
  
  @JSImport("twilio/lib/rest/preview/Wireless", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Wireless {
    /**
      * Initialize the Wireless version of Preview
      *
      * @param domain - The twilio domain
      */
    def this(domain: typingsJapgolly.twilio.libRestPreviewMod.^) = this()
  }
  
  @js.native
  trait Wireless
    extends typingsJapgolly.twilio.libBaseVersionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def commands(sid: String): CommandContext = js.native
    @JSName("commands")
    val commands_Original: CommandListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def ratePlans(sid: String): RatePlanContext = js.native
    @JSName("ratePlans")
    val ratePlans_Original: RatePlanListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def sims(sid: String): SimContext = js.native
    @JSName("sims")
    val sims_Original: SimListInstance = js.native
  }
}
