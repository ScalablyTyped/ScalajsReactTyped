package typingsJapgolly.firebaseMessaging

import typingsJapgolly.firebaseAppTypes.mod.FirebaseApp
import typingsJapgolly.firebaseAppTypes.privateMod.FirebaseService
import typingsJapgolly.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typingsJapgolly.firebaseMessagingTypes.mod.FirebaseMessaging
import typingsJapgolly.firebaseUtil.subscribeMod.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/controllers/window-controller", JSImport.Namespace)
@js.native
object windowControllerMod extends js.Object {
  @js.native
  class WindowController protected ()
    extends FirebaseMessaging
       with FirebaseService {
    def this(firebaseDependencies: FirebaseInternalDependencies) = this()
    /* CompleteClass */
    override var app: FirebaseApp = js.native
    val firebaseDependencies: js.Any = js.native
    /**
      * Creates or updates the default service worker registration.
      * @return The service worker registration to be used for the push service.
      */
    var getServiceWorkerRegistration: js.Any = js.native
    var logEvent: js.Any = js.native
    var messageEventListener: js.Any = js.native
    var onMessageCallback: js.Any = js.native
    var swRegistration: js.UndefOr[js.Any] = js.native
    var vapidKey: js.Any = js.native
    @JSName("app")
    def app_MWindowController(): typingsJapgolly.firebaseMessaging.mod.FirebaseApp = js.native
    def deleteToken(): js.Promise[Boolean] = js.native
    def onTokenRefresh(): Unsubscribe = js.native
    def setBackgroundMessageHandler(): Unit = js.native
  }
  
}

