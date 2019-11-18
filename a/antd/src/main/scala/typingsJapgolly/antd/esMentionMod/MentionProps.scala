package typingsJapgolly.antd.esMentionMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.FocusEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var defaultSuggestions: js.UndefOr[js.Array[SuggestionItme]] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var getSuggestionContainer: js.UndefOr[js.Function1[/* triggerNode */ Element, HTMLElement]] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var multiLines: js.UndefOr[Boolean] = js.undefined
  var notFoundContent: js.UndefOr[js.Any] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* contentState */ js.Any, Unit]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
  var onSearchChange: js.UndefOr[js.Function2[/* value */ String, /* trigger */ String, _]] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* suggestion */ String, /* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var placement: js.UndefOr[MentionPlacement] = js.undefined
  var prefix: js.UndefOr[String | js.Array[String]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suggestionStyle: js.UndefOr[CSSProperties] = js.undefined
  var suggestions: js.UndefOr[js.Array[japgolly.scalajs.react.raw.React.Element]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object MentionProps {
  @scala.inline
  def apply(
    className: String = null,
    defaultSuggestions: js.Array[SuggestionItme] = null,
    defaultValue: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    getSuggestionContainer: /* triggerNode */ Element => CallbackTo[HTMLElement] = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    multiLines: js.UndefOr[Boolean] = js.undefined,
    notFoundContent: js.Any = null,
    onBlur: ReactFocusEventFrom[HTMLElement] => Callback = null,
    onChange: /* contentState */ js.Any => Callback = null,
    onFocus: ReactFocusEventFrom[HTMLElement] => Callback = null,
    onSearchChange: (/* value */ String, /* trigger */ String) => CallbackTo[_] = null,
    onSelect: (/* suggestion */ String, /* data */ js.UndefOr[js.Any]) => Callback = null,
    placeholder: String = null,
    placement: MentionPlacement = null,
    prefix: String | js.Array[String] = null,
    prefixCls: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suggestionStyle: CSSProperties = null,
    suggestions: js.Array[japgolly.scalajs.react.raw.React.Element] = null,
    value: js.Any = null
  ): MentionProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultSuggestions != null) __obj.updateDynamic("defaultSuggestions")(defaultSuggestions.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (getSuggestionContainer != null) __obj.updateDynamic("getSuggestionContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.Element) => getSuggestionContainer(t0).runNow()))
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(multiLines)) __obj.updateDynamic("multiLines")(multiLines.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* contentState */ js.Any) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]) => onFocus(t0).runNow()))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* trigger */ java.lang.String) => onSearchChange(t0, t1).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* suggestion */ java.lang.String, t1: /* data */ js.UndefOr[js.Any]) => onSelect(t0, t1).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suggestionStyle != null) __obj.updateDynamic("suggestionStyle")(suggestionStyle.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionProps]
  }
}

