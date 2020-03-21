package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonFabElement
import typingsJapgolly.ionicCore.ionicCoreStrings.bottom
import typingsJapgolly.ionicCore.ionicCoreStrings.end
import typingsJapgolly.ionicCore.ionicCoreStrings.start
import typingsJapgolly.ionicCore.ionicCoreStrings.top
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/fab-list/fab-list", JSImport.Namespace)
@js.native
object fabListMod extends js.Object {
  @js.native
  class FabList () extends ComponentInterface {
    /**
      * If `true`, the fab list will show all fab buttons in the list.
      */
    var activated: Boolean = js.native
    var el: HTMLIonFabElement = js.native
    /**
      * The side the fab list will show on relative to the main fab button.
      */
    var side: start | end | top | bottom = js.native
    /* protected */ def activatedChanged(activated: Boolean): Unit = js.native
    @JSName("render")
    def render_MFabList(): js.Any = js.native
  }
  
}

