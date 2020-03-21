package typingsJapgolly.reactCustomScrollbars.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactUIEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.react.mod.UIEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarProps
  extends AllHTMLAttributes[Scrollbars]
     with ClassAttributes[Scrollbars] {
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  var autoHeightMax: js.UndefOr[Double | String] = js.undefined
  var autoHeightMin: js.UndefOr[Double | String] = js.undefined
  var autoHide: js.UndefOr[Boolean] = js.undefined
  var autoHideDuration: js.UndefOr[Double] = js.undefined
  var autoHideTimeout: js.UndefOr[Double] = js.undefined
  var hideTracksWhenNotNeeded: js.UndefOr[Boolean] = js.undefined
  var onScrollFrame: js.UndefOr[js.Function1[/* values */ positionValues, Unit]] = js.undefined
  var onScrollStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onScrollStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  @JSName("onScroll")
  var onScroll_ScrollbarProps: js.UndefOr[UIEventHandler[_]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* values */ positionValues, Unit]] = js.undefined
  var renderThumbHorizontal: js.UndefOr[StatelessComponent[_]] = js.undefined
  var renderThumbVertical: js.UndefOr[StatelessComponent[_]] = js.undefined
  var renderTrackHorizontal: js.UndefOr[StatelessComponent[_]] = js.undefined
  var renderTrackVertical: js.UndefOr[StatelessComponent[_]] = js.undefined
  var renderView: js.UndefOr[StatelessComponent[_]] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
  var thumbMinSize: js.UndefOr[Double] = js.undefined
  var thumbSize: js.UndefOr[Double] = js.undefined
  var universal: js.UndefOr[Boolean] = js.undefined
}

object ScrollbarProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Scrollbars] = null,
    ClassAttributes: ClassAttributes[Scrollbars] = null,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    autoHeightMax: Double | String = null,
    autoHeightMin: Double | String = null,
    autoHide: js.UndefOr[Boolean] = js.undefined,
    autoHideDuration: Int | Double = null,
    autoHideTimeout: Int | Double = null,
    hideTracksWhenNotNeeded: js.UndefOr[Boolean] = js.undefined,
    onScroll: ReactUIEventFrom[Element] => Callback = null,
    onScrollFrame: /* values */ positionValues => Callback = null,
    onScrollStart: js.UndefOr[Callback] = js.undefined,
    onScrollStop: js.UndefOr[Callback] = js.undefined,
    onUpdate: /* values */ positionValues => Callback = null,
    renderThumbHorizontal: StatelessComponent[_] = null,
    renderThumbVertical: StatelessComponent[_] = null,
    renderTrackHorizontal: StatelessComponent[_] = null,
    renderTrackVertical: StatelessComponent[_] = null,
    renderView: StatelessComponent[_] = null,
    tagName: String = null,
    thumbMinSize: Int | Double = null,
    thumbSize: Int | Double = null,
    universal: js.UndefOr[Boolean] = js.undefined
  ): ScrollbarProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (autoHeightMax != null) __obj.updateDynamic("autoHeightMax")(autoHeightMax.asInstanceOf[js.Any])
    if (autoHeightMin != null) __obj.updateDynamic("autoHeightMin")(autoHeightMin.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.asInstanceOf[js.Any])
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (autoHideTimeout != null) __obj.updateDynamic("autoHideTimeout")(autoHideTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTracksWhenNotNeeded)) __obj.updateDynamic("hideTracksWhenNotNeeded")(hideTracksWhenNotNeeded.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[org.scalajs.dom.raw.Element]) => onScroll(t0).runNow()))
    if (onScrollFrame != null) __obj.updateDynamic("onScrollFrame")(js.Any.fromFunction1((t0: /* values */ typingsJapgolly.reactCustomScrollbars.mod.positionValues) => onScrollFrame(t0).runNow()))
    onScrollStart.foreach(p => __obj.updateDynamic("onScrollStart")(p.toJsFn))
    onScrollStop.foreach(p => __obj.updateDynamic("onScrollStop")(p.toJsFn))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1((t0: /* values */ typingsJapgolly.reactCustomScrollbars.mod.positionValues) => onUpdate(t0).runNow()))
    if (renderThumbHorizontal != null) __obj.updateDynamic("renderThumbHorizontal")(renderThumbHorizontal.asInstanceOf[js.Any])
    if (renderThumbVertical != null) __obj.updateDynamic("renderThumbVertical")(renderThumbVertical.asInstanceOf[js.Any])
    if (renderTrackHorizontal != null) __obj.updateDynamic("renderTrackHorizontal")(renderTrackHorizontal.asInstanceOf[js.Any])
    if (renderTrackVertical != null) __obj.updateDynamic("renderTrackVertical")(renderTrackVertical.asInstanceOf[js.Any])
    if (renderView != null) __obj.updateDynamic("renderView")(renderView.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (thumbMinSize != null) __obj.updateDynamic("thumbMinSize")(thumbMinSize.asInstanceOf[js.Any])
    if (thumbSize != null) __obj.updateDynamic("thumbSize")(thumbSize.asInstanceOf[js.Any])
    if (!js.isUndefined(universal)) __obj.updateDynamic("universal")(universal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarProps]
  }
}

