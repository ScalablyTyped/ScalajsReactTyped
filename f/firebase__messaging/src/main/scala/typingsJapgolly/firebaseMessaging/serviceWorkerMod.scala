package typingsJapgolly.firebaseMessaging

import org.scalajs.dom.experimental.push.PushEncryptionKeyName
import org.scalajs.dom.experimental.push.PushSubscriptionJSON
import org.scalajs.dom.experimental.push.PushSubscriptionOptions
import typingsJapgolly.std.EventInit
import typingsJapgolly.std.PushManager
import typingsJapgolly.std.PushSubscription
import typingsJapgolly.std.ServiceWorkerRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/testing/fakes/service-worker", JSImport.Namespace)
@js.native
object serviceWorkerMod extends js.Object {
  @js.native
  class FakeEvent protected () extends ExtendableEvent {
    def this(`type`: String) = this()
    def this(`type`: String, options: EventInit) = this()
    @JSName("currentTarget")
    var currentTarget_FakeEvent: Null = js.native
    @JSName("srcElement")
    var srcElement_FakeEvent: Null = js.native
    @JSName("target")
    var target_FakeEvent: Null = js.native
    def initEvent(): Unit = js.native
    def waitUntil(): Unit = js.native
  }
  
  @js.native
  trait FakePushManager extends PushManager {
    var subscription: js.Any = js.native
  }
  
  @js.native
  class FakePushSubscription () extends PushSubscription {
    var auth: String = js.native
    /* CompleteClass */
    override val endpoint: String = js.native
    /* CompleteClass */
    override val expirationTime: Double | Null = js.native
    @JSName("expirationTime")
    var expirationTime_FakePushSubscription: Double = js.native
    /* CompleteClass */
    override val options: PushSubscriptionOptions = js.native
    var p256: String = js.native
    /* CompleteClass */
    override def getKey(name: PushEncryptionKeyName): scala.scalajs.js.typedarray.ArrayBuffer | Null = js.native
    /* CompleteClass */
    override def toJSON(): PushSubscriptionJSON = js.native
    /* CompleteClass */
    override def unsubscribe(): js.Promise[Boolean] = js.native
  }
  
  @js.native
  class FakeServiceWorkerRegistration () extends ServiceWorkerRegistration {
    @JSName("active")
    var active_FakeServiceWorkerRegistration: Null = js.native
    @JSName("installing")
    var installing_FakeServiceWorkerRegistration: Null = js.native
    @JSName("onupdatefound")
    var onupdatefound_FakeServiceWorkerRegistration: Null = js.native
    @JSName("pushManager")
    var pushManager_FakeServiceWorkerRegistration: FakePushManager = js.native
    @JSName("waiting")
    var waiting_FakeServiceWorkerRegistration: Null = js.native
    def addEventListener(): Unit = js.native
    def dispatchEvent(): Boolean = js.native
    def removeEventListener(): Unit = js.native
    def showNotification(): js.Promise[Unit] = js.native
  }
  
  def mockServiceWorker(): Unit = js.native
  def restoreServiceWorker(): Unit = js.native
}

