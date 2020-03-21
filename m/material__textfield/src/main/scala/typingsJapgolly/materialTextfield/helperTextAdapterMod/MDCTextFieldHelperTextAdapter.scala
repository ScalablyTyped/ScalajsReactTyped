package typingsJapgolly.materialTextfield.helperTextAdapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTextFieldHelperTextAdapter extends js.Object {
  /**
    * Adds a class to the helper text element.
    */
  def addClass(className: String): Unit
  /**
    * Returns whether or not the helper text element contains the given class.
    */
  def hasClass(className: String): Boolean
  /**
    * Removes an attribute from the helper text element.
    */
  def removeAttr(attr: String): Unit
  /**
    * Removes a class from the helper text element.
    */
  def removeClass(className: String): Unit
  /**
    * Sets an attribute with a given value on the helper text element.
    */
  def setAttr(attr: String, value: String): Unit
  /**
    * Sets the text content for the helper text element.
    */
  def setContent(content: String): Unit
}

object MDCTextFieldHelperTextAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    hasClass: String => CallbackTo[Boolean],
    removeAttr: String => Callback,
    removeClass: String => Callback,
    setAttr: (String, String) => Callback,
    setContent: String => Callback
  ): MDCTextFieldHelperTextAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("hasClass")(js.Any.fromFunction1((t0: java.lang.String) => hasClass(t0).runNow()))
    __obj.updateDynamic("removeAttr")(js.Any.fromFunction1((t0: java.lang.String) => removeAttr(t0).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("setAttr")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setAttr(t0, t1).runNow()))
    __obj.updateDynamic("setContent")(js.Any.fromFunction1((t0: java.lang.String) => setContent(t0).runNow()))
    __obj.asInstanceOf[MDCTextFieldHelperTextAdapter]
  }
}

