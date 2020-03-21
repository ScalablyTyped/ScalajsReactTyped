package typingsJapgolly.topojson.mod

import typingsJapgolly.topojsonSimplify.mod.Filter_
import typingsJapgolly.topojsonSpecification.mod.Objects
import typingsJapgolly.topojsonSpecification.mod.OrNull
import typingsJapgolly.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "filter")
@js.native
object filter extends js.Object {
  def apply[K /* <: Objects[js.Object] */](topology: Topology[K], filter: Filter_): Topology[OrNull[K]] = js.native
}

