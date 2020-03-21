package typingsJapgolly.sodiumjs.mod

import typingsJapgolly.sodiumjs.vertexMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "Vertex")
@js.native
class Vertex protected ()
  extends typingsJapgolly.sodiumjs.vertexMod.Vertex {
  def this(name: String, rank: Double, sources: js.Array[Source]) = this()
}

/* static members */
@JSImport("sodiumjs", "Vertex")
@js.native
object Vertex extends js.Object {
  var NULL: typingsJapgolly.sodiumjs.vertexMod.Vertex = js.native
  var collectingCycles: Boolean = js.native
  var toBeFreedList: js.Array[typingsJapgolly.sodiumjs.vertexMod.Vertex] = js.native
  def collectCycles(): scala.Unit = js.native
  def collectRoots(): scala.Unit = js.native
  def markRoots(): scala.Unit = js.native
  def scanRoots(): scala.Unit = js.native
}

