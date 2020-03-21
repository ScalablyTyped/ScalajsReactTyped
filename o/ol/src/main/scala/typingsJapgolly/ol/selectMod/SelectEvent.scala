package typingsJapgolly.ol.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Select", "SelectEvent")
@js.native
class SelectEvent protected ()
  extends typingsJapgolly.ol.eventMod.default {
  def this(
    `type`: SelectEventType,
    selected: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]],
    deselected: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]],
    mapBrowserEvent: typingsJapgolly.ol.mapBrowserEventMod.default
  ) = this()
  var deselected: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]] = js.native
  var mapBrowserEvent: typingsJapgolly.ol.mapBrowserEventMod.default = js.native
  var selected: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]] = js.native
}

