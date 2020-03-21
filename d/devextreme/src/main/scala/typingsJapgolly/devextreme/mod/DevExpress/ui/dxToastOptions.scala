package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonCancelComponentElementModel
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonElementDxElement
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.devextremeStrings.custom
import typingsJapgolly.devextreme.devextremeStrings.error
import typingsJapgolly.devextreme.devextremeStrings.info
import typingsJapgolly.devextreme.devextremeStrings.success
import typingsJapgolly.devextreme.devextremeStrings.warning
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.event
import typingsJapgolly.devextreme.mod.DevExpress.positionConfig
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxToastOptions extends dxOverlayOptions[dxToast] {
  /** Configures widget visibility animations. This object contains two fields: show and hide. */
  @JSName("animation")
  var animation_dxToastOptions: js.UndefOr[dxToastAnimation] = js.undefined
  /** A Boolean value specifying whether or not the toast is closed if a user clicks it. */
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  /** A Boolean value specifying whether or not the toast is closed if a user swipes it out of the screen boundaries. */
  var closeOnSwipe: js.UndefOr[Boolean] = js.undefined
  /** The time span in milliseconds during which the Toast widget is visible. */
  var displayTime: js.UndefOr[Double] = js.undefined
  /** The Toast message text. */
  var message: js.UndefOr[String] = js.undefined
  /** Positions the widget. */
  @JSName("position")
  var position_dxToastOptions: js.UndefOr[positionConfig | String] = js.undefined
  /** Specifies the Toast widget type. */
  var `type`: js.UndefOr[custom | error | info | success | warning] = js.undefined
}

object dxToastOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    animation: dxToastAnimation = null,
    bindingOptions: js.Any = null,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    closeOnOutsideClick: Boolean | (js.Function1[/* event */ event, Boolean]) = null,
    closeOnSwipe: js.UndefOr[Boolean] = js.undefined,
    contentTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, String | Element | JQuery]) = null,
    deferRendering: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayTime: Int | Double = null,
    dragEnabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Double | String | (js.Function0[Double | String]) = null,
    maxWidth: Double | String | (js.Function0[Double | String]) = null,
    message: String = null,
    minHeight: Double | String | (js.Function0[Double | String]) = null,
    minWidth: Double | String | (js.Function0[Double | String]) = null,
    onContentReady: /* e */ AnonComponentElement[dxToast] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxToast] => CallbackTo[js.Any] = null,
    onHidden: /* e */ AnonElementDxElement[dxToast] => CallbackTo[js.Any] = null,
    onHiding: /* e */ AnonCancelComponentElementModel[dxToast] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxToast] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxToast] => CallbackTo[js.Any] = null,
    onShowing: /* e */ AnonElementDxElement[dxToast] => CallbackTo[js.Any] = null,
    onShown: /* e */ AnonElementDxElement[dxToast] => CallbackTo[js.Any] = null,
    position: positionConfig | String = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    shading: js.UndefOr[Boolean] = js.undefined,
    shadingColor: String = null,
    tabIndex: Int | Double = null,
    `type`: custom | error | info | success | warning = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxToastOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (closeOnOutsideClick != null) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSwipe)) __obj.updateDynamic("closeOnSwipe")(closeOnSwipe.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRendering)) __obj.updateDynamic("deferRendering")(deferRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayTime != null) __obj.updateDynamic("displayTime")(displayTime.asInstanceOf[js.Any])
    if (!js.isUndefined(dragEnabled)) __obj.updateDynamic("dragEnabled")(dragEnabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxToast]) => onContentReady(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxToast]) => onDisposing(t0).runNow()))
    if (onHidden != null) __obj.updateDynamic("onHidden")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementDxElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxToast]) => onHidden(t0).runNow()))
    if (onHiding != null) __obj.updateDynamic("onHiding")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCancelComponentElementModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxToast]) => onHiding(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxToast]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxToast]) => onOptionChanged(t0).runNow()))
    if (onShowing != null) __obj.updateDynamic("onShowing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementDxElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxToast]) => onShowing(t0).runNow()))
    if (onShown != null) __obj.updateDynamic("onShown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementDxElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxToast]) => onShown(t0).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(shading)) __obj.updateDynamic("shading")(shading.asInstanceOf[js.Any])
    if (shadingColor != null) __obj.updateDynamic("shadingColor")(shadingColor.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxToastOptions]
  }
}

