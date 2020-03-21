package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonComponentDxScrollView
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonReachedRight
import typingsJapgolly.devextreme.devextremeStrings.always
import typingsJapgolly.devextreme.devextremeStrings.both
import typingsJapgolly.devextreme.devextremeStrings.horizontal
import typingsJapgolly.devextreme.devextremeStrings.never
import typingsJapgolly.devextreme.devextremeStrings.onHover
import typingsJapgolly.devextreme.devextremeStrings.onScroll
import typingsJapgolly.devextreme.devextremeStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxScrollViewOptions extends dxScrollableOptions[dxScrollView] {
  /** A function that is executed when the "pull to refresh" gesture is performed. Supported in mobile themes only. */
  var onPullDown: js.UndefOr[js.Function1[/* e */ AnonComponentDxScrollView, _]] = js.undefined
  /** A function that is executed when the content is scrolled down to the bottom. */
  var onReachBottom: js.UndefOr[js.Function1[/* e */ AnonComponentDxScrollView, _]] = js.undefined
  /** Specifies the text shown in the pullDown panel when pulling the content down lowers the refresh threshold. */
  var pulledDownText: js.UndefOr[String] = js.undefined
  /** Specifies the text shown in the pullDown panel while pulling the content down to the refresh threshold. */
  var pullingDownText: js.UndefOr[String] = js.undefined
  /** Specifies the text shown in the pullDown panel displayed when content is scrolled to the bottom. */
  var reachBottomText: js.UndefOr[String] = js.undefined
  /** Specifies the text shown in the pullDown panel displayed when the content is being refreshed. */
  var refreshingText: js.UndefOr[String] = js.undefined
}

object dxScrollViewOptions {
  @scala.inline
  def apply(
    bindingOptions: js.Any = null,
    bounceEnabled: js.UndefOr[Boolean] = js.undefined,
    direction: both | horizontal | vertical = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    onDisposing: /* e */ AnonModel[dxScrollView] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxScrollView] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxScrollView] => CallbackTo[js.Any] = null,
    onPullDown: /* e */ AnonComponentDxScrollView => CallbackTo[js.Any] = null,
    onReachBottom: /* e */ AnonComponentDxScrollView => CallbackTo[js.Any] = null,
    onScroll: /* e */ AnonReachedRight[dxScrollView] => CallbackTo[js.Any] = null,
    onUpdated: /* e */ AnonReachedRight[dxScrollView] => CallbackTo[js.Any] = null,
    pulledDownText: String = null,
    pullingDownText: String = null,
    reachBottomText: String = null,
    refreshingText: String = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollByContent: js.UndefOr[Boolean] = js.undefined,
    scrollByThumb: js.UndefOr[Boolean] = js.undefined,
    showScrollbar: onScroll | onHover | always | never = null,
    useNative: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxScrollViewOptions = {
    val __obj = js.Dynamic.literal()
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceEnabled)) __obj.updateDynamic("bounceEnabled")(bounceEnabled.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxScrollView]) => onDisposing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxScrollView]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxScrollView]) => onOptionChanged(t0).runNow()))
    if (onPullDown != null) __obj.updateDynamic("onPullDown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxScrollView) => onPullDown(t0).runNow()))
    if (onReachBottom != null) __obj.updateDynamic("onReachBottom")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxScrollView) => onReachBottom(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonReachedRight[typingsJapgolly.devextreme.mod.DevExpress.ui.dxScrollView]) => onScroll(t0).runNow()))
    if (onUpdated != null) __obj.updateDynamic("onUpdated")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonReachedRight[typingsJapgolly.devextreme.mod.DevExpress.ui.dxScrollView]) => onUpdated(t0).runNow()))
    if (pulledDownText != null) __obj.updateDynamic("pulledDownText")(pulledDownText.asInstanceOf[js.Any])
    if (pullingDownText != null) __obj.updateDynamic("pullingDownText")(pullingDownText.asInstanceOf[js.Any])
    if (reachBottomText != null) __obj.updateDynamic("reachBottomText")(reachBottomText.asInstanceOf[js.Any])
    if (refreshingText != null) __obj.updateDynamic("refreshingText")(refreshingText.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollByContent)) __obj.updateDynamic("scrollByContent")(scrollByContent.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollByThumb)) __obj.updateDynamic("scrollByThumb")(scrollByThumb.asInstanceOf[js.Any])
    if (showScrollbar != null) __obj.updateDynamic("showScrollbar")(showScrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxScrollViewOptions]
  }
}

