package typingsJapgolly.sodiumjs.mod

import typingsJapgolly.sodiumjs.lambdaMod.Lambda2_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "lambda2")
@js.native
object lambda2 extends js.Object {
  def apply[A, B, C](
    f: js.Function2[/* a */ A, /* b */ B, C],
    deps: js.Array[
      typingsJapgolly.sodiumjs.streamMod.Stream[_] | typingsJapgolly.sodiumjs.cellMod.Cell[_]
    ]
  ): Lambda2_[A, B, C] = js.native
}

