package typingsJapgolly.rcSelect.mod.RcSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps extends js.Object {
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var animation: js.UndefOr[String] = js.undefined
  var choiceTransitionName: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var combobox: js.UndefOr[Boolean] = js.undefined
  var defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined
  var defaultLabel: js.UndefOr[String | js.Array[String]] = js.undefined
  var defaultValue: js.UndefOr[String | js.Array[String]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dropdownClassName: js.UndefOr[String] = js.undefined
  var dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined
  var dropdownMenuStyle: js.UndefOr[StringDictionary[String]] = js.undefined
  var dropdownStyle: js.UndefOr[StringDictionary[String]] = js.undefined
  var filterOption: js.UndefOr[Boolean] = js.undefined
  var getInputElement: js.UndefOr[js.Function0[Node]] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* trigger */ Node, Node]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var labelInValue: js.UndefOr[Boolean] = js.undefined
  var maxTagCount: js.UndefOr[Double] = js.undefined
  var maxTagPlaceholder: js.UndefOr[japgolly.scalajs.react.raw.React.Node | js.Function] = js.undefined
  var maxTagTextLength: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var notFoundContent: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* value */ String, /* label */ String, Unit]] = js.undefined
  var onDeselect: js.UndefOr[
    js.Function2[/* value */ String, Component[OptionProps with js.Object, js.Object], Unit]
  ] = js.undefined
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onInputKeyDown: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.undefined
  var onPopupScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSearch: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSelect: js.UndefOr[
    js.Function2[/* value */ String, Component[OptionProps with js.Object, js.Object], Unit]
  ] = js.undefined
  var optionFilterProp: js.UndefOr[String] = js.undefined
  var optionLabelProp: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var showAction: js.UndefOr[js.Array[String]] = js.undefined
  var showArrow: js.UndefOr[Boolean] = js.undefined
  var showSearch: js.UndefOr[Boolean] = js.undefined
  var tags: js.UndefOr[Boolean] = js.undefined
  var tokenSeparators: js.UndefOr[js.Array[String]] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | js.Array[String]] = js.undefined
}

object SelectProps {
  @scala.inline
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
    value: String | js.Array[String] = null
  ): SelectProps = {
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
    __obj.asInstanceOf[SelectProps]
  }
}

