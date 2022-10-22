package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.anon.Value
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatePickerViewDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/date-picker-view/demo/basic", JSImport.Default)
  @js.native
  open class default () extends DatePickerViewExample
  
  @js.native
  trait DatePickerViewExample
    extends Component[js.Object, js.Object, Any] {
    
    def onChange(value: Any): Unit = js.native
    
    def onValueChange(args: Any*): Unit = js.native
    
    @JSName("state")
    var state_DatePickerViewExample: Value = js.native
  }
}
