package typingsJapgolly.azureMsalBrowser.mod

import typingsJapgolly.azureMsalBrowser.distEventEventMessageMod.EventMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "EventMessageUtils")
@js.native
open class EventMessageUtils ()
  extends typingsJapgolly.azureMsalBrowser.distEventEventMessageMod.EventMessageUtils
/* static members */
object EventMessageUtils {
  
  @JSImport("@azure/msal-browser", "EventMessageUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets interaction status from event message
    * @param message
    * @param currentStatus
    */
  inline def getInteractionStatusFromEvent(message: EventMessage): typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getInteractionStatusFromEvent")(message.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus | Null]
  inline def getInteractionStatusFromEvent(
    message: EventMessage,
    currentStatus: typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus
  ): typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getInteractionStatusFromEvent")(message.asInstanceOf[js.Any], currentStatus.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus | Null]
}
