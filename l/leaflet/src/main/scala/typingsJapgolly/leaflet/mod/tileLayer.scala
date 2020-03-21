package typingsJapgolly.leaflet.mod

import typingsJapgolly.leaflet.mod.TileLayer_.WMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "tileLayer")
@js.native
object tileLayer extends js.Object {
  def apply(urlTemplate: String): TileLayer_ = js.native
  def apply(urlTemplate: String, options: TileLayerOptions): TileLayer_ = js.native
  def wms(baseUrl: String): WMS = js.native
  def wms(baseUrl: String, options: WMSOptions): WMS = js.native
}

