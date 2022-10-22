package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCore.mod.ComponentFactoryResolver
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectableDeclaration
import typingsJapgolly.ionicAngular.anon.Optional
import typingsJapgolly.ionicAngular.diR3InjectorMod.EnvironmentInjector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "PopoverController")
@js.native
open class PopoverController protected ()
  extends typingsJapgolly.ionicAngular.providersPopoverControllerMod.PopoverController {
  def this(
    angularDelegate: typingsJapgolly.ionicAngular.providersAngularDelegateMod.AngularDelegate,
    resolver: ComponentFactoryResolver,
    injector: Injector,
    environmentInjector: EnvironmentInjector
  ) = this()
}
/* static members */
object PopoverController {
  
  @JSImport("@ionic/angular", "PopoverController")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "PopoverController.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[
    typingsJapgolly.ionicAngular.providersPopoverControllerMod.PopoverController, 
    js.Tuple4[Null, Null, Null, Optional]
  ] = js.native
  inline def ɵfac_=(
    x: ɵɵFactoryDeclaration[
      typingsJapgolly.ionicAngular.providersPopoverControllerMod.PopoverController, 
      js.Tuple4[Null, Null, Null, Optional]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "PopoverController.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[typingsJapgolly.ionicAngular.providersPopoverControllerMod.PopoverController] = js.native
  inline def ɵprov_=(
    x: ɵɵInjectableDeclaration[typingsJapgolly.ionicAngular.providersPopoverControllerMod.PopoverController]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
