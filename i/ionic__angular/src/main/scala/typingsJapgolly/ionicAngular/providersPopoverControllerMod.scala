package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.ComponentFactoryResolver
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectableDeclaration
import typingsJapgolly.ionicAngular.anon.Optional
import typingsJapgolly.ionicAngular.diR3InjectorMod.EnvironmentInjector
import typingsJapgolly.ionicAngular.providersAngularDelegateMod.AngularDelegate
import typingsJapgolly.ionicAngular.utilOverlayMod.OverlayBaseController
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPopoverElement
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PopoverOptions
import typingsJapgolly.ionicCore.mod.ComponentRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersPopoverControllerMod {
  
  @JSImport("@ionic/angular/providers/popover-controller", "PopoverController")
  @js.native
  open class PopoverController protected () extends OverlayBaseController[PopoverOptions[ComponentRef], HTMLIonPopoverElement] {
    def this(
      angularDelegate: AngularDelegate,
      resolver: ComponentFactoryResolver,
      injector: Injector,
      environmentInjector: EnvironmentInjector
    ) = this()
    
    /* private */ var angularDelegate: Any = js.native
    
    /* private */ var environmentInjector: Any = js.native
    
    /* private */ var injector: Any = js.native
    
    /* private */ var resolver: Any = js.native
  }
  /* static members */
  object PopoverController {
    
    @JSImport("@ionic/angular/providers/popover-controller", "PopoverController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/providers/popover-controller", "PopoverController.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[PopoverController, js.Tuple4[Null, Null, Null, Optional]] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[PopoverController, js.Tuple4[Null, Null, Null, Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/providers/popover-controller", "PopoverController.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[PopoverController] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[PopoverController]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
}
