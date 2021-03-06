package typingsJapgolly.pullStream

import typingsJapgolly.pullStream.mod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sinks/collect", JSImport.Namespace)
@js.native
object collectMod extends js.Object {
  /**
    * Read the stream into an array, then call `cb`.
    */
  def apply[T](): Sink[T] = js.native
  def apply[T](cb: js.Function2[/* err */ js.Error | Null, /* results */ js.Array[T], _]): Sink[T] = js.native
}

