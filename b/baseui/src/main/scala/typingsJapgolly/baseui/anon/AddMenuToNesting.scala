package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baseui.baseuiStrings.character
import typingsJapgolly.baseui.baseuiStrings.click
import typingsJapgolly.baseui.baseuiStrings.enter_
import typingsJapgolly.baseui.baseuiStrings.focus
import typingsJapgolly.baseui.baseuiStrings.mouseEnter
import typingsJapgolly.baseui.baseuiStrings.mouseLeave
import typingsJapgolly.baseui.baseuiStrings.moveDown
import typingsJapgolly.baseui.baseuiStrings.moveUp
import typingsJapgolly.baseui.baseuiStrings.reset
import typingsJapgolly.baseui.menuTypesMod.StateReducerFn
import typingsJapgolly.baseui.menuTypesMod.StatefulContainerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddMenuToNesting extends StObject {
  
  def addMenuToNesting(): Unit
  
  def children(): Any
  
  var forceHighlight: Boolean
  
  def getChildMenu(): Unit
  
  def getParentMenu(): Unit
  
  def getRequiredItemProps(): js.Object
  
  var initialState: HighlightedIndex
  
  def isNestedMenuVisible(): Boolean
  
  var keyboardControlNode: Current
  
  var nestedMenuHoverIndex: Double
  
  def onItemSelect(): Unit
  
  def removeMenuFromNesting(): Unit
  
  var stateReducer: StateReducerFn
  
  var typeAhead: Boolean
}
object AddMenuToNesting {
  
  inline def apply(
    addMenuToNesting: Callback,
    children: CallbackTo[Any],
    forceHighlight: Boolean,
    getChildMenu: Callback,
    getParentMenu: Callback,
    getRequiredItemProps: CallbackTo[js.Object],
    initialState: HighlightedIndex,
    isNestedMenuVisible: CallbackTo[Boolean],
    keyboardControlNode: Current,
    nestedMenuHoverIndex: Double,
    onItemSelect: Callback,
    removeMenuFromNesting: Callback,
    stateReducer: (/* changeType */ js.UndefOr[
      click | moveUp | moveDown | mouseEnter | mouseLeave | focus | reset | character | enter_ | Null
    ], /* changes */ PartialStatefulContainerS, /* currentState */ StatefulContainerState) => StatefulContainerState,
    typeAhead: Boolean
  ): AddMenuToNesting = {
    val __obj = js.Dynamic.literal(addMenuToNesting = addMenuToNesting.toJsFn, children = children.toJsFn, forceHighlight = forceHighlight.asInstanceOf[js.Any], getChildMenu = getChildMenu.toJsFn, getParentMenu = getParentMenu.toJsFn, getRequiredItemProps = getRequiredItemProps.toJsFn, initialState = initialState.asInstanceOf[js.Any], isNestedMenuVisible = isNestedMenuVisible.toJsFn, keyboardControlNode = keyboardControlNode.asInstanceOf[js.Any], nestedMenuHoverIndex = nestedMenuHoverIndex.asInstanceOf[js.Any], onItemSelect = onItemSelect.toJsFn, removeMenuFromNesting = removeMenuFromNesting.toJsFn, stateReducer = js.Any.fromFunction3(stateReducer), typeAhead = typeAhead.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddMenuToNesting]
  }
  
  extension [Self <: AddMenuToNesting](x: Self) {
    
    inline def setAddMenuToNesting(value: Callback): Self = StObject.set(x, "addMenuToNesting", value.toJsFn)
    
    inline def setChildren(value: CallbackTo[Any]): Self = StObject.set(x, "children", value.toJsFn)
    
    inline def setForceHighlight(value: Boolean): Self = StObject.set(x, "forceHighlight", value.asInstanceOf[js.Any])
    
    inline def setGetChildMenu(value: Callback): Self = StObject.set(x, "getChildMenu", value.toJsFn)
    
    inline def setGetParentMenu(value: Callback): Self = StObject.set(x, "getParentMenu", value.toJsFn)
    
    inline def setGetRequiredItemProps(value: CallbackTo[js.Object]): Self = StObject.set(x, "getRequiredItemProps", value.toJsFn)
    
    inline def setInitialState(value: HighlightedIndex): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setIsNestedMenuVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNestedMenuVisible", value.toJsFn)
    
    inline def setKeyboardControlNode(value: Current): Self = StObject.set(x, "keyboardControlNode", value.asInstanceOf[js.Any])
    
    inline def setNestedMenuHoverIndex(value: Double): Self = StObject.set(x, "nestedMenuHoverIndex", value.asInstanceOf[js.Any])
    
    inline def setOnItemSelect(value: Callback): Self = StObject.set(x, "onItemSelect", value.toJsFn)
    
    inline def setRemoveMenuFromNesting(value: Callback): Self = StObject.set(x, "removeMenuFromNesting", value.toJsFn)
    
    inline def setStateReducer(
      value: (/* changeType */ js.UndefOr[
          click | moveUp | moveDown | mouseEnter | mouseLeave | focus | reset | character | enter_ | Null
        ], /* changes */ PartialStatefulContainerS, /* currentState */ StatefulContainerState) => StatefulContainerState
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    inline def setTypeAhead(value: Boolean): Self = StObject.set(x, "typeAhead", value.asInstanceOf[js.Any])
  }
}
