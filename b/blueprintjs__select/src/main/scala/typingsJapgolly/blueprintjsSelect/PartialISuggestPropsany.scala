package typingsJapgolly.blueprintjsSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsJapgolly.blueprintjsCore.propsMod.HTMLInputProps
import typingsJapgolly.blueprintjsSelect.itemListRendererMod.IItemListRendererProps
import typingsJapgolly.blueprintjsSelect.itemListRendererMod.ItemListRenderer
import typingsJapgolly.blueprintjsSelect.itemRendererMod.IItemRendererProps
import typingsJapgolly.blueprintjsSelect.itemRendererMod.ItemRenderer
import typingsJapgolly.blueprintjsSelect.listItemsPropsMod.ItemsEqualProp
import typingsJapgolly.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typingsJapgolly.blueprintjsSelect.predicateMod.ItemListPredicate
import typingsJapgolly.blueprintjsSelect.predicateMod.ItemPredicate
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/select.@blueprintjs/select/lib/esm/components/select/suggest.ISuggestProps<any>> */
trait PartialISuggestPropsany extends js.Object {
  var activeItem: js.UndefOr[js.Any | ICreateNewItem] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closeOnSelect: js.UndefOr[Boolean] = js.undefined
  var createNewItemFromQuery: js.UndefOr[js.Function1[/* query */ String, _]] = js.undefined
  var createNewItemRenderer: js.UndefOr[
    js.Function3[
      /* query */ String, 
      /* active */ Boolean, 
      /* handleClick */ MouseEventHandler[HTMLElement], 
      js.UndefOr[Element]
    ]
  ] = js.undefined
  var defaultSelectedItem: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var initialContent: js.UndefOr[Node] = js.undefined
  var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.undefined
  var inputValueRenderer: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.undefined
  var itemDisabled: js.UndefOr[String | (js.Function2[/* item */ js.Any, /* index */ Double, Boolean])] = js.undefined
  var itemListPredicate: js.UndefOr[ItemListPredicate[_]] = js.undefined
  var itemListRenderer: js.UndefOr[ItemListRenderer[_]] = js.undefined
  var itemPredicate: js.UndefOr[ItemPredicate[_]] = js.undefined
  var itemRenderer: js.UndefOr[ItemRenderer[_]] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var itemsEqual: js.UndefOr[ItemsEqualProp[_]] = js.undefined
  var noResults: js.UndefOr[Node] = js.undefined
  var onActiveItemChange: js.UndefOr[
    js.Function2[/* activeItem */ js.Any | Null, /* isCreateNewItem */ Boolean, Unit]
  ] = js.undefined
  var onItemSelect: js.UndefOr[
    js.Function2[/* item */ js.Any, /* event */ js.UndefOr[ReactEventFrom[HTMLElement]], Unit]
  ] = js.undefined
  var onItemsPaste: js.UndefOr[js.Function1[/* items */ js.Array[_], Unit]] = js.undefined
  var onQueryChange: js.UndefOr[
    js.Function2[/* query */ String, /* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]], Unit]
  ] = js.undefined
  var openOnKeyDown: js.UndefOr[Boolean] = js.undefined
  var popoverProps: js.UndefOr[PartialIPopoverProps with js.Object] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var resetOnClose: js.UndefOr[Boolean] = js.undefined
  var resetOnQuery: js.UndefOr[Boolean] = js.undefined
  var resetOnSelect: js.UndefOr[Boolean] = js.undefined
  var scrollToActiveItem: js.UndefOr[Boolean] = js.undefined
  var selectedItem: js.UndefOr[js.Any] = js.undefined
}

object PartialISuggestPropsany {
  @scala.inline
  def apply(
    activeItem: js.Any | ICreateNewItem = null,
    className: String = null,
    closeOnSelect: js.UndefOr[Boolean] = js.undefined,
    createNewItemFromQuery: /* query */ String => CallbackTo[js.Any] = null,
    createNewItemRenderer: (/* query */ String, /* active */ Boolean, /* handleClick */ MouseEventHandler[HTMLElement]) => CallbackTo[js.UndefOr[Element]] = null,
    defaultSelectedItem: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    initialContent: VdomNode = null,
    inputProps: IInputGroupProps with HTMLInputProps = null,
    inputValueRenderer: /* item */ js.Any => CallbackTo[String] = null,
    itemDisabled: String | (js.Function2[/* item */ js.Any, /* index */ Double, Boolean]) = null,
    itemListPredicate: (/* query */ String, /* items */ js.Array[js.Any]) => CallbackTo[js.Array[js.Any]] = null,
    itemListRenderer: /* itemListProps */ IItemListRendererProps[js.Any] => CallbackTo[Element] = null,
    itemPredicate: (/* query */ String, js.Any, /* index */ js.UndefOr[Double], /* exactMatch */ js.UndefOr[Boolean]) => CallbackTo[Boolean] = null,
    itemRenderer: (js.Any, /* itemProps */ IItemRendererProps) => CallbackTo[Element | Null] = null,
    items: js.Array[_] = null,
    itemsEqual: ItemsEqualProp[_] = null,
    noResults: VdomNode = null,
    onActiveItemChange: (/* activeItem */ js.Any | Null, /* isCreateNewItem */ Boolean) => Callback = null,
    onItemSelect: (/* item */ js.Any, /* event */ js.UndefOr[ReactEventFrom[HTMLElement]]) => Callback = null,
    onItemsPaste: /* items */ js.Array[js.Any] => Callback = null,
    onQueryChange: (/* query */ String, /* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]]) => Callback = null,
    openOnKeyDown: js.UndefOr[Boolean] = js.undefined,
    popoverProps: PartialIPopoverProps with js.Object = null,
    query: String = null,
    resetOnClose: js.UndefOr[Boolean] = js.undefined,
    resetOnQuery: js.UndefOr[Boolean] = js.undefined,
    resetOnSelect: js.UndefOr[Boolean] = js.undefined,
    scrollToActiveItem: js.UndefOr[Boolean] = js.undefined,
    selectedItem: js.Any = null
  ): PartialISuggestPropsany = {
    val __obj = js.Dynamic.literal()
    if (activeItem != null) __obj.updateDynamic("activeItem")(activeItem.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect.asInstanceOf[js.Any])
    if (createNewItemFromQuery != null) __obj.updateDynamic("createNewItemFromQuery")(js.Any.fromFunction1((t0: /* query */ java.lang.String) => createNewItemFromQuery(t0).runNow()))
    if (createNewItemRenderer != null) __obj.updateDynamic("createNewItemRenderer")(js.Any.fromFunction3((t0: /* query */ java.lang.String, t1: /* active */ scala.Boolean, t2: /* handleClick */ typingsJapgolly.react.mod.MouseEventHandler[org.scalajs.dom.raw.HTMLElement]) => createNewItemRenderer(t0, t1, t2).runNow()))
    if (defaultSelectedItem != null) __obj.updateDynamic("defaultSelectedItem")(defaultSelectedItem.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (initialContent != null) __obj.updateDynamic("initialContent")(initialContent.rawNode.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputValueRenderer != null) __obj.updateDynamic("inputValueRenderer")(js.Any.fromFunction1((t0: /* item */ js.Any) => inputValueRenderer(t0).runNow()))
    if (itemDisabled != null) __obj.updateDynamic("itemDisabled")(itemDisabled.asInstanceOf[js.Any])
    if (itemListPredicate != null) __obj.updateDynamic("itemListPredicate")(js.Any.fromFunction2((t0: /* query */ java.lang.String, t1: /* items */ js.Array[js.Any]) => itemListPredicate(t0, t1).runNow()))
    if (itemListRenderer != null) __obj.updateDynamic("itemListRenderer")(js.Any.fromFunction1((t0: /* itemListProps */ typingsJapgolly.blueprintjsSelect.itemListRendererMod.IItemListRendererProps[js.Any]) => itemListRenderer(t0).runNow()))
    if (itemPredicate != null) __obj.updateDynamic("itemPredicate")(js.Any.fromFunction4((t0: /* query */ java.lang.String, t1: js.Any, t2: /* index */ js.UndefOr[scala.Double], t3: /* exactMatch */ js.UndefOr[scala.Boolean]) => itemPredicate(t0, t1, t2, t3).runNow()))
    if (itemRenderer != null) __obj.updateDynamic("itemRenderer")(js.Any.fromFunction2((t0: js.Any, t1: /* itemProps */ typingsJapgolly.blueprintjsSelect.itemRendererMod.IItemRendererProps) => itemRenderer(t0, t1).runNow()))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (itemsEqual != null) __obj.updateDynamic("itemsEqual")(itemsEqual.asInstanceOf[js.Any])
    if (noResults != null) __obj.updateDynamic("noResults")(noResults.rawNode.asInstanceOf[js.Any])
    if (onActiveItemChange != null) __obj.updateDynamic("onActiveItemChange")(js.Any.fromFunction2((t0: /* activeItem */ js.Any | scala.Null, t1: /* isCreateNewItem */ scala.Boolean) => onActiveItemChange(t0, t1).runNow()))
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction2((t0: /* item */ js.Any, t1: /* event */ js.UndefOr[japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onItemSelect(t0, t1).runNow()))
    if (onItemsPaste != null) __obj.updateDynamic("onItemsPaste")(js.Any.fromFunction1((t0: /* items */ js.Array[js.Any]) => onItemsPaste(t0).runNow()))
    if (onQueryChange != null) __obj.updateDynamic("onQueryChange")(js.Any.fromFunction2((t0: /* query */ java.lang.String, t1: /* event */ js.UndefOr[japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]]) => onQueryChange(t0, t1).runNow()))
    if (!js.isUndefined(openOnKeyDown)) __obj.updateDynamic("openOnKeyDown")(openOnKeyDown.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnClose)) __obj.updateDynamic("resetOnClose")(resetOnClose.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnQuery)) __obj.updateDynamic("resetOnQuery")(resetOnQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnSelect)) __obj.updateDynamic("resetOnSelect")(resetOnSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToActiveItem)) __obj.updateDynamic("scrollToActiveItem")(scrollToActiveItem.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialISuggestPropsany]
  }
}

