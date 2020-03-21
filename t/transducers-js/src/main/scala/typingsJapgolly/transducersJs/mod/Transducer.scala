package typingsJapgolly.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transducer[TInput, TOutput] extends js.Object {
  def apply[TResult](xf: Transformer[TResult, TOutput]): Transformer[TResult, TInput] = js.native
}

