package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonToastElement
import typingsJapgolly.ionicCore.overlaysInterfaceMod.OverlayController
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import typingsJapgolly.ionicCore.toastInterfaceMod.ToastOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/toast-controller/toast-controller", JSImport.Namespace)
@js.native
object toastControllerMod extends js.Object {
  @js.native
  class ToastController ()
    extends ComponentInterface
       with OverlayController {
    def create(options: ToastOptions): js.Promise[HTMLIonToastElement] = js.native
  }
  
}

