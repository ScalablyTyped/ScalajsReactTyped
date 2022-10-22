package typingsJapgolly.reactNativeDraggableFlatlist

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextCellContextMod {
  
  @JSImport("react-native-draggable-flatlist/lib/context/cellContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasIsActiveChildren: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasIsActiveChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useIsActive(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsActive")().asInstanceOf[Boolean]
  
  trait Props extends StObject {
    
    var children: Node
    
    var isActive: Boolean
  }
  object Props {
    
    inline def apply(isActive: Boolean): Props = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    }
  }
}
