package typingsJapgolly.materialLinearProgress.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCLinearProgressAdapter extends js.Object {
  def addClass(className: String): Unit
  def getBuffer(): Element
  def getPrimaryBar(): Element
  def hasClass(className: String): Boolean
  def removeClass(className: String): Unit
  def setStyle(el: Element, styleProperty: String, value: Double): Unit
}

object MDCLinearProgressAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    getBuffer: CallbackTo[Element],
    getPrimaryBar: CallbackTo[Element],
    hasClass: String => CallbackTo[Boolean],
    removeClass: String => Callback,
    setStyle: (Element, String, Double) => Callback
  ): MDCLinearProgressAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("getBuffer")(getBuffer.toJsFn)
    __obj.updateDynamic("getPrimaryBar")(getPrimaryBar.toJsFn)
    __obj.updateDynamic("hasClass")(js.Any.fromFunction1((t0: java.lang.String) => hasClass(t0).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("setStyle")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.Element, t1: java.lang.String, t2: scala.Double) => setStyle(t0, t1, t2).runNow()))
    __obj.asInstanceOf[MDCLinearProgressAdapter]
  }
}

