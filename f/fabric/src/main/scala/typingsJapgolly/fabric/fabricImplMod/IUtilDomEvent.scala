package typingsJapgolly.fabric.fabricImplMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilDomEvent extends js.Object {
  /**
  	 * Adds an event listener to an element
  	 */
  def addListener(element: HTMLElement, eventName: String, handler: js.Function): Unit
  /**
  	 * Cross-browser wrapper for getting event's coordinates
  	 * @param event Event object
  	 * @param upperCanvasEl &lt;canvas> element on which object selection is drawn
  	 */
  def getPointer(event: Event_, upperCanvasEl: HTMLCanvasElement): Point
  /**
  	 * Removes an event listener from an element
  	 */
  def removeListener(element: HTMLElement, eventName: String, handler: js.Function): Unit
}

object IUtilDomEvent {
  @scala.inline
  def apply(
    addListener: (HTMLElement, String, js.Function) => Callback,
    getPointer: (Event_, HTMLCanvasElement) => CallbackTo[Point],
    removeListener: (HTMLElement, String, js.Function) => Callback
  ): IUtilDomEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String, t2: js.Function) => addListener(t0, t1, t2).runNow()))
    __obj.updateDynamic("getPointer")(js.Any.fromFunction2((t0: typingsJapgolly.std.Event_, t1: org.scalajs.dom.raw.HTMLCanvasElement) => getPointer(t0, t1).runNow()))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String, t2: js.Function) => removeListener(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IUtilDomEvent]
  }
}

