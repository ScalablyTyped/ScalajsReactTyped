package typingsJapgolly.googlemaps.google.maps.visualization

import org.scalajs.dom.raw.Element
import typingsJapgolly.googlemaps.google.maps.LatLng
import typingsJapgolly.googlemaps.google.maps.MVCArray
import typingsJapgolly.googlemaps.google.maps.MVCObject
import typingsJapgolly.googlemaps.google.maps.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.visualization.HeatmapLayer")
@js.native
class HeatmapLayer () extends MVCObject {
  def this(opts: HeatmapLayerOptions) = this()
  def getData(): MVCArray[LatLng | WeightedLocation] = js.native
  def getMap(): Map[Element] = js.native
  def setData(data: js.Array[LatLng | WeightedLocation]): Unit = js.native
  def setData(data: MVCArray[LatLng | WeightedLocation]): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  def setOptions(options: HeatmapLayerOptions): Unit = js.native
}

