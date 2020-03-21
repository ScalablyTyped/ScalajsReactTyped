package typingsJapgolly.ionicAngular

import typingsJapgolly.ionicAngular.overlayMod.OverlayBaseController
import typingsJapgolly.ionicCore.alertInterfaceMod.AlertOptions
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonAlertElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/alert-controller", JSImport.Namespace)
@js.native
object alertControllerMod extends js.Object {
  @js.native
  class AlertController () extends OverlayBaseController[AlertOptions, HTMLIonAlertElement]
  
}

