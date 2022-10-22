package typingsJapgolly.dynmap.mod

import typingsJapgolly.leaflet.mod.Control_.Layers
import typingsJapgolly.leaflet.mod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynmapLayerControl extends Layers {
  
  def _addLayer(layer: Layer, name: String, overlay: Layer): Unit = js.native
  def _addLayer(layer: Layer, name: String, overlay: Layer, pos: Boolean): Unit = js.native
  
  def addOverlay(layer: Layer, name: String, pos: Boolean): this.type = js.native
}
