package typingsJapgolly.reactScrollspy.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollspyProps extends js.Object {
  // ClassName attribute to be passed to the generated <ul /> element
  var className: js.UndefOr[String] = js.undefined
  // HTML tag for Scrollspy component if you want to use other than ul
  var componentTag: js.UndefOr[String | ComponentType[js.Object]] = js.undefined
  // Class name that apply to the navigation element paired with the content element in viewport
  var currentClassName: String
  // Array of target element IDs
  var items: js.Array[String]
  // Offset value that adjusts to determine the elements are in the viewport
  var offset: js.UndefOr[Double] = js.undefined
  // Function to be executed when the active item has been updated
  var onUpdate: js.UndefOr[js.Function1[/* item */ String, Unit]] = js.undefined
  // Selector for the element of scrollable container that can be used with querySelector
  var rootEl: js.UndefOr[String] = js.undefined
  // Class name that apply to the navigation elements that have been scrolled past
  var scrolledPastClassName: js.UndefOr[String] = js.undefined
  // Style attribute to be passed to the generated <ul /> element
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ScrollspyProps {
  @scala.inline
  def apply(
    currentClassName: String,
    items: js.Array[String],
    className: String = null,
    componentTag: String | ComponentType[js.Object] = null,
    offset: Int | Double = null,
    onUpdate: /* item */ String => Callback = null,
    rootEl: String = null,
    scrolledPastClassName: String = null,
    style: CSSProperties = null
  ): ScrollspyProps = {
    val __obj = js.Dynamic.literal(currentClassName = currentClassName.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentTag != null) __obj.updateDynamic("componentTag")(componentTag.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1((t0: /* item */ java.lang.String) => onUpdate(t0).runNow()))
    if (rootEl != null) __obj.updateDynamic("rootEl")(rootEl.asInstanceOf[js.Any])
    if (scrolledPastClassName != null) __obj.updateDynamic("scrolledPastClassName")(scrolledPastClassName.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollspyProps]
  }
}

