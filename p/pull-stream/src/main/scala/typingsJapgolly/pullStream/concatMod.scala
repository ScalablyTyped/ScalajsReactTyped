package typingsJapgolly.pullStream

import typingsJapgolly.pullStream.mod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sinks/concat", JSImport.Namespace)
@js.native
object concatMod extends js.Object {
  /**
    * Concat stream of strings into single string, then call `cb`.
    */
  def apply(): Sink[String] = js.native
  def apply(cb: js.Function2[/* err */ js.Error | Null, /* result */ String, _]): Sink[String] = js.native
}

