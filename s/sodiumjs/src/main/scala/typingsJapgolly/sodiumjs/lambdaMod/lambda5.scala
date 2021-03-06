package typingsJapgolly.sodiumjs.lambdaMod

import typingsJapgolly.sodiumjs.cellMod.Cell
import typingsJapgolly.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "lambda5")
@js.native
object lambda5 extends js.Object {
  def apply[A, B, C, D, E, F](
    f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F],
    deps: js.Array[Stream[_] | Cell[_]]
  ): Lambda5_[A, B, C, D, E, F] = js.native
}

