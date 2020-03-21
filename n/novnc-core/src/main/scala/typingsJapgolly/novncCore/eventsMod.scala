package typingsJapgolly.novncCore

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Touch
import org.scalajs.dom.raw.TouchList
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("novnc-core/lib/util/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  def getPointerEvent(event: Event_): TouchList | js.Array[Touch] = js.native
  def releaseCapture(): Unit = js.native
  def setCapture(el: Element): Unit = js.native
  def stopEvent(event: Event_): Unit = js.native
}

