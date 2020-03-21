package typingsJapgolly.sodiumjs.lambdaMod

import typingsJapgolly.sodiumjs.cellMod.Cell
import typingsJapgolly.sodiumjs.streamMod.Stream
import typingsJapgolly.sodiumjs.vertexMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "toSources")
@js.native
object toSources extends js.Object {
  def apply(deps: js.Array[Stream[_] | Cell[_]]): js.Array[Source] = js.native
}

