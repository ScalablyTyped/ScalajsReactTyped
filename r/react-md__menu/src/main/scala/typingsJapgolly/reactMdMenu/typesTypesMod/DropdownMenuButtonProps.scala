package typingsJapgolly.reactMdMenu.typesTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionEnterHandler
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionExitHandler
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.reactMdMenu.typesTypesMod.MenuTransitionProps because var conflicts: className. Inlined onExit, onExited, exit, onEnter, onExiting, onEntered, appear, enter, onEntering, timeout, temporary, classNames
- typingsJapgolly.reactMdMenu.typesTypesMod.BaseDropdownMenuProps because var conflicts: className. Inlined  */ trait DropdownMenuButtonProps
  extends StObject
     with BaseMenuButtonProps
     with MenuListProps
     with DropdownMenuProps
     with DropdownMenuConfigurationProps
     with BaseMenuRendererProps {
  
  var appear: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The children to display in the button. This should normally be text or an
    * icon.
    *
    * Note: If this is an icon, set the {@link buttonType} to `"icon"` to get the
    * correct styling and remove the dropdown icon.
    */
  var buttonChildren: Node
  
  var classNames: js.UndefOr[CSSTransitionClassNames] = js.undefined
  
  var enter: js.UndefOr[Boolean] = js.undefined
  
  var exit: js.UndefOr[Boolean] = js.undefined
  
  var onEnter: js.UndefOr[TransitionEnterHandler] = js.undefined
  
  var onEntered: js.UndefOr[TransitionEnterHandler] = js.undefined
  
  var onEntering: js.UndefOr[TransitionEnterHandler] = js.undefined
  
  var onExit: js.UndefOr[TransitionExitHandler] = js.undefined
  
  var onExited: js.UndefOr[TransitionExitHandler] = js.undefined
  
  var onExiting: js.UndefOr[TransitionExitHandler] = js.undefined
  
  var temporary: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[TransitionTimeout] = js.undefined
}
object DropdownMenuButtonProps {
  
  inline def apply(id: String): DropdownMenuButtonProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], buttonChildren = null)
    __obj.asInstanceOf[DropdownMenuButtonProps]
  }
  
  extension [Self <: DropdownMenuButtonProps](x: Self) {
    
    inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
    
    inline def setButtonChildren(value: VdomNode): Self = StObject.set(x, "buttonChildren", value.rawNode.asInstanceOf[js.Any])
    
    inline def setButtonChildrenNull: Self = StObject.set(x, "buttonChildren", null)
    
    inline def setButtonChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "buttonChildren", js.Array(value*))
    
    inline def setButtonChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "buttonChildren", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    inline def setOnEnter(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEnter", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnEntered(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEntered", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
    
    inline def setOnEntering(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEntering", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
    
    inline def setOnExit(value: Callback): Self = StObject.set(x, "onExit", value.toJsFn)
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnExited(value: Callback): Self = StObject.set(x, "onExited", value.toJsFn)
    
    inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
    
    inline def setOnExiting(value: Callback): Self = StObject.set(x, "onExiting", value.toJsFn)
    
    inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
    
    inline def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
    
    inline def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
    
    inline def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
