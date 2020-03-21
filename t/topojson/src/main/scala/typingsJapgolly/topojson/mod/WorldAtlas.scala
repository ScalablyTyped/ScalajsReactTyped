package typingsJapgolly.topojson.mod

import typingsJapgolly.topojson.AnonCountries
import typingsJapgolly.topojsonSpecification.mod.Arc
import typingsJapgolly.topojsonSpecification.mod.Objects
import typingsJapgolly.topojsonSpecification.mod.Properties
import typingsJapgolly.topojsonSpecification.mod.Topology
import typingsJapgolly.topojsonSpecification.mod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorldAtlas extends Topology[Objects[Properties]] {
  @JSName("bbox")
  var bbox_WorldAtlas: js.Tuple4[Double, Double, Double, Double]
  @JSName("objects")
  var objects_WorldAtlas: AnonCountries
  @JSName("transform")
  var transform_WorldAtlas: Transform
}

object WorldAtlas {
  @scala.inline
  def apply(
    arcs: js.Array[Arc],
    bbox: js.Tuple4[Double, Double, Double, Double],
    objects: AnonCountries,
    transform: Transform,
    `type`: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.Topology
  ): WorldAtlas = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorldAtlas]
  }
}

