package typingsJapgolly.reactMdMenu

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactMdMenu.typesTypesMod.MenuOrientationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuKeyboardFocusProviderMod {
  
  @JSImport("@react-md/menu/types/MenuKeyboardFocusProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MenuKeyboardFocusProvider(hasHorizontalChildren: MenuKeyboardFocusProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuKeyboardFocusProvider")(hasHorizontalChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MenuKeyboardFocusProviderProps
    extends StObject
       with MenuOrientationProps {
    
    var children: Node
  }
  object MenuKeyboardFocusProviderProps {
    
    inline def apply(): MenuKeyboardFocusProviderProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[MenuKeyboardFocusProviderProps]
    }
    
    extension [Self <: MenuKeyboardFocusProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
