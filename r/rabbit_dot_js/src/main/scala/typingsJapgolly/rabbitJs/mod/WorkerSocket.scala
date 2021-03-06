package typingsJapgolly.rabbitJs.mod

import typingsJapgolly.node.AnonEnd
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rabbit.js", "WorkerSocket")
@js.native
class WorkerSocket protected ()
  extends Readable
     with Socket {
  def this(channel: String, opts: SocketOptions) = this()
  def ack(): js.Any = js.native
  def discard(): js.Any = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
  def requeue(): js.Any = js.native
}

