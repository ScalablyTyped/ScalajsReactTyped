package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCore.mod.ModuleWithProviders
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectorDeclaration
import typingsJapgolly.angularCore.mod.ɵɵNgModuleDeclaration
import typingsJapgolly.ionicAngular.anon.TypeofCommonModule
import typingsJapgolly.ionicCore.distTypesUtilsConfigMod.IonicConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "IonicModule")
@js.native
open class IonicModule ()
  extends typingsJapgolly.ionicAngular.ionicModuleMod.IonicModule
/* static members */
object IonicModule {
  
  @JSImport("@ionic/angular", "IonicModule")
  @js.native
  val ^ : js.Any = js.native
  
  inline def forRoot(): ModuleWithProviders[typingsJapgolly.ionicAngular.ionicModuleMod.IonicModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("forRoot")().asInstanceOf[ModuleWithProviders[typingsJapgolly.ionicAngular.ionicModuleMod.IonicModule]]
  inline def forRoot(config: IonicConfig): ModuleWithProviders[typingsJapgolly.ionicAngular.ionicModuleMod.IonicModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("forRoot")(config.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[typingsJapgolly.ionicAngular.ionicModuleMod.IonicModule]]
  
  @JSImport("@ionic/angular", "IonicModule.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[typingsJapgolly.ionicAngular.ionicModuleMod.IonicModule, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[typingsJapgolly.ionicAngular.ionicModuleMod.IonicModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "IonicModule.\u0275inj")
  @js.native
  def ɵinj: ɵɵInjectorDeclaration[typingsJapgolly.ionicAngular.ionicModuleMod.IonicModule] = js.native
  inline def ɵinj_=(x: ɵɵInjectorDeclaration[typingsJapgolly.ionicAngular.ionicModuleMod.IonicModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "IonicModule.\u0275mod")
  @js.native
  def ɵmod: ɵɵNgModuleDeclaration[
    typingsJapgolly.ionicAngular.ionicModuleMod.IonicModule, 
    js.Array[Any], 
    js.Array[TypeofCommonModule], 
    js.Array[Any]
  ] = js.native
  inline def ɵmod_=(
    x: ɵɵNgModuleDeclaration[
      typingsJapgolly.ionicAngular.ionicModuleMod.IonicModule, 
      js.Array[Any], 
      js.Array[TypeofCommonModule], 
      js.Array[Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
}
