package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Chat

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for getting chat capabilities. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Chat.ChatCapabilitiesManager")
@js.native
open class ChatCapabilitiesManager ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat.ChatCapabilitiesManager
object ChatCapabilitiesManager {
  
  @JSGlobal("Windows.ApplicationModel.Chat.ChatCapabilitiesManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Asynchronously gets the locally cached Rich Communication Services (RCS) chat capabilities for the specified phone number.
    * @param address The phone number for which to get the RCS chat capabilites
    * @return The locally cached RCS chat capabilities.
    */
  /* static member */
  inline def getCachedCapabilitiesAsync(address: String): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat.ChatCapabilities] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCachedCapabilitiesAsync")(address.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat.ChatCapabilities]]
  
  /**
    * Asynchronously gets the Rich Communication Services (RCS) chat capabilities for the specified phone number from the service provider.
    * @param address The phone number for which to get the RCS chat capabilities.
    * @return The RCS chat capabilities from the service provider.
    */
  /* static member */
  inline def getCapabilitiesFromNetworkAsync(address: String): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat.ChatCapabilities] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCapabilitiesFromNetworkAsync")(address.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat.ChatCapabilities]]
}
