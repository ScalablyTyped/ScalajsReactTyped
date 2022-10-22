package typingsJapgolly.firebaseMessaging

import typingsJapgolly.firebaseMessaging.distSrcMessagingServiceMod.MessagingService
import typingsJapgolly.firebaseMessaging.distSrcUtilSwTypesMod.NotificationEvent
import typingsJapgolly.firebaseMessaging.distSrcUtilSwTypesMod.PushEvent
import typingsJapgolly.firebaseMessaging.distSrcUtilSwTypesMod.PushSubscriptionChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcListenersSwListenersMod {
  
  @JSImport("@firebase/messaging/dist/src/listeners/sw-listeners", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onNotificationClick(event: NotificationEvent): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onNotificationClick")(event.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def onPush(event: PushEvent, messaging: MessagingService): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("onPush")(event.asInstanceOf[js.Any], messaging.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def onSubChange(event: PushSubscriptionChangeEvent, messaging: MessagingService): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("onSubChange")(event.asInstanceOf[js.Any], messaging.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
