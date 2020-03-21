package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.ComponentFactoryResolver
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.ionicAngular.angularDelegateMod.AngularDelegate
import typingsJapgolly.ionicAngular.overlayMod.OverlayBaseController
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonPopoverElement
import typingsJapgolly.ionicCore.mod.ComponentRef
import typingsJapgolly.ionicCore.popoverInterfaceMod.PopoverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/popover-controller", JSImport.Namespace)
@js.native
object popoverControllerMod extends js.Object {
  @js.native
  class PopoverController protected () extends OverlayBaseController[PopoverOptions[ComponentRef], HTMLIonPopoverElement] {
    def this(angularDelegate: AngularDelegate, resolver: ComponentFactoryResolver, injector: Injector) = this()
    var angularDelegate: js.Any = js.native
    var injector: js.Any = js.native
    var resolver: js.Any = js.native
  }
  
}

