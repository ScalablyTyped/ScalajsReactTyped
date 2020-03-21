package typingsJapgolly.blueprintjsSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.blueprintjsSelect.PartialIPopoverProps
import typingsJapgolly.blueprintjsSelect.PartialITagInputProps
import typingsJapgolly.blueprintjsSelect.itemListRendererMod.IItemListRendererProps
import typingsJapgolly.blueprintjsSelect.itemRendererMod.IItemRendererProps
import typingsJapgolly.blueprintjsSelect.listItemsPropsMod.ItemsEqualProp
import typingsJapgolly.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typingsJapgolly.blueprintjsSelect.multiSelectMod.IMultiSelectProps
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiSelect {
  def apply[T](
    items: js.Array[T],
    itemRenderer: (T, /* itemProps */ IItemRendererProps) => CallbackTo[Element | Null],
    onItemSelect: (T, js.UndefOr[ReactEventFrom[HTMLElement]]) => Callback,
    tagRenderer: T => CallbackTo[Node],
    activeItem: T | ICreateNewItem = null,
    className: String = null,
    createNewItemFromQuery: /* query */ String => CallbackTo[T] = null,
    createNewItemRenderer: (/* query */ String, /* active */ Boolean, /* handleClick */ MouseEventHandler[HTMLElement]) => CallbackTo[js.UndefOr[Element]] = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    initialContent: VdomNode = null,
    itemDisabled: String | (js.Function2[T, /* index */ Double, Boolean]) = null,
    itemListPredicate: (/* query */ String, /* items */ js.Array[T]) => CallbackTo[js.Array[T]] = null,
    itemListRenderer: /* itemListProps */ IItemListRendererProps[T] => CallbackTo[Element] = null,
    itemPredicate: (/* query */ String, T, /* index */ js.UndefOr[Double], /* exactMatch */ js.UndefOr[Boolean]) => CallbackTo[Boolean] = null,
    itemsEqual: ItemsEqualProp[T] = null,
    noResults: VdomNode = null,
    onActiveItemChange: (/* activeItem */ T | Null, /* isCreateNewItem */ Boolean) => Callback = null,
    onItemsPaste: /* items */ js.Array[T] => Callback = null,
    onQueryChange: (/* query */ String, /* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]]) => Callback = null,
    openOnKeyDown: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    popoverProps: PartialIPopoverProps with js.Object = null,
    query: String = null,
    resetOnQuery: js.UndefOr[Boolean] = js.undefined,
    resetOnSelect: js.UndefOr[Boolean] = js.undefined,
    scrollToActiveItem: js.UndefOr[Boolean] = js.undefined,
    selectedItems: js.Array[T] = null,
    tagInputProps: PartialITagInputProps with js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IMultiSelectProps[T], 
    typingsJapgolly.blueprintjsSelect.mod.MultiSelect[T], 
    Unit, 
    IMultiSelectProps[T]
  ] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
  
      __obj.updateDynamic("itemRenderer")(js.Any.fromFunction2((t0: T, t1: /* itemProps */ typingsJapgolly.blueprintjsSelect.itemRendererMod.IItemRendererProps) => itemRenderer(t0, t1).runNow()))
    __obj.updateDynamic("onItemSelect")(js.Any.fromFunction2((t0: T, t1: js.UndefOr[japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onItemSelect(t0, t1).runNow()))
    __obj.updateDynamic("tagRenderer")(js.Any.fromFunction1((t0: T) => tagRenderer(t0).runNow()))
    if (activeItem != null) __obj.updateDynamic("activeItem")(activeItem.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (createNewItemFromQuery != null) __obj.updateDynamic("createNewItemFromQuery")(js.Any.fromFunction1((t0: /* query */ java.lang.String) => createNewItemFromQuery(t0).runNow()))
    if (createNewItemRenderer != null) __obj.updateDynamic("createNewItemRenderer")(js.Any.fromFunction3((t0: /* query */ java.lang.String, t1: /* active */ scala.Boolean, t2: /* handleClick */ typingsJapgolly.react.mod.MouseEventHandler[org.scalajs.dom.raw.HTMLElement]) => createNewItemRenderer(t0, t1, t2).runNow()))
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (initialContent != null) __obj.updateDynamic("initialContent")(initialContent.rawNode.asInstanceOf[js.Any])
    if (itemDisabled != null) __obj.updateDynamic("itemDisabled")(itemDisabled.asInstanceOf[js.Any])
    if (itemListPredicate != null) __obj.updateDynamic("itemListPredicate")(js.Any.fromFunction2((t0: /* query */ java.lang.String, t1: /* items */ js.Array[T]) => itemListPredicate(t0, t1).runNow()))
    if (itemListRenderer != null) __obj.updateDynamic("itemListRenderer")(js.Any.fromFunction1((t0: /* itemListProps */ typingsJapgolly.blueprintjsSelect.itemListRendererMod.IItemListRendererProps[T]) => itemListRenderer(t0).runNow()))
    if (itemPredicate != null) __obj.updateDynamic("itemPredicate")(js.Any.fromFunction4((t0: /* query */ java.lang.String, t1: T, t2: /* index */ js.UndefOr[scala.Double], t3: /* exactMatch */ js.UndefOr[scala.Boolean]) => itemPredicate(t0, t1, t2, t3).runNow()))
    if (itemsEqual != null) __obj.updateDynamic("itemsEqual")(itemsEqual.asInstanceOf[js.Any])
    if (noResults != null) __obj.updateDynamic("noResults")(noResults.rawNode.asInstanceOf[js.Any])
    if (onActiveItemChange != null) __obj.updateDynamic("onActiveItemChange")(js.Any.fromFunction2((t0: /* activeItem */ T | scala.Null, t1: /* isCreateNewItem */ scala.Boolean) => onActiveItemChange(t0, t1).runNow()))
    if (onItemsPaste != null) __obj.updateDynamic("onItemsPaste")(js.Any.fromFunction1((t0: /* items */ js.Array[T]) => onItemsPaste(t0).runNow()))
    if (onQueryChange != null) __obj.updateDynamic("onQueryChange")(js.Any.fromFunction2((t0: /* query */ java.lang.String, t1: /* event */ js.UndefOr[japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]]) => onQueryChange(t0, t1).runNow()))
    if (!js.isUndefined(openOnKeyDown)) __obj.updateDynamic("openOnKeyDown")(openOnKeyDown.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnQuery)) __obj.updateDynamic("resetOnQuery")(resetOnQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnSelect)) __obj.updateDynamic("resetOnSelect")(resetOnSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToActiveItem)) __obj.updateDynamic("scrollToActiveItem")(scrollToActiveItem.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (tagInputProps != null) __obj.updateDynamic("tagInputProps")(tagInputProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsSelect.multiSelectMod.IMultiSelectProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsSelect.mod.MultiSelect[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsSelect.multiSelectMod.IMultiSelectProps[T]])(children: _*)
  }
  @JSImport("@blueprintjs/select", "MultiSelect")
  @js.native
  object componentImport extends js.Object
  
}

