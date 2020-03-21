package typingsJapgolly.officeUiFabricReact.basePickerMod

import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.officeUiFabricReact.autofillMod.Autofill
import typingsJapgolly.officeUiFabricReact.autofillTypesMod.IAutofill
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.IBasePicker
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import typingsJapgolly.officeUiFabricReact.focusZoneTypesMod.IFocusZone
import typingsJapgolly.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typingsJapgolly.officeUiFabricReact.selectionMod.Selection
import typingsJapgolly.officeUiFabricReact.suggestionsControllerMod.SuggestionsController
import typingsJapgolly.officeUiFabricReact.suggestionsMod.Suggestions
import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestions
import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/pickers/BasePicker", "BasePicker")
@js.native
class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
  extends BaseComponent[P, IBasePickerState]
     with IBasePicker[T] {
  def this(basePickerProps: P) = this()
  /**
    * @deprecated this is no longer necessary as typescript now supports generic elements
    */
  var SuggestionOfProperType: Instantiable1[/* props */ ISuggestionsProps[T], Suggestions[T]] = js.native
  var _ariaMap: IPickerAriaIds = js.native
  var _completeGenericSuggestion: js.Any = js.native
  /**
    * Suggestions are normally shown after the user updates text and the text
    * is non-empty, but also when the user clicks on the input element.
    * @returns True if suggestions should be shown.
    */
  var _getShowSuggestions: js.Any = js.native
  var _getTextFromItem: js.Any = js.native
  var _id: js.Any = js.native
  var _onResolveSuggestions: js.Any = js.native
  var _onSelectedItemsUpdated: js.Any = js.native
  var _requestSuggestionsOnClick: js.Any = js.native
  var _styledSuggestions: js.Any = js.native
  /**
    * Takes in the current updated value and either resolves it with the new suggestions
    * or if updated value is undefined then it clears out currently suggested items
    */
  var _updateAndResolveValue: js.Any = js.native
  /**
    * Controls what happens whenever there is an action that impacts the selected items.
    * If selectedItems is provided as a property then this will act as a controlled component and it will not update it's own state.
    */
  var _updateSelectedItems: js.Any = js.native
  var currentPromise: js.UndefOr[js.Thenable[_]] = js.native
  var focusZone: RefHandle[IFocusZone] = js.native
  var input: RefHandle[IAutofill] = js.native
  @JSName("items")
  val items_BasePicker: js.Array[T] = js.native
  var root: RefHandle[HTMLDivElement] = js.native
  var selection: Selection[IObjectWithKey] = js.native
  var suggestionElement: RefHandle[ISuggestions[T]] = js.native
  var suggestionStore: SuggestionsController[T] = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MBasePicker(newProps: P): Unit = js.native
  @JSName("UNSAFE_componentWillUpdate")
  def UNSAFE_componentWillUpdate_MBasePicker(newProps: P, newState: IBasePickerState): Unit = js.native
  /* protected */ def _isFocusZoneInnerKeystroke(ev: ReactKeyboardEventFrom[HTMLElement]): Boolean = js.native
  /* protected */ def addItem(item: T): Unit = js.native
  /* protected */ def addItemByIndex(index: Double): Unit = js.native
  /* protected */ def canAddItems(): Boolean = js.native
  /* protected */ def completeSelection(item: T): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBasePicker(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MBasePicker(): Unit = js.native
  def dismissSuggestions(): Unit = js.native
  def dismissSuggestions(ev: js.Any): Unit = js.native
  /* protected */ def getActiveDescendant(): js.UndefOr[String] = js.native
  /* protected */ def getSuggestionsAlert(): js.UndefOr[Element] = js.native
  /* protected */ def getSuggestionsAlert(suggestionAlertClassName: String): js.UndefOr[Element] = js.native
  /* protected */ def onBackspace(ev: ReactKeyboardEventFrom[HTMLElement]): Unit = js.native
  /* protected */ def onBlur(ev: ReactFocusEventFrom[(HTMLElement | Autofill) with org.scalajs.dom.raw.Element]): Unit = js.native
  /* protected */ def onChange(): Unit = js.native
  /* protected */ def onChange(items: js.Array[T]): Unit = js.native
  /**
    * Reveals suggestions any time the user clicks on the input element
    * without shifting focus.
    */
  /* protected */ def onClick(ev: ReactMouseEventFrom[HTMLInputElement]): Unit = js.native
  /* protected */ def onEmptyInputFocus(): Unit = js.native
  /* protected */ def onGetMoreResults(): Unit = js.native
  /* protected */ def onInputBlur(ev: ReactFocusEventFrom[(HTMLInputElement | Autofill) with org.scalajs.dom.raw.Element]): Unit = js.native
  /* protected */ def onInputChange(value: String): Unit = js.native
  /* protected */ def onInputFocus(ev: ReactFocusEventFrom[(HTMLInputElement | Autofill) with org.scalajs.dom.raw.Element]): Unit = js.native
  /* protected */ def onItemChange(changedItem: T, index: Double): Unit = js.native
  /* protected */ def onKeyDown(ev: ReactKeyboardEventFrom[HTMLElement]): Unit = js.native
  /* protected */ def onSelectionChange(): Unit = js.native
  /* protected */ def onSuggestionClick(ev: ReactMouseEventFrom[HTMLElement], item: js.Any, index: Double): Unit = js.native
  /* protected */ def onSuggestionRemove(ev: ReactMouseEventFrom[HTMLElement], item: T, index: Double): Unit = js.native
  /* protected */ def onSuggestionSelect(): Unit = js.native
  def refocusSuggestions(keyCode: Double): Unit = js.native
  /* protected */ def removeItem(item: IPickerItemProps[T]): Unit = js.native
  /* protected */ def removeItem(item: IPickerItemProps[T], focusNextItem: Boolean): Unit = js.native
  /* protected */ def removeItems(itemsToRemove: js.Array[_]): Unit = js.native
  /* protected */ def renderItems(): js.Array[Element] = js.native
  /* protected */ def renderSuggestions(): Element | Null = js.native
  /* protected */ def resetFocus(): Unit = js.native
  /* protected */ def resetFocus(index: Double): Unit = js.native
  /* protected */ def resolveNewValue(updatedValue: String, suggestions: js.Array[T]): Unit = js.native
  /* protected */ def updateSuggestions(suggestions: js.Array[_]): Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: js.Array[T]): Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: js.Array[T], updatedValue: String): Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: js.Thenable[js.Array[T]]): Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: js.Thenable[js.Array[T]], updatedValue: String): Unit = js.native
  /* protected */ def updateValue(updatedValue: String): Unit = js.native
}

