package typingsJapgolly.googlemaps.google.maps

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.KmlLayer")
@js.native
class KmlLayer () extends MVCObject {
  def this(opts: KmlLayerOptions) = this()
  def getDefaultViewport(): LatLngBounds = js.native
  def getMap(): Map[Element] = js.native
  def getMetadata(): KmlLayerMetadata = js.native
  def getStatus(): KmlLayerStatus = js.native
  def getUrl(): String = js.native
  def getZIndex(): Double = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  def setOptions(options: KmlLayerOptions): Unit = js.native
  def setUrl(url: String): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}

