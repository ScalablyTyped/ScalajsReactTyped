package typingsJapgolly.leaflet.leafletMod

import typingsJapgolly.leaflet.leafletMod.Control.Attribution
import typingsJapgolly.leaflet.leafletMod.Control.AttributionOptions
import typingsJapgolly.leaflet.leafletMod.Control.Layers
import typingsJapgolly.leaflet.leafletMod.Control.LayersObject
import typingsJapgolly.leaflet.leafletMod.Control.LayersOptions
import typingsJapgolly.leaflet.leafletMod.Control.Scale
import typingsJapgolly.leaflet.leafletMod.Control.ScaleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "control")
@js.native
object control extends js.Object {
  def attribution(): Attribution = js.native
  def attribution(options: AttributionOptions): Attribution = js.native
  def layers(): Layers = js.native
  def layers(baseLayers: LayersObject): Layers = js.native
  def layers(baseLayers: LayersObject, overlays: LayersObject): Layers = js.native
  def layers(baseLayers: LayersObject, overlays: LayersObject, options: LayersOptions): Layers = js.native
  def scale(): Scale = js.native
  def scale(options: ScaleOptions): Scale = js.native
  def zoom(): typingsJapgolly.leaflet.leafletMod.Control.Zoom = js.native
  def zoom(options: typingsJapgolly.leaflet.leafletMod.Control.ZoomOptions): typingsJapgolly.leaflet.leafletMod.Control.Zoom = js.native
}

