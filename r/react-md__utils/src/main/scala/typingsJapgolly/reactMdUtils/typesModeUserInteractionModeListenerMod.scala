package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactMdUtils.typesModeTypesMod.UserInteractionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModeUserInteractionModeListenerMod {
  
  @JSImport("@react-md/utils/types/mode/UserInteractionModeListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def UserInteractionModeListener(hasChildren: UserInteractionModeListenerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("UserInteractionModeListener")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useIsUserInteractionMode(mode: UserInteractionMode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsUserInteractionMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useUserInteractionMode(): UserInteractionMode = ^.asInstanceOf[js.Dynamic].applyDynamic("useUserInteractionMode")().asInstanceOf[UserInteractionMode]
  
  trait UserInteractionModeListenerProps extends StObject {
    
    /**
      * The `children` are required since this component basically does nothing
      * other than providing a `className` to the `document.body` otherwise.
      */
    var children: Node
  }
  object UserInteractionModeListenerProps {
    
    inline def apply(): UserInteractionModeListenerProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[UserInteractionModeListenerProps]
    }
    
    extension [Self <: UserInteractionModeListenerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
