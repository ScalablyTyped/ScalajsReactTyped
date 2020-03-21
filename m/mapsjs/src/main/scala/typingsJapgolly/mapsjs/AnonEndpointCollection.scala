package typingsJapgolly.mapsjs

import typingsJapgolly.mapsjs.mod.tile.quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndpointCollection extends js.Object {
  var endpointCollection: js.Array[String]
  var idxMinX: Double
  var idxMinY: Double
  var quadCollection: js.Array[quad]
  var ulX: Double
  var ulY: Double
}

object AnonEndpointCollection {
  @scala.inline
  def apply(
    endpointCollection: js.Array[String],
    idxMinX: Double,
    idxMinY: Double,
    quadCollection: js.Array[quad],
    ulX: Double,
    ulY: Double
  ): AnonEndpointCollection = {
    val __obj = js.Dynamic.literal(endpointCollection = endpointCollection.asInstanceOf[js.Any], idxMinX = idxMinX.asInstanceOf[js.Any], idxMinY = idxMinY.asInstanceOf[js.Any], quadCollection = quadCollection.asInstanceOf[js.Any], ulX = ulX.asInstanceOf[js.Any], ulY = ulY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEndpointCollection]
  }
}

