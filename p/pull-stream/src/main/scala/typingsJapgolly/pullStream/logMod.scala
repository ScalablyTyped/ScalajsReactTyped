package typingsJapgolly.pullStream

import typingsJapgolly.pullStream.mod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sinks/log", JSImport.Namespace)
@js.native
object logMod extends js.Object {
  /**
    * Output the stream to `console.log`.
    */
  def apply(): Sink[_] = js.native
}

