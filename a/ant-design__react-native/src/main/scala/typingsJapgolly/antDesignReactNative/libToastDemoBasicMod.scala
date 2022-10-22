package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.anon.EnableMask
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToastDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/toast/demo/basic", JSImport.Default)
  @js.native
  open class default () extends ToastExample
  
  @js.native
  trait ToastExample extends Component[Any, Any, Any] {
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MToastExample(): Unit = js.native
    
    @JSName("state")
    var state_ToastExample: EnableMask = js.native
    
    var timer: Any = js.native
  }
}
