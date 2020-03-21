package typingsJapgolly.downshift.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSelectProps[Item] extends js.Object {
  var circularNavigation: js.UndefOr[Boolean] = js.undefined
  var defaultHighlightedIndex: js.UndefOr[Double] = js.undefined
  var defaultIsOpen: js.UndefOr[Boolean] = js.undefined
  var defaultSelectedItem: js.UndefOr[Item] = js.undefined
  var environment: js.UndefOr[Environment] = js.undefined
  var getA11ySelectionMessage: js.UndefOr[js.Function1[/* options */ UseSelectA11yMessageOptions[Item], String]] = js.undefined
  var getA11yStatusMessage: js.UndefOr[js.Function1[/* options */ UseSelectA11yMessageOptions[Item], String]] = js.undefined
  var getItemId: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
  var highlightedIndex: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var initialHighlightedIndex: js.UndefOr[Double] = js.undefined
  var initialIsOpen: js.UndefOr[Boolean] = js.undefined
  var initialSelectedItem: js.UndefOr[Item] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var itemToString: js.UndefOr[js.Function1[/* item */ Item, String]] = js.undefined
  var items: js.Array[Item]
  var labelId: js.UndefOr[String] = js.undefined
  var menuId: js.UndefOr[String] = js.undefined
  var onHighlightedIndexChange: js.UndefOr[js.Function1[/* changes */ Partial[UseSelectState[Item]], Unit]] = js.undefined
  var onIsOpenChange: js.UndefOr[js.Function1[/* changes */ Partial[UseSelectState[Item]], Unit]] = js.undefined
  var onSelectedItemChange: js.UndefOr[js.Function1[/* changes */ Partial[UseSelectState[Item]], Unit]] = js.undefined
  var onStateChange: js.UndefOr[js.Function1[/* changes */ Partial[UseSelectState[Item]], Unit]] = js.undefined
  var selectedItem: js.UndefOr[Item] = js.undefined
  var stateReducer: js.UndefOr[
    js.Function2[
      /* state */ UseSelectState[Item], 
      /* actionAndChanges */ UseSelectStateChangeOptions[Item], 
      UseSelectState[Item]
    ]
  ] = js.undefined
  var toggleButtonId: js.UndefOr[String] = js.undefined
}

object UseSelectProps {
  @scala.inline
  def apply[Item](
    items: js.Array[Item],
    circularNavigation: js.UndefOr[Boolean] = js.undefined,
    defaultHighlightedIndex: Int | Double = null,
    defaultIsOpen: js.UndefOr[Boolean] = js.undefined,
    defaultSelectedItem: Item = null,
    environment: Environment = null,
    getA11ySelectionMessage: /* options */ UseSelectA11yMessageOptions[Item] => CallbackTo[String] = null,
    getA11yStatusMessage: /* options */ UseSelectA11yMessageOptions[Item] => CallbackTo[String] = null,
    getItemId: /* index */ Double => CallbackTo[String] = null,
    highlightedIndex: Int | Double = null,
    id: String = null,
    initialHighlightedIndex: Int | Double = null,
    initialIsOpen: js.UndefOr[Boolean] = js.undefined,
    initialSelectedItem: Item = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    itemToString: /* item */ Item => CallbackTo[String] = null,
    labelId: String = null,
    menuId: String = null,
    onHighlightedIndexChange: /* changes */ Partial[UseSelectState[Item]] => japgolly.scalajs.react.Callback = null,
    onIsOpenChange: /* changes */ Partial[UseSelectState[Item]] => japgolly.scalajs.react.Callback = null,
    onSelectedItemChange: /* changes */ Partial[UseSelectState[Item]] => japgolly.scalajs.react.Callback = null,
    onStateChange: /* changes */ Partial[UseSelectState[Item]] => japgolly.scalajs.react.Callback = null,
    selectedItem: Item = null,
    stateReducer: (/* state */ UseSelectState[Item], /* actionAndChanges */ UseSelectStateChangeOptions[Item]) => CallbackTo[UseSelectState[Item]] = null,
    toggleButtonId: String = null
  ): UseSelectProps[Item] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (!js.isUndefined(circularNavigation)) __obj.updateDynamic("circularNavigation")(circularNavigation.asInstanceOf[js.Any])
    if (defaultHighlightedIndex != null) __obj.updateDynamic("defaultHighlightedIndex")(defaultHighlightedIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultIsOpen)) __obj.updateDynamic("defaultIsOpen")(defaultIsOpen.asInstanceOf[js.Any])
    if (defaultSelectedItem != null) __obj.updateDynamic("defaultSelectedItem")(defaultSelectedItem.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (getA11ySelectionMessage != null) __obj.updateDynamic("getA11ySelectionMessage")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.downshift.mod.UseSelectA11yMessageOptions[Item]) => getA11ySelectionMessage(t0).runNow()))
    if (getA11yStatusMessage != null) __obj.updateDynamic("getA11yStatusMessage")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.downshift.mod.UseSelectA11yMessageOptions[Item]) => getA11yStatusMessage(t0).runNow()))
    if (getItemId != null) __obj.updateDynamic("getItemId")(js.Any.fromFunction1((t0: /* index */ scala.Double) => getItemId(t0).runNow()))
    if (highlightedIndex != null) __obj.updateDynamic("highlightedIndex")(highlightedIndex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initialHighlightedIndex != null) __obj.updateDynamic("initialHighlightedIndex")(initialHighlightedIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(initialIsOpen)) __obj.updateDynamic("initialIsOpen")(initialIsOpen.asInstanceOf[js.Any])
    if (initialSelectedItem != null) __obj.updateDynamic("initialSelectedItem")(initialSelectedItem.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (itemToString != null) __obj.updateDynamic("itemToString")(js.Any.fromFunction1((t0: /* item */ Item) => itemToString(t0).runNow()))
    if (labelId != null) __obj.updateDynamic("labelId")(labelId.asInstanceOf[js.Any])
    if (menuId != null) __obj.updateDynamic("menuId")(menuId.asInstanceOf[js.Any])
    if (onHighlightedIndexChange != null) __obj.updateDynamic("onHighlightedIndexChange")(js.Any.fromFunction1((t0: /* changes */ typingsJapgolly.std.Partial[typingsJapgolly.downshift.mod.UseSelectState[Item]]) => onHighlightedIndexChange(t0).runNow()))
    if (onIsOpenChange != null) __obj.updateDynamic("onIsOpenChange")(js.Any.fromFunction1((t0: /* changes */ typingsJapgolly.std.Partial[typingsJapgolly.downshift.mod.UseSelectState[Item]]) => onIsOpenChange(t0).runNow()))
    if (onSelectedItemChange != null) __obj.updateDynamic("onSelectedItemChange")(js.Any.fromFunction1((t0: /* changes */ typingsJapgolly.std.Partial[typingsJapgolly.downshift.mod.UseSelectState[Item]]) => onSelectedItemChange(t0).runNow()))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1((t0: /* changes */ typingsJapgolly.std.Partial[typingsJapgolly.downshift.mod.UseSelectState[Item]]) => onStateChange(t0).runNow()))
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction2((t0: /* state */ typingsJapgolly.downshift.mod.UseSelectState[Item], t1: /* actionAndChanges */ typingsJapgolly.downshift.mod.UseSelectStateChangeOptions[Item]) => stateReducer(t0, t1).runNow()))
    if (toggleButtonId != null) __obj.updateDynamic("toggleButtonId")(toggleButtonId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectProps[Item]]
  }
}

