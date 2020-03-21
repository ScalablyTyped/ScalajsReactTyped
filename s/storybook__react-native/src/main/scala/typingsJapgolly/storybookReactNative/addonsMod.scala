package typingsJapgolly.storybookReactNative

import typingsJapgolly.react.mod.Component
import typingsJapgolly.storybookAddons.distMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons", JSImport.Namespace)
@js.native
object addonsMod extends js.Object {
  @js.native
  trait Addons
    extends Component[js.Object, AnonAddonSelected, js.Any] {
    var panels: Collection = js.native
    def onPressAddon(addonSelected: String): Unit = js.native
  }
  
  @js.native
  class default protected () extends Addons {
    def this(props: js.Object) = this()
  }
  
}

