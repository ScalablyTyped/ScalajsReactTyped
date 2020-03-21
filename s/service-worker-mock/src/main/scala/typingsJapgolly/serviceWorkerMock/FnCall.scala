package typingsJapgolly.serviceWorkerMock

import typingsJapgolly.serviceWorkerMock.serviceWorkerMockStrings.fetch
import typingsJapgolly.serviceWorkerMock.serviceWorkerMockStrings.message
import typingsJapgolly.serviceWorkerMock.serviceWorkerMockStrings.notificationclick
import typingsJapgolly.serviceWorkerMock.serviceWorkerMockStrings.notificationclose
import typingsJapgolly.serviceWorkerMock.serviceWorkerMockStrings.push
import typingsJapgolly.std.Notification
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(name: fetch, request: String): js.Promise[Unit] = js.native
  def apply(name: fetch, request: Request): js.Promise[Unit] = js.native
  def apply(name: message, args: PartialMessageEvent): js.Promise[Unit] = js.native
  def apply(name: notificationclick, args: Notification): js.Promise[Unit] = js.native
  def apply(name: notificationclose, args: Notification): js.Promise[Unit] = js.native
  def apply(
    name: push,
    args: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ _
    ]
  ): js.Promise[Unit] = js.native
  def apply(`type`: String): js.Promise[Unit] = js.native
}

