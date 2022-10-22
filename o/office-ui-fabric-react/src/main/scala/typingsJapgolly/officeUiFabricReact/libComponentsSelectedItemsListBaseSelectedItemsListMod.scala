package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.ReactClipboardEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.officeUiFabricReact.libComponentsSelectedItemsListBaseSelectedItemsListDottypesMod.IBaseSelectedItemsList
import typingsJapgolly.officeUiFabricReact.libComponentsSelectedItemsListBaseSelectedItemsListDottypesMod.IBaseSelectedItemsListProps
import typingsJapgolly.officeUiFabricReact.libSelectionMod.Selection
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.IObjectWithKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSelectedItemsListBaseSelectedItemsListMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/BaseSelectedItemsList", "BaseSelectedItemsList")
  @js.native
  open class BaseSelectedItemsList[T, P /* <: IBaseSelectedItemsListProps[T] */] protected ()
    extends Component[P, IBaseSelectedItemsListState[T], Any]
       with IBaseSelectedItemsList[T] {
    def this(basePickerProps: P) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MBaseSelectedItemsList(newProps: P): Unit = js.native
    
    @JSName("UNSAFE_componentWillUpdate")
    def UNSAFE_componentWillUpdate_MBaseSelectedItemsList(newProps: P, newState: IBaseSelectedItemsListState[Any]): Unit = js.native
    
    /* private */ var _canRemoveItem: Any = js.native
    
    /* private */ var _onSelectedItemsUpdated: Any = js.native
    
    /* CompleteClass */
    override def addItems(items: js.Array[T]): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MBaseSelectedItemsList(): Unit = js.native
    
    /* protected */ def copyItems(items: js.Array[T]): Unit = js.native
    
    def hasSelectedItems(): Boolean = js.native
    
    def highlightedItems(): js.Array[T] = js.native
    
    @JSName("items")
    val items_BaseSelectedItemsList: js.Array[T] = js.native
    
    /* protected */ def onChange(): Unit = js.native
    /* protected */ def onChange(items: js.Array[T]): Unit = js.native
    
    def onCopy(ev: ReactClipboardEventFrom[HTMLElement]): Unit = js.native
    
    /* protected */ def onItemChange(changedItem: T, index: Double): Unit = js.native
    
    /* protected */ def onSelectionChanged(): Unit = js.native
    
    def removeItem(item: T): Unit = js.native
    
    def removeItemAt(index: Double): Unit = js.native
    
    def removeItems(itemsToRemove: js.Array[Any]): Unit = js.native
    
    def removeSelectedItems(): Unit = js.native
    
    /* protected */ def renderItems(): js.Array[Element] = js.native
    
    def replaceItem(itemToReplace: T, itemsToReplaceWith: js.Array[T]): Unit = js.native
    
    /* protected */ var root: HTMLElement = js.native
    
    /* protected */ var selection: Selection[IObjectWithKey] = js.native
    
    def unselectAll(): Unit = js.native
    
    /**
      * Controls what happens whenever there is an action that impacts the selected items.
      * If selectedItems is provided, this will act as a controlled component and will not update its own state.
      */
    def updateItems(items: js.Array[T]): Unit = js.native
    def updateItems(items: js.Array[T], focusIndex: Double): Unit = js.native
  }
  
  trait IBaseSelectedItemsListState[T] extends StObject {
    
    var items: js.Array[T]
  }
  object IBaseSelectedItemsListState {
    
    inline def apply[T](items: js.Array[T]): IBaseSelectedItemsListState[T] = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBaseSelectedItemsListState[T]]
    }
    
    extension [Self <: IBaseSelectedItemsListState[?], T](x: Self & IBaseSelectedItemsListState[T]) {
      
      inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
}
