package typingsJapgolly.ol.interactionInteractionMod

import typingsJapgolly.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Interaction", "zoomByDelta")
@js.native
object zoomByDelta extends js.Object {
  def apply(view: typingsJapgolly.ol.viewMod.default, delta: Double): Unit = js.native
  def apply(view: typingsJapgolly.ol.viewMod.default, delta: Double, opt_anchor: Coordinate): Unit = js.native
  def apply(
    view: typingsJapgolly.ol.viewMod.default,
    delta: Double,
    opt_anchor: Coordinate,
    opt_duration: Double
  ): Unit = js.native
}

