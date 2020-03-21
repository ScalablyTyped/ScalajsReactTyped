package typingsJapgolly.fabric.fabricImplMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilDomStyle extends js.Object {
  /**
  	 * Cross-browser wrapper for setting element's style
  	 */
  def setStyle(element: HTMLElement, styles: js.Any): HTMLElement
}

object IUtilDomStyle {
  @scala.inline
  def apply(setStyle: (HTMLElement, js.Any) => CallbackTo[HTMLElement]): IUtilDomStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setStyle")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: js.Any) => setStyle(t0, t1).runNow()))
    __obj.asInstanceOf[IUtilDomStyle]
  }
}

