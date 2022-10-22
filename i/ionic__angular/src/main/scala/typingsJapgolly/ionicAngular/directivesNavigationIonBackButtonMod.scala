package typingsJapgolly.ionicAngular

import org.scalajs.dom.Event
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.DefaultHref
import typingsJapgolly.ionicAngular.anon.Optional
import typingsJapgolly.ionicAngular.directivesNavigationIonRouterOutletMod.IonRouterOutlet
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-back-button`
import typingsJapgolly.ionicAngular.providersConfigMod.Config
import typingsJapgolly.ionicAngular.providersNavControllerMod.NavController
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesNavigationIonBackButtonMod {
  
  @JSImport("@ionic/angular/directives/navigation/ion-back-button", "IonBackButtonDelegateDirective")
  @js.native
  open class IonBackButtonDelegateDirective protected () extends StObject {
    def this(routerOutlet: IonRouterOutlet, navCtrl: NavController, config: Config) = this()
    
    /* private */ var config: Any = js.native
    
    var defaultHref: js.UndefOr[String | Null] = js.native
    
    /* private */ var navCtrl: Any = js.native
    
    /**
      * @internal
      */
    def onClick(ev: Event): Unit = js.native
    
    var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    /* private */ var routerOutlet: Any = js.native
  }
  /* static members */
  object IonBackButtonDelegateDirective {
    
    @JSImport("@ionic/angular/directives/navigation/ion-back-button", "IonBackButtonDelegateDirective")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/directives/navigation/ion-back-button", "IonBackButtonDelegateDirective.\u0275dir")
    @js.native
    def ɵdir: ɵɵDirectiveDeclaration[
        IonBackButtonDelegateDirective, 
        `ion-back-button`, 
        scala.Nothing, 
        DefaultHref, 
        js.Object, 
        scala.Nothing, 
        scala.Nothing, 
        `false`
      ] = js.native
    inline def ɵdir_=(
      x: ɵɵDirectiveDeclaration[
          IonBackButtonDelegateDirective, 
          `ion-back-button`, 
          scala.Nothing, 
          DefaultHref, 
          js.Object, 
          scala.Nothing, 
          scala.Nothing, 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/directives/navigation/ion-back-button", "IonBackButtonDelegateDirective.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[IonBackButtonDelegateDirective, js.Tuple3[Optional, Null, Null]] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonBackButtonDelegateDirective, js.Tuple3[Optional, Null, Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
}
