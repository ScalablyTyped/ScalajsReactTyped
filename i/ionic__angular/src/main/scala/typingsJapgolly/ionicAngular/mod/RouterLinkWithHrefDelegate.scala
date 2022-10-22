package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCommon.mod.LocationStrategy
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularRouter.mod.Router
import typingsJapgolly.angularRouter.mod.RouterLink
import typingsJapgolly.ionicAngular.anon.Optional
import typingsJapgolly.ionicAngular.anon.RouterAnimation
import typingsJapgolly.ionicAngular.directivesNavigationRouterLinkDelegateMod.RouterLinkWithHrefDelegateDirective
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`a[routerLink]Commaarea[routerLink]`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "RouterLinkWithHrefDelegate")
@js.native
open class RouterLinkWithHrefDelegate protected () extends RouterLinkWithHrefDelegateDirective {
  def this(
    locationStrategy: LocationStrategy,
    navCtrl: typingsJapgolly.ionicAngular.providersNavControllerMod.NavController,
    elementRef: ElementRef[Any],
    router: Router
  ) = this()
  def this(
    locationStrategy: LocationStrategy,
    navCtrl: typingsJapgolly.ionicAngular.providersNavControllerMod.NavController,
    elementRef: ElementRef[Any],
    router: Router,
    routerLink: RouterLink
  ) = this()
}
/* static members */
object RouterLinkWithHrefDelegate {
  
  @JSImport("@ionic/angular", "RouterLinkWithHrefDelegate")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "RouterLinkWithHrefDelegate.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    RouterLinkWithHrefDelegateDirective, 
    `a[routerLink]Commaarea[routerLink]`, 
    scala.Nothing, 
    RouterAnimation, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      RouterLinkWithHrefDelegateDirective, 
      `a[routerLink]Commaarea[routerLink]`, 
      scala.Nothing, 
      RouterAnimation, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "RouterLinkWithHrefDelegate.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[RouterLinkWithHrefDelegateDirective, js.Tuple5[Null, Null, Null, Null, Optional]] = js.native
  inline def ɵfac_=(
    x: ɵɵFactoryDeclaration[RouterLinkWithHrefDelegateDirective, js.Tuple5[Null, Null, Null, Null, Optional]]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
