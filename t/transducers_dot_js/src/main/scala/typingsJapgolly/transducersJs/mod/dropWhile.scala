package typingsJapgolly.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "dropWhile")
@js.native
object dropWhile extends js.Object {
  def apply[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
}

