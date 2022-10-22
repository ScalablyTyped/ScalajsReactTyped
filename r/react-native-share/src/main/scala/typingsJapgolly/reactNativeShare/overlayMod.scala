package typingsJapgolly.reactNativeShare

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("react-native-share/Overlay", JSImport.Default)
  @js.native
  open class default () extends Overlay
  
  @js.native
  trait Overlay extends Component[OverlayProps, OverlayState, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MOverlay(newProps: OverlayProps): Unit = js.native
    
    def onAnimatedEnd(): Unit = js.native
  }
  
  trait OverlayProps extends StObject {
    
    var children: Node
    
    def onCancel(): Unit
    
    var visible: Boolean
  }
  object OverlayProps {
    
    inline def apply(onCancel: Callback, visible: Boolean): OverlayProps = {
      val __obj = js.Dynamic.literal(onCancel = onCancel.toJsFn, visible = visible.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[OverlayProps]
    }
    
    extension [Self <: OverlayProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnCancel(value: Callback): Self = StObject.set(x, "onCancel", value.toJsFn)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait OverlayState extends StObject {
    
    var fadeAnim: Value
    
    var overlayStyle: StyleProp[ViewProps]
  }
  object OverlayState {
    
    inline def apply(fadeAnim: Value): OverlayState = {
      val __obj = js.Dynamic.literal(fadeAnim = fadeAnim.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayState]
    }
    
    extension [Self <: OverlayState](x: Self) {
      
      inline def setFadeAnim(value: Value): Self = StObject.set(x, "fadeAnim", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyle(value: StyleProp[ViewProps]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    }
  }
}
