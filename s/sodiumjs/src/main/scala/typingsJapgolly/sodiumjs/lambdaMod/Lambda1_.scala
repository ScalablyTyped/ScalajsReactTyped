package typingsJapgolly.sodiumjs.lambdaMod

import typingsJapgolly.sodiumjs.cellMod.Cell
import typingsJapgolly.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda1")
@js.native
class Lambda1_[A, B] protected () extends js.Object {
  def this(f: js.Function1[/* a */ A, B], deps: js.Array[Stream[_] | Cell[_]]) = this()
  var deps: js.Array[Stream[_] | Cell[_]] = js.native
  def f(a: A): B = js.native
}

