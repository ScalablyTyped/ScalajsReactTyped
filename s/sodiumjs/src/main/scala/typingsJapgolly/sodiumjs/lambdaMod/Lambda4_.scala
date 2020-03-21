package typingsJapgolly.sodiumjs.lambdaMod

import typingsJapgolly.sodiumjs.cellMod.Cell
import typingsJapgolly.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda4")
@js.native
class Lambda4_[A, B, C, D, E] protected () extends js.Object {
  def this(
    f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E],
    deps: js.Array[Stream[_] | Cell[_]]
  ) = this()
  var deps: js.Array[Stream[_] | Cell[_]] = js.native
  def f(a: A, b: B, c: C, d: D): E = js.native
}

