package typingsJapgolly.googlemaps.google.maps.adsense

import org.scalajs.dom.raw.Element
import typingsJapgolly.googlemaps.google.maps.ControlPosition
import typingsJapgolly.googlemaps.google.maps.MVCObject
import typingsJapgolly.googlemaps.google.maps.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.adsense.AdUnit")
@js.native
class AdUnit protected () extends MVCObject {
  def this(container: Element, opts: AdUnitOptions) = this()
  def getBackgroundColor(): String = js.native
  def getBorderColor(): String = js.native
  def getChannelNumber(): String = js.native
  def getContainer(): Element = js.native
  def getFormat(): AdFormat = js.native
  def getMap(): Map = js.native
  def getPosition(): ControlPosition = js.native
  def getPublisherId(): String = js.native
  def getTextColor(): String = js.native
  def getTitleColor(): String = js.native
  def getUrlColor(): String = js.native
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  def setBorderColor(borderColor: String): Unit = js.native
  def setChannelNumber(channelNumber: String): Unit = js.native
  def setFormat(format: AdFormat): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setPosition(position: ControlPosition): Unit = js.native
  def setTextColor(textColor: String): Unit = js.native
  def setTitleColor(titleColor: String): Unit = js.native
  def setUrlColor(urlColor: String): Unit = js.native
}

