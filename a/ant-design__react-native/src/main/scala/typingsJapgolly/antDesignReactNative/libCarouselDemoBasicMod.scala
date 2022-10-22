package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.mod.Carousel
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCarouselDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/carousel/demo/basic", JSImport.Default)
  @js.native
  open class default protected () extends BasicCarouselExample {
    def this(props: Any) = this()
  }
  
  @js.native
  trait BasicCarouselExample extends Component[Any, Any, Any] {
    
    var carousel: Null | Carousel = js.native
    
    def onHorizontalSelectedIndexChange(index: Double): Unit = js.native
    
    def onVerticalSelectedIndexChange(index: Double): Unit = js.native
  }
}
