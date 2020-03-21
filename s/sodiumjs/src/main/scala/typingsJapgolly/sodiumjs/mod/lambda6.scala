package typingsJapgolly.sodiumjs.mod

import typingsJapgolly.sodiumjs.lambdaMod.Lambda6_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "lambda6")
@js.native
object lambda6 extends js.Object {
  def apply[A, B, C, D, E, F, G](
    f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G],
    deps: js.Array[
      typingsJapgolly.sodiumjs.streamMod.Stream[_] | typingsJapgolly.sodiumjs.cellMod.Cell[_]
    ]
  ): Lambda6_[A, B, C, D, E, F, G] = js.native
}

