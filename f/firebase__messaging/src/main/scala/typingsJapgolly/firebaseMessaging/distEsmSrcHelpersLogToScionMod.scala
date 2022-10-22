package typingsJapgolly.firebaseMessaging

import typingsJapgolly.firebaseMessaging.distEsmSrcInterfacesInternalMessagePayloadMod.ConsoleMessageData
import typingsJapgolly.firebaseMessaging.distEsmSrcInterfacesInternalMessagePayloadMod.MessageType
import typingsJapgolly.firebaseMessaging.distEsmSrcMessagingServiceMod.MessagingService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcHelpersLogToScionMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/helpers/logToScion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def logToScion(messaging: MessagingService, messageType: MessageType, data: ConsoleMessageData): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("logToScion")(messaging.asInstanceOf[js.Any], messageType.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
