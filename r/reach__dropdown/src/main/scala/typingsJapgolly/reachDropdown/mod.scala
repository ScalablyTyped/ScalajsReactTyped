package typingsJapgolly.reachDropdown

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reachDescendants.mod.Descendant
import typingsJapgolly.reachDropdown.anon.Data
import typingsJapgolly.reachDropdown.anon.DataControls
import typingsJapgolly.reachDropdown.anon.DataProps
import typingsJapgolly.reachDropdown.anon.DropdownContextValueisOpe
import typingsJapgolly.reachDropdown.anon.Index
import typingsJapgolly.reachDropdown.anon.Props
import typingsJapgolly.reachDropdown.anon.Ref
import typingsJapgolly.reachDropdown.anon.RefForwardedRef
import typingsJapgolly.reachDropdown.anon.X
import typingsJapgolly.reachDropdown.reachDropdownStrings.button
import typingsJapgolly.reachDropdown.reachDropdownStrings.div
import typingsJapgolly.reachPolymorphic.mod.ForwardRefComponent
import typingsJapgolly.reachPopover.mod.Position
import typingsJapgolly.react.mod.ComponentPropsWithoutRef
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/dropdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * DropdownItem
    */
  @JSImport("@reach/dropdown", "DropdownItem")
  @js.native
  val DropdownItem: ForwardRefComponent[div, DropdownItemProps] = js.native
  
  /**
    * DropdownItem
    */
  @JSImport("@reach/dropdown", "DropdownItems")
  @js.native
  val DropdownItems: ForwardRefComponent[div, DropdownItemsProps] = js.native
  
  @JSImport("@reach/dropdown", "DropdownPopover")
  @js.native
  val DropdownPopover: ForwardRefComponent[div, DropdownPopoverProps] = js.native
  
  @JSImport("@reach/dropdown", "DropdownProvider")
  @js.native
  val DropdownProvider: FC[DropdownProviderProps] = js.native
  
  @JSImport("@reach/dropdown", "DropdownTrigger")
  @js.native
  val DropdownTrigger: ForwardRefComponent[button, DropdownTriggerProps] = js.native
  
  inline def useDropdownContext(callerComponentName: String): InternalDropdownContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownContext")(callerComponentName.asInstanceOf[js.Any]).asInstanceOf[InternalDropdownContextValue]
  
  inline def useDropdownDescendants(): js.Array[DropdownDescendant] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownDescendants")().asInstanceOf[js.Array[DropdownDescendant]]
  
  inline def useDropdownItem_div(
    hasIndexPropIsLinkOnClickOnDragStartOnMouseDownOnMouseEnterOnMouseLeaveOnMouseMoveOnMouseUpOnSelectDisabledOnFocusValueTextPropForwardedRefProps: DropdownItemProps & ComponentPropsWithoutRef[div] & Ref
  ): Data = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownItem")(hasIndexPropIsLinkOnClickOnDragStartOnMouseDownOnMouseEnterOnMouseLeaveOnMouseMoveOnMouseUpOnSelectDisabledOnFocusValueTextPropForwardedRefProps.asInstanceOf[js.Any]).asInstanceOf[Data]
  
  inline def useDropdownItems_div(hasIdOnKeyDownForwardedRefProps: DropdownItemsProps & ComponentPropsWithoutRef[div] & Ref): Props = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownItems")(hasIdOnKeyDownForwardedRefProps.asInstanceOf[js.Any]).asInstanceOf[Props]
  
  inline def useDropdownPopover_div(
    hasOnBlurPortalPositionForwardedRefProps: DropdownPopoverProps & ComponentPropsWithoutRef[div] & Ref
  ): DataProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownPopover")(hasOnBlurPortalPositionForwardedRefProps.asInstanceOf[js.Any]).asInstanceOf[DataProps]
  
  inline def useDropdownTrigger_button(
    hasOnKeyDownOnMouseDownIdForwardedRefProps: DropdownTriggerProps & ComponentPropsWithoutRef[button] & RefForwardedRef
  ): DataControls = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropdownTrigger")(hasOnKeyDownOnMouseDownIdForwardedRefProps.asInstanceOf[js.Any]).asInstanceOf[DataControls]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reachDropdown.anon.Type
    - typingsJapgolly.reachDropdown.anon.`0`
    - typingsJapgolly.reachDropdown.anon.`1`
    - typingsJapgolly.reachDropdown.anon.Payload
    - typingsJapgolly.reachDropdown.anon.`2`
    - typingsJapgolly.reachDropdown.anon.PayloadType
    - typingsJapgolly.reachDropdown.anon.`3`
    - typingsJapgolly.reachDropdown.anon.PayloadString
    - typingsJapgolly.reachDropdown.anon.PayloadStringType
  */
  trait DropdownAction extends StObject
  object DropdownAction {
    
    inline def `0`(): typingsJapgolly.reachDropdown.anon.`0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("CLOSE_MENU")
      __obj.asInstanceOf[typingsJapgolly.reachDropdown.anon.`0`]
    }
    
    inline def `1`(): typingsJapgolly.reachDropdown.anon.`1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("OPEN_MENU_AT_FIRST_ITEM")
      __obj.asInstanceOf[typingsJapgolly.reachDropdown.anon.`1`]
    }
    
    inline def `2`(): typingsJapgolly.reachDropdown.anon.`2` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("OPEN_MENU_CLEARED")
      __obj.asInstanceOf[typingsJapgolly.reachDropdown.anon.`2`]
    }
    
    inline def `3`(): typingsJapgolly.reachDropdown.anon.`3` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("CLEAR_SELECTION_INDEX")
      __obj.asInstanceOf[typingsJapgolly.reachDropdown.anon.`3`]
    }
    
    inline def Payload(payload: Index): typingsJapgolly.reachDropdown.anon.Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("OPEN_MENU_AT_INDEX")
      __obj.asInstanceOf[typingsJapgolly.reachDropdown.anon.Payload]
    }
    
    inline def PayloadString(payload: String): typingsJapgolly.reachDropdown.anon.PayloadString = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SET_BUTTON_ID")
      __obj.asInstanceOf[typingsJapgolly.reachDropdown.anon.PayloadString]
    }
    
    inline def PayloadStringType(payload: String): typingsJapgolly.reachDropdown.anon.PayloadStringType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SEARCH_FOR_ITEM")
      __obj.asInstanceOf[typingsJapgolly.reachDropdown.anon.PayloadStringType]
    }
    
    inline def PayloadType(payload: typingsJapgolly.reachDropdown.anon.DropdownRef): typingsJapgolly.reachDropdown.anon.PayloadType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SELECT_ITEM_AT_INDEX")
      __obj.asInstanceOf[typingsJapgolly.reachDropdown.anon.PayloadType]
    }
    
    inline def Type(): typingsJapgolly.reachDropdown.anon.Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("CLICK_MENU_ITEM")
      __obj.asInstanceOf[typingsJapgolly.reachDropdown.anon.Type]
    }
  }
  
  trait DropdownContextValue extends StObject {
    
    var isExpanded: Boolean
  }
  object DropdownContextValue {
    
    inline def apply(isExpanded: Boolean): DropdownContextValue = {
      val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownContextValue]
    }
    
    extension [Self <: DropdownContextValue](x: Self) {
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropdownDescendant
    extends StObject
       with Descendant[HTMLElement] {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var isLink: Boolean
    
    var key: String
  }
  object DropdownDescendant {
    
    inline def apply(index: Double, isLink: Boolean, key: String): DropdownDescendant = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isLink = isLink.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], element = null)
      __obj.asInstanceOf[DropdownDescendant]
    }
    
    extension [Self <: DropdownDescendant](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIsLink(value: Boolean): Self = StObject.set(x, "isLink", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropdownItemProps extends StObject {
    
    var children: Node
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var isLink: js.UndefOr[Boolean] = js.undefined
    
    def onSelect(): Unit
    
    var valueText: js.UndefOr[String] = js.undefined
  }
  object DropdownItemProps {
    
    inline def apply(onSelect: Callback): DropdownItemProps = {
      val __obj = js.Dynamic.literal(onSelect = onSelect.toJsFn, children = null)
      __obj.asInstanceOf[DropdownItemProps]
    }
    
    extension [Self <: DropdownItemProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsLink(value: Boolean): Self = StObject.set(x, "isLink", value.asInstanceOf[js.Any])
      
      inline def setIsLinkUndefined: Self = StObject.set(x, "isLink", js.undefined)
      
      inline def setOnSelect(value: Callback): Self = StObject.set(x, "onSelect", value.toJsFn)
      
      inline def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
      
      inline def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    }
  }
  
  trait DropdownItemsProps extends StObject {
    
    var children: Node
  }
  object DropdownItemsProps {
    
    inline def apply(): DropdownItemsProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[DropdownItemsProps]
    }
    
    extension [Self <: DropdownItemsProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait DropdownPopoverProps extends StObject {
    
    var children: Node
    
    var portal: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
  }
  object DropdownPopoverProps {
    
    inline def apply(): DropdownPopoverProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[DropdownPopoverProps]
    }
    
    extension [Self <: DropdownPopoverProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPortal(value: Boolean): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  trait DropdownProviderProps extends StObject {
    
    var children: Node | (js.Function1[/* props */ DropdownContextValueisOpe, Node])
    
    var id: js.UndefOr[String] = js.undefined
  }
  object DropdownProviderProps {
    
    inline def apply(): DropdownProviderProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[DropdownProviderProps]
    }
    
    extension [Self <: DropdownProviderProps](x: Self) {
      
      inline def setChildren(value: Node | (js.Function1[/* props */ DropdownContextValueisOpe, Node])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ DropdownContextValueisOpe => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  type DropdownRef = RefHandle[Null | HTMLElement]
  
  trait DropdownState extends StObject {
    
    var isExpanded: Boolean
    
    var selectionIndex: Double
    
    var triggerId: Null | String
    
    var typeaheadQuery: String
  }
  object DropdownState {
    
    inline def apply(isExpanded: Boolean, selectionIndex: Double, typeaheadQuery: String): DropdownState = {
      val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any], selectionIndex = selectionIndex.asInstanceOf[js.Any], typeaheadQuery = typeaheadQuery.asInstanceOf[js.Any], triggerId = null)
      __obj.asInstanceOf[DropdownState]
    }
    
    extension [Self <: DropdownState](x: Self) {
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setSelectionIndex(value: Double): Self = StObject.set(x, "selectionIndex", value.asInstanceOf[js.Any])
      
      inline def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
      
      inline def setTriggerIdNull: Self = StObject.set(x, "triggerId", null)
      
      inline def setTypeaheadQuery(value: String): Self = StObject.set(x, "typeaheadQuery", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropdownTriggerProps extends StObject {
    
    var children: Node
  }
  object DropdownTriggerProps {
    
    inline def apply(): DropdownTriggerProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[DropdownTriggerProps]
    }
    
    extension [Self <: DropdownTriggerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait InternalDropdownContextValue extends StObject {
    
    var dispatch: Dispatch[DropdownAction]
    
    var dropdownId: js.UndefOr[String] = js.undefined
    
    var dropdownRef: RefHandle[Null | HTMLElement]
    
    var mouseDownStartPosRef: MutableRefObject[X]
    
    var popoverRef: RefHandle[Null | HTMLElement]
    
    var readyToSelect: MutableRefObject[Boolean]
    
    var selectCallbacks: MutableRefObject[js.Array[js.Function0[Unit]]]
    
    var state: DropdownState
    
    var triggerClickedRef: MutableRefObject[Boolean]
    
    var triggerRef: RefHandle[Null | HTMLElement]
  }
  object InternalDropdownContextValue {
    
    inline def apply(
      dispatch: DropdownAction => Callback,
      dropdownRef: RefHandle[Null | HTMLElement],
      mouseDownStartPosRef: MutableRefObject[X],
      popoverRef: RefHandle[Null | HTMLElement],
      readyToSelect: MutableRefObject[Boolean],
      selectCallbacks: MutableRefObject[js.Array[js.Function0[Unit]]],
      state: DropdownState,
      triggerClickedRef: MutableRefObject[Boolean],
      triggerRef: RefHandle[Null | HTMLElement]
    ): InternalDropdownContextValue = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1((t0: DropdownAction) => dispatch(t0).runNow()), dropdownRef = dropdownRef.asInstanceOf[js.Any], mouseDownStartPosRef = mouseDownStartPosRef.asInstanceOf[js.Any], popoverRef = popoverRef.asInstanceOf[js.Any], readyToSelect = readyToSelect.asInstanceOf[js.Any], selectCallbacks = selectCallbacks.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], triggerClickedRef = triggerClickedRef.asInstanceOf[js.Any], triggerRef = triggerRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalDropdownContextValue]
    }
    
    extension [Self <: InternalDropdownContextValue](x: Self) {
      
      inline def setDispatch(value: DropdownAction => Callback): Self = StObject.set(x, "dispatch", js.Any.fromFunction1((t0: DropdownAction) => value(t0).runNow()))
      
      inline def setDropdownId(value: String): Self = StObject.set(x, "dropdownId", value.asInstanceOf[js.Any])
      
      inline def setDropdownIdUndefined: Self = StObject.set(x, "dropdownId", js.undefined)
      
      inline def setDropdownRef(value: RefHandle[Null | HTMLElement]): Self = StObject.set(x, "dropdownRef", value.asInstanceOf[js.Any])
      
      inline def setMouseDownStartPosRef(value: MutableRefObject[X]): Self = StObject.set(x, "mouseDownStartPosRef", value.asInstanceOf[js.Any])
      
      inline def setPopoverRef(value: RefHandle[Null | HTMLElement]): Self = StObject.set(x, "popoverRef", value.asInstanceOf[js.Any])
      
      inline def setReadyToSelect(value: MutableRefObject[Boolean]): Self = StObject.set(x, "readyToSelect", value.asInstanceOf[js.Any])
      
      inline def setSelectCallbacks(value: MutableRefObject[js.Array[js.Function0[Unit]]]): Self = StObject.set(x, "selectCallbacks", value.asInstanceOf[js.Any])
      
      inline def setState(value: DropdownState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTriggerClickedRef(value: MutableRefObject[Boolean]): Self = StObject.set(x, "triggerClickedRef", value.asInstanceOf[js.Any])
      
      inline def setTriggerRef(value: RefHandle[Null | HTMLElement]): Self = StObject.set(x, "triggerRef", value.asInstanceOf[js.Any])
    }
  }
  
  type PopoverRef = RefHandle[Null | HTMLElement]
  
  type TriggerRef = RefHandle[Null | HTMLElement]
}
