package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.ModuleWithProviders
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectorDeclaration
import typingsJapgolly.angularCore.mod.ɵɵNgModuleDeclaration
import typingsJapgolly.ionicAngular.anon.TypeofCommonModule
import typingsJapgolly.ionicCore.distTypesUtilsConfigMod.IonicConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicModuleMod {
  
  @JSImport("@ionic/angular/ionic-module", "IonicModule")
  @js.native
  open class IonicModule () extends StObject
  /* static members */
  object IonicModule {
    
    @JSImport("@ionic/angular/ionic-module", "IonicModule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def forRoot(): ModuleWithProviders[IonicModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("forRoot")().asInstanceOf[ModuleWithProviders[IonicModule]]
    inline def forRoot(config: IonicConfig): ModuleWithProviders[IonicModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("forRoot")(config.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[IonicModule]]
    
    @JSImport("@ionic/angular/ionic-module", "IonicModule.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[IonicModule, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonicModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/ionic-module", "IonicModule.\u0275inj")
    @js.native
    def ɵinj: ɵɵInjectorDeclaration[IonicModule] = js.native
    inline def ɵinj_=(x: ɵɵInjectorDeclaration[IonicModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/ionic-module", "IonicModule.\u0275mod")
    @js.native
    def ɵmod: ɵɵNgModuleDeclaration[IonicModule, js.Array[Any], js.Array[TypeofCommonModule], js.Array[Any]] = js.native
    inline def ɵmod_=(x: ɵɵNgModuleDeclaration[IonicModule, js.Array[Any], js.Array[TypeofCommonModule], js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
  }
}
