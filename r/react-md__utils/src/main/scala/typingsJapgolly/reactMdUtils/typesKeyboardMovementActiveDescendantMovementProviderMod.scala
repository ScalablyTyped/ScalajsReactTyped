package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactMdUtils.typesKeyboardMovementActiveDescendantContextMod.ActiveDescendantContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyboardMovementActiveDescendantMovementProviderMod {
  
  @JSImport("@react-md/utils/types/keyboardMovement/ActiveDescendantMovementProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ActiveDescendantMovementProvider(hasChildrenActiveIdSetActiveId: ActiveDescendantMovementProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ActiveDescendantMovementProvider")(hasChildrenActiveIdSetActiveId.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ActiveDescendantMovementProviderProps
    extends StObject
       with ActiveDescendantContext {
    
    var children: Node
  }
  object ActiveDescendantMovementProviderProps {
    
    inline def apply(activeId: String, setActiveId: SetStateAction[String] => Callback): ActiveDescendantMovementProviderProps = {
      val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], setActiveId = js.Any.fromFunction1((t0: SetStateAction[String]) => setActiveId(t0).runNow()), children = null)
      __obj.asInstanceOf[ActiveDescendantMovementProviderProps]
    }
    
    extension [Self <: ActiveDescendantMovementProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
