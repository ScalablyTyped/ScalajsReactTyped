package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialDashUi.Anon_Text
import typingsJapgolly.materialDashUi.__MaterialUI.AutoCompleteProps
import typingsJapgolly.materialDashUi.__MaterialUI.Popover.PopoverAnimationProps
import typingsJapgolly.materialDashUi.__MaterialUI.Popover.PopoverProps
import typingsJapgolly.materialDashUi.__MaterialUI.propTypes.origin
import typingsJapgolly.materialDashUi.autoCompleteMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoComplete {
  def apply(
    dataSource: js.Array[js.Any],
    anchorOrigin: origin = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: ComponentClassP[PopoverAnimationProps with js.Object] = null,
    autoComplete: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    dataSourceConfig: Anon_Text = null,
    defaultValue: String | Double = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorStyle: CSSProperties = null,
    errorText: VdomNode = null,
    filter: (/* searchText */ String, /* key */ String, js.Any) => CallbackTo[Boolean] = null,
    floatingLabelFixed: js.UndefOr[Boolean] = js.undefined,
    floatingLabelFocusStyle: CSSProperties = null,
    floatingLabelShrinkStyle: CSSProperties = null,
    floatingLabelStyle: CSSProperties = null,
    floatingLabelText: VdomNode = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hintStyle: CSSProperties = null,
    hintText: VdomNode = null,
    id: String = null,
    inputStyle: CSSProperties = null,
    listStyle: CSSProperties = null,
    max: Int | Double = null,
    maxSearchResults: Int | Double = null,
    maxlength: String = null,
    menuCloseDelay: Int | Double = null,
    menuProps: js.Any = null,
    menuStyle: CSSProperties = null,
    min: Int | Double = null,
    minlength: String = null,
    multiLine: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onBlur: ReactFocusEventFrom[js.Object with Element] => Callback = null,
    onChange: (/* e */ ReactEventFrom[js.Object with Element], /* newValue */ String) => Callback = null,
    onFocus: ReactFocusEventFrom[js.Object with Element] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[js.Object with Element] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[js.Object with Element] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[js.Object with Element] => Callback = null,
    onNewRequest: (js.Any, /* index */ Double) => Callback = null,
    onUpdateInput: (/* searchText */ String, /* dataSource */ js.Array[js.Any]) => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    openOnFocus: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    popoverProps: PopoverProps = null,
    required: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    rowsMax: Int | Double = null,
    searchText: String = null,
    step: Int | Double = null,
    style: CSSProperties = null,
    targetOrigin: origin = null,
    textFieldStyle: CSSProperties = null,
    textareaStyle: CSSProperties = null,
    title: String = null,
    `type`: String = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineShow: js.UndefOr[Boolean] = js.undefined,
    underlineStyle: CSSProperties = null,
    value: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AutoCompleteProps[js.Any], default, Unit, AutoCompleteProps[js.Any]] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
  
      if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dataSourceConfig != null) __obj.updateDynamic("dataSourceConfig")(dataSourceConfig.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle.asInstanceOf[js.Any])
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.rawNode.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3((t0: /* searchText */ java.lang.String, t1: /* key */ java.lang.String, t2: js.Any) => filter(t0, t1, t2).runNow()))
    if (!js.isUndefined(floatingLabelFixed)) __obj.updateDynamic("floatingLabelFixed")(floatingLabelFixed.asInstanceOf[js.Any])
    if (floatingLabelFocusStyle != null) __obj.updateDynamic("floatingLabelFocusStyle")(floatingLabelFocusStyle.asInstanceOf[js.Any])
    if (floatingLabelShrinkStyle != null) __obj.updateDynamic("floatingLabelShrinkStyle")(floatingLabelShrinkStyle.asInstanceOf[js.Any])
    if (floatingLabelStyle != null) __obj.updateDynamic("floatingLabelStyle")(floatingLabelStyle.asInstanceOf[js.Any])
    if (floatingLabelText != null) __obj.updateDynamic("floatingLabelText")(floatingLabelText.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle.asInstanceOf[js.Any])
    if (hintText != null) __obj.updateDynamic("hintText")(hintText.rawNode.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxSearchResults != null) __obj.updateDynamic("maxSearchResults")(maxSearchResults.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (menuCloseDelay != null) __obj.updateDynamic("menuCloseDelay")(menuCloseDelay.asInstanceOf[js.Any])
    if (menuProps != null) __obj.updateDynamic("menuProps")(menuProps.asInstanceOf[js.Any])
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minlength != null) __obj.updateDynamic("minlength")(minlength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiLine)) __obj.updateDynamic("multiLine")(multiLine.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* newValue */ java.lang.String) => onChange(t0, t1).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onKeyUp(t0).runNow()))
    if (onNewRequest != null) __obj.updateDynamic("onNewRequest")(js.Any.fromFunction2((t0: js.Any, t1: /* index */ scala.Double) => onNewRequest(t0, t1).runNow()))
    if (onUpdateInput != null) __obj.updateDynamic("onUpdateInput")(js.Any.fromFunction2((t0: /* searchText */ java.lang.String, t1: /* dataSource */ js.Array[js.Any]) => onUpdateInput(t0, t1).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnFocus)) __obj.updateDynamic("openOnFocus")(openOnFocus.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (searchText != null) __obj.updateDynamic("searchText")(searchText.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin.asInstanceOf[js.Any])
    if (textFieldStyle != null) __obj.updateDynamic("textFieldStyle")(textFieldStyle.asInstanceOf[js.Any])
    if (textareaStyle != null) __obj.updateDynamic("textareaStyle")(textareaStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle.asInstanceOf[js.Any])
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(underlineShow)) __obj.updateDynamic("underlineShow")(underlineShow.asInstanceOf[js.Any])
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.__MaterialUI.AutoCompleteProps[js.Any], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.autoCompleteMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.__MaterialUI.AutoCompleteProps[js.Any]])(children: _*)
  }
  @JSImport("material-ui/AutoComplete", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

