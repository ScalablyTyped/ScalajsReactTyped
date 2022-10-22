package typingsJapgolly.blueprintjsSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsSelect.anon.PartialIPopoverProps
import typingsJapgolly.blueprintjsSelect.anon.PartialTagInputProps
import typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.first
import typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.last
import typingsJapgolly.blueprintjsSelect.libEsmCommonItemListRendererMod.ItemListRendererProps
import typingsJapgolly.blueprintjsSelect.libEsmCommonItemRendererMod.ItemRendererProps
import typingsJapgolly.blueprintjsSelect.libEsmCommonListItemsPropsMod.ItemsEqualProp
import typingsJapgolly.blueprintjsSelect.libEsmCommonListItemsUtilsMod.CreateNewItem
import typingsJapgolly.blueprintjsSelect.libEsmComponentsMultiSelectMultiSelectMod.IMultiSelectProps
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MultiSelect {
  
  inline def apply[T](
    itemRenderer: (T, /* itemProps */ ItemRendererProps) => Element | Null,
    items: js.Array[T],
    onItemSelect: (T, js.UndefOr[ReactEventFrom[HTMLElement]]) => Callback,
    tagRenderer: T => Node
  ): Builder[T] = {
    val __props = js.Dynamic.literal(itemRenderer = js.Any.fromFunction2(itemRenderer), items = items.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction2((t0: T, t1: js.UndefOr[ReactEventFrom[HTMLElement]]) => (onItemSelect(t0, t1)).runNow()), tagRenderer = js.Any.fromFunction1(tagRenderer))
    new Builder[T](js.Array(this.component, __props.asInstanceOf[IMultiSelectProps[T]]))
  }
  
  @JSImport("@blueprintjs/select", "MultiSelect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsSelect.mod.MultiSelect[T]] {
    
    inline def activeItem(value: T | CreateNewItem): this.type = set("activeItem", value.asInstanceOf[js.Any])
    
    inline def activeItemNull: this.type = set("activeItem", null)
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def createNewItemFromQuery(value: /* query */ String => T | js.Array[T]): this.type = set("createNewItemFromQuery", js.Any.fromFunction1(value))
    
    inline def createNewItemPosition(value: first | last): this.type = set("createNewItemPosition", value.asInstanceOf[js.Any])
    
    inline def createNewItemRenderer(
      value: (/* query */ String, /* active */ Boolean, /* handleClick */ MouseEventHandler[HTMLElement]) => js.UndefOr[Element]
    ): this.type = set("createNewItemRenderer", js.Any.fromFunction3(value))
    
    inline def fill(value: Boolean): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def initialContent(value: VdomNode): this.type = set("initialContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def initialContentNull: this.type = set("initialContent", null)
    
    inline def initialContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("initialContent", js.Array(value*))
    
    inline def initialContentVdomElement(value: VdomElement): this.type = set("initialContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def itemDisabled(value: (/* keyof T */ String) | (js.Function2[T, /* index */ Double, Boolean])): this.type = set("itemDisabled", value.asInstanceOf[js.Any])
    
    inline def itemDisabledFunction2(value: (T, /* index */ Double) => Boolean): this.type = set("itemDisabled", js.Any.fromFunction2(value))
    
    inline def itemListPredicate(value: (/* query */ String, /* items */ js.Array[T]) => js.Array[T]): this.type = set("itemListPredicate", js.Any.fromFunction2(value))
    
    inline def itemListRenderer(value: /* itemListProps */ ItemListRendererProps[T] => Element | Null): this.type = set("itemListRenderer", js.Any.fromFunction1(value))
    
    inline def itemPredicate(
      value: (/* query */ String, T, /* index */ js.UndefOr[Double], /* exactMatch */ js.UndefOr[Boolean]) => Boolean
    ): this.type = set("itemPredicate", js.Any.fromFunction4(value))
    
    inline def itemsEqual(value: ItemsEqualProp[T]): this.type = set("itemsEqual", value.asInstanceOf[js.Any])
    
    inline def itemsEqualFunction2(value: (T, T) => Boolean): this.type = set("itemsEqual", js.Any.fromFunction2(value))
    
    inline def noResults(value: VdomNode): this.type = set("noResults", value.rawNode.asInstanceOf[js.Any])
    
    inline def noResultsNull: this.type = set("noResults", null)
    
    inline def noResultsVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("noResults", js.Array(value*))
    
    inline def noResultsVdomElement(value: VdomElement): this.type = set("noResults", value.rawElement.asInstanceOf[js.Any])
    
    inline def onActiveItemChange(value: (/* activeItem */ T | Null, /* isCreateNewItem */ Boolean) => Callback): this.type = set("onActiveItemChange", js.Any.fromFunction2((t0: /* activeItem */ T | Null, t1: /* isCreateNewItem */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def onItemsPaste(value: /* items */ js.Array[T] => Callback): this.type = set("onItemsPaste", js.Any.fromFunction1((t0: /* items */ js.Array[T]) => value(t0).runNow()))
    
    inline def onQueryChange(value: (/* query */ String, /* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]]) => Callback): this.type = set("onQueryChange", js.Any.fromFunction2((t0: /* query */ String, t1: /* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]]) => (value(t0, t1)).runNow()))
    
    inline def onRemove(value: (T, /* index */ Double) => Callback): this.type = set("onRemove", js.Any.fromFunction2((t0: T, t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def openOnKeyDown(value: Boolean): this.type = set("openOnKeyDown", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def popoverProps(value: PartialIPopoverProps & js.Object): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    inline def query(value: String): this.type = set("query", value.asInstanceOf[js.Any])
    
    inline def resetOnQuery(value: Boolean): this.type = set("resetOnQuery", value.asInstanceOf[js.Any])
    
    inline def resetOnSelect(value: Boolean): this.type = set("resetOnSelect", value.asInstanceOf[js.Any])
    
    inline def scrollToActiveItem(value: Boolean): this.type = set("scrollToActiveItem", value.asInstanceOf[js.Any])
    
    inline def selectedItems(value: js.Array[T]): this.type = set("selectedItems", value.asInstanceOf[js.Any])
    
    inline def selectedItemsVarargs(value: T*): this.type = set("selectedItems", js.Array(value*))
    
    inline def tagInputProps(value: PartialTagInputProps & js.Object): this.type = set("tagInputProps", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: IMultiSelectProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
