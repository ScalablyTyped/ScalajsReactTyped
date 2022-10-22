package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectableDeclaration
import typingsJapgolly.ionicAngular.utilOverlayMod.OverlayBaseController
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonToastElement
import typingsJapgolly.ionicCore.distTypesComponentsToastToastInterfaceMod.ToastOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersToastControllerMod {
  
  @JSImport("@ionic/angular/providers/toast-controller", "ToastController")
  @js.native
  open class ToastController () extends OverlayBaseController[ToastOptions, HTMLIonToastElement]
  /* static members */
  object ToastController {
    
    @JSImport("@ionic/angular/providers/toast-controller", "ToastController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/providers/toast-controller", "ToastController.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[ToastController, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[ToastController, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/providers/toast-controller", "ToastController.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[ToastController] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[ToastController]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
}
