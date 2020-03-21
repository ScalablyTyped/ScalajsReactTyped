package typingsJapgolly.higButton.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /** Prevents user interaction with the button */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** A @hig/icon element */
  var icon: js.UndefOr[Element] = js.undefined
  /** Sets the link of a button */
  var link: js.UndefOr[String] = js.undefined
  /** Triggers blur when focus is moved away from icon */
  var onBlur: js.UndefOr[Callback] = js.undefined
  /** Triggers when you click the button */
  var onClick: js.UndefOr[Callback] = js.undefined
  /** Triggers when focus is moved to button */
  var onFocus: js.UndefOr[Callback] = js.undefined
  /** Triggers when you hover over the button */
  var onHover: js.UndefOr[Callback] = js.undefined
  /** Triggers when the user's mouse is pressed over the button */
  var onMouseDown: js.UndefOr[Callback] = js.undefined
  /** Triggers when the user's mouse is over the button */
  var onMouseEnter: js.UndefOr[Callback] = js.undefined
  /** Triggers when the user's mouse is no longer over the button */
  var onMouseLeave: js.UndefOr[Callback] = js.undefined
  /** Triggers when the user's mouse is no longer pressed over the button */
  var onMouseUp: js.UndefOr[Callback] = js.undefined
  /** Adds custom/overriding styles */
  var stylesheet: js.UndefOr[js.Any] = js.undefined
  /** Specifies where to display the linked URL */
  var target: js.UndefOr[AvailableTargets_] = js.undefined
  /** Sets the title of a button */
  var title: String
  /** Specifies type of button */
  var `type`: js.UndefOr[AvailableTypes_] = js.undefined
  /** Specifies width of button */
  var width: js.UndefOr[AvailableWidths_] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    title: String,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: VdomElement = null,
    link: String = null,
    onBlur: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    onClick: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    onFocus: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    onHover: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    onMouseDown: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    onMouseEnter: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    onMouseLeave: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    onMouseUp: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    stylesheet: js.Any = null,
    target: AvailableTargets_ = null,
    `type`: AvailableTypes_ = null,
    width: AvailableWidths_ = null
  ): Props = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawElement.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    onBlur.foreach(p => __obj.updateDynamic("onBlur")(p.toJsFn))
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    onFocus.foreach(p => __obj.updateDynamic("onFocus")(p.toJsFn))
    onHover.foreach(p => __obj.updateDynamic("onHover")(p.toJsFn))
    onMouseDown.foreach(p => __obj.updateDynamic("onMouseDown")(p.toJsFn))
    onMouseEnter.foreach(p => __obj.updateDynamic("onMouseEnter")(p.toJsFn))
    onMouseLeave.foreach(p => __obj.updateDynamic("onMouseLeave")(p.toJsFn))
    onMouseUp.foreach(p => __obj.updateDynamic("onMouseUp")(p.toJsFn))
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

