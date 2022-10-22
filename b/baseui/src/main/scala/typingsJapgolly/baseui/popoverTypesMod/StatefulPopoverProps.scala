package typingsJapgolly.baseui.popoverTypesMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.anon.`253`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulPopoverProps
  extends StObject
     with BasePopoverProps {
  
  /** Content that should trigger the popover to be shown (also acts as the anchor against
    * which the popover will be positioned).
    */
  var children: Node
  
  /** Content to render within the popover when it's shown. */
  var content: Node | StatefulContentRenderProp
  
  /** Whether to hide the popover when the user clicks anywhere outside the trigger/popover. */
  var dismissOnClickOutside: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to hide the popover when the user presses the escape key. */
  var dismissOnEsc: js.UndefOr[Boolean] = js.undefined
  
  /** Initial state populated into the component */
  var initialState: js.UndefOr[State] = js.undefined
  
  /** Event handler when popover is hidden. */
  var onClose: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** Event handler when popover is shown. */
  var onOpen: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** Reducer function to manipulate internal state updates. */
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}
object StatefulPopoverProps {
  
  inline def apply(): StatefulPopoverProps = {
    val __obj = js.Dynamic.literal(children = null, content = null)
    __obj.asInstanceOf[StatefulPopoverProps]
  }
  
  extension [Self <: StatefulPopoverProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setContent(value: Node | StatefulContentRenderProp): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction1(value: /* a */ `253` => Node): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDismissOnClickOutside(value: Boolean): Self = StObject.set(x, "dismissOnClickOutside", value.asInstanceOf[js.Any])
    
    inline def setDismissOnClickOutsideUndefined: Self = StObject.set(x, "dismissOnClickOutside", js.undefined)
    
    inline def setDismissOnEsc(value: Boolean): Self = StObject.set(x, "dismissOnEsc", value.asInstanceOf[js.Any])
    
    inline def setDismissOnEscUndefined: Self = StObject.set(x, "dismissOnEsc", js.undefined)
    
    inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setOnClose(value: CallbackTo[Any]): Self = StObject.set(x, "onClose", value.toJsFn)
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnOpen(value: CallbackTo[Any]): Self = StObject.set(x, "onOpen", value.toJsFn)
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setStateReducer(
      value: (/* stateChangeType */ StateChangeType, /* nextState */ State, /* currentState */ State) => State
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
  }
}
