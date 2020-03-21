package typingsJapgolly.googlemaps.google.maps.visualization

import org.scalajs.dom.raw.Element
import typingsJapgolly.googlemaps.google.maps.MVCObject
import typingsJapgolly.googlemaps.google.maps.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.visualization.MapsEngineLayer")
@js.native
class MapsEngineLayer protected () extends MVCObject {
  def this(options: MapsEngineLayerOptions) = this()
  def getLayerId(): String = js.native
  def getLayerKey(): String = js.native
  def getMap(): Map[Element] = js.native
  def getMapId(): String = js.native
  def getOpacity(): Double = js.native
  def getProperties(): MapsEngineLayerProperties = js.native
  def getStatus(): MapsEngineStatus = js.native
  def getZIndex(): Double = js.native
  def setLayerId(layerId: String): Unit = js.native
  def setLayerKey(layerKey: String): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  def setMapId(mapId: String): Unit = js.native
  def setOpacity(opacity: Double): Unit = js.native
  def setOptions(options: MapsEngineLayerOptions): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}

