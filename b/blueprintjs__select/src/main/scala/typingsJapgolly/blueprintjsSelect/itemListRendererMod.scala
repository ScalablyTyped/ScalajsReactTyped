package typingsJapgolly.blueprintjsSelect

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select/lib/esm/common/itemListRenderer", JSImport.Namespace)
@js.native
object itemListRendererMod extends js.Object {
  @js.native
  trait IItemListRendererProps[T] extends js.Object {
    /**
      * The currently focused item (for keyboard interactions), or `null` to
      * indicate that no item is active.
      */
    var activeItem: T | ICreateNewItem | Null = js.native
    /**
      * Array of items filtered by `itemListPredicate` or `itemPredicate`.
      * See `items` for the full list of items.
      *
      * Use `renderFilteredItems()` utility function from this library to
      * map each item in this array through `renderItem`, with support for
      * optional `noResults` and `initialContent` states.
      */
    var filteredItems: js.Array[T] = js.native
    /**
      * Array of all items in the list.
      * See `filteredItems` for a filtered array based on `query` and predicate props.
      */
    var items: js.Array[T] = js.native
    /**
      * The current query string.
      */
    var query: String = js.native
    def itemsParentRef(): Unit = js.native
    /**
      * A ref handler that should be attached to the parent HTML element of the menu items.
      * This is required for the active item to scroll into view automatically.
      */
    def itemsParentRef(ref: HTMLElement): Unit = js.native
    /**
      * Call this function to render an item.
      * This retrieves the modifiers for the item and delegates actual rendering
      * to the owner component's `itemRenderer` prop.
      */
    def renderItem(item: T, index: Double): Element | Null = js.native
  }
  
  def renderFilteredItems(props: IItemListRendererProps[_]): Node = js.native
  def renderFilteredItems(props: IItemListRendererProps[_], noResults: Node): Node = js.native
  def renderFilteredItems(props: IItemListRendererProps[_], noResults: Node, initialContent: Node): Node = js.native
  type ItemListRenderer[T] = js.Function1[/* itemListProps */ IItemListRendererProps[T], Element]
}

