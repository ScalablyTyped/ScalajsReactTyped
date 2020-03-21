package typingsJapgolly.fscreen.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fscreen extends js.Object {
  val fullscreenElement: js.UndefOr[Element] = js.native
  val fullscreenEnabled: Boolean = js.native
  @JSName("onfullscreenchange")
  var onfullscreenchange_Original: Handler = js.native
  @JSName("onfullscreenerror")
  var onfullscreenerror_Original: Handler = js.native
  def addEventListener(`type`: EventName, handler: Handler): Unit = js.native
  def addEventListener(`type`: EventName, handler: Handler, options: Boolean): Unit = js.native
  def addEventListener(`type`: EventName, handler: Handler, options: AddEventListenerOptions): Unit = js.native
  def exitFullscreen(): Unit = js.native
  def exitFullscreen(e: Event_): Unit = js.native
  def onfullscreenchange(): Unit = js.native
  def onfullscreenchange(e: Event_): Unit = js.native
  def onfullscreenerror(): Unit = js.native
  def onfullscreenerror(e: Event_): Unit = js.native
  def removeEventListener(`type`: EventName, handler: Handler): Unit = js.native
  def removeEventListener(`type`: EventName, handler: Handler, options: Boolean): Unit = js.native
  def removeEventListener(`type`: EventName, handler: Handler, options: AddEventListenerOptions): Unit = js.native
  def requestFullscreen(element: Element): Unit = js.native
  def requestFullscreenFunction(element: Element): RequestFullScreenFunction = js.native
}

