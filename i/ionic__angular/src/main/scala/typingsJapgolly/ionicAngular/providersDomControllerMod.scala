package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersDomControllerMod {
  
  @JSImport("@ionic/angular/providers/dom-controller", "DomController")
  @js.native
  open class DomController () extends StObject {
    
    /**
      * Schedules a task to run during the READ phase of the next frame.
      * This task should only read the DOM, but never modify it.
      */
    def read(cb: RafCallback): Unit = js.native
    
    /**
      * Schedules a task to run during the WRITE phase of the next frame.
      * This task should write the DOM, but never READ it.
      */
    def write(cb: RafCallback): Unit = js.native
  }
  /* static members */
  object DomController {
    
    @JSImport("@ionic/angular/providers/dom-controller", "DomController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/providers/dom-controller", "DomController.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[DomController, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[DomController, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/providers/dom-controller", "DomController.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[DomController] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[DomController]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
  
  type RafCallback = js.Function1[/* timeStamp */ js.UndefOr[Double], Unit]
}
