package typingsJapgolly.topojson.mod

import typingsJapgolly.topojsonSpecification.mod.Objects
import typingsJapgolly.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "simplify")
@js.native
object simplify extends js.Object {
  def apply[T /* <: Objects[js.Object] */](topology: Topology[T]): Topology[T] = js.native
  def apply[T /* <: Objects[js.Object] */](topology: Topology[T], minWeight: Double): Topology[T] = js.native
}

