package typingsJapgolly.antdMobileRn

import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/picker/demo/basic.native", JSImport.Namespace)
@js.native
object pickerDemoBasicNativeMod extends js.Object {
  @js.native
  trait PopupExample
    extends Component[js.Any, js.Any, js.Any] {
    def onChange(value: js.Any): Unit = js.native
    def onClick(): Unit = js.native
  }
  
  @js.native
  class default protected () extends PopupExample {
    def this(props: js.Any) = this()
  }
  
}

