package typingsJapgolly.reactAutocomplete.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactAutocomplete.mod.Props
import typingsJapgolly.reactAutocomplete.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactAutocomplete {
  def apply(
    items: js.Array[_],
    value: js.Any,
    getItemValue: js.Any => CallbackTo[String],
    renderItem: (js.Any, Boolean, js.UndefOr[CSSProperties]) => CallbackTo[Node],
    autoHighlight: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    inputProps: HTMLProps[HTMLInputElement] = null,
    isItemSelectable: /* item */ js.Any => CallbackTo[Boolean] = null,
    menuStyle: CSSProperties = null,
    onChange: (/* e */ ReactEventFrom[HTMLInputElement], /* value */ String) => Callback = null,
    onMenuVisibilityChange: /* isOpen */ Boolean => Callback = null,
    onSelect: (/* value */ String, /* item */ js.Any) => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    renderInput: /* props */ HTMLProps[HTMLInputElement] => CallbackTo[Node] = null,
    renderMenu: (/* items */ js.Array[Node], /* value */ String, /* styles */ CSSProperties) => CallbackTo[Node] = null,
    selectOnBlur: js.UndefOr[Boolean] = js.undefined,
    shouldItemRender: (/* item */ js.Any, /* value */ String) => CallbackTo[Boolean] = null,
    sortItems: (/* a */ js.Any, /* b */ js.Any, /* value */ String) => CallbackTo[Double] = null,
    wrapperProps: HTMLProps[HTMLDivElement] = null,
    wrapperStyle: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, ^, Unit, Props] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
      __obj.updateDynamic("getItemValue")(js.Any.fromFunction1((t0: js.Any) => getItemValue(t0).runNow()))
    __obj.updateDynamic("renderItem")(js.Any.fromFunction3((t0: js.Any, t1: scala.Boolean, t2: js.UndefOr[typingsJapgolly.react.mod.CSSProperties]) => renderItem(t0, t1, t2).runNow()))
    if (!js.isUndefined(autoHighlight)) __obj.updateDynamic("autoHighlight")(autoHighlight.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (isItemSelectable != null) __obj.updateDynamic("isItemSelectable")(js.Any.fromFunction1((t0: /* item */ js.Any) => isItemSelectable(t0).runNow()))
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement], t1: /* value */ java.lang.String) => onChange(t0, t1).runNow()))
    if (onMenuVisibilityChange != null) __obj.updateDynamic("onMenuVisibilityChange")(js.Any.fromFunction1((t0: /* isOpen */ scala.Boolean) => onMenuVisibilityChange(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* item */ js.Any) => onSelect(t0, t1).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (renderInput != null) __obj.updateDynamic("renderInput")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLInputElement]) => renderInput(t0).runNow()))
    if (renderMenu != null) __obj.updateDynamic("renderMenu")(js.Any.fromFunction3((t0: /* items */ js.Array[japgolly.scalajs.react.raw.React.Node], t1: /* value */ java.lang.String, t2: /* styles */ typingsJapgolly.react.mod.CSSProperties) => renderMenu(t0, t1, t2).runNow()))
    if (!js.isUndefined(selectOnBlur)) __obj.updateDynamic("selectOnBlur")(selectOnBlur.asInstanceOf[js.Any])
    if (shouldItemRender != null) __obj.updateDynamic("shouldItemRender")(js.Any.fromFunction2((t0: /* item */ js.Any, t1: /* value */ java.lang.String) => shouldItemRender(t0, t1).runNow()))
    if (sortItems != null) __obj.updateDynamic("sortItems")(js.Any.fromFunction3((t0: /* a */ js.Any, t1: /* b */ js.Any, t2: /* value */ java.lang.String) => sortItems(t0, t1, t2).runNow()))
    if (wrapperProps != null) __obj.updateDynamic("wrapperProps")(wrapperProps.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAutocomplete.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactAutocomplete.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAutocomplete.mod.Props])(children: _*)
  }
  @JSImport("react-autocomplete", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

