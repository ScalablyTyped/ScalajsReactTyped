package typingsJapgolly.scChannel.mod

import typingsJapgolly.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-channel", JSImport.Namespace)
@js.native
class ^[T] protected () extends SCChannel[T] {
  def this(
    name: String,
    client: Client,
    eventDemux: typingsJapgolly.streamDemux.mod.^[T],
    dataStream: typingsJapgolly.asyncIterableStream.mod.^[T]
  ) = this()
  /* CompleteClass */
  override def next(): js.Promise[IteratorResult[T, _]] = js.native
  /* CompleteClass */
  override def `return`(): Unit = js.native
}

