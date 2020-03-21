package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonLoadingElement
import typingsJapgolly.ionicCore.loadingInterfaceMod.LoadingOptions
import typingsJapgolly.ionicCore.overlaysInterfaceMod.OverlayController
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/loading-controller/loading-controller", JSImport.Namespace)
@js.native
object loadingControllerMod extends js.Object {
  @js.native
  class LoadingController ()
    extends ComponentInterface
       with OverlayController {
    def create(options: LoadingOptions): js.Promise[HTMLIonLoadingElement] = js.native
  }
  
}

