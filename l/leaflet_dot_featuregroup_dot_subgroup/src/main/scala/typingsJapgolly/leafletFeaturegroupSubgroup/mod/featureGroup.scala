package typingsJapgolly.leafletFeaturegroupSubgroup.mod

import typingsJapgolly.leaflet.mod.Layer
import typingsJapgolly.leaflet.mod.LayerGroup_
import typingsJapgolly.leafletFeaturegroupSubgroup.mod.FeatureGroup_.SubGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "featureGroup")
@js.native
object featureGroup extends js.Object {
  /**
    * Creates a feature subgroup, optionally given an initial parent group and a set of layers.
    */
  def subGroup(): SubGroup[_] = js.native
  def subGroup(parentGroup: LayerGroup_[_]): SubGroup[_] = js.native
  def subGroup(parentGroup: LayerGroup_[_], layers: js.Array[Layer]): SubGroup[_] = js.native
}

