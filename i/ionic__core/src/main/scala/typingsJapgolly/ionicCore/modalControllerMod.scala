package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonModalElement
import typingsJapgolly.ionicCore.mod.ComponentRef
import typingsJapgolly.ionicCore.modalInterfaceMod.ModalOptions
import typingsJapgolly.ionicCore.overlaysInterfaceMod.OverlayController
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/modal-controller/modal-controller", JSImport.Namespace)
@js.native
object modalControllerMod extends js.Object {
  @js.native
  class ModalController ()
    extends ComponentInterface
       with OverlayController {
    /**
      * Create a modal overlay with modal options.
      *
      * @param options The options to use to create the modal.
      */
    def create[T /* <: ComponentRef */](options: ModalOptions[T]): js.Promise[HTMLIonModalElement] = js.native
  }
  
}

