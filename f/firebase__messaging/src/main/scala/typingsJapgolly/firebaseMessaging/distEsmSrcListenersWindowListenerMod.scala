package typingsJapgolly.firebaseMessaging

import org.scalajs.dom.MessageEvent
import typingsJapgolly.firebaseMessaging.distEsmSrcMessagingServiceMod.MessagingService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcListenersWindowListenerMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/listeners/window-listener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def messageEventListener(messaging: MessagingService, event: MessageEvent): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("messageEventListener")(messaging.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
