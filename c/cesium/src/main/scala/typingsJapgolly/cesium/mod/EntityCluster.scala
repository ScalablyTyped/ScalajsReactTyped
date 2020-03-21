package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.AnonClusterBillboards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EntityCluster")
@js.native
class EntityCluster () extends js.Object {
  def this(options: AnonClusterBillboards) = this()
  var clusterBillboards: Boolean = js.native
  var clusterEvent: Event[js.Array[_]] = js.native
  var clusterLabels: Boolean = js.native
  var clusterPoints: Boolean = js.native
  var enabled: Boolean = js.native
  var minimumClusterSize: Double = js.native
  var pixelRange: Double = js.native
  def destroy(): Unit = js.native
}

