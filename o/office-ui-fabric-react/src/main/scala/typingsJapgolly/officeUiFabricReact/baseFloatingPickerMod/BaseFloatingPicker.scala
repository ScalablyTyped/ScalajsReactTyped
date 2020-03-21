package typingsJapgolly.officeUiFabricReact.baseFloatingPickerMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Selection
import typingsJapgolly.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPicker
import typingsJapgolly.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.suggestionsControlMod.SuggestionsControl
import typingsJapgolly.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsControlProps
import typingsJapgolly.officeUiFabricReact.suggestionsStoreMod.SuggestionsStore
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/BaseFloatingPicker", "BaseFloatingPicker")
@js.native
class BaseFloatingPicker[T, P /* <: IBaseFloatingPickerProps[T] */] protected ()
  extends BaseComponent[P, IBaseFloatingPickerState]
     with IBaseFloatingPicker {
  def this(basePickerProps: P) = this()
  var SuggestionsControlOfProperType: Instantiable1[/* props */ ISuggestionsControlProps[T], SuggestionsControl[T]] = js.native
  var _bindToInputElement: js.Any = js.native
  var _onResolveSuggestions: js.Any = js.native
  var _onValidateInput: js.Any = js.native
  var _unbindFromInputElement: js.Any = js.native
  var _updateActiveDescendant: js.Any = js.native
  var _updateSuggestionsVisible: js.Any = js.native
  var currentPromise: js.Thenable[js.Array[T]] = js.native
  val currentSelectedSuggestionIndex: Double = js.native
  var isComponentMounted: Boolean = js.native
  var root: RefHandle[HTMLDivElement] = js.native
  var selection: Selection = js.native
  var suggestionStore: SuggestionsStore[T] = js.native
  var suggestionsControl: RefHandle[SuggestionsControl[T]] = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MBaseFloatingPicker(newProps: IBaseFloatingPickerProps[T]): Unit = js.native
  def completeSuggestion(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBaseFloatingPicker(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MBaseFloatingPicker(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MBaseFloatingPicker(): Unit = js.native
  def forceResolveSuggestion(): Unit = js.native
  /* protected */ def onChange(item: T): Unit = js.native
  /* protected */ def onKeyDown(ev: MouseEvent): Unit = js.native
  /* protected */ def onSelectionChange(): Unit = js.native
  /* protected */ def onSuggestionClick(ev: ReactMouseEventFrom[HTMLElement], item: T, index: Double): Unit = js.native
  /* protected */ def onSuggestionRemove(ev: ReactMouseEventFrom[HTMLElement], item: T, index: Double): Unit = js.native
  /* protected */ def renderSuggestions(): Element | Null = js.native
  /* protected */ def updateSuggestionWithZeroState(): Unit = js.native
  def updateSuggestions(suggestions: js.Array[T]): Unit = js.native
  def updateSuggestions(suggestions: js.Array[T], forceUpdate: Boolean): Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: js.Array[T]): Unit = js.native
  /* protected */ def updateSuggestionsList(suggestions: js.Thenable[js.Array[T]]): Unit = js.native
  /* protected */ def updateValue(updatedValue: String): Unit = js.native
}

