package typingsJapgolly.firebaseMessaging

import org.scalajs.dom.ServiceWorkerRegistration
import typingsJapgolly.firebaseMessaging.distSrcMessagingServiceMod.MessagingService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersUpdateSwRegMod {
  
  @JSImport("@firebase/messaging/dist/src/helpers/updateSwReg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateSwReg(messaging: MessagingService): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSwReg")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def updateSwReg(messaging: MessagingService, swRegistration: ServiceWorkerRegistration): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSwReg")(messaging.asInstanceOf[js.Any], swRegistration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
