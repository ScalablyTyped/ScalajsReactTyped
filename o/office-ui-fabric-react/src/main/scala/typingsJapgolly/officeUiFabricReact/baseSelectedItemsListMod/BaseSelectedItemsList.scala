package typingsJapgolly.officeUiFabricReact.baseSelectedItemsListMod

import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsList
import typingsJapgolly.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typingsJapgolly.officeUiFabricReact.libSelectionMod.Selection
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/BaseSelectedItemsList", "BaseSelectedItemsList")
@js.native
class BaseSelectedItemsList[T, P /* <: IBaseSelectedItemsListProps[T] */] protected ()
  extends BaseComponent[P, IBaseSelectedItemsListState[T]]
     with IBaseSelectedItemsList[T] {
  def this(basePickerProps: P) = this()
  var _canRemoveItem: js.Any = js.native
  var _onSelectedItemsUpdated: js.Any = js.native
  @JSName("items")
  val items_BaseSelectedItemsList: js.Array[T] = js.native
  var root: HTMLElement = js.native
  var selection: Selection[IObjectWithKey] = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MBaseSelectedItemsList(newProps: P): Unit = js.native
  @JSName("UNSAFE_componentWillUpdate")
  def UNSAFE_componentWillUpdate_MBaseSelectedItemsList(newProps: P, newState: IBaseSelectedItemsListState[_]): Unit = js.native
  /* CompleteClass */
  override def addItems(items: js.Array[T]): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBaseSelectedItemsList(): Unit = js.native
  /* protected */ def copyItems(items: js.Array[T]): Unit = js.native
  def hasSelectedItems(): Boolean = js.native
  def highlightedItems(): js.Array[T] = js.native
  /* protected */ def onChange(): Unit = js.native
  /* protected */ def onChange(items: js.Array[T]): Unit = js.native
  def onCopy(ev: ReactClipboardEventFrom[HTMLElement]): Unit = js.native
  /* protected */ def onItemChange(changedItem: T, index: Double): Unit = js.native
  /* protected */ def onSelectionChanged(): Unit = js.native
  def removeItem(item: T): Unit = js.native
  def removeItemAt(index: Double): Unit = js.native
  def removeItems(itemsToRemove: js.Array[_]): Unit = js.native
  def removeSelectedItems(): Unit = js.native
  /* protected */ def renderItems(): js.Array[Element] = js.native
  def replaceItem(itemToReplace: T, itemsToReplaceWith: js.Array[T]): Unit = js.native
  def unselectAll(): Unit = js.native
  /**
    * Controls what happens whenever there is an action that impacts the selected items.
    * If selectedItems is provided as a property then this will act as a controlled component and it will not update it's own state.
    */
  def updateItems(items: js.Array[T]): Unit = js.native
  def updateItems(items: js.Array[T], focusIndex: Double): Unit = js.native
}

