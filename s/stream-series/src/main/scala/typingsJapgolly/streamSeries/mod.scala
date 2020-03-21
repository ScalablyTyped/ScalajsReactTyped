package typingsJapgolly.streamSeries

import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-series", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[T /* <: ReadableStream */](streams: T*): ReadWriteStream = js.native
}

