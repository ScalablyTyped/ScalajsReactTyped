package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.esMentionMod.MentionPlacement
import typingsJapgolly.antd.esMentionMod.MentionProps
import typingsJapgolly.antd.esMentionMod.SuggestionItme
import typingsJapgolly.antd.esMentionMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Mention {
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
    value: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MentionProps, default, Unit, MentionProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.esMentionMod.MentionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.esMentionMod.default](js.constructorOf[typingsJapgolly.antd.esMentionMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.antd.esMentionMod.MentionProps])(children: _*)
  }
}

