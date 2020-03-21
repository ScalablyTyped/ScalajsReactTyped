package typingsJapgolly.pgQueryStream.mod

import typingsJapgolly.node.AnonEnd
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.pg.mod.Submittable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryStream
  extends Readable
     with Submittable {
  var batchSize: Double = js.native
  var text: String = js.native
  var values: js.UndefOr[js.Array[_]] = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
}

