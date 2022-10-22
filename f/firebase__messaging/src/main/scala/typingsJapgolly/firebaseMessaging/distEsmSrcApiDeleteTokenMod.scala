package typingsJapgolly.firebaseMessaging

import typingsJapgolly.firebaseMessaging.distEsmSrcMessagingServiceMod.MessagingService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcApiDeleteTokenMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/api/deleteToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteToken(messaging: MessagingService): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteToken")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
