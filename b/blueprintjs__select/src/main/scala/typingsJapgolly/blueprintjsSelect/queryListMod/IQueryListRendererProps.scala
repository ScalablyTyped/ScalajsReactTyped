package typingsJapgolly.blueprintjsSelect.queryListMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@blueprintjs/select.@blueprintjs/select/lib/esm/components/query-list/queryList.IQueryListState<T>, 'activeItem' | 'filteredItems' | 'query'> */
/* Inlined parent @blueprintjs/core.@blueprintjs/core.IProps */
@js.native
trait IQueryListRendererProps[T] extends js.Object {
  var activeItem: js.UndefOr[T | ICreateNewItem] = js.native
  /** A space-delimited list of class names to pass along to a child element. */
  var className: js.UndefOr[String] = js.native
  var filteredItems: js.Array[T] = js.native
  /**
    * Keyboard handler for up/down arrow keys to shift the active item.
    * Attach this handler to any element that should support this interaction.
    */
  var handleKeyDown: KeyboardEventHandler[HTMLElement] = js.native
  /**
    * Keyboard handler for enter key to select the active item.
    * Attach this handler to any element that should support this interaction.
    */
  var handleKeyUp: KeyboardEventHandler[HTMLElement] = js.native
  /**
    * Change handler for query string. Attach this to an input element to allow
    * `QueryList` to control the query.
    */
  var handleQueryChange: ChangeEventHandler[HTMLInputElement] = js.native
  /** Rendered elements returned from `itemListRenderer` prop. */
  var itemList: Node = js.native
  var query: String = js.native
  /**
    * Selection handler that should be invoked when a new item has been chosen,
    * perhaps because the user clicked it.
    */
  def handleItemSelect(item: T): Unit = js.native
  def handleItemSelect(item: T, event: ReactEventFrom[HTMLElement]): Unit = js.native
  /**
    * Handler that should be invoked when the user pastes one or more values.
    *
    * This callback will use `itemPredicate` with `exactMatch=true` to find a
    * subset of `items` exactly matching the pasted `values` provided, then it
    * will invoke `onItemsPaste` with those found items. Each pasted value that
    * does not exactly match an item will be ignored.
    *
    * If creating items is enabled (by providing both `createNewItemFromQuery`
    * and `createNewItemRenderer`), then pasted values that do not exactly
    * match an existing item will emit a new item as created via
    * `createNewItemFromQuery`.
    *
    * If `itemPredicate` returns multiple matching items for a particular query
    * in `queries`, then only the first matching item will be emitted.
    */
  def handlePaste(queries: js.Array[String]): Unit = js.native
}

