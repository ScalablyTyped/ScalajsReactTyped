package typingsJapgolly.firebaseMessagingCompat

import typingsJapgolly.firebaseAppCompat.mod.FirebaseService
import typingsJapgolly.firebaseMessaging.mod.MessagePayload
import typingsJapgolly.firebaseMessaging.mod.Messaging
import typingsJapgolly.firebaseMessagingCompat.anon.ServiceWorkerRegistration
import typingsJapgolly.firebaseMessagingCompat.appCompatMod.FirebaseApp
import typingsJapgolly.firebaseUtil.mod.NextFn
import typingsJapgolly.firebaseUtil.mod.Observer
import typingsJapgolly.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMessagingCompatMod {
  
  @JSImport("@firebase/messaging-compat/dist/src/messaging-compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/messaging-compat/dist/src/messaging-compat", "MessagingCompatImpl")
  @js.native
  open class MessagingCompatImpl protected ()
    extends StObject
       with MessagingCompat
       with FirebaseService {
    def this(app: FirebaseApp, _delegate: Messaging) = this()
    
    /* CompleteClass */
    var _delegate: Any = js.native
    @JSName("_delegate")
    val _delegate_MessagingCompatImpl: Messaging = js.native
    
    /* CompleteClass */
    var app: typingsJapgolly.firebaseAppCompat.mod.FirebaseApp = js.native
    @JSName("app")
    val app_MessagingCompatImpl: FirebaseApp = js.native
  }
  
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  
  @js.native
  trait MessagingCompat extends StObject {
    
    def deleteToken(): js.Promise[Boolean] = js.native
    
    def getToken(): js.Promise[String] = js.native
    def getToken(options: ServiceWorkerRegistration): js.Promise[String] = js.native
    
    def onBackgroundMessage(nextOrObserver: NextFn[MessagePayload]): Unsubscribe = js.native
    def onBackgroundMessage(nextOrObserver: Observer[MessagePayload]): Unsubscribe = js.native
    
    def onMessage(nextOrObserver: NextFn[MessagePayload]): Unsubscribe = js.native
    def onMessage(nextOrObserver: Observer[MessagePayload]): Unsubscribe = js.native
  }
}
