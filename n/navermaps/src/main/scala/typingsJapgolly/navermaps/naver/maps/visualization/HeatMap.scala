package typingsJapgolly.navermaps.naver.maps.visualization

import typingsJapgolly.navermaps.naver.maps.LatLng
import typingsJapgolly.navermaps.naver.maps.Map
import typingsJapgolly.navermaps.naver.maps.PointArrayLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.visualization.HeatMap")
@js.native
class HeatMap () extends js.Object {
  def this(heatMapOptions: HeatMapOptions) = this()
  def getColorMap(): SpectrumStyle = js.native
  def getData(): js.Array[LatLng | PointArrayLiteral] = js.native
  def getMap(): Map | Null = js.native
  def getOptions(): HeatMapOptions = js.native
  def getOptions(key: String): HeatMapOptions = js.native
  def redraw(): Unit = js.native
  def setColorMap(colormap: SpectrumStyle, inReverse: Boolean): Unit = js.native
  def setData(data: js.Array[LatLng | PointArrayLiteral]): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOptions(key: String, value: js.Any): Unit = js.native
  def setOptions(options: HeatMapOptions): Unit = js.native
}

