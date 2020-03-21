package typingsJapgolly.reactLeaflet.mod.LayersControl

import typingsJapgolly.leaflet.mod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "LayersControl.BaseLayer")
@js.native
class BaseLayer[P /* <: ControlledLayerProps */] protected () extends ControlledLayer[P] {
  def this(props: ControlledLayerProps) = this()
  def addLayer(layer: Layer): Unit = js.native
}

