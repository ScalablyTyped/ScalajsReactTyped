package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectableDeclaration
import typingsJapgolly.ionicAngular.utilOverlayMod.OverlayBaseController
import typingsJapgolly.ionicCore.distTypesComponentsActionSheetActionSheetInterfaceMod.ActionSheetOptions
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonActionSheetElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersActionSheetControllerMod {
  
  @JSImport("@ionic/angular/providers/action-sheet-controller", "ActionSheetController")
  @js.native
  open class ActionSheetController () extends OverlayBaseController[ActionSheetOptions, HTMLIonActionSheetElement]
  /* static members */
  object ActionSheetController {
    
    @JSImport("@ionic/angular/providers/action-sheet-controller", "ActionSheetController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/providers/action-sheet-controller", "ActionSheetController.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[ActionSheetController, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[ActionSheetController, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/providers/action-sheet-controller", "ActionSheetController.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[ActionSheetController] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[ActionSheetController]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
}
