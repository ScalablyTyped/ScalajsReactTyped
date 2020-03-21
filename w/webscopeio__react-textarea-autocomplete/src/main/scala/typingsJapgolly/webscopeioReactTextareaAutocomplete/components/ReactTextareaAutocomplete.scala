package typingsJapgolly.webscopeioReactTextareaAutocomplete.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.SFC
import typingsJapgolly.webscopeioReactTextareaAutocomplete.mod.TextareaProps
import typingsJapgolly.webscopeioReactTextareaAutocomplete.mod.TriggerType
import typingsJapgolly.webscopeioReactTextareaAutocomplete.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTextareaAutocomplete {
  def apply[TItem /* <: String | js.Object */](
    loadingComponent: SFC[js.Object],
    trigger: TriggerType[TItem],
    className: String = null,
    closeOnClickOutside: js.UndefOr[Boolean] = js.undefined,
    containerClassName: String = null,
    containerStyle: CSSProperties = null,
    dropdownClassName: String = null,
    dropdownStyle: CSSProperties = null,
    innerRef: /* ref */ HTMLTextAreaElement => Callback = null,
    itemClassName: String = null,
    itemStyle: CSSProperties = null,
    listClassName: String = null,
    listStyle: CSSProperties = null,
    loaderClassName: String = null,
    loaderStyle: CSSProperties = null,
    minChar: Int | Double = null,
    movePopupAsYouType: js.UndefOr[Boolean] = js.undefined,
    onBlur: ReactFocusEventFrom[HTMLTextAreaElement] => Callback = null,
    onCaretPositionChange: /* pos */ Double => Callback = null,
    onChange: ReactEventFrom[HTMLTextAreaElement] => Callback = null,
    onSelect: ReactEventFrom[HTMLTextAreaElement] => Callback = null,
    scrollToItem: Boolean | (js.Function2[/* container */ HTMLDivElement, /* item */ HTMLDivElement, Unit]) = null,
    style: CSSProperties = null,
    value: String | js.Array[String] | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TextareaProps[TItem], default[TItem], Unit, TextareaProps[TItem]] = {
    val __obj = js.Dynamic.literal(loadingComponent = loadingComponent.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClickOutside)) __obj.updateDynamic("closeOnClickOutside")(closeOnClickOutside.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLTextAreaElement) => innerRef(t0).runNow()))
    if (itemClassName != null) __obj.updateDynamic("itemClassName")(itemClassName.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (listClassName != null) __obj.updateDynamic("listClassName")(listClassName.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (loaderClassName != null) __obj.updateDynamic("loaderClassName")(loaderClassName.asInstanceOf[js.Any])
    if (loaderStyle != null) __obj.updateDynamic("loaderStyle")(loaderStyle.asInstanceOf[js.Any])
    if (minChar != null) __obj.updateDynamic("minChar")(minChar.asInstanceOf[js.Any])
    if (!js.isUndefined(movePopupAsYouType)) __obj.updateDynamic("movePopupAsYouType")(movePopupAsYouType.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLTextAreaElement]) => onBlur(t0).runNow()))
    if (onCaretPositionChange != null) __obj.updateDynamic("onCaretPositionChange")(js.Any.fromFunction1((t0: /* pos */ scala.Double) => onCaretPositionChange(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLTextAreaElement]) => onChange(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLTextAreaElement]) => onSelect(t0).runNow()))
    if (scrollToItem != null) __obj.updateDynamic("scrollToItem")(scrollToItem.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.webscopeioReactTextareaAutocomplete.mod.TextareaProps[TItem], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.webscopeioReactTextareaAutocomplete.mod.default[TItem]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.webscopeioReactTextareaAutocomplete.mod.TextareaProps[TItem]])(children: _*)
  }
  @JSImport("@webscopeio/react-textarea-autocomplete", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

