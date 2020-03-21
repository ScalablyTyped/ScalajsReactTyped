package typingsJapgolly.downshift.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownshiftProps[Item] extends js.Object {
  var children: js.UndefOr[ChildrenFunction[Item]] = js.undefined
  var defaultHighlightedIndex: js.UndefOr[Double | Null] = js.undefined
  var defaultIsOpen: js.UndefOr[Boolean] = js.undefined
  var environment: js.UndefOr[Environment] = js.undefined
  var getA11yStatusMessage: js.UndefOr[js.Function1[/* options */ A11yStatusMessageOptions[Item], String]] = js.undefined
  var getItemId: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], String]] = js.undefined
  var highlightedIndex: js.UndefOr[Double | Null] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var initialHighlightedIndex: js.UndefOr[Double | Null] = js.undefined
  var initialInputValue: js.UndefOr[String] = js.undefined
  var initialIsOpen: js.UndefOr[Boolean] = js.undefined
  var initialSelectedItem: js.UndefOr[Item] = js.undefined
  var inputId: js.UndefOr[String] = js.undefined
  var inputValue: js.UndefOr[String | Null] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var itemCount: js.UndefOr[Double] = js.undefined
  var itemToString: js.UndefOr[js.Function1[/* item */ Item | Null, String]] = js.undefined
  var labelId: js.UndefOr[String] = js.undefined
  var menuId: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* selectedItem */ Item | Null, 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      Unit
    ]
  ] = js.undefined
  var onInputValueChange: js.UndefOr[
    js.Function2[/* inputValue */ String, /* stateAndHelpers */ ControllerStateAndHelpers[Item], Unit]
  ] = js.undefined
  var onOuterClick: js.UndefOr[js.Function1[/* stateAndHelpers */ ControllerStateAndHelpers[Item], Unit]] = js.undefined
  var onSelect: js.UndefOr[
    js.Function2[
      /* selectedItem */ Item | Null, 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      Unit
    ]
  ] = js.undefined
  var onStateChange: js.UndefOr[
    js.Function2[
      /* options */ StateChangeOptions[Item], 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      Unit
    ]
  ] = js.undefined
  var onUserAction: js.UndefOr[
    js.Function2[
      /* options */ StateChangeOptions[Item], 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      Unit
    ]
  ] = js.undefined
  var scrollIntoView: js.UndefOr[js.Function2[/* node */ HTMLElement, /* menuNode */ HTMLElement, Unit]] = js.undefined
  var selectedItem: js.UndefOr[Item | Null] = js.undefined
  var selectedItemChanged: js.UndefOr[js.Function2[/* prevItem */ Item, /* item */ Item, Boolean]] = js.undefined
  var stateReducer: js.UndefOr[
    js.Function2[
      /* state */ DownshiftState[Item], 
      /* changes */ StateChangeOptions[Item], 
      Partial[StateChangeOptions[Item]]
    ]
  ] = js.undefined
  var suppressRefError: js.UndefOr[Boolean] = js.undefined
}

object DownshiftProps {
  @scala.inline
  def apply[Item](
    children: /* options */ ControllerStateAndHelpers[Item] => CallbackTo[Node] = null,
    defaultHighlightedIndex: Int | Double = null,
    defaultIsOpen: js.UndefOr[Boolean] = js.undefined,
    environment: Environment = null,
    getA11yStatusMessage: /* options */ A11yStatusMessageOptions[Item] => CallbackTo[String] = null,
    getItemId: /* index */ js.UndefOr[Double] => CallbackTo[String] = null,
    highlightedIndex: Int | Double = null,
    id: String = null,
    initialHighlightedIndex: Int | Double = null,
    initialInputValue: String = null,
    initialIsOpen: js.UndefOr[Boolean] = js.undefined,
    initialSelectedItem: Item = null,
    inputId: String = null,
    inputValue: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    itemCount: Int | Double = null,
    itemToString: /* item */ Item | Null => CallbackTo[String] = null,
    labelId: String = null,
    menuId: String = null,
    onChange: (/* selectedItem */ Item | Null, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => japgolly.scalajs.react.Callback = null,
    onInputValueChange: (/* inputValue */ String, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => japgolly.scalajs.react.Callback = null,
    onOuterClick: /* stateAndHelpers */ ControllerStateAndHelpers[Item] => japgolly.scalajs.react.Callback = null,
    onSelect: (/* selectedItem */ Item | Null, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => japgolly.scalajs.react.Callback = null,
    onStateChange: (/* options */ StateChangeOptions[Item], /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => japgolly.scalajs.react.Callback = null,
    onUserAction: (/* options */ StateChangeOptions[Item], /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => japgolly.scalajs.react.Callback = null,
    scrollIntoView: (/* node */ HTMLElement, /* menuNode */ HTMLElement) => japgolly.scalajs.react.Callback = null,
    selectedItem: Item = null,
    selectedItemChanged: (/* prevItem */ Item, /* item */ Item) => CallbackTo[Boolean] = null,
    stateReducer: (/* state */ DownshiftState[Item], /* changes */ StateChangeOptions[Item]) => CallbackTo[Partial[StateChangeOptions[Item]]] = null,
    suppressRefError: js.UndefOr[Boolean] = js.undefined
  ): DownshiftProps[Item] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.downshift.mod.ControllerStateAndHelpers[Item]) => children(t0).runNow()))
    if (defaultHighlightedIndex != null) __obj.updateDynamic("defaultHighlightedIndex")(defaultHighlightedIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultIsOpen)) __obj.updateDynamic("defaultIsOpen")(defaultIsOpen.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (getA11yStatusMessage != null) __obj.updateDynamic("getA11yStatusMessage")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.downshift.mod.A11yStatusMessageOptions[Item]) => getA11yStatusMessage(t0).runNow()))
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
    if (itemToString != null) __obj.updateDynamic("itemToString")(js.Any.fromFunction1((t0: /* item */ Item | scala.Null) => itemToString(t0).runNow()))
    if (labelId != null) __obj.updateDynamic("labelId")(labelId.asInstanceOf[js.Any])
    if (menuId != null) __obj.updateDynamic("menuId")(menuId.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* selectedItem */ Item | scala.Null, t1: /* stateAndHelpers */ typingsJapgolly.downshift.mod.ControllerStateAndHelpers[Item]) => onChange(t0, t1).runNow()))
    if (onInputValueChange != null) __obj.updateDynamic("onInputValueChange")(js.Any.fromFunction2((t0: /* inputValue */ java.lang.String, t1: /* stateAndHelpers */ typingsJapgolly.downshift.mod.ControllerStateAndHelpers[Item]) => onInputValueChange(t0, t1).runNow()))
    if (onOuterClick != null) __obj.updateDynamic("onOuterClick")(js.Any.fromFunction1((t0: /* stateAndHelpers */ typingsJapgolly.downshift.mod.ControllerStateAndHelpers[Item]) => onOuterClick(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* selectedItem */ Item | scala.Null, t1: /* stateAndHelpers */ typingsJapgolly.downshift.mod.ControllerStateAndHelpers[Item]) => onSelect(t0, t1).runNow()))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction2((t0: /* options */ typingsJapgolly.downshift.mod.StateChangeOptions[Item], t1: /* stateAndHelpers */ typingsJapgolly.downshift.mod.ControllerStateAndHelpers[Item]) => onStateChange(t0, t1).runNow()))
    if (onUserAction != null) __obj.updateDynamic("onUserAction")(js.Any.fromFunction2((t0: /* options */ typingsJapgolly.downshift.mod.StateChangeOptions[Item], t1: /* stateAndHelpers */ typingsJapgolly.downshift.mod.ControllerStateAndHelpers[Item]) => onUserAction(t0, t1).runNow()))
    if (scrollIntoView != null) __obj.updateDynamic("scrollIntoView")(js.Any.fromFunction2((t0: /* node */ org.scalajs.dom.raw.HTMLElement, t1: /* menuNode */ org.scalajs.dom.raw.HTMLElement) => scrollIntoView(t0, t1).runNow()))
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemChanged != null) __obj.updateDynamic("selectedItemChanged")(js.Any.fromFunction2((t0: /* prevItem */ Item, t1: /* item */ Item) => selectedItemChanged(t0, t1).runNow()))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction2((t0: /* state */ typingsJapgolly.downshift.mod.DownshiftState[Item], t1: /* changes */ typingsJapgolly.downshift.mod.StateChangeOptions[Item]) => stateReducer(t0, t1).runNow()))
    if (!js.isUndefined(suppressRefError)) __obj.updateDynamic("suppressRefError")(suppressRefError.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownshiftProps[Item]]
  }
}

