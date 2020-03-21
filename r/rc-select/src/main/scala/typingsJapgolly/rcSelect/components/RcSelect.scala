package typingsJapgolly.rcSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import typingsJapgolly.rcSelect.mod.RcSelect.OptionProps
import typingsJapgolly.rcSelect.mod.RcSelect.SelectProps
import typingsJapgolly.rcSelect.mod.default
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcSelect {
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    animation: String = null,
    choiceTransitionName: String = null,
    className: String = null,
    combobox: js.UndefOr[Boolean] = js.undefined,
    defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined,
    defaultLabel: String | js.Array[String] = null,
    defaultValue: String | js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdownClassName: String = null,
    dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined,
    dropdownMenuStyle: StringDictionary[String] = null,
    dropdownStyle: StringDictionary[String] = null,
    filterOption: js.UndefOr[Boolean] = js.undefined,
    getInputElement: js.UndefOr[CallbackTo[Node]] = js.undefined,
    getPopupContainer: /* trigger */ Node => CallbackTo[Node] = null,
    id: String = null,
    labelInValue: js.UndefOr[Boolean] = js.undefined,
    maxTagCount: Int | Double = null,
    maxTagPlaceholder: japgolly.scalajs.react.raw.React.Node | js.Function = null,
    maxTagTextLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    notFoundContent: String = null,
    onBlur: js.UndefOr[Callback] = js.undefined,
    onChange: (/* value */ String, /* label */ String) => Callback = null,
    onDeselect: (/* value */ String, Component[OptionProps with js.Object, js.Object]) => Callback = null,
    onFocus: js.UndefOr[Callback] = js.undefined,
    onInputKeyDown: /* e */ Event_ => Callback = null,
    onPopupScroll: js.UndefOr[Callback] = js.undefined,
    onSearch: js.UndefOr[Callback] = js.undefined,
    onSelect: (/* value */ String, Component[OptionProps with js.Object, js.Object]) => Callback = null,
    optionFilterProp: String = null,
    optionLabelProp: String = null,
    placeholder: VdomNode = null,
    prefixCls: String = null,
    showAction: js.Array[String] = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    tags: js.UndefOr[Boolean] = js.undefined,
    tokenSeparators: js.Array[String] = null,
    transitionName: String = null,
    value: String | js.Array[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SelectProps, default, Unit, SelectProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (choiceTransitionName != null) __obj.updateDynamic("choiceTransitionName")(choiceTransitionName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(combobox)) __obj.updateDynamic("combobox")(combobox.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption.asInstanceOf[js.Any])
    if (defaultLabel != null) __obj.updateDynamic("defaultLabel")(defaultLabel.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownMatchSelectWidth)) __obj.updateDynamic("dropdownMatchSelectWidth")(dropdownMatchSelectWidth.asInstanceOf[js.Any])
    if (dropdownMenuStyle != null) __obj.updateDynamic("dropdownMenuStyle")(dropdownMenuStyle.asInstanceOf[js.Any])
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(filterOption)) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    getInputElement.foreach(p => __obj.updateDynamic("getInputElement")(p.toJsFn))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* trigger */ org.scalajs.dom.raw.Node) => getPopupContainer(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(labelInValue)) __obj.updateDynamic("labelInValue")(labelInValue.asInstanceOf[js.Any])
    if (maxTagCount != null) __obj.updateDynamic("maxTagCount")(maxTagCount.asInstanceOf[js.Any])
    if (maxTagPlaceholder != null) __obj.updateDynamic("maxTagPlaceholder")(maxTagPlaceholder.asInstanceOf[js.Any])
    if (maxTagTextLength != null) __obj.updateDynamic("maxTagTextLength")(maxTagTextLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    onBlur.foreach(p => __obj.updateDynamic("onBlur")(p.toJsFn))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* label */ java.lang.String) => onChange(t0, t1).runNow()))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: japgolly.scalajs.react.raw.React.Component[typingsJapgolly.rcSelect.mod.RcSelect.OptionProps with js.Object, js.Object]) => onDeselect(t0, t1).runNow()))
    onFocus.foreach(p => __obj.updateDynamic("onFocus")(p.toJsFn))
    if (onInputKeyDown != null) __obj.updateDynamic("onInputKeyDown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onInputKeyDown(t0).runNow()))
    onPopupScroll.foreach(p => __obj.updateDynamic("onPopupScroll")(p.toJsFn))
    onSearch.foreach(p => __obj.updateDynamic("onSearch")(p.toJsFn))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: japgolly.scalajs.react.raw.React.Component[typingsJapgolly.rcSelect.mod.RcSelect.OptionProps with js.Object, js.Object]) => onSelect(t0, t1).runNow()))
    if (optionFilterProp != null) __obj.updateDynamic("optionFilterProp")(optionFilterProp.asInstanceOf[js.Any])
    if (optionLabelProp != null) __obj.updateDynamic("optionLabelProp")(optionLabelProp.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (tokenSeparators != null) __obj.updateDynamic("tokenSeparators")(tokenSeparators.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcSelect.mod.RcSelect.SelectProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rcSelect.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcSelect.mod.RcSelect.SelectProps])(children: _*)
  }
  @JSImport("rc-select", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

