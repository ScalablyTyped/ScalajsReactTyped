package typingsJapgolly.serviceWorkerMock.mod

import org.scalajs.dom.experimental.Notification
import typingsJapgolly.serviceWorkerMock.FnCall
import typingsJapgolly.serviceWorkerMock.PartialMessageEvent
import typingsJapgolly.serviceWorkerMock.serviceWorkerMockStrings.fetch
import typingsJapgolly.serviceWorkerMock.serviceWorkerMockStrings.message
import typingsJapgolly.serviceWorkerMock.serviceWorkerMockStrings.notificationclick
import typingsJapgolly.serviceWorkerMock.serviceWorkerMockStrings.notificationclose
import typingsJapgolly.serviceWorkerMock.serviceWorkerMockStrings.push
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  trait WorkerGlobalScope extends js.Object {
    var listeners: Listeners = js.native
    @JSName("snapshot")
    var snapshot_Original: js.Function0[Snapshot] = js.native
    @JSName("trigger")
    var trigger_Original: FnCall = js.native
    def snapshot(): Snapshot = js.native
    def trigger(`type`: String): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_fetch(name: fetch, request: String): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_fetch(name: fetch, request: Request): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_message(name: message, args: PartialMessageEvent): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_notificationclick(name: notificationclick, args: Notification): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_notificationclose(name: notificationclose, args: Notification): js.Promise[Unit] = js.native
    @JSName("trigger")
    def trigger_push(
      name: push,
      args: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ _
        ]
    ): js.Promise[Unit] = js.native
  }
  
  /**
    * A key/value map of active listeners (`install`/`activate`/`fetch`/etc).
    */
  val listeners: Listeners = js.native
  /**
    * Used to generate a snapshot of the service worker internals.
    */
  def snapshot(): Snapshot = js.native
  /**
    * Used to trigger active listeners.
    */
  def trigger(`type`: String): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_fetch(name: fetch, request: String): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_fetch(name: fetch, request: Request): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_message(name: message, args: PartialMessageEvent): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_notificationclick(name: notificationclick, args: Notification): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_notificationclose(name: notificationclose, args: Notification): js.Promise[Unit] = js.native
  @JSName("trigger")
  def trigger_push(
    name: push,
    args: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ _
    ]
  ): js.Promise[Unit] = js.native
}

