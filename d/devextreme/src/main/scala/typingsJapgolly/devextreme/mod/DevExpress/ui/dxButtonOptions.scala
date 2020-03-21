package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonIcon
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonValidationGroup
import typingsJapgolly.devextreme.devextremeStrings.back
import typingsJapgolly.devextreme.devextremeStrings.contained
import typingsJapgolly.devextreme.devextremeStrings.danger
import typingsJapgolly.devextreme.devextremeStrings.default_
import typingsJapgolly.devextreme.devextremeStrings.normal
import typingsJapgolly.devextreme.devextremeStrings.outlined
import typingsJapgolly.devextreme.devextremeStrings.success
import typingsJapgolly.devextreme.devextremeStrings.text
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxButtonOptions extends WidgetOptions[dxButton] {
  /** Specifies the icon to be displayed on the button. */
  var icon: js.UndefOr[String] = js.undefined
  /** A function that is executed when the Button is clicked or tapped. */
  var onClick: js.UndefOr[js.Function1[/* e */ AnonValidationGroup, _]] = js.undefined
  /** Specifies how the button is styled. */
  var stylingMode: js.UndefOr[text | outlined | contained] = js.undefined
  /** Specifies a custom template for the Button widget. */
  var template: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ AnonIcon, /* contentElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** The text displayed on the button. */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the button type. */
  var `type`: js.UndefOr[back | danger | default_ | normal | success] = js.undefined
  /** Specifies whether the button submits an HTML form. */
  var useSubmitBehavior: js.UndefOr[Boolean] = js.undefined
  /** Specifies the name of the validation group to be accessed in the click event handler. */
  var validationGroup: js.UndefOr[String] = js.undefined
}

object dxButtonOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    onClick: /* e */ AnonValidationGroup => CallbackTo[js.Any] = null,
    onContentReady: /* e */ AnonComponentElement[dxButton] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxButton] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxButton] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxButton] => CallbackTo[js.Any] = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    stylingMode: text | outlined | contained = null,
    tabIndex: Int | Double = null,
    template: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ AnonIcon, /* contentElement */ dxElement, String | Element | JQuery]) = null,
    text: String = null,
    `type`: back | danger | default_ | normal | success = null,
    useSubmitBehavior: js.UndefOr[Boolean] = js.undefined,
    validationGroup: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonValidationGroup) => onClick(t0).runNow()))
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxButton]) => onContentReady(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxButton]) => onDisposing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxButton]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxButton]) => onOptionChanged(t0).runNow()))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useSubmitBehavior)) __obj.updateDynamic("useSubmitBehavior")(useSubmitBehavior.asInstanceOf[js.Any])
    if (validationGroup != null) __obj.updateDynamic("validationGroup")(validationGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxButtonOptions]
  }
}

