package typingsJapgolly.baidumapWebSdk.BMap

import typingsJapgolly.baidumapWebSdk.AnonTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.PanoramaLabel")
@js.native
class PanoramaLabel protected () extends js.Object {
  def this(content: String) = this()
  def this(content: String, opts: PanoramaLabelOptions) = this()
  def addEventListener(event: String, handler: Callback): Unit = js.native
  def getAltitude(): Double = js.native
  def getContent(): String = js.native
  def getPosition(): Point = js.native
  def getPov(): PanoramaPov = js.native
  def hide(): Unit = js.native
  def onclick(event: AnonTarget): Unit = js.native
  def onmouseout(event: AnonTarget): Unit = js.native
  def onmouseover(event: AnonTarget): Unit = js.native
  def onremove(event: AnonTarget): Unit = js.native
  def removeEventListener(event: String, handler: Callback): Unit = js.native
  def setAltitude(altitude: Double): Unit = js.native
  def setContent(content: String): Unit = js.native
  def setPosition(position: Point): Unit = js.native
  def show(): Unit = js.native
}

