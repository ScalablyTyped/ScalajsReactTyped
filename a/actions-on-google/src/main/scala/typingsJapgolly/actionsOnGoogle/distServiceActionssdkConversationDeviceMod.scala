package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Device
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationDeviceMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/device", "Device")
  @js.native
  /** @hidden */
  open class Device () extends StObject {
    def this(device: GoogleActionsV2Device) = this()
    
    /**
      * If granted permission to device's location in previous intent, returns device's
      * location (see {@link Permission|conv.ask(new Permission)}).
      * @public
      */
    var location: js.UndefOr[GoogleActionsV2Location] = js.native
  }
}
