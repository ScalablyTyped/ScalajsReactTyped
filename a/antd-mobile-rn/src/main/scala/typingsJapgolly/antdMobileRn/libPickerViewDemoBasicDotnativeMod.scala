package typingsJapgolly.antdMobileRn

import typingsJapgolly.antdMobileRn.anon.Value
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerViewDemoBasicDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/picker-view/demo/basic.native", JSImport.Default)
  @js.native
  open class default () extends PickerViewExample
  
  @js.native
  trait PickerViewExample
    extends Component[js.Object, js.Object, Any] {
    
    def onChange(value: Any): Unit = js.native
    
    @JSName("state")
    var state_PickerViewExample: Value = js.native
  }
}
