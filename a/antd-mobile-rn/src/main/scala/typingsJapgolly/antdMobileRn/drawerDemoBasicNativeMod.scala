package typingsJapgolly.antdMobileRn

import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/drawer/demo/basic.native", JSImport.Namespace)
@js.native
object drawerDemoBasicNativeMod extends js.Object {
  @js.native
  trait DrawerExample
    extends Component[js.Any, js.Any, js.Any] {
    var drawer: js.Any = js.native
    def onOpenChange(isOpen: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends DrawerExample
  
}

