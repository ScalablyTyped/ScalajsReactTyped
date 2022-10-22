package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectableDeclaration
import typingsJapgolly.ionicAngular.utilOverlayMod.OverlayBaseController
import typingsJapgolly.ionicCore.distTypesComponentsLoadingLoadingInterfaceMod.LoadingOptions
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonLoadingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersLoadingControllerMod {
  
  @JSImport("@ionic/angular/providers/loading-controller", "LoadingController")
  @js.native
  open class LoadingController () extends OverlayBaseController[LoadingOptions, HTMLIonLoadingElement]
  /* static members */
  object LoadingController {
    
    @JSImport("@ionic/angular/providers/loading-controller", "LoadingController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/providers/loading-controller", "LoadingController.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[LoadingController, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[LoadingController, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/providers/loading-controller", "LoadingController.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[LoadingController] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[LoadingController]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
}
