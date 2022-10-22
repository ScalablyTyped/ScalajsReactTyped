package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.DefaultHref
import typingsJapgolly.ionicAngular.anon.Optional
import typingsJapgolly.ionicAngular.directivesNavigationIonBackButtonMod.IonBackButtonDelegateDirective
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-back-button`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "IonBackButtonDelegate")
@js.native
open class IonBackButtonDelegate protected () extends IonBackButtonDelegateDirective {
  def this(
    routerOutlet: typingsJapgolly.ionicAngular.directivesNavigationIonRouterOutletMod.IonRouterOutlet,
    navCtrl: typingsJapgolly.ionicAngular.providersNavControllerMod.NavController,
    config: typingsJapgolly.ionicAngular.providersConfigMod.Config
  ) = this()
}
/* static members */
object IonBackButtonDelegate {
  
  @JSImport("@ionic/angular", "IonBackButtonDelegate")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "IonBackButtonDelegate.\u0275dir")
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
  
  @JSImport("@ionic/angular", "IonBackButtonDelegate.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonBackButtonDelegateDirective, js.Tuple3[Optional, Null, Null]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonBackButtonDelegateDirective, js.Tuple3[Optional, Null, Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
