package typingsJapgolly.storybookReactNative

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPreviewComponentsOnDeviceUINavigationVisibilityButtonMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation/visibility-button", JSImport.Default)
  @js.native
  open class default () extends VisibilityButton
  
  trait Props extends StObject {
    
    def onPress(): Unit
  }
  object Props {
    
    inline def apply(onPress: Callback): Props = {
      val __obj = js.Dynamic.literal(onPress = onPress.toJsFn)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
    }
  }
  
  @js.native
  trait VisibilityButton
    extends PureComponent[Props, js.Object, Any]
}
