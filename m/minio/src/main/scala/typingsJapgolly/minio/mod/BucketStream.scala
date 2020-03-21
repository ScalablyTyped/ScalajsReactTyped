package typingsJapgolly.minio.mod

import typingsJapgolly.minio.minioStrings.data
import typingsJapgolly.minio.minioStrings.end
import typingsJapgolly.minio.minioStrings.error
import typingsJapgolly.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketStream[T] extends Stream {
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* item */ T, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
}

