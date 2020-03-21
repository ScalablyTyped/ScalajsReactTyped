package typingsJapgolly.materialTabIndicator.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabIndicatorAdapter extends js.Object {
  /**
    * Adds the given className to the root element.
    * @param className The className to add
    */
  def addClass(className: String): Unit
  /**
    * Returns the client rect of the content element.
    */
  def computeContentClientRect(): ClientRect
  /**
    * Removes the given className from the root element.
    * @param className The className to remove
    */
  def removeClass(className: String): Unit
  /**
    * Sets a style property of the content element to the passed value
    * @param propName The style property name to set
    * @param value The style property value
    */
  def setContentStyleProperty(propName: String, value: String): Unit
}

object MDCTabIndicatorAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    computeContentClientRect: CallbackTo[ClientRect],
    removeClass: String => Callback,
    setContentStyleProperty: (String, String) => Callback
  ): MDCTabIndicatorAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("computeContentClientRect")(computeContentClientRect.toJsFn)
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("setContentStyleProperty")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setContentStyleProperty(t0, t1).runNow()))
    __obj.asInstanceOf[MDCTabIndicatorAdapter]
  }
}

