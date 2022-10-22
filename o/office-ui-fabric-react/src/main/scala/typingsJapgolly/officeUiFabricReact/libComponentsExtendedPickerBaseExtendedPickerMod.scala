package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill
import typingsJapgolly.officeUiFabricReact.libComponentsExtendedPickerBaseExtendedPickerDottypesMod.IBaseExtendedPicker
import typingsJapgolly.officeUiFabricReact.libComponentsExtendedPickerBaseExtendedPickerDottypesMod.IBaseExtendedPickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerBaseFloatingPickerDottypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsSelectedItemsListBaseSelectedItemsListDottypesMod.IBaseSelectedItemsListProps
import typingsJapgolly.officeUiFabricReact.libFloatingPickerMod.BaseFloatingPicker
import typingsJapgolly.officeUiFabricReact.libSelectedItemsListMod.BaseSelectedItemsList
import typingsJapgolly.officeUiFabricReact.libSelectionMod.Selection
import typingsJapgolly.react.mod.Component
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.IObjectWithKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsExtendedPickerBaseExtendedPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/BaseExtendedPicker", "BaseExtendedPicker")
  @js.native
  open class BaseExtendedPicker[T, P /* <: IBaseExtendedPickerProps[T] */] protected ()
    extends Component[P, IBaseExtendedPickerState[T], Any]
       with IBaseExtendedPicker[T] {
    def this(basePickerProps: P) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MBaseExtendedPicker(newProps: P): Unit = js.native
    
    /* private */ var _addProcessedItem: Any = js.native
    
    /* protected */ def _onSelectedItemsChanged(): Unit = js.native
    
    /* protected */ def _onSuggestionSelected(item: T): Unit = js.native
    
    /**
      * The floating picker is the source of truth for if the menu has been opened or not.
      *
      * Because this isn't tracked inside the state of this component, we need to
      * force an update here to keep the rendered output that depends on the picker being open
      * in sync with the state
      *
      * Called when the suggestions is shown or closed
      */
    /* private */ var _onSuggestionsShownOrHidden: Any = js.native
    
    /* protected */ def canAddItems(): Boolean = js.native
    
    def clearInput(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MBaseExtendedPicker(): Unit = js.native
    
    var floatingPicker: RefHandle[BaseFloatingPicker[T, IBaseFloatingPickerProps[T]]] = js.native
    
    /* protected */ var floatingPickerProps: IBaseFloatingPickerProps[T] = js.native
    
    /** Sets focus to the input. */
    /* CompleteClass */
    override def focus(): Unit = js.native
    
    val highlightedItems: js.Array[T] = js.native
    
    /* protected */ var input: RefHandle[Autofill] = js.native
    
    val inputElement: HTMLInputElement | Null = js.native
    
    /* protected */ def onBackspace(ev: ReactKeyboardEventFrom[HTMLElement]): Unit = js.native
    
    /* protected */ def onCopy(ev: ReactClipboardEventFrom[HTMLElement]): Unit = js.native
    
    /* protected */ def onInputChange(value: String): Unit = js.native
    /* protected */ def onInputChange(value: String, composing: Boolean): Unit = js.native
    
    /* protected */ def onInputClick(ev: ReactMouseEventFrom[(HTMLInputElement | Autofill) & Element]): Unit = js.native
    
    /* protected */ def onInputFocus(ev: ReactFocusEventFrom[(HTMLInputElement | Autofill) & Element]): Unit = js.native
    
    /* protected */ def onPaste(ev: ReactClipboardEventFrom[(HTMLInputElement | Autofill) & Element]): Unit = js.native
    
    /* protected */ def onSelectionChange(): Unit = js.native
    
    /* protected */ def renderFloatingPicker(): typingsJapgolly.react.mod.global.JSX.Element = js.native
    
    /* protected */ def renderSelectedItemsList(): typingsJapgolly.react.mod.global.JSX.Element = js.native
    
    /* protected */ var root: RefHandle[HTMLDivElement] = js.native
    
    var selectedItemsList: RefHandle[BaseSelectedItemsList[T, IBaseSelectedItemsListProps[T]]] = js.native
    
    /* protected */ var selectedItemsListProps: IBaseSelectedItemsListProps[T] = js.native
    
    /* protected */ var selection: Selection[IObjectWithKey] = js.native
  }
  
  trait IBaseExtendedPickerState[T] extends StObject {
    
    var queryString: String | Null
    
    var selectedItems: js.Array[T] | Null
    
    var suggestionItems: js.Array[T] | Null
  }
  object IBaseExtendedPickerState {
    
    inline def apply[T](): IBaseExtendedPickerState[T] = {
      val __obj = js.Dynamic.literal(queryString = null, selectedItems = null, suggestionItems = null)
      __obj.asInstanceOf[IBaseExtendedPickerState[T]]
    }
    
    extension [Self <: IBaseExtendedPickerState[?], T](x: Self & IBaseExtendedPickerState[T]) {
      
      inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      inline def setQueryStringNull: Self = StObject.set(x, "queryString", null)
      
      inline def setSelectedItems(value: js.Array[T]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsNull: Self = StObject.set(x, "selectedItems", null)
      
      inline def setSelectedItemsVarargs(value: T*): Self = StObject.set(x, "selectedItems", js.Array(value*))
      
      inline def setSuggestionItems(value: js.Array[T]): Self = StObject.set(x, "suggestionItems", value.asInstanceOf[js.Any])
      
      inline def setSuggestionItemsNull: Self = StObject.set(x, "suggestionItems", null)
      
      inline def setSuggestionItemsVarargs(value: T*): Self = StObject.set(x, "suggestionItems", js.Array(value*))
    }
  }
}
