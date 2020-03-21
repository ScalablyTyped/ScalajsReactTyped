package typingsJapgolly.esriLeaflet.mod

import typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.FeatureLayerServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.FeatureLayerService` is an abstraction for interacting with Feature Layers running on ArcGIS Online
  * and ArcGIS Server that allows you to make requests to the API, as well as query, add, update and remove
  * features from the service.
  */
@JSImport("esri-leaflet", "FeatureLayerService")
@js.native
class FeatureLayerService_ protected ()
  extends typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.FeatureLayerService_ {
  def this(options: FeatureLayerServiceOptions) = this()
}

