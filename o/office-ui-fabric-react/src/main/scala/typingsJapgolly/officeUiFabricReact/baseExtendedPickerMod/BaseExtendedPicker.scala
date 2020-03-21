package typingsJapgolly.officeUiFabricReact.baseExtendedPickerMod

import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPicker
import typingsJapgolly.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps
import typingsJapgolly.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill
import typingsJapgolly.officeUiFabricReact.libFloatingPickerMod.BaseFloatingPicker
import typingsJapgolly.officeUiFabricReact.libSelectedItemsListMod.BaseSelectedItemsList
import typingsJapgolly.officeUiFabricReact.libSelectionMod.Selection
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/BaseExtendedPicker", "BaseExtendedPicker")
@js.native
class BaseExtendedPicker[T, P /* <: IBaseExtendedPickerProps[T] */] protected ()
  extends BaseComponent[P, IBaseExtendedPickerState[T]]
     with IBaseExtendedPicker[T] {
  def this(basePickerProps: P) = this()
  var _addProcessedItem: js.Any = js.native
  /**
    * The floating picker is the source of truth for if the menu has been opened or not.
    *
    * Because this isn't tracked inside the state of this component, we need to
    * force an update here to keep the rendered output that depends on the picker being open
    * in sync with the state
    *
    * Called when the suggestions is shown or closed
    */
  var _onSuggestionsShownOrHidden: js.Any = js.native
  var floatingPicker: RefHandle[BaseFloatingPicker[T, IBaseFloatingPickerProps[T]]] = js.native
  var floatingPickerProps: IBaseFloatingPickerProps[T] = js.native
  val highlightedItems: js.Array[T] = js.native
  var input: RefHandle[Autofill] = js.native
  val inputElement: HTMLInputElement | Null = js.native
  var root: RefHandle[HTMLDivElement] = js.native
  var selectedItemsList: RefHandle[BaseSelectedItemsList[T, IBaseSelectedItemsListProps[T]]] = js.native
  var selectedItemsListProps: IBaseSelectedItemsListProps[T] = js.native
  var selection: Selection[IObjectWithKey] = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MBaseExtendedPicker(newProps: P): Unit = js.native
  /* protected */ def _onSelectedItemsChanged(): Unit = js.native
  /* protected */ def _onSuggestionSelected(item: T): Unit = js.native
  /* protected */ def canAddItems(): Boolean = js.native
  def clearInput(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBaseExtendedPicker(): Unit = js.native
  /** Sets focus to the input. */
  /* CompleteClass */
  override def focus(): Unit = js.native
  /* protected */ def onBackspace(ev: ReactKeyboardEventFrom[HTMLElement]): Unit = js.native
  /* protected */ def onCopy(ev: ReactClipboardEventFrom[HTMLElement]): Unit = js.native
  /* protected */ def onInputChange(value: String): Unit = js.native
  /* protected */ def onInputChange(value: String, composing: Boolean): Unit = js.native
  /* protected */ def onInputClick(ev: ReactMouseEventFrom[(HTMLInputElement | Autofill) with Element]): Unit = js.native
  /* protected */ def onInputFocus(ev: ReactFocusEventFrom[(HTMLInputElement | Autofill) with Element]): Unit = js.native
  /* protected */ def onPaste(ev: ReactClipboardEventFrom[(HTMLInputElement | Autofill) with Element]): Unit = js.native
  /* protected */ def onSelectionChange(): Unit = js.native
  /* protected */ def renderFloatingPicker(): japgolly.scalajs.react.raw.React.Element = js.native
  /* protected */ def renderSelectedItemsList(): japgolly.scalajs.react.raw.React.Element = js.native
}

