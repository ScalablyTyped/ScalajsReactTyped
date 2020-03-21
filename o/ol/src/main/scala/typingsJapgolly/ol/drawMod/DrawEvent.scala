package typingsJapgolly.ol.drawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Draw", "DrawEvent")
@js.native
class DrawEvent protected ()
  extends typingsJapgolly.ol.eventMod.default {
  def this(
    `type`: DrawEventType,
    feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]
  ) = this()
  var feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default] = js.native
}

