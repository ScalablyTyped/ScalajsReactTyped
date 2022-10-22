package typingsJapgolly.firebaseMessaging

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseMessaging.distSrcInterfacesPublicTypesMod.GetTokenOptions
import typingsJapgolly.firebaseMessaging.distSrcInterfacesPublicTypesMod.MessagePayload
import typingsJapgolly.firebaseMessaging.distSrcInterfacesPublicTypesMod.Messaging
import typingsJapgolly.firebaseUtil.mod.NextFn
import typingsJapgolly.firebaseUtil.mod.Observer
import typingsJapgolly.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiMod {
  
  @JSImport("@firebase/messaging/dist/src/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteToken(messaging: Messaging): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteToken")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def experimentalSetDeliveryMetricsExportedToBigQueryEnabled(messaging: Messaging, enable: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("experimentalSetDeliveryMetricsExportedToBigQueryEnabled")(messaging.asInstanceOf[js.Any], enable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getMessagingInSw(): Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessagingInSw")().asInstanceOf[Messaging]
  inline def getMessagingInSw(app: FirebaseApp): Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessagingInSw")(app.asInstanceOf[js.Any]).asInstanceOf[Messaging]
  
  inline def getMessagingInWindow(): Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessagingInWindow")().asInstanceOf[Messaging]
  inline def getMessagingInWindow(app: FirebaseApp): Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessagingInWindow")(app.asInstanceOf[js.Any]).asInstanceOf[Messaging]
  
  inline def getToken(messaging: Messaging): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getToken(messaging: Messaging, options: GetTokenOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(messaging.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def onBackgroundMessage(messaging: Messaging, nextOrObserver: NextFn[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onBackgroundMessage(messaging: Messaging, nextOrObserver: Observer[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onMessage(messaging: Messaging, nextOrObserver: NextFn[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onMessage(messaging: Messaging, nextOrObserver: Observer[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
}
