package typingsJapgolly.ionicAngular

import typingsJapgolly.ionicAngular.overlayMod.OverlayBaseController
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonToastElement
import typingsJapgolly.ionicCore.toastInterfaceMod.ToastOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/toast-controller", JSImport.Namespace)
@js.native
object toastControllerMod extends js.Object {
  @js.native
  class ToastController () extends OverlayBaseController[ToastOptions, HTMLIonToastElement]
  
}

