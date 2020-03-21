package typingsJapgolly.navermaps.naver.maps

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.InfoWindow")
@js.native
class InfoWindow protected () extends OverlayView {
  def this(options: InfoWindowOptions) = this()
  def close(): Unit = js.native
  def getContent(): HTMLElement = js.native
  def getOptions(): InfoWindowOptions = js.native
  def getOptions(key: String): InfoWindowOptions = js.native
  def getPosition(): Coord = js.native
  def getZIndex(): Double = js.native
  def open(map: Map, anchor: Coord): Unit = js.native
  def open(map: Map, anchor: CoordLiteral): Unit = js.native
  def open(map: Map, anchor: Marker): Unit = js.native
  def setContent(content: String): Unit = js.native
  def setContent(content: typingsJapgolly.std.HTMLElement): Unit = js.native
  def setOptions(options: InfoWindowOptions): Unit = js.native
  def setPosition(position: Coord): Unit = js.native
  def setPosition(position: CoordLiteral): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}

