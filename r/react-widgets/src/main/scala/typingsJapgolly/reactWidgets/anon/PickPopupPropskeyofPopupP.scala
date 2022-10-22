package typingsJapgolly.reactWidgets.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Key
import typingsJapgolly.reactTransitionGroup.transitionMod.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-widgets.react-widgets/esm/Popup.PopupProps, keyof react-widgets.react-widgets/esm/Popup.PopupProps> & react.react.RefAttributes<std.HTMLDivElement> */
trait PickPopupPropskeyofPopupP extends StObject {
  
  var children: Node
  
  var className: js.UndefOr[String] = js.undefined
  
  var dropUp: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[Key | Null] = js.undefined
  
  var onEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onEntered: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onEntering: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onExit: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onExited: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onExiting: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var ref: js.UndefOr[typingsJapgolly.react.mod.Ref[HTMLDivElement]] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var transition: js.UndefOr[ComponentType[TransitionProps[Unit]]] = js.undefined
}
object PickPopupPropskeyofPopupP {
  
  inline def apply(): PickPopupPropskeyofPopupP = {
    val __obj = js.Dynamic.literal(children = null)
    __obj.asInstanceOf[PickPopupPropskeyofPopupP]
  }
  
  extension [Self <: PickPopupPropskeyofPopupP](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDropUp(value: Boolean): Self = StObject.set(x, "dropUp", value.asInstanceOf[js.Any])
    
    inline def setDropUpUndefined: Self = StObject.set(x, "dropUp", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOnEnter(value: Callback): Self = StObject.set(x, "onEnter", value.toJsFn)
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnEntered(value: Callback): Self = StObject.set(x, "onEntered", value.toJsFn)
    
    inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
    
    inline def setOnEntering(value: Callback): Self = StObject.set(x, "onEntering", value.toJsFn)
    
    inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
    
    inline def setOnExit(value: Callback): Self = StObject.set(x, "onExit", value.toJsFn)
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnExited(value: Callback): Self = StObject.set(x, "onExited", value.toJsFn)
    
    inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
    
    inline def setOnExiting(value: Callback): Self = StObject.set(x, "onExiting", value.toJsFn)
    
    inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setRef(value: typingsJapgolly.react.mod.Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setTransition(value: ComponentType[TransitionProps[Unit]]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
