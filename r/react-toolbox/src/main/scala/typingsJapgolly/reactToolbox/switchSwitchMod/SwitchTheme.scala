package typingsJapgolly.reactToolbox.switchSwitchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchTheme extends js.Object {
  /**
    * Used for the root element if the component is disabled.
    */
  var disabled: js.UndefOr[String] = js.undefined
  /**
    * Used for the root element if the component is not disabled.
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * Used for the input element.
    */
  var input: js.UndefOr[String] = js.undefined
  /**
    * Used for a wrapper around the thumb if checked is false.
    */
  var off: js.UndefOr[String] = js.undefined
  /**
    * Used for a wrapper around the thumb if checked is true.
    */
  var on: js.UndefOr[String] = js.undefined
  /**
    * Used for the ripple inside the switch.
    */
  var ripple: js.UndefOr[String] = js.undefined
  /**
    * Used for the text label element.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Used for the thumb element.
    */
  var thumb: js.UndefOr[String] = js.undefined
}

object SwitchTheme {
  @scala.inline
  def apply(
    disabled: String = null,
    field: String = null,
    input: String = null,
    off: String = null,
    on: String = null,
    ripple: String = null,
    text: String = null,
    thumb: String = null
  ): SwitchTheme = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (off != null) __obj.updateDynamic("off")(off.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (ripple != null) __obj.updateDynamic("ripple")(ripple.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchTheme]
  }
}

