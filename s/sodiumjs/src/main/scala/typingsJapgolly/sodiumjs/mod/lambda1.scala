package typingsJapgolly.sodiumjs.mod

import typingsJapgolly.sodiumjs.lambdaMod.Lambda1_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "lambda1")
@js.native
object lambda1 extends js.Object {
  def apply[A, B](
    f: js.Function1[/* a */ A, B],
    deps: js.Array[
      typingsJapgolly.sodiumjs.streamMod.Stream[_] | typingsJapgolly.sodiumjs.cellMod.Cell[_]
    ]
  ): Lambda1_[A, B] = js.native
}

