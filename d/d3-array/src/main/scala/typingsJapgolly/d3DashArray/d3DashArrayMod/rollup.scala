package typingsJapgolly.d3DashArray.d3DashArrayMod

import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-array", "rollup")
@js.native
object rollup extends js.Object {
  def apply[TObject, TKey, TReduce](
    a: js.Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key: js.Function1[/* value */ TObject, TKey]
  ): Map[TKey, TReduce] = js.native
}

