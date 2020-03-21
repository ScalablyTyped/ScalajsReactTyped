package typingsJapgolly.reactSelect.selectMod

import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.TouchEvent
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSelect.AnonClearValue
import typingsJapgolly.reactSelect.AnonContext
import typingsJapgolly.reactSelect.AnonEvent
import typingsJapgolly.reactSelect.componentsMod.PlaceholderOrValue
import typingsJapgolly.reactSelect.componentsMod.SelectComponents
import typingsJapgolly.reactSelect.reactSelectStrings.first
import typingsJapgolly.reactSelect.reactSelectStrings.group
import typingsJapgolly.reactSelect.reactSelectStrings.input
import typingsJapgolly.reactSelect.reactSelectStrings.last
import typingsJapgolly.reactSelect.reactSelectStrings.listbox
import typingsJapgolly.reactSelect.reactSelectStrings.next
import typingsJapgolly.reactSelect.reactSelectStrings.option
import typingsJapgolly.reactSelect.reactSelectStrings.previous
import typingsJapgolly.reactSelect.typesMod.ActionTypes
import typingsJapgolly.reactSelect.typesMod.FocusDirection
import typingsJapgolly.reactSelect.typesMod.InputActionMeta
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import typingsJapgolly.reactSelect.typesMod.OptionsType
import typingsJapgolly.reactSelect.typesMod.ValueType
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select[OptionType /* <: OptionTypeBase */]
  extends Component[Props[OptionType], State[OptionType], js.Any] {
  // Misc. Instance Properties
  // ------------------------------
  var blockOptionHover: Boolean = js.native
  var clearFocusValueOnUpdate: Boolean = js.native
  var commonProps: js.Any = js.native
   // TODO
  var components: SelectComponents[OptionType] = js.native
  // Refs
  // ------------------------------
  var controlRef: ElRef = js.native
  var focusedOptionRef: ElRef = js.native
  var formatGroupLabel: typingsJapgolly.reactSelect.builtinsMod.formatGroupLabel[OptionType] = js.native
  var getOptionLabel: typingsJapgolly.reactSelect.builtinsMod.getOptionLabel[OptionType] = js.native
  var getOptionValue: typingsJapgolly.reactSelect.builtinsMod.getOptionValue[OptionType] = js.native
  var hasGroups: Boolean = js.native
  var initialTouchX: Double = js.native
  var initialTouchY: Double = js.native
  var inputIsHiddenAfterUpdate: Boolean | Null = js.native
  var inputRef: ElRef = js.native
  var instancePrefix: String = js.native
  var menuListRef: ElRef = js.native
  var openAfterFocus: Boolean = js.native
  var scrollToFocusedOptionOnUpdate: Boolean = js.native
  var userIsDragging: Boolean | Null = js.native
  def announceAriaLiveContext(props: AnonEvent): Unit = js.native
  // ==============================
  // Helpers
  // ==============================
  def announceAriaLiveSelection(props: AnonContext): Unit = js.native
  def blur(): Unit = js.native
  def blurInput(): Unit = js.native
  // ==============================
  // Menu Options
  // ==============================
  def buildMenuOptions(props: Props[OptionType], selectValue: OptionsType[OptionType]): MenuOptions[OptionType] = js.native
  // Lifecycle
  // ------------------------------
  def cacheComponents(components: SelectComponents[OptionType]): Unit = js.native
  def clearValue(): Unit = js.native
  // ==============================
  // Renderers
  // ==============================
  def constructAriaLiveMessage(): String = js.native
  def countOptions(): Double = js.native
  def filterOption(option: js.Object, inputValue: String): Boolean = js.native
  // aliased for consumers
  def focus(): Unit = js.native
  // ==============================
  // Methods
  // ==============================
  def focusInput(): Unit = js.native
  def focusOption(direction: FocusDirection): Unit = js.native
  @JSName("focusValue")
  def focusValue_next(direction: next): Unit = js.native
  @JSName("focusValue")
  def focusValue_previous(direction: previous): Unit = js.native
  def formatOptionLabel(data: OptionType, context: FormatOptionLabelContext): Node = js.native
  def getActiveDescendentId(): js.Any = js.native
  // ==============================
  // Getters
  // ==============================
  def getCommonProps(): AnonClearValue[OptionType] = js.native
  def getControlRef(ref: HTMLElement): Unit = js.native
  @JSName("getElementId")
  def getElementId_group(element: group): String = js.native
  @JSName("getElementId")
  def getElementId_input(element: input): String = js.native
  @JSName("getElementId")
  def getElementId_listbox(element: listbox): String = js.native
  @JSName("getElementId")
  def getElementId_option(element: option): String = js.native
  def getFocusedOptionRef(ref: HTMLElement): Unit = js.native
  def getInputRef(ref: HTMLElement): Unit = js.native
  def getMenuListRef(ref: HTMLElement): Unit = js.native
  def getNextFocusedOption(options: OptionsType[OptionType]): OptionType = js.native
  def getNextFocusedValue(nextSelectValue: OptionsType[OptionType]): OptionType = js.native
  def getStyles(key: String, props: js.Object): js.Object = js.native
  // ==============================
  // Focus Handlers
  // ==============================
  def handleInputChange(event: ReactKeyboardEventFrom[HTMLInputElement]): Unit = js.native
  def hasOptions(): Boolean = js.native
  def hasValue(): Boolean = js.native
  def isClearable(): Boolean = js.native
  def isOptionDisabled(option: OptionType, selectValue: OptionsType[OptionType]): Boolean = js.native
  def isOptionSelected(option: OptionType, selectValue: OptionsType[OptionType]): Boolean = js.native
  def onClearIndicatorMouseDown(event: MouseOrTouchEvent): Unit = js.native
  def onClearIndicatorTouchEnd(event: ReactTouchEventFrom[HTMLElement]): Unit = js.native
  def onCompositionEnd(): Unit = js.native
  def onCompositionStart(): Unit = js.native
  def onControlMouseDown(event: MouseOrTouchEvent): Unit = js.native
  def onControlTouchEnd(event: ReactTouchEventFrom[HTMLElement]): Unit = js.native
  def onDropdownIndicatorMouseDown(event: MouseOrTouchEvent): Unit = js.native
  def onDropdownIndicatorTouchEnd(event: ReactTouchEventFrom[HTMLElement]): Unit = js.native
  def onInputBlur(event: ReactFocusEventFrom[HTMLInputElement]): Unit = js.native
  def onInputChange(newValue: String, actionMeta: InputActionMeta): Unit = js.native
  def onInputFocus(event: ReactFocusEventFrom[HTMLInputElement]): Unit = js.native
  // ==============================
  // Keyboard Handlers
  // ==============================
  def onKeyDown(event: ReactKeyboardEventFrom[HTMLElement]): Unit = js.native
  def onMenuClose(): Unit = js.native
  // ==============================
  // Mouse Handlers
  // ==============================
  def onMenuMouseDown(event: ReactMouseEventFrom[HTMLElement]): Unit = js.native
  def onMenuMouseMove(event: ReactMouseEventFrom[HTMLElement]): Unit = js.native
  // ==============================
  // Consumer Handlers
  // ==============================
  def onMenuOpen(): Unit = js.native
  def onOptionHover(focusedOption: OptionType): Unit = js.native
  def onScroll(event: Event_): Unit = js.native
  def onTouchEnd(event: TouchEvent): Unit = js.native
  def onTouchMove(event: TouchEvent): Unit = js.native
  def onTouchStart(event: TouchEvent): Unit = js.native
  @JSName("openMenu")
  def openMenu_first(focusOption: first): Unit = js.native
  @JSName("openMenu")
  def openMenu_last(focusOption: last): Unit = js.native
  def popValue(): Unit = js.native
  def removeValue(removedValue: OptionType): Unit = js.native
  def renderClearIndicator(): Node = js.native
  def renderDropdownIndicator(): Node = js.native
  def renderFormField(): Node = js.native
  def renderIndicatorSeparator(): Node = js.native
  def renderInput(): Node = js.native
  def renderLiveRegion(): Node = js.native
  def renderLoadingIndicator(): Node = js.native
  def renderMenu(): Node = js.native
  def renderPlaceholderOrValue(): PlaceholderOrValue[OptionType] | Null = js.native
  def selectOption(newValue: OptionType): Unit = js.native
  def setValue(newValue: ValueType[OptionType], action: ActionTypes): Unit = js.native
  def setValue(newValue: ValueType[OptionType], action: ActionTypes, option: OptionType): Unit = js.native
  def shouldHideSelectedOptions(): Boolean = js.native
  // ==============================
  // Composition Handlers
  // ==============================
  def startListeningComposition(): Unit = js.native
  // ==============================
  // Touch Handlers
  // ==============================
  def startListeningToTouch(): Unit = js.native
  def stopListeningComposition(): Unit = js.native
  def stopListeningToTouch(): Unit = js.native
}

