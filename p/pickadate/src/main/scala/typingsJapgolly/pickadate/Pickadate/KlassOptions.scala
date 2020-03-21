package typingsJapgolly.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// KlassOptions shared between date and time pickers
trait KlassOptions extends js.Object {
   // default 'picker__input'
  var active: js.UndefOr[String] = js.undefined
   // default 'picker__wrap'
  var box: js.UndefOr[String] = js.undefined
   // default 'picker__day--today' or 'picker__list-item--now'
  // Clear button
  var buttonClear: js.UndefOr[String] = js.undefined
   // default 'picker__box'
  // Day/Time states
  var disabled: js.UndefOr[String] = js.undefined
   // default 'picker--opened'
  var focused: js.UndefOr[String] = js.undefined
   // default 'picker__holder'
  // The picker frame, wrapper, and box
  var frame: js.UndefOr[String] = js.undefined
  // default 'picker__day--selected' or 'picker__list-item--selected'
  var highlighted: js.UndefOr[String] = js.undefined
   // default 'picker--focused'
  // The picker holder
  var holder: js.UndefOr[String] = js.undefined
  // The element states
  var input: js.UndefOr[String] = js.undefined
  // default 'picker__day--highlighted' or 'picker__list-item--highlighted'
  var now: js.UndefOr[String] = js.undefined
   // default 'picker' or 'picker picker--time'
  var opened: js.UndefOr[String] = js.undefined
   // default 'picker__input--active'
  // The root picker and states
  var picker: js.UndefOr[String] = js.undefined
   // default 'picker__day--disabled' or 'picker__list-item--disabled'
  var selected: js.UndefOr[String] = js.undefined
   // default 'picker__frame'
  var wrap: js.UndefOr[String] = js.undefined
}

object KlassOptions {
  @scala.inline
  def apply(
    active: String = null,
    box: String = null,
    buttonClear: String = null,
    disabled: String = null,
    focused: String = null,
    frame: String = null,
    highlighted: String = null,
    holder: String = null,
    input: String = null,
    now: String = null,
    opened: String = null,
    picker: String = null,
    selected: String = null,
    wrap: String = null
  ): KlassOptions = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (box != null) __obj.updateDynamic("box")(box.asInstanceOf[js.Any])
    if (buttonClear != null) __obj.updateDynamic("buttonClear")(buttonClear.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (highlighted != null) __obj.updateDynamic("highlighted")(highlighted.asInstanceOf[js.Any])
    if (holder != null) __obj.updateDynamic("holder")(holder.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (opened != null) __obj.updateDynamic("opened")(opened.asInstanceOf[js.Any])
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[KlassOptions]
  }
}

