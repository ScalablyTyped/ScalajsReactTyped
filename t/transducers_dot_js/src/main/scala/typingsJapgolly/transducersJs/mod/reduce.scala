package typingsJapgolly.transducersJs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "reduce")
@js.native
object reduce extends js.Object {
  def apply[TResult, TInput](
    coll: StringDictionary[TInput],
    xf: Transformer_[TResult, js.Tuple2[String, TInput]],
    init: TResult
  ): TResult = js.native
  def apply[TResult, TInput](coll: Iterable[TInput], xf: Transformer_[TResult, TInput], init: TResult): TResult = js.native
}

