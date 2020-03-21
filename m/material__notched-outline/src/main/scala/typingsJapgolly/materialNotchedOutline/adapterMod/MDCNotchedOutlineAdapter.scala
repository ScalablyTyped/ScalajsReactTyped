package typingsJapgolly.materialNotchedOutline.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCNotchedOutlineAdapter extends js.Object {
  /**
    * Adds a class to the root element.
    */
  def addClass(className: String): Unit
  /**
    * Returns the height of the root element.
    */
  def getHeight(): Double
  /**
    * Returns the idle outline element's computed style value of the given css property `propertyName`.
    * We achieve this via `getComputedStyle(...).getPropertyValue(propertyName)`.
    */
  def getIdleOutlineStyleValue(propertyName: String): String
  /**
    * Returns the width of the root element.
    */
  def getWidth(): Double
  /**
    * Removes a class from the root element.
    */
  def removeClass(className: String): Unit
  /**
    * Sets the "d" attribute of the outline element's SVG path.
    */
  def setOutlinePathAttr(value: String): Unit
}

object MDCNotchedOutlineAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    getHeight: CallbackTo[Double],
    getIdleOutlineStyleValue: String => CallbackTo[String],
    getWidth: CallbackTo[Double],
    removeClass: String => Callback,
    setOutlinePathAttr: String => Callback
  ): MDCNotchedOutlineAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("getHeight")(getHeight.toJsFn)
    __obj.updateDynamic("getIdleOutlineStyleValue")(js.Any.fromFunction1((t0: java.lang.String) => getIdleOutlineStyleValue(t0).runNow()))
    __obj.updateDynamic("getWidth")(getWidth.toJsFn)
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("setOutlinePathAttr")(js.Any.fromFunction1((t0: java.lang.String) => setOutlinePathAttr(t0).runNow()))
    __obj.asInstanceOf[MDCNotchedOutlineAdapter]
  }
}

