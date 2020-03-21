package typingsJapgolly.pullStream

import typingsJapgolly.pullStream.mod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sinks/on-end", JSImport.Namespace)
@js.native
object onEndMod extends js.Object {
  /**
    * Drain the stream and then call `cb` when done.
    */
  def apply(): Sink[_] = js.native
  def apply(cb: js.Function1[/* err */ js.Error | Null, _]): Sink[_] = js.native
}

