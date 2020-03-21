package typingsJapgolly.sodiumjs.lambdaMod

import typingsJapgolly.sodiumjs.cellMod.Cell
import typingsJapgolly.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "lambda4")
@js.native
object lambda4 extends js.Object {
  def apply[A, B, C, D, E](
    f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E],
    deps: js.Array[Stream[_] | Cell[_]]
  ): Lambda4_[A, B, C, D, E] = js.native
}

