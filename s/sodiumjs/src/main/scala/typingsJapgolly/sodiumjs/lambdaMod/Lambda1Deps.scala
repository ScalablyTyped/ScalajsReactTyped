package typingsJapgolly.sodiumjs.lambdaMod

import typingsJapgolly.sodiumjs.cellMod.Cell
import typingsJapgolly.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda1_deps")
@js.native
object Lambda1Deps extends js.Object {
  def apply[A, B](f: js.Function1[/* a */ A, B]): js.Array[Stream[_] | Cell[_]] = js.native
  def apply[A, B](f: Lambda1_[A, B]): js.Array[Stream[_] | Cell[_]] = js.native
}

