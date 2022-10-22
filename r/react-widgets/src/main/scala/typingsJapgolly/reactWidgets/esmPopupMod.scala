package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.reactTransitionGroup.transitionMod.TransitionProps
import typingsJapgolly.reactWidgets.anon.PickPopupPropskeyofPopupP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPopupMod extends Shortcut {
  
  @JSImport("react-widgets/esm/Popup", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PickPopupPropskeyofPopupP] = js.native
  
  @JSImport("react-widgets/esm/Popup", "StaticContainer")
  @js.native
  val StaticContainer: MemoExoticComponent[js.Function1[/* hasChildren */ StaticContainerProps, Element]] = js.native
  
  trait PopupProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var children: Node
    
    var className: js.UndefOr[String] = js.undefined
    
    var dropUp: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onEntered: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onEntering: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExited: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExiting: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var transition: js.UndefOr[ComponentType[TransitionProps[Unit]]] = js.undefined
  }
  object PopupProps {
    
    inline def apply(): PopupProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[PopupProps]
    }
    
    extension [Self <: PopupProps](x: Self) {
      
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
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTransition(value: ComponentType[TransitionProps[Unit]]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  trait StaticContainerProps extends StObject {
    
    var children: Node
    
    var shouldUpdate: js.UndefOr[Boolean] = js.undefined
  }
  object StaticContainerProps {
    
    inline def apply(): StaticContainerProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[StaticContainerProps]
    }
    
    extension [Self <: StaticContainerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setShouldUpdate(value: Boolean): Self = StObject.set(x, "shouldUpdate", value.asInstanceOf[js.Any])
      
      inline def setShouldUpdateUndefined: Self = StObject.set(x, "shouldUpdate", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PickPopupPropskeyofPopupP]
  
  /* This means you don't have to write `default`, but can instead just say `esmPopupMod.foo` */
  override def _to: ForwardRefExoticComponent[PickPopupPropskeyofPopupP] = default
}
