package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.anon.NewIndex
import typingsJapgolly.baseui.anon.NewState
import typingsJapgolly.baseui.anon.OmitListPropschildren
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.baseui.helpersOverridesMod.Override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dndListTypesMod {
  
  trait ListOverrides extends StObject {
    
    var CloseHandle: js.UndefOr[Override[Any]] = js.undefined
    
    var DragHandle: js.UndefOr[Override[Any]] = js.undefined
    
    var Item: js.UndefOr[Override[Any]] = js.undefined
    
    var Label: js.UndefOr[Override[Any]] = js.undefined
    
    var List: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object ListOverrides {
    
    inline def apply(): ListOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOverrides]
    }
    
    extension [Self <: ListOverrides](x: Self) {
      
      inline def setCloseHandle(value: Override[Any]): Self = StObject.set(x, "CloseHandle", value.asInstanceOf[js.Any])
      
      inline def setCloseHandleUndefined: Self = StObject.set(x, "CloseHandle", js.undefined)
      
      inline def setDragHandle(value: Override[Any]): Self = StObject.set(x, "DragHandle", value.asInstanceOf[js.Any])
      
      inline def setDragHandleUndefined: Self = StObject.set(x, "DragHandle", js.undefined)
      
      inline def setItem(value: Override[Any]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setLabel(value: Override[Any]): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
      
      inline def setList(value: Override[Any]): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "List", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait ListProps extends StObject {
    
    /** Items (labels) to be rendered */
    var items: js.Array[Node]
    
    /** Handler for when drag and drop is finished and order changed or item is deleted (newIndex would be -1 in that case) */
    def onChange(a: NewIndex): Any
    
    var overrides: js.UndefOr[ListOverrides] = js.undefined
    
    /** Set if the list items should be removable */
    var removable: js.UndefOr[Boolean] = js.undefined
    
    /** Set if the list items should be removable by dragging them far left or right */
    var removableByMove: js.UndefOr[Boolean] = js.undefined
  }
  object ListProps {
    
    inline def apply(items: js.Array[Node], onChange: NewIndex => Any): ListProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[ListProps]
    }
    
    extension [Self <: ListProps](x: Self) {
      
      inline def setItems(value: js.Array[Node]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Node*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnChange(value: NewIndex => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOverrides(value: ListOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      inline def setRemovableByMove(value: Boolean): Self = StObject.set(x, "removableByMove", value.asInstanceOf[js.Any])
      
      inline def setRemovableByMoveUndefined: Self = StObject.set(x, "removableByMove", js.undefined)
      
      inline def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
    }
  }
  
  trait SharedStylePropsArg extends StObject {
    
    @JSName("$index")
    var $index: Double
    
    @JSName("$isDragged")
    var $isDragged: Boolean
    
    @JSName("$isFocusVisible")
    var $isFocusVisible: Boolean
    
    @JSName("$isOutOfBounds")
    var $isOutOfBounds: Boolean
    
    @JSName("$isRemovable")
    var $isRemovable: Boolean
    
    @JSName("$isRemovableByMove")
    var $isRemovableByMove: Boolean
    
    @JSName("$isSelected")
    var $isSelected: Boolean
    
    @JSName("$value")
    var $value: Node
  }
  object SharedStylePropsArg {
    
    inline def apply(
      $index: Double,
      $isDragged: Boolean,
      $isFocusVisible: Boolean,
      $isOutOfBounds: Boolean,
      $isRemovable: Boolean,
      $isRemovableByMove: Boolean,
      $isSelected: Boolean
    ): SharedStylePropsArg = {
      val __obj = js.Dynamic.literal($index = $index.asInstanceOf[js.Any], $isDragged = $isDragged.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isOutOfBounds = $isOutOfBounds.asInstanceOf[js.Any], $isRemovable = $isRemovable.asInstanceOf[js.Any], $isRemovableByMove = $isRemovableByMove.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any], $value = null)
      __obj.asInstanceOf[SharedStylePropsArg]
    }
    
    extension [Self <: SharedStylePropsArg](x: Self) {
      
      inline def set$index(value: Double): Self = StObject.set(x, "$index", value.asInstanceOf[js.Any])
      
      inline def set$isDragged(value: Boolean): Self = StObject.set(x, "$isDragged", value.asInstanceOf[js.Any])
      
      inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def set$isOutOfBounds(value: Boolean): Self = StObject.set(x, "$isOutOfBounds", value.asInstanceOf[js.Any])
      
      inline def set$isRemovable(value: Boolean): Self = StObject.set(x, "$isRemovable", value.asInstanceOf[js.Any])
      
      inline def set$isRemovableByMove(value: Boolean): Self = StObject.set(x, "$isRemovableByMove", value.asInstanceOf[js.Any])
      
      inline def set$isSelected(value: Boolean): Self = StObject.set(x, "$isSelected", value.asInstanceOf[js.Any])
      
      inline def set$value(value: VdomNode): Self = StObject.set(x, "$value", value.rawNode.asInstanceOf[js.Any])
      
      inline def set$valueNull: Self = StObject.set(x, "$value", null)
      
      inline def set$valueVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "$value", js.Array(value*))
      
      inline def set$valueVdomElement(value: VdomElement): Self = StObject.set(x, "$value", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var items: js.Array[Node]
  }
  object State {
    
    inline def apply(items: js.Array[Node]): State = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setItems(value: js.Array[Node]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Node*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  /* Inlined { readonly change :'change'}[keyof { readonly change :'change'}] */
  type StateChangeType = change_
  
  type StateReducer = js.Function3[
    /* stateChangeType */ StateChangeType, 
    /* nextState */ State, 
    /* currentState */ State, 
    State
  ]
  
  /* Inlined std.Omit<baseui.baseui/dnd-list/types.StatefulListProps, 'children'> & {  initialState :baseui.baseui/dnd-list/types.State | undefined, children (props : std.Omit<baseui.baseui/dnd-list/types.ListProps, 'children'>): react.react.ReactNode} */
  trait StatefulComponentContainerProps extends StObject {
    
    def children(props: OmitListPropschildren): Node
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* params */ NewState, Any]] = js.undefined
    
    var overrides: js.UndefOr[ListOverrides] = js.undefined
    
    var removable: js.UndefOr[Boolean] = js.undefined
    
    var removableByMove: js.UndefOr[Boolean] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulComponentContainerProps {
    
    inline def apply(children: OmitListPropschildren => Node): StatefulComponentContainerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[StatefulComponentContainerProps]
    }
    
    extension [Self <: StatefulComponentContainerProps](x: Self) {
      
      inline def setChildren(value: OmitListPropschildren => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnChange(value: /* params */ NewState => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverrides(value: ListOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      inline def setRemovableByMove(value: Boolean): Self = StObject.set(x, "removableByMove", value.asInstanceOf[js.Any])
      
      inline def setRemovableByMoveUndefined: Self = StObject.set(x, "removableByMove", js.undefined)
      
      inline def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
      
      inline def setStateReducer(
        value: (/* stateChangeType */ StateChangeType, /* nextState */ State, /* currentState */ State) => State
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  trait StatefulListProps extends StObject {
    
    /** Initial state populated into the component */
    var initialState: js.UndefOr[State] = js.undefined
    
    /** Handler for when drag and drop is finished and order changed or item is deleted (newIndex would be -1 in that case) */
    var onChange: js.UndefOr[js.Function1[/* params */ NewState, Any]] = js.undefined
    
    var overrides: js.UndefOr[ListOverrides] = js.undefined
    
    /** Set if the list items should be removable */
    var removable: js.UndefOr[Boolean] = js.undefined
    
    /** Set if the list items should be removable by dragging them far left or right */
    var removableByMove: js.UndefOr[Boolean] = js.undefined
    
    /** Reducer function to manipulate internal state updates. */
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulListProps {
    
    inline def apply(): StatefulListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulListProps]
    }
    
    extension [Self <: StatefulListProps](x: Self) {
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnChange(value: /* params */ NewState => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverrides(value: ListOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      inline def setRemovableByMove(value: Boolean): Self = StObject.set(x, "removableByMove", value.asInstanceOf[js.Any])
      
      inline def setRemovableByMoveUndefined: Self = StObject.set(x, "removableByMove", js.undefined)
      
      inline def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
      
      inline def setStateReducer(
        value: (/* stateChangeType */ StateChangeType, /* nextState */ State, /* currentState */ State) => State
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
}
