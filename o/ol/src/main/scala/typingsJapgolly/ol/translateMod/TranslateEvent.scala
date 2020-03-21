package typingsJapgolly.ol.translateMod

import typingsJapgolly.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Translate", "TranslateEvent")
@js.native
class TranslateEvent ()
  extends typingsJapgolly.ol.eventMod.default {
  var coordinate: Coordinate = js.native
  var features: typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]] = js.native
  var mapBrowserEvent: typingsJapgolly.ol.mapBrowserEventMod.default = js.native
  var startCoordinate: Coordinate = js.native
}

