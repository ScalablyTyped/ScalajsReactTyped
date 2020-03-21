package typingsJapgolly.mcustomscrollbar

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlwaysTriggerOffsets extends js.Object {
  /**
    * Set the behavior of calling onTotalScroll and onTotalScrollBack offsets.
    * By default, callback offsets will trigger repeatedly while content is scrolling within the offsets.
    * Set alwaysTriggerOffsets: false when you need to trigger onTotalScroll and onTotalScrollBack callbacks once, each time scroll end or beginning is reached.
    */
  var alwaysTriggerOffsets: js.UndefOr[Boolean] = js.undefined
  /**
    * A function to call right before scrollbar(s) are updated.
    */
  var onBeforeUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call when plugin markup is created.
    */
  var onCreate: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call each time an image inside the element is fully loaded and scrollbar(s) are updated.
    */
  var onImageLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call when scrollbars have initialized
    */
  var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call when content becomes wide enough and horizontal scrollbar is added.
    */
  var onOverflowX: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call when content becomes narrow enough and horizontal scrollbar is removed.
    */
  var onOverflowXNone: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call when content becomes long enough and vertical scrollbar is added.
    */
  var onOverflowY: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call when content becomes short enough and vertical scrollbar is removed.
    */
  var onOverflowYNone: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * User defined callback function, triggered on scroll event. Call your own function(s) each time a scroll event completes
    */
  var onScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * User defined callback function, triggered on scroll start event. You can call your own function(s) each time a scroll event begins
    */
  var onScrollStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call each time a type of element is added, removed or changes its size and scrollbar(s) are updated.
    */
  var onSelectorChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call when scrolling is completed and content is scrolled all the way to the end (bottom/right)
    */
  var onTotalScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to call when scrolling is completed and content is scrolled back to the beginning (top/left)
    */
  var onTotalScrollBack: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Set an offset for which the onTotalScrollBack callback is triggered.
    * Its value is in pixels
    */
  var onTotalScrollBackOffset: js.UndefOr[Double] = js.undefined
  /**
    * Set an offset for which the onTotalScroll callback is triggered.
    * Its value is in pixels.
    */
  var onTotalScrollOffset: js.UndefOr[Double] = js.undefined
  /**
    * A function to call when scrollbar(s) are updated.
    */
  var onUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * User defined callback function, triggered while scrolling
    */
  var whileScrolling: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonAlwaysTriggerOffsets {
  @scala.inline
  def apply(
    alwaysTriggerOffsets: js.UndefOr[Boolean] = js.undefined,
    onBeforeUpdate: js.UndefOr[Callback] = js.undefined,
    onCreate: js.UndefOr[Callback] = js.undefined,
    onImageLoad: js.UndefOr[Callback] = js.undefined,
    onInit: js.UndefOr[Callback] = js.undefined,
    onOverflowX: js.UndefOr[Callback] = js.undefined,
    onOverflowXNone: js.UndefOr[Callback] = js.undefined,
    onOverflowY: js.UndefOr[Callback] = js.undefined,
    onOverflowYNone: js.UndefOr[Callback] = js.undefined,
    onScroll: js.UndefOr[Callback] = js.undefined,
    onScrollStart: js.UndefOr[Callback] = js.undefined,
    onSelectorChange: js.UndefOr[Callback] = js.undefined,
    onTotalScroll: js.UndefOr[Callback] = js.undefined,
    onTotalScrollBack: js.UndefOr[Callback] = js.undefined,
    onTotalScrollBackOffset: Int | Double = null,
    onTotalScrollOffset: Int | Double = null,
    onUpdate: js.UndefOr[Callback] = js.undefined,
    whileScrolling: js.UndefOr[Callback] = js.undefined
  ): AnonAlwaysTriggerOffsets = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysTriggerOffsets)) __obj.updateDynamic("alwaysTriggerOffsets")(alwaysTriggerOffsets.asInstanceOf[js.Any])
    onBeforeUpdate.foreach(p => __obj.updateDynamic("onBeforeUpdate")(p.toJsFn))
    onCreate.foreach(p => __obj.updateDynamic("onCreate")(p.toJsFn))
    onImageLoad.foreach(p => __obj.updateDynamic("onImageLoad")(p.toJsFn))
    onInit.foreach(p => __obj.updateDynamic("onInit")(p.toJsFn))
    onOverflowX.foreach(p => __obj.updateDynamic("onOverflowX")(p.toJsFn))
    onOverflowXNone.foreach(p => __obj.updateDynamic("onOverflowXNone")(p.toJsFn))
    onOverflowY.foreach(p => __obj.updateDynamic("onOverflowY")(p.toJsFn))
    onOverflowYNone.foreach(p => __obj.updateDynamic("onOverflowYNone")(p.toJsFn))
    onScroll.foreach(p => __obj.updateDynamic("onScroll")(p.toJsFn))
    onScrollStart.foreach(p => __obj.updateDynamic("onScrollStart")(p.toJsFn))
    onSelectorChange.foreach(p => __obj.updateDynamic("onSelectorChange")(p.toJsFn))
    onTotalScroll.foreach(p => __obj.updateDynamic("onTotalScroll")(p.toJsFn))
    onTotalScrollBack.foreach(p => __obj.updateDynamic("onTotalScrollBack")(p.toJsFn))
    if (onTotalScrollBackOffset != null) __obj.updateDynamic("onTotalScrollBackOffset")(onTotalScrollBackOffset.asInstanceOf[js.Any])
    if (onTotalScrollOffset != null) __obj.updateDynamic("onTotalScrollOffset")(onTotalScrollOffset.asInstanceOf[js.Any])
    onUpdate.foreach(p => __obj.updateDynamic("onUpdate")(p.toJsFn))
    whileScrolling.foreach(p => __obj.updateDynamic("whileScrolling")(p.toJsFn))
    __obj.asInstanceOf[AnonAlwaysTriggerOffsets]
  }
}

