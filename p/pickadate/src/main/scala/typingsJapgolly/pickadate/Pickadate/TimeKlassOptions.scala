package typingsJapgolly.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeKlassOptions extends KlassOptions {
   // default 'picker picker--time'
  // List of times
  var list: js.UndefOr[String] = js.undefined
   // default 'picker__list'
  var listItem: js.UndefOr[String] = js.undefined
   // default 'picker__list-item'
  // Time states
  var viewset: js.UndefOr[String] = js.undefined
}

object TimeKlassOptions {
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
    list: String = null,
    listItem: String = null,
    now: String = null,
    opened: String = null,
    picker: String = null,
    selected: String = null,
    viewset: String = null,
    wrap: String = null
  ): TimeKlassOptions = {
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
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (listItem != null) __obj.updateDynamic("listItem")(listItem.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (opened != null) __obj.updateDynamic("opened")(opened.asInstanceOf[js.Any])
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (viewset != null) __obj.updateDynamic("viewset")(viewset.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeKlassOptions]
  }
}

