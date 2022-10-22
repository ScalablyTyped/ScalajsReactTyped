package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectableDeclaration
import typingsJapgolly.ionicCore.distTypesUtilsGestureMod.Gesture
import typingsJapgolly.ionicCore.distTypesUtilsGestureMod.GestureConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersGestureControllerMod {
  
  @JSImport("@ionic/angular/providers/gesture-controller", "GestureController")
  @js.native
  open class GestureController protected () extends StObject {
    def this(zone: NgZone) = this()
    
    /**
      * Create a new gesture
      */
    def create(opts: GestureConfig): Gesture = js.native
    def create(opts: GestureConfig, runInsideAngularZone: Boolean): Gesture = js.native
    
    /* private */ var zone: Any = js.native
  }
  /* static members */
  object GestureController {
    
    @JSImport("@ionic/angular/providers/gesture-controller", "GestureController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/providers/gesture-controller", "GestureController.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[GestureController, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[GestureController, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/providers/gesture-controller", "GestureController.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[GestureController] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[GestureController]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
}
