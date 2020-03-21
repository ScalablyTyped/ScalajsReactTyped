package typingsJapgolly.sodiumjs.mod

import typingsJapgolly.sodiumjs.lambdaMod.Lambda4_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "lambda4")
@js.native
object lambda4 extends js.Object {
  def apply[A, B, C, D, E](
    f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E],
    deps: js.Array[
      typingsJapgolly.sodiumjs.streamMod.Stream[_] | typingsJapgolly.sodiumjs.cellMod.Cell[_]
    ]
  ): Lambda4_[A, B, C, D, E] = js.native
}

