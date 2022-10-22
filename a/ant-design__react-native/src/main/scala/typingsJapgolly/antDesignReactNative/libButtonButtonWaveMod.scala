package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.TouchableNativeFeedbackProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libButtonButtonWaveMod {
  
  @JSImport("@ant-design/react-native/lib/button/ButtonWave", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ButtonWaveProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ButtonWaveProps
    extends StObject
       with TouchableNativeFeedbackProps {
    
    var Color: js.UndefOr[ColorValue] = js.undefined
    
    @JSName("children")
    var children_ButtonWaveProps: Node
  }
  object ButtonWaveProps {
    
    inline def apply(): ButtonWaveProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ButtonWaveProps]
    }
    
    extension [Self <: ButtonWaveProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColor(value: ColorValue): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
    }
  }
}
