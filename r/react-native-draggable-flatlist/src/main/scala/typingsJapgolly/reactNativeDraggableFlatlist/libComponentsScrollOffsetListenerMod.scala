package typingsJapgolly.reactNativeDraggableFlatlist

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeReanimated.mod.Animated.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsScrollOffsetListenerMod {
  
  @JSImport("react-native-draggable-flatlist/lib/components/ScrollOffsetListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasScrollOffsetOnScrollOffsetChange: Props): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasScrollOffsetOnScrollOffsetChange.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  trait Props extends StObject {
    
    def onScrollOffsetChange(offset: js.Array[Double]): Unit
    
    var scrollOffset: Value
  }
  object Props {
    
    inline def apply(onScrollOffsetChange: js.Array[Double] => Callback, scrollOffset: Value): Props = {
      val __obj = js.Dynamic.literal(onScrollOffsetChange = js.Any.fromFunction1((t0: js.Array[Double]) => onScrollOffsetChange(t0).runNow()), scrollOffset = scrollOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnScrollOffsetChange(value: js.Array[Double] => Callback): Self = StObject.set(x, "onScrollOffsetChange", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
      
      inline def setScrollOffset(value: Value): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
    }
  }
}
