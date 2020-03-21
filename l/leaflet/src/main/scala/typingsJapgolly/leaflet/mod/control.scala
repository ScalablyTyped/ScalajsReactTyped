package typingsJapgolly.leaflet.mod

import typingsJapgolly.leaflet.mod.Control_.Attribution
import typingsJapgolly.leaflet.mod.Control_.AttributionOptions
import typingsJapgolly.leaflet.mod.Control_.Layers
import typingsJapgolly.leaflet.mod.Control_.LayersObject
import typingsJapgolly.leaflet.mod.Control_.LayersOptions
import typingsJapgolly.leaflet.mod.Control_.Scale
import typingsJapgolly.leaflet.mod.Control_.ScaleOptions
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
  def zoom(): typingsJapgolly.leaflet.mod.Control_.Zoom = js.native
  def zoom(options: typingsJapgolly.leaflet.mod.Control_.ZoomOptions): typingsJapgolly.leaflet.mod.Control_.Zoom = js.native
}

