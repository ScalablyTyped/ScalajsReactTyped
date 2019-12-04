package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.antd.libMentionsMod.MentionProps
import typingsJapgolly.antd.libMentionsMod.default
import typingsJapgolly.rcDashMentions.libMentionsMod.Placement
import typingsJapgolly.rcDashMentions.libOptionMod.OptionProps
import typingsJapgolly.rcDashMentions.rcDashMentionsNumbers.`false`
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Mentions {
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultValue: String = null,
    filterOption: `false` | (js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean]) = null,
    getPopupContainer: js.UndefOr[CallbackTo[HTMLElement]] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    notFoundContent: VdomNode = null,
    onBlur: ReactFocusEventFrom[HTMLTextAreaElement] => Callback = null,
    onChange: /* text */ String => Callback = null,
    onFocus: ReactFocusEventFrom[HTMLTextAreaElement] => Callback = null,
    onSearch: (/* text */ String, /* prefix */ String) => Callback = null,
    onSelect: (/* option */ OptionProps, /* prefix */ String) => Callback = null,
    placement: Placement = null,
    prefix: String | js.Array[String] = null,
    prefixCls: String = null,
    split: String = null,
    style: CSSProperties = null,
    transitionName: String = null,
    validateSearch: (/* text */ String, MentionProps) => CallbackTo[Boolean] = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MentionProps, default, Unit, MentionProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption.asInstanceOf[js.Any])
    getPopupContainer.foreach(p => __obj.updateDynamic("getPopupContainer")(p.toJsFn))
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.rawNode.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLTextAreaElement]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLTextAreaElement]) => onFocus(t0).runNow()))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction2((t0: /* text */ java.lang.String, t1: /* prefix */ java.lang.String) => onSearch(t0, t1).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* option */ typingsJapgolly.rcDashMentions.libOptionMod.OptionProps, t1: /* prefix */ java.lang.String) => onSelect(t0, t1).runNow()))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (validateSearch != null) __obj.updateDynamic("validateSearch")(js.Any.fromFunction2((t0: /* text */ java.lang.String, t1: typingsJapgolly.antd.libMentionsMod.MentionProps) => validateSearch(t0, t1).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libMentionsMod.MentionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libMentionsMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libMentionsMod.MentionProps])(children: _*)
  }
  @JSImport("antd/lib/mentions", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

