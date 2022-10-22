package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsImageLazyDetectorMod {
  
  @JSImport("antd-mobile/es/components/image/lazy-detector", "LazyDetector")
  @js.native
  val LazyDetector: FC[Props] = js.native
  
  trait Props extends StObject {
    
    def onActive(): Unit
  }
  object Props {
    
    inline def apply(onActive: Callback): Props = {
      val __obj = js.Dynamic.literal(onActive = onActive.toJsFn)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnActive(value: Callback): Self = StObject.set(x, "onActive", value.toJsFn)
    }
  }
}
