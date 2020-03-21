package typingsJapgolly.transducersJs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "toArray")
@js.native
object toArray extends js.Object {
  def apply[TInput, TOutput](coll: StringDictionary[TInput]): js.Array[TOutput] = js.native
  def apply[TInput, TOutput](coll: StringDictionary[TInput], xf: Transducer[js.Tuple2[String, TInput], TOutput]): js.Array[TOutput] = js.native
  def apply[TInput, TOutput](coll: Iterable[TInput]): js.Array[TOutput] = js.native
  def apply[TInput, TOutput](coll: Iterable[TInput], xf: Transducer[TInput, TOutput]): js.Array[TOutput] = js.native
}

