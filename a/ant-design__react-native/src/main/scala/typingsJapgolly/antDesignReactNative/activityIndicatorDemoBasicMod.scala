package typingsJapgolly.antDesignReactNative

import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/activity-indicator/demo/basic", JSImport.Namespace)
@js.native
object activityIndicatorDemoBasicMod extends js.Object {
  @js.native
  trait ActivityIndicatorExample
    extends Component[js.Any, js.Any, js.Any] {
    var closeTimer: js.Any = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MActivityIndicatorExample(): Unit = js.native
    def loadingToast(): Unit = js.native
  }
  
  @js.native
  class default protected () extends ActivityIndicatorExample {
    def this(props: js.Any) = this()
  }
  
}

