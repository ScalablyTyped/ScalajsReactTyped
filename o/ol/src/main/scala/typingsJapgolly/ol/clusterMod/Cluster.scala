package typingsJapgolly.ol.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster
  extends typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geometryMod.default] {
  var distance: Double = js.native
  var features: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]] = js.native
  var resolution: Double = js.native
  var source: typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geometryMod.default] = js.native
  /* protected */ def cluster(): Unit = js.native
  /* protected */ def createCluster(
    features: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]]
  ): typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default] = js.native
  /* protected */ def geometryFunction(feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]): typingsJapgolly.ol.pointMod.default = js.native
  def getDistance(): Double = js.native
  def getSource(): typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geometryMod.default] = js.native
  def setDistance(distance: Double): Unit = js.native
}

