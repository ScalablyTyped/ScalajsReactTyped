package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectableDeclaration
import typingsJapgolly.ionicAngular.utilOverlayMod.OverlayBaseController
import typingsJapgolly.ionicCore.distTypesComponentsAlertAlertInterfaceMod.AlertOptions
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonAlertElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersAlertControllerMod {
  
  @JSImport("@ionic/angular/providers/alert-controller", "AlertController")
  @js.native
  open class AlertController () extends OverlayBaseController[AlertOptions, HTMLIonAlertElement]
  /* static members */
  object AlertController {
    
    @JSImport("@ionic/angular/providers/alert-controller", "AlertController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/providers/alert-controller", "AlertController.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[AlertController, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[AlertController, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/providers/alert-controller", "AlertController.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[AlertController] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[AlertController]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
}
