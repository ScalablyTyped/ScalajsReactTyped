package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonComponentDxDeferRendering
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.mod.DevExpress.animationConfig
import typingsJapgolly.devextreme.mod._Global_.JQueryPromise
import typingsJapgolly.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDeferRenderingOptions extends WidgetOptions[dxDeferRendering] {
  /** Specifies the animation to be used to show the rendered content. */
  var animation: js.UndefOr[animationConfig] = js.undefined
  /** A function that is executed when the content is rendered but not yet displayed. */
  var onRendered: js.UndefOr[js.Function1[/* e */ AnonComponentDxDeferRendering, _]] = js.undefined
  /** A function that is executed when the content is displayed and animation is completed. */
  var onShown: js.UndefOr[js.Function1[/* e */ AnonComponentDxDeferRendering, _]] = js.undefined
  /** Specifies when the widget content is rendered. */
  var renderWhen: js.UndefOr[Promise[Unit] | JQueryPromise[Unit] | Boolean] = js.undefined
  /** Indicates if a load indicator should be shown until the widget's content is rendered. */
  var showLoadIndicator: js.UndefOr[Boolean] = js.undefined
  /** Specifies a jQuery selector of items that should be rendered using a staggered animation. */
  var staggerItemSelector: js.UndefOr[String] = js.undefined
}

object dxDeferRenderingOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    animation: animationConfig = null,
    bindingOptions: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    onContentReady: /* e */ AnonComponentElement[dxDeferRendering] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxDeferRendering] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxDeferRendering] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxDeferRendering] => CallbackTo[js.Any] = null,
    onRendered: /* e */ AnonComponentDxDeferRendering => CallbackTo[js.Any] = null,
    onShown: /* e */ AnonComponentDxDeferRendering => CallbackTo[js.Any] = null,
    renderWhen: Promise[Unit] | JQueryPromise[Unit] | Boolean = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    showLoadIndicator: js.UndefOr[Boolean] = js.undefined,
    staggerItemSelector: String = null,
    tabIndex: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxDeferRenderingOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDeferRendering]) => onContentReady(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDeferRendering]) => onDisposing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDeferRendering]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxDeferRendering]) => onOptionChanged(t0).runNow()))
    if (onRendered != null) __obj.updateDynamic("onRendered")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxDeferRendering) => onRendered(t0).runNow()))
    if (onShown != null) __obj.updateDynamic("onShown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentDxDeferRendering) => onShown(t0).runNow()))
    if (renderWhen != null) __obj.updateDynamic("renderWhen")(renderWhen.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showLoadIndicator)) __obj.updateDynamic("showLoadIndicator")(showLoadIndicator.asInstanceOf[js.Any])
    if (staggerItemSelector != null) __obj.updateDynamic("staggerItemSelector")(staggerItemSelector.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDeferRenderingOptions]
  }
}

