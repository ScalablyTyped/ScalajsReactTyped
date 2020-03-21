package typingsJapgolly.supercluster.mod

import typingsJapgolly.supercluster.superclusterNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileFeature[C, P] extends js.Object {
  var geometry: js.Array[js.Tuple2[Double, Double]]
  var tags: (ClusterProperties with C) | P
  var `type`: `1`
}

object TileFeature {
  @scala.inline
  def apply[C, P](geometry: js.Array[js.Tuple2[Double, Double]], tags: (ClusterProperties with C) | P, `type`: `1`): TileFeature[C, P] = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileFeature[C, P]]
  }
}

