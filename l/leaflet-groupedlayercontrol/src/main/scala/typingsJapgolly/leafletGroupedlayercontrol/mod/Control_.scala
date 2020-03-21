package typingsJapgolly.leafletGroupedlayercontrol.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.leaflet.mod.Layer
import typingsJapgolly.leaflet.mod.LayerGroup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Control")
@js.native
object Control_ extends js.Object {
  @js.native
  class GroupedLayers protected ()
    extends typingsJapgolly.leaflet.mod.Control_ {
    def this(
      baseLayers: StringDictionary[Layer],
      groupedOverlays: StringDictionary[StringDictionary[LayerGroup_[_]]],
      options: GroupedLayersOptions
    ) = this()
  }
  
}

