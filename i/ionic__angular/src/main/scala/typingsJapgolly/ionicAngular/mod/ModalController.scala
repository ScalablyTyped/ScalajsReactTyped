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

@JSImport("@ionic/angular", "ModalController")
@js.native
open class ModalController protected ()
  extends typingsJapgolly.ionicAngular.providersModalControllerMod.ModalController {
  def this(
    angularDelegate: typingsJapgolly.ionicAngular.providersAngularDelegateMod.AngularDelegate,
    resolver: ComponentFactoryResolver,
    injector: Injector,
    environmentInjector: EnvironmentInjector
  ) = this()
}
/* static members */
object ModalController {
  
  @JSImport("@ionic/angular", "ModalController")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "ModalController.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[
    typingsJapgolly.ionicAngular.providersModalControllerMod.ModalController, 
    js.Tuple4[Null, Null, Null, Optional]
  ] = js.native
  inline def ɵfac_=(
    x: ɵɵFactoryDeclaration[
      typingsJapgolly.ionicAngular.providersModalControllerMod.ModalController, 
      js.Tuple4[Null, Null, Null, Optional]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "ModalController.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[typingsJapgolly.ionicAngular.providersModalControllerMod.ModalController] = js.native
  inline def ɵprov_=(
    x: ɵɵInjectableDeclaration[typingsJapgolly.ionicAngular.providersModalControllerMod.ModalController]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
