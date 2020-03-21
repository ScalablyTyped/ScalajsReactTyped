package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgScroll
  extends /**
	 * Option for igScroll
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Sets or gets if the scrollbars should be always visible (on all environments). Otherwise it will be the default behavior. Note: this option is only for the custom scrollbars set through the scrollbarType option.
  	 *
  	 */
  var alwaysVisible: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Sets gets the step of the default scrolling behavior when using any of the custom scrollbar track areas.
  	 *
  	 */
  var bigIncrementStep: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets gets at least how many times the horizontal speed should be bigger so the inertia proceeds only horizontally without scrolling vertically. This is to improve interactions due to not perfectly swiping left/right with some deviation down/up
  	 *
  	 */
  var inertiaDeltaX: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets gets at least how many times the vertical speed should be bigger so the inertia proceeds only vertically without scrolling horizontally. This is to improve interactions due to not perfectly swiping down/up with some deviation left/right
  	 *
  	 */
  var inertiaDeltaY: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets gets the modifier for how long the inertia last on mobile devices
  	 *
  	 */
  var inertiaDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets gets the modifier for how much the inertia scrolls on mobile devices
  	 *
  	 */
  var inertiaStep: js.UndefOr[Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Sets or gets the minimum size of the thumb drag in pixels. For the vertical thumb it means its minimum height, for the horizontal thumb it means its minimum width. This affects only the custom scrollblar when scrollbarType is set to "custom".
  	 *
  	 */
  var minThumbSize: js.UndefOr[Double | String] = js.undefined
  /**
  	 * Sets or gets if igScroll can modify the DOM when it is initialized on certain element so that the content can be scrollable.
  	 *
  	 */
  var modifyDOM: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Event which is raised after the scroller has been rendered fully
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  /**
  	 * Event which is raised after the igScroll has finished resizing.
  	 * Function takes arguments evt and args.
  	 * Use evt.originalEvent (with validation for not null of evt) to obtain reference to event of browser.
  	 * Use args.owner to obtain reference to igScroll.
  	 */
  var resized: js.UndefOr[ResizedEvent] = js.undefined
  /**
  	 * Event which is raised when the igScroll detects that the element is reizing.
  	 * Function takes arguments evt and args.
  	 * Use evt.originalEvent (with validation for not null of evt) to obtain reference to event of browser.
  	 * Use args.owner to obtain reference to igScroll.
  	 */
  var resizing: js.UndefOr[ResizingEvent] = js.undefined
  /**
  	 * Sets custom value for how high is actually the content. Useful when wanting to scroll and update the shown content manually.
  	 *
  	 */
  var scrollHeight: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets gets current horizontal position of the content.
  	 *
  	 */
  var scrollLeft: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets gets if only the linked horizontal scrollbar should be used for horizontal scrolling. Note: The behavior when the linked scrollbar is scrolled in this case should be handled manually.
  	 *
  	 */
  var scrollOnlyHBar: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Sets gets if only the linked vertical scrollbar should be used for vertical scrolling. Note: The behavior when the linked scrollbar is scrolled in this case should be handled manually.
  	 *
  	 */
  var scrollOnlyVBar: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Sets gets current vertical position of the content.
  	 *
  	 */
  var scrollTop: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets custom value for what width is actually the content. Useful when wanting to scroll and update the shown content manually.
  	 *
  	 */
  var scrollWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets gets html or jQuery element which is used for horizontal scrolling.
  	 *
  	 */
  var scrollbarH: js.UndefOr[String] = js.undefined
  /**
  	 * Sets gets html or jQuery element to which the horizontal scrollbar will be appended to.
  	 *
  	 */
  var scrollbarHParent: js.UndefOr[String] = js.undefined
  /**
  	 * Sets or gets what type of scrollbars should be using the igScroll (on all environments).
  	 *
  	 *
  	 * Valid values:
  	 * "custom" Custom scrollbars with custom ui and events.
  	 * "native" Native scrollbars
  	 * "none" No scrollbars should be visible
  	 */
  var scrollbarType: js.UndefOr[String] = js.undefined
  /**
  	 * Sets gets html or jQuery element which is used for vertical scrolling.
  	 *
  	 */
  var scrollbarV: js.UndefOr[String] = js.undefined
  /**
  	 * Sets gets html or jQuery element to which the vertical scrollbar will be appended to.
  	 *
  	 */
  var scrollbarVParent: js.UndefOr[String] = js.undefined
  /**
  	 * Event which is raised after scrolling has stopped.
  	 */
  var scrolled: js.UndefOr[ScrolledEvent] = js.undefined
  /**
  	 * Event which is raised before scrolling or before each step when having inertia.
  	 * Return false in order to cancel action.
  	 */
  var scrolling: js.UndefOr[ScrollingEvent] = js.undefined
  /**
  	 * Sets gets the step of the default scrolling behavior when using any of the custom scrollbar arrows
  	 *
  	 */
  var smallIncrementStep: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets gets if smoother scrolling with small intertia should be used when using mouse wheel
  	 *
  	 */
  var smoothing: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Sets or gets the modifier for how long the scroll ‘animation’ lasts when using the mouse wheel once. This is used only for the smooth scrolling behavior.
  	 *
  	 */
  var smoothingDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets or gets the modifier for how many pixels will be scrolled when using the mouse wheel once. This is used only for the smooth scrolling behavior.
  	 *
  	 */
  var smoothingStep: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets gets how much pixels of toleration there will be when initially swiping horizontally. This is to improve swiping up/down without scrolling left/right when not intended due to small deviation left/right
  	 *
  	 */
  var swipeToleranceX: js.UndefOr[Double] = js.undefined
  /**
  	 * Sets gets elements that are linked to the main content horizontally. When the content is scrolled on X axis the linked elements scroll accordingly.
  	 *
  	 */
  var syncedElemsH: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Sets gets elements that are linked to the main content vertically. When the content is scrolled on Y axis the linked elements scroll accordingly.
  	 *
  	 */
  var syncedElemsV: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Event which is raised on mouse up from the scrollbar's thumb drag.
  	 */
  var thumbDragEnd: js.UndefOr[ThumbDragEndEvent] = js.undefined
  /**
  	 * Event which is raised when the thumb drag is being moved.
  	 */
  var thumbDragMove: js.UndefOr[ThumbDragMoveEvent] = js.undefined
  /**
  	 * Event which is raised when there is mouse click on the scrollbar's thumb drag.
  	 */
  var thumbDragStart: js.UndefOr[ThumbDragStartEvent] = js.undefined
  /**
  	 * Sets gets the step of the default scrolling behavior when using mouse wheel
  	 *
  	 */
  var wheelStep: js.UndefOr[Double] = js.undefined
}

object IgScroll {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igScroll
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    alwaysVisible: js.UndefOr[Boolean] = js.undefined,
    bigIncrementStep: Int | Double = null,
    inertiaDeltaX: Int | Double = null,
    inertiaDeltaY: Int | Double = null,
    inertiaDuration: Int | Double = null,
    inertiaStep: Int | Double = null,
    language: String = null,
    locale: js.Any = null,
    minThumbSize: Double | String = null,
    modifyDOM: js.UndefOr[Boolean] = js.undefined,
    regional: String | js.Object = null,
    rendered: (/* event */ Event_, /* ui */ RenderedEventUIParam) => Callback = null,
    resized: (/* event */ Event_, /* ui */ ResizedEventUIParam) => Callback = null,
    resizing: (/* event */ Event_, /* ui */ ResizingEventUIParam) => Callback = null,
    scrollHeight: Int | Double = null,
    scrollLeft: Int | Double = null,
    scrollOnlyHBar: js.UndefOr[Boolean] = js.undefined,
    scrollOnlyVBar: js.UndefOr[Boolean] = js.undefined,
    scrollTop: Int | Double = null,
    scrollWidth: Int | Double = null,
    scrollbarH: String = null,
    scrollbarHParent: String = null,
    scrollbarType: String = null,
    scrollbarV: String = null,
    scrollbarVParent: String = null,
    scrolled: (/* event */ Event_, /* ui */ ScrolledEventUIParam) => Callback = null,
    scrolling: (/* event */ Event_, /* ui */ ScrollingEventUIParam) => Callback = null,
    smallIncrementStep: Int | Double = null,
    smoothing: js.UndefOr[Boolean] = js.undefined,
    smoothingDuration: Int | Double = null,
    smoothingStep: Int | Double = null,
    swipeToleranceX: Int | Double = null,
    syncedElemsH: js.Array[_] = null,
    syncedElemsV: js.Array[_] = null,
    thumbDragEnd: (/* event */ Event_, /* ui */ ThumbDragEndEventUIParam) => Callback = null,
    thumbDragMove: (/* event */ Event_, /* ui */ ThumbDragMoveEventUIParam) => Callback = null,
    thumbDragStart: (/* event */ Event_, /* ui */ ThumbDragStartEventUIParam) => Callback = null,
    wheelStep: Int | Double = null
  ): IgScroll = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(alwaysVisible)) __obj.updateDynamic("alwaysVisible")(alwaysVisible.asInstanceOf[js.Any])
    if (bigIncrementStep != null) __obj.updateDynamic("bigIncrementStep")(bigIncrementStep.asInstanceOf[js.Any])
    if (inertiaDeltaX != null) __obj.updateDynamic("inertiaDeltaX")(inertiaDeltaX.asInstanceOf[js.Any])
    if (inertiaDeltaY != null) __obj.updateDynamic("inertiaDeltaY")(inertiaDeltaY.asInstanceOf[js.Any])
    if (inertiaDuration != null) __obj.updateDynamic("inertiaDuration")(inertiaDuration.asInstanceOf[js.Any])
    if (inertiaStep != null) __obj.updateDynamic("inertiaStep")(inertiaStep.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (minThumbSize != null) __obj.updateDynamic("minThumbSize")(minThumbSize.asInstanceOf[js.Any])
    if (!js.isUndefined(modifyDOM)) __obj.updateDynamic("modifyDOM")(modifyDOM.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (rendered != null) __obj.updateDynamic("rendered")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.RenderedEventUIParam) => rendered(t0, t1).runNow()))
    if (resized != null) __obj.updateDynamic("resized")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ResizedEventUIParam) => resized(t0, t1).runNow()))
    if (resizing != null) __obj.updateDynamic("resizing")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ResizingEventUIParam) => resizing(t0, t1).runNow()))
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollOnlyHBar)) __obj.updateDynamic("scrollOnlyHBar")(scrollOnlyHBar.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollOnlyVBar)) __obj.updateDynamic("scrollOnlyVBar")(scrollOnlyVBar.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (scrollWidth != null) __obj.updateDynamic("scrollWidth")(scrollWidth.asInstanceOf[js.Any])
    if (scrollbarH != null) __obj.updateDynamic("scrollbarH")(scrollbarH.asInstanceOf[js.Any])
    if (scrollbarHParent != null) __obj.updateDynamic("scrollbarHParent")(scrollbarHParent.asInstanceOf[js.Any])
    if (scrollbarType != null) __obj.updateDynamic("scrollbarType")(scrollbarType.asInstanceOf[js.Any])
    if (scrollbarV != null) __obj.updateDynamic("scrollbarV")(scrollbarV.asInstanceOf[js.Any])
    if (scrollbarVParent != null) __obj.updateDynamic("scrollbarVParent")(scrollbarVParent.asInstanceOf[js.Any])
    if (scrolled != null) __obj.updateDynamic("scrolled")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ScrolledEventUIParam) => scrolled(t0, t1).runNow()))
    if (scrolling != null) __obj.updateDynamic("scrolling")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ScrollingEventUIParam) => scrolling(t0, t1).runNow()))
    if (smallIncrementStep != null) __obj.updateDynamic("smallIncrementStep")(smallIncrementStep.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothing)) __obj.updateDynamic("smoothing")(smoothing.asInstanceOf[js.Any])
    if (smoothingDuration != null) __obj.updateDynamic("smoothingDuration")(smoothingDuration.asInstanceOf[js.Any])
    if (smoothingStep != null) __obj.updateDynamic("smoothingStep")(smoothingStep.asInstanceOf[js.Any])
    if (swipeToleranceX != null) __obj.updateDynamic("swipeToleranceX")(swipeToleranceX.asInstanceOf[js.Any])
    if (syncedElemsH != null) __obj.updateDynamic("syncedElemsH")(syncedElemsH.asInstanceOf[js.Any])
    if (syncedElemsV != null) __obj.updateDynamic("syncedElemsV")(syncedElemsV.asInstanceOf[js.Any])
    if (thumbDragEnd != null) __obj.updateDynamic("thumbDragEnd")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ThumbDragEndEventUIParam) => thumbDragEnd(t0, t1).runNow()))
    if (thumbDragMove != null) __obj.updateDynamic("thumbDragMove")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ThumbDragMoveEventUIParam) => thumbDragMove(t0, t1).runNow()))
    if (thumbDragStart != null) __obj.updateDynamic("thumbDragStart")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ThumbDragStartEventUIParam) => thumbDragStart(t0, t1).runNow()))
    if (wheelStep != null) __obj.updateDynamic("wheelStep")(wheelStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgScroll]
  }
}

