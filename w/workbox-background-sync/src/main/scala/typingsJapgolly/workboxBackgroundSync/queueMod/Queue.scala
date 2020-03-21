package typingsJapgolly.workboxBackgroundSync.queueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-background-sync/Queue", "Queue")
@js.native
class Queue protected () extends js.Object {
  def this(name: String) = this()
  def this(name: String, options: QueueOptions) = this()
  val name: String = js.native
  def getAll(): js.Promise[js.Array[QueueEntry[_]]] = js.native
  def popRequest(): js.Promise[QueueEntry[_]] = js.native
  def pushRequest(entry: QueueEntry[_]): js.Promise[Unit] = js.native
  def registerSync(): js.Promise[Unit] = js.native
  def shiftRequest(): js.Promise[QueueEntry[_]] = js.native
  def unshiftRequest(entry: QueueEntry[_]): js.Promise[Unit] = js.native
}

