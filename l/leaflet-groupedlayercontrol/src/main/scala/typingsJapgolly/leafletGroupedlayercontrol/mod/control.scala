package typingsJapgolly.leafletGroupedlayercontrol.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.leaflet.mod.Layer
import typingsJapgolly.leaflet.mod.LayerGroup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "control")
@js.native
object control extends js.Object {
  def groupedLayers(
    baseLayers: StringDictionary[Layer],
    groupedOverlays: StringDictionary[StringDictionary[LayerGroup_[_]]],
    options: GroupedLayersOptions
  ): typingsJapgolly.leaflet.mod.Control_ = js.native
}

