package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSlider
  extends /**
	 * Option for igSlider
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Get or set whether the slide handle will animate when it is moved.
  	 */
  var animate: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Defines the slider bookmark click event. Fired when a bookmark is clicked.
  	 */
  var bookmarkClick: js.UndefOr[BookmarkClickEvent] = js.undefined
  /**
  	 * Defines the slider bookmark hit event. Fired when the slider handle passes after the bookmark value.
  	 */
  var bookmarkHit: js.UndefOr[BookmarkHitEvent] = js.undefined
  /**
  	 * Get or set the bookmarks array.
  	 */
  var bookmarks: js.UndefOr[IgSliderBookmarks] = js.undefined
  /**
  	 * Defines the slider value change event. Fired when the value of the slider changes. It fires after the slide event.
  	 */
  var change: js.UndefOr[ChangeEvent] = js.undefined
  /**
  	 * Get or set the slider range maximum value.
  	 */
  var max: js.UndefOr[Double] = js.undefined
  /**
  	 * Get or set the slider range minimum value.
  	 */
  var min: js.UndefOr[Double] = js.undefined
  /**
  	 * Get or set the slider orientation.
  	 */
  var orientation: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get or set the whether to show bookmarks title on bookmark hover or not.
  	 */
  var showBookmarkTitle: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Defines the slide event. Fired when the user is sliding with mouse.
  	 */
  var slide: js.UndefOr[SlideEvent] = js.undefined
  /**
  	 * Defines the slide start event.
  	 */
  var start: js.UndefOr[StartEvent] = js.undefined
  /**
  	 * Get or set the step with which the value is increased.
  	 */
  var step: js.UndefOr[Double] = js.undefined
  /**
  	 * Defines the slide stop event. Fired to mark the end of a sliding action.
  	 */
  var stop: js.UndefOr[StopEvent] = js.undefined
  /**
  	 * Get or set whether the handle will be moved to the bookmark position when a bookmark is clicked.
  	 */
  var syncHandleWithBookmark: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Get or set the slider value.
  	 */
  var value: js.UndefOr[Double] = js.undefined
}

object IgSlider {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igSlider
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    bookmarkClick: (/* event */ Event_, /* ui */ BookmarkClickEventUIParam) => Callback = null,
    bookmarkHit: (/* event */ Event_, /* ui */ BookmarkHitEventUIParam) => Callback = null,
    bookmarks: IgSliderBookmarks = null,
    change: (/* event */ Event_, /* ui */ ChangeEventUIParam) => Callback = null,
    max: Int | Double = null,
    min: Int | Double = null,
    orientation: js.Any = null,
    showBookmarkTitle: js.UndefOr[Boolean] = js.undefined,
    slide: (/* event */ Event_, /* ui */ SlideEventUIParam) => Callback = null,
    start: (/* event */ Event_, /* ui */ StartEventUIParam) => Callback = null,
    step: Int | Double = null,
    stop: (/* event */ Event_, /* ui */ StopEventUIParam) => Callback = null,
    syncHandleWithBookmark: js.UndefOr[Boolean] = js.undefined,
    value: Int | Double = null
  ): IgSlider = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (bookmarkClick != null) __obj.updateDynamic("bookmarkClick")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.BookmarkClickEventUIParam) => bookmarkClick(t0, t1).runNow()))
    if (bookmarkHit != null) __obj.updateDynamic("bookmarkHit")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.BookmarkHitEventUIParam) => bookmarkHit(t0, t1).runNow()))
    if (bookmarks != null) __obj.updateDynamic("bookmarks")(bookmarks.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ChangeEventUIParam) => change(t0, t1).runNow()))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(showBookmarkTitle)) __obj.updateDynamic("showBookmarkTitle")(showBookmarkTitle.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.SlideEventUIParam) => slide(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.StartEventUIParam) => start(t0, t1).runNow()))
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.StopEventUIParam) => stop(t0, t1).runNow()))
    if (!js.isUndefined(syncHandleWithBookmark)) __obj.updateDynamic("syncHandleWithBookmark")(syncHandleWithBookmark.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSlider]
  }
}

