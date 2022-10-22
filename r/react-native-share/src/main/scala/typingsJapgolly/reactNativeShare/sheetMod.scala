package typingsJapgolly.reactNativeShare

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.Animated.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sheetMod {
  
  @JSImport("react-native-share/Sheet", JSImport.Default)
  @js.native
  open class default () extends Sheet
  
  @js.native
  trait Sheet extends Component[SheetProps, SheetState, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MSheet(newProps: SheetProps): Unit = js.native
  }
  
  trait SheetProps extends StObject {
    
    var children: Node
    
    var visible: Boolean
  }
  object SheetProps {
    
    inline def apply(visible: Boolean): SheetProps = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[SheetProps]
    }
    
    extension [Self <: SheetProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait SheetState extends StObject {
    
    var bottom: Value
  }
  object SheetState {
    
    inline def apply(bottom: Value): SheetState = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any])
      __obj.asInstanceOf[SheetState]
    }
    
    extension [Self <: SheetState](x: Self) {
      
      inline def setBottom(value: Value): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    }
  }
}
