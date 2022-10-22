package typingsJapgolly.reactMdMenu

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactMdMenu.anon.ReadonlyMenuVisibilityCon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuVisibilityProviderMod {
  
  @JSImport("@react-md/menu/types/MenuVisibilityProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MenuVisibilityProvider(hasVisibleSetVisibleChildren: MenuVisibilityProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuVisibilityProvider")(hasVisibleSetVisibleChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useMenuVisibility(): ReadonlyMenuVisibilityCon = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuVisibility")().asInstanceOf[ReadonlyMenuVisibilityCon]
  
  /* Inlined std.Pick<@react-md/utils.@react-md/utils.HoverModeHookReturnValue, 'visible' | 'setVisible'> */
  trait MenuVisibilityContext extends StObject {
    
    var setVisible: Dispatch[SetStateAction[Boolean]]
    
    var visible: Boolean
  }
  object MenuVisibilityContext {
    
    inline def apply(setVisible: SetStateAction[Boolean] => Callback, visible: Boolean): MenuVisibilityContext = {
      val __obj = js.Dynamic.literal(setVisible = js.Any.fromFunction1((t0: SetStateAction[Boolean]) => setVisible(t0).runNow()), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuVisibilityContext]
    }
    
    extension [Self <: MenuVisibilityContext](x: Self) {
      
      inline def setSetVisible(value: SetStateAction[Boolean] => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: SetStateAction[Boolean]) => value(t0).runNow()))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait MenuVisibilityProviderProps
    extends StObject
       with MenuVisibilityContext {
    
    var children: Node
  }
  object MenuVisibilityProviderProps {
    
    inline def apply(setVisible: SetStateAction[Boolean] => Callback, visible: Boolean): MenuVisibilityProviderProps = {
      val __obj = js.Dynamic.literal(setVisible = js.Any.fromFunction1((t0: SetStateAction[Boolean]) => setVisible(t0).runNow()), visible = visible.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[MenuVisibilityProviderProps]
    }
    
    extension [Self <: MenuVisibilityProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
