package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectableDeclaration
import typingsJapgolly.ionicAngular.utilOverlayMod.OverlayBaseController
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPickerElement
import typingsJapgolly.ionicCore.distTypesComponentsPickerPickerInterfaceMod.PickerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersPickerControllerMod {
  
  @JSImport("@ionic/angular/providers/picker-controller", "PickerController")
  @js.native
  open class PickerController () extends OverlayBaseController[PickerOptions, HTMLIonPickerElement]
  /* static members */
  object PickerController {
    
    @JSImport("@ionic/angular/providers/picker-controller", "PickerController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/providers/picker-controller", "PickerController.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[PickerController, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[PickerController, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/providers/picker-controller", "PickerController.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[PickerController] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[PickerController]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
}
