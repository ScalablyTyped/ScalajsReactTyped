package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonCancelComponentElementModel
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonElementDxElement
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.devextremeStrings.`left bottom`
import typingsJapgolly.devextreme.devextremeStrings.`left top`
import typingsJapgolly.devextreme.devextremeStrings.`right bottom`
import typingsJapgolly.devextreme.devextremeStrings.`right top`
import typingsJapgolly.devextreme.devextremeStrings.bottom
import typingsJapgolly.devextreme.devextremeStrings.center
import typingsJapgolly.devextreme.devextremeStrings.left
import typingsJapgolly.devextreme.devextremeStrings.right
import typingsJapgolly.devextreme.devextremeStrings.top
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.event
import typingsJapgolly.devextreme.mod.DevExpress.positionConfig
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxLoadPanelOptions extends dxOverlayOptions[dxLoadPanel] {
  /** Configures widget visibility animations. This object contains two fields: show and hide. */
  @JSName("animation")
  var animation_dxLoadPanelOptions: js.UndefOr[dxLoadPanelAnimation] = js.undefined
  /** Specifies the widget's container. */
  var container: js.UndefOr[String | Element | JQuery] = js.undefined
  /** The delay in milliseconds after which the load panel is displayed. */
  var delay: js.UndefOr[Double] = js.undefined
  /** A URL pointing to an image to be used as a load indicator. */
  var indicatorSrc: js.UndefOr[String] = js.undefined
  /** Specifies the text displayed in the load panel. Ignored in the Material Design theme. */
  var message: js.UndefOr[String] = js.undefined
  /** Positions the widget. */
  @JSName("position")
  var position_dxLoadPanelOptions: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | positionConfig | js.Function
  ] = js.undefined
  /** A Boolean value specifying whether or not to show a load indicator. */
  var showIndicator: js.UndefOr[Boolean] = js.undefined
  /** A Boolean value specifying whether or not to show the pane behind the load indicator. */
  var showPane: js.UndefOr[Boolean] = js.undefined
}

object dxLoadPanelOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    animation: dxLoadPanelAnimation = null,
    bindingOptions: js.Any = null,
    closeOnOutsideClick: Boolean | (js.Function1[/* event */ event, Boolean]) = null,
    container: String | Element | JQuery = null,
    contentTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function1[/* contentElement */ dxElement, String | Element | JQuery]) = null,
    deferRendering: js.UndefOr[Boolean] = js.undefined,
    delay: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dragEnabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    indicatorSrc: String = null,
    maxHeight: Double | String | (js.Function0[Double | String]) = null,
    maxWidth: Double | String | (js.Function0[Double | String]) = null,
    message: String = null,
    minHeight: Double | String | (js.Function0[Double | String]) = null,
    minWidth: Double | String | (js.Function0[Double | String]) = null,
    onContentReady: /* e */ AnonComponentElement[dxLoadPanel] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxLoadPanel] => CallbackTo[js.Any] = null,
    onHidden: /* e */ AnonElementDxElement[dxLoadPanel] => CallbackTo[js.Any] = null,
    onHiding: /* e */ AnonCancelComponentElementModel[dxLoadPanel] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxLoadPanel] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxLoadPanel] => CallbackTo[js.Any] = null,
    onShowing: /* e */ AnonElementDxElement[dxLoadPanel] => CallbackTo[js.Any] = null,
    onShown: /* e */ AnonElementDxElement[dxLoadPanel] => CallbackTo[js.Any] = null,
    position: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | positionConfig | js.Function = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    shading: js.UndefOr[Boolean] = js.undefined,
    shadingColor: String = null,
    showIndicator: js.UndefOr[Boolean] = js.undefined,
    showPane: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxLoadPanelOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (closeOnOutsideClick != null) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(deferRendering)) __obj.updateDynamic("deferRendering")(deferRendering.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dragEnabled)) __obj.updateDynamic("dragEnabled")(dragEnabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (indicatorSrc != null) __obj.updateDynamic("indicatorSrc")(indicatorSrc.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxLoadPanel]) => onContentReady(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxLoadPanel]) => onDisposing(t0).runNow()))
    if (onHidden != null) __obj.updateDynamic("onHidden")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementDxElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxLoadPanel]) => onHidden(t0).runNow()))
    if (onHiding != null) __obj.updateDynamic("onHiding")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonCancelComponentElementModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxLoadPanel]) => onHiding(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxLoadPanel]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxLoadPanel]) => onOptionChanged(t0).runNow()))
    if (onShowing != null) __obj.updateDynamic("onShowing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementDxElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxLoadPanel]) => onShowing(t0).runNow()))
    if (onShown != null) __obj.updateDynamic("onShown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementDxElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxLoadPanel]) => onShown(t0).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(shading)) __obj.updateDynamic("shading")(shading.asInstanceOf[js.Any])
    if (shadingColor != null) __obj.updateDynamic("shadingColor")(shadingColor.asInstanceOf[js.Any])
    if (!js.isUndefined(showIndicator)) __obj.updateDynamic("showIndicator")(showIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(showPane)) __obj.updateDynamic("showPane")(showPane.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxLoadPanelOptions]
  }
}

