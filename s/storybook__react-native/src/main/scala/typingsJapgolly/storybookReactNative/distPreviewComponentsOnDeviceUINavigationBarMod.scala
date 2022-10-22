package typingsJapgolly.storybookReactNative

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPreviewComponentsOnDeviceUINavigationBarMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation/bar", JSImport.Default)
  @js.native
  open class default () extends Bar
  
  @js.native
  trait Bar
    extends PureComponent[Props, js.Object, Any]
  
  trait Props extends StObject {
    
    var index: Double
    
    def onPress(id: Double): Unit
  }
  object Props {
    
    inline def apply(index: Double, onPress: Double => Callback): Props = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onPress = js.Any.fromFunction1((t0: Double) => onPress(t0).runNow()))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOnPress(value: Double => Callback): Self = StObject.set(x, "onPress", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
