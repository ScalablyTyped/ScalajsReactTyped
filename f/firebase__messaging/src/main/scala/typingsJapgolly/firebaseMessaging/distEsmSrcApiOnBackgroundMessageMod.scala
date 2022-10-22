package typingsJapgolly.firebaseMessaging

import typingsJapgolly.firebaseMessaging.distEsmSrcInterfacesPublicTypesMod.MessagePayload
import typingsJapgolly.firebaseMessaging.distEsmSrcMessagingServiceMod.MessagingService
import typingsJapgolly.firebaseUtil.mod.NextFn
import typingsJapgolly.firebaseUtil.mod.Observer
import typingsJapgolly.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcApiOnBackgroundMessageMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/api/onBackgroundMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onBackgroundMessage(messaging: MessagingService, nextOrObserver: NextFn[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onBackgroundMessage(messaging: MessagingService, nextOrObserver: Observer[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
}
