package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridFeatureChooserPopover
  extends /**
	 * Option for igGridFeatureChooserPopover
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Sets the time popover fades in and out when showing/hiding
  	 *
  	 */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Controls where the popover DOM should be attached to.
  	 *
  	 *
  	 * Valid values:
  	 * "string" A valid jQuery selector for the element
  	 * "object" A reference to the parent jQuery object
  	 */
  var appendTo: js.UndefOr[String | js.Object] = js.undefined
  var closeOnBlur: js.UndefOr[Boolean] = js.undefined
  var containment: js.UndefOr[js.Any] = js.undefined
  /**
  	 * sets the content for the popover container. If left null the content will be get from the target.
  	 *
  	 *
  	 * Valid values:
  	 * "string" String content of the popover container
  	 * "function" Function which is a callback that should return the content. Use the 'this' value to access the target DOM element.
  	 */
  var contentTemplate: js.UndefOr[String | js.Function] = js.undefined
  /**
  	 * controls the direction in which the control shows relative to the target element
  	 *
  	 *
  	 * Valid values:
  	 * "auto" lets the control show on the side where enough space is available with the priority specified by the [directionPriority](ui.%%WidgetNameLowered%%#options:directionPriority) property
  	 * "left" shows popover on the left side of the target element
  	 * "right" shows popover on the right side of the target element
  	 * "top" shows popover on the top of the target element
  	 * "bottom" shows popover on the bottom of the target element
  	 */
  var direction: js.UndefOr[String] = js.undefined
  /**
  	 * Controls the priority in which the control searches for space to show relative to the target element.
  	 * This property has effect only if the [direction](ui.%%WidgetNameLowered%%#options:direction) property value is "auto" or unset.
  	 *
  	 */
  var directionPriority: js.UndefOr[js.Array[_]] = js.undefined
  var gridId: js.UndefOr[String] = js.undefined
  /**
  	 * Sets the content for the popover header
  	 *
  	 */
  var headerTemplate: js.UndefOr[IgPopoverHeaderTemplate] = js.undefined
  /**
  	 * defines height for the popover. leave null for auto
  	 *
  	 */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
  	 * Event fired after popover is hidden.
  	 */
  var hidden: js.UndefOr[HiddenEvent] = js.undefined
  /**
  	 * Event fired before popover is hidden.
  	 */
  var hiding: js.UndefOr[HidingEvent] = js.undefined
  /**
  	 * defines height the popover won't exceed even if no specific one is set.
  	 *
  	 */
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  /**
  	 * defines width the popover won't exceed even if no specific one is set.
  	 *
  	 */
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  /**
  	 * defines width the popover won't go under the value even if no specific one is set.
  	 *
  	 */
  var minWidth: js.UndefOr[Double | String] = js.undefined
  /**
  	 * controls the position of the popover according to the target element in case the popover is larger than the target on the side we want to position, if the popover is smaller it should always be in the middle of the visible area
  	 *
  	 *
  	 * Valid values:
  	 * "auto" lets the control choose a position depending on available space with the following priority balanced > end > start
  	 * "balanced" the popover is positioned at the middle of the target element
  	 * "start" the popover is positioned at the beginning of the target element
  	 * "end" the popover is positioned at the end of the target element
  	 */
  var position: js.UndefOr[String] = js.undefined
  /**
  	 * Selectors indicating which items should show popovers. The predefined value is [title]. Customize if you're using something other then the title attribute for the popover content, or if you need a different selector for event delegation. When changing this option, you likely need to also change the contentTemplate option
  	 *
  	 */
  var selectors: js.UndefOr[String] = js.undefined
  /**
  	 * sets the event on which the popover will be shown. Predefined values are "mouseenter", "click" and "focus"
  	 *
  	 *
  	 * Valid values:
  	 * "mouseenter" the popover is shown on mouse enter in the target element
  	 * "click" the popover is shown on click on the target element
  	 * "focus" the popover is shown on focusing the target element
  	 */
  var showOn: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired before popover is shown.
  	 */
  var showing: js.UndefOr[ShowingEvent] = js.undefined
  /**
  	 * Event fired after popover is shown.
  	 */
  var shown: js.UndefOr[ShownEvent] = js.undefined
  var targetButton: js.UndefOr[js.Any] = js.undefined
  /**
  	 * defines width for the popover. leave null for auto.
  	 *
  	 */
  var width: js.UndefOr[Double | String] = js.undefined
}

object IgGridFeatureChooserPopover {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igGridFeatureChooserPopover
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    animationDuration: Int | Double = null,
    appendTo: String | js.Object = null,
    closeOnBlur: js.UndefOr[Boolean] = js.undefined,
    containment: js.Any = null,
    contentTemplate: String | js.Function = null,
    direction: String = null,
    directionPriority: js.Array[_] = null,
    gridId: String = null,
    headerTemplate: IgPopoverHeaderTemplate = null,
    height: Double | String = null,
    hidden: (/* event */ Event_, /* ui */ HiddenEventUIParam) => Callback = null,
    hiding: (/* event */ Event_, /* ui */ HidingEventUIParam) => Callback = null,
    maxHeight: Double | String = null,
    maxWidth: Double | String = null,
    minWidth: Double | String = null,
    position: String = null,
    selectors: String = null,
    showOn: String = null,
    showing: (/* event */ Event_, /* ui */ ShowingEventUIParam) => Callback = null,
    shown: (/* event */ Event_, /* ui */ ShownEventUIParam) => Callback = null,
    targetButton: js.Any = null,
    width: Double | String = null
  ): IgGridFeatureChooserPopover = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnBlur)) __obj.updateDynamic("closeOnBlur")(closeOnBlur.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (directionPriority != null) __obj.updateDynamic("directionPriority")(directionPriority.asInstanceOf[js.Any])
    if (gridId != null) __obj.updateDynamic("gridId")(gridId.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hidden != null) __obj.updateDynamic("hidden")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.HiddenEventUIParam) => hidden(t0, t1).runNow()))
    if (hiding != null) __obj.updateDynamic("hiding")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.HidingEventUIParam) => hiding(t0, t1).runNow()))
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (showOn != null) __obj.updateDynamic("showOn")(showOn.asInstanceOf[js.Any])
    if (showing != null) __obj.updateDynamic("showing")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ShowingEventUIParam) => showing(t0, t1).runNow()))
    if (shown != null) __obj.updateDynamic("shown")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ShownEventUIParam) => shown(t0, t1).runNow()))
    if (targetButton != null) __obj.updateDynamic("targetButton")(targetButton.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridFeatureChooserPopover]
  }
}

