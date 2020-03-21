package typingsJapgolly.expo

import typingsJapgolly.fbemitter.mod.EventEmitter
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/launch/AppLoading", JSImport.Namespace)
@js.native
object appLoadingMod extends js.Object {
  @js.native
  trait AppLoading
    extends Component[Props, js.Object, js.Any] {
    var _isMounted: Boolean = js.native
    def _startLoadingAppResourcesAsync(): js.Promise[Unit] = js.native
    @JSName("componentDidMount")
    def componentDidMount_MAppLoading(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAppLoading(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expo.AnonAutoHideSplash
    - typingsJapgolly.expo.AnonOnError
  */
  trait Props extends js.Object
  
  @js.native
  class default () extends AppLoading
  
  def getAppLoadingLifecycleEmitter(): EventEmitter = js.native
}

