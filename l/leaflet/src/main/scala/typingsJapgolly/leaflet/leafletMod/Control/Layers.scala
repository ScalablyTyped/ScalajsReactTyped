package typingsJapgolly.leaflet.leafletMod.Control

import typingsJapgolly.leaflet.leafletMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Control.Layers")
@js.native
class Layers ()
  extends typingsJapgolly.leaflet.leafletMod.Control {
  def this(baseLayers: LayersObject) = this()
  def this(baseLayers: LayersObject, overlays: LayersObject) = this()
  def this(baseLayers: LayersObject, overlays: LayersObject, options: LayersOptions) = this()
  @JSName("options")
  var options_Layers: LayersOptions = js.native
  def addBaseLayer(layer: Layer, name: String): this.type = js.native
  def addOverlay(layer: Layer, name: String): this.type = js.native
  def collapse(): this.type = js.native
  def expand(): this.type = js.native
  def removeLayer(layer: Layer): this.type = js.native
}

