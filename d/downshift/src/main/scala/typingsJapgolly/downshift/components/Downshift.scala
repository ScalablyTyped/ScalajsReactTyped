package typingsJapgolly.downshift.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.downshift.mod.A11yStatusMessageOptions
import typingsJapgolly.downshift.mod.ControllerStateAndHelpers
import typingsJapgolly.downshift.mod.DownshiftProps
import typingsJapgolly.downshift.mod.DownshiftState
import typingsJapgolly.downshift.mod.Environment
import typingsJapgolly.downshift.mod.StateChangeOptions
import typingsJapgolly.downshift.mod.default
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Downshift {
  def apply(
    defaultHighlightedIndex: Int | Double = null,
    defaultIsOpen: js.UndefOr[Boolean] = js.undefined,
    environment: Environment = null,
    getA11yStatusMessage: /* options */ A11yStatusMessageOptions[js.Any] => CallbackTo[String] = null,
    getItemId: /* index */ js.UndefOr[Double] => CallbackTo[String] = null,
    highlightedIndex: Int | Double = null,
    id: String = null,
    initialHighlightedIndex: Int | Double = null,
    initialInputValue: String = null,
    initialIsOpen: js.UndefOr[Boolean] = js.undefined,
    initialSelectedItem: js.Any = null,
    inputId: String = null,
    inputValue: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    itemCount: Int | Double = null,
    itemToString: /* item */ js.Any | Null => CallbackTo[String] = null,
    labelId: String = null,
    menuId: String = null,
    onChange: (/* selectedItem */ js.Any | Null, /* stateAndHelpers */ ControllerStateAndHelpers[js.Any]) => Callback = null,
    onInputValueChange: (/* inputValue */ String, /* stateAndHelpers */ ControllerStateAndHelpers[js.Any]) => Callback = null,
    onOuterClick: /* stateAndHelpers */ ControllerStateAndHelpers[js.Any] => Callback = null,
    onSelect: (/* selectedItem */ js.Any | Null, /* stateAndHelpers */ ControllerStateAndHelpers[js.Any]) => Callback = null,
    onStateChange: (/* options */ StateChangeOptions[js.Any], /* stateAndHelpers */ ControllerStateAndHelpers[js.Any]) => Callback = null,
    onUserAction: (/* options */ StateChangeOptions[js.Any], /* stateAndHelpers */ ControllerStateAndHelpers[js.Any]) => Callback = null,
    scrollIntoView: (/* node */ HTMLElement, /* menuNode */ HTMLElement) => Callback = null,
    selectedItem: js.Any = null,
    selectedItemChanged: (js.Any, js.Any) => CallbackTo[Boolean] = null,
    stateReducer: (/* state */ DownshiftState[js.Any], /* changes */ StateChangeOptions[js.Any]) => CallbackTo[Partial[StateChangeOptions[js.Any]]] = null,
    suppressRefError: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* options */ ControllerStateAndHelpers[js.Any] => CallbackTo[Node] = null
  ): UnmountedWithRoot[DownshiftProps[js.Any], default, Unit, DownshiftProps[js.Any]] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.downshift.mod.ControllerStateAndHelpers[js.Any]) => children(t0).runNow()))
    if (defaultHighlightedIndex != null) __obj.updateDynamic("defaultHighlightedIndex")(defaultHighlightedIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultIsOpen)) __obj.updateDynamic("defaultIsOpen")(defaultIsOpen.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (getA11yStatusMessage != null) __obj.updateDynamic("getA11yStatusMessage")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.downshift.mod.A11yStatusMessageOptions[js.Any]) => getA11yStatusMessage(t0).runNow()))
    if (getItemId != null) __obj.updateDynamic("getItemId")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => getItemId(t0).runNow()))
    if (highlightedIndex != null) __obj.updateDynamic("highlightedIndex")(highlightedIndex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initialHighlightedIndex != null) __obj.updateDynamic("initialHighlightedIndex")(initialHighlightedIndex.asInstanceOf[js.Any])
    if (initialInputValue != null) __obj.updateDynamic("initialInputValue")(initialInputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(initialIsOpen)) __obj.updateDynamic("initialIsOpen")(initialIsOpen.asInstanceOf[js.Any])
    if (initialSelectedItem != null) __obj.updateDynamic("initialSelectedItem")(initialSelectedItem.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    if (itemToString != null) __obj.updateDynamic("itemToString")(js.Any.fromFunction1((t0: /* item */ js.Any | scala.Null) => itemToString(t0).runNow()))
    if (labelId != null) __obj.updateDynamic("labelId")(labelId.asInstanceOf[js.Any])
    if (menuId != null) __obj.updateDynamic("menuId")(menuId.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* selectedItem */ js.Any | scala.Null, t1: /* stateAndHelpers */ typingsJapgolly.downshift.mod.ControllerStateAndHelpers[js.Any]) => onChange(t0, t1).runNow()))
    if (onInputValueChange != null) __obj.updateDynamic("onInputValueChange")(js.Any.fromFunction2((t0: /* inputValue */ java.lang.String, t1: /* stateAndHelpers */ typingsJapgolly.downshift.mod.ControllerStateAndHelpers[js.Any]) => onInputValueChange(t0, t1).runNow()))
    if (onOuterClick != null) __obj.updateDynamic("onOuterClick")(js.Any.fromFunction1((t0: /* stateAndHelpers */ typingsJapgolly.downshift.mod.ControllerStateAndHelpers[js.Any]) => onOuterClick(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* selectedItem */ js.Any | scala.Null, t1: /* stateAndHelpers */ typingsJapgolly.downshift.mod.ControllerStateAndHelpers[js.Any]) => onSelect(t0, t1).runNow()))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction2((t0: /* options */ typingsJapgolly.downshift.mod.StateChangeOptions[js.Any], t1: /* stateAndHelpers */ typingsJapgolly.downshift.mod.ControllerStateAndHelpers[js.Any]) => onStateChange(t0, t1).runNow()))
    if (onUserAction != null) __obj.updateDynamic("onUserAction")(js.Any.fromFunction2((t0: /* options */ typingsJapgolly.downshift.mod.StateChangeOptions[js.Any], t1: /* stateAndHelpers */ typingsJapgolly.downshift.mod.ControllerStateAndHelpers[js.Any]) => onUserAction(t0, t1).runNow()))
    if (scrollIntoView != null) __obj.updateDynamic("scrollIntoView")(js.Any.fromFunction2((t0: /* node */ org.scalajs.dom.raw.HTMLElement, t1: /* menuNode */ org.scalajs.dom.raw.HTMLElement) => scrollIntoView(t0, t1).runNow()))
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemChanged != null) __obj.updateDynamic("selectedItemChanged")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => selectedItemChanged(t0, t1).runNow()))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction2((t0: /* state */ typingsJapgolly.downshift.mod.DownshiftState[js.Any], t1: /* changes */ typingsJapgolly.downshift.mod.StateChangeOptions[js.Any]) => stateReducer(t0, t1).runNow()))
    if (!js.isUndefined(suppressRefError)) __obj.updateDynamic("suppressRefError")(suppressRefError.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.downshift.mod.DownshiftProps[js.Any], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.downshift.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.downshift.mod.DownshiftProps[js.Any]])
  }
  @JSImport("downshift", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

