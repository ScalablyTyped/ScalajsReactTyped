package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCommon.mod.Location
import typingsJapgolly.angularCore.mod.ComponentFactoryResolver
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ViewContainerRef
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularRouter.mod.ActivatedRoute
import typingsJapgolly.angularRouter.mod.ChildrenOutletContexts
import typingsJapgolly.angularRouter.mod.Router
import typingsJapgolly.ionicAngular.anon.ActivateEvents
import typingsJapgolly.ionicAngular.anon.Animated
import typingsJapgolly.ionicAngular.anon.Attribute
import typingsJapgolly.ionicAngular.anon.AttributeOptional
import typingsJapgolly.ionicAngular.anon.Optional
import typingsJapgolly.ionicAngular.anon.SkipSelf
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-router-outlet`
import typingsJapgolly.ionicAngular.ionicAngularStrings.outlet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "IonRouterOutlet")
@js.native
open class IonRouterOutlet protected ()
  extends typingsJapgolly.ionicAngular.directivesNavigationIonRouterOutletMod.IonRouterOutlet {
  def this(
    parentContexts: ChildrenOutletContexts,
    location: ViewContainerRef,
    name: String,
    tabs: String,
    config: typingsJapgolly.ionicAngular.providersConfigMod.Config,
    navCtrl: typingsJapgolly.ionicAngular.providersNavControllerMod.NavController,
    componentFactoryResolver: ComponentFactoryResolver,
    commonLocation: Location,
    elementRef: ElementRef[Any],
    router: Router,
    zone: NgZone,
    activatedRoute: ActivatedRoute
  ) = this()
  def this(
    parentContexts: ChildrenOutletContexts,
    location: ViewContainerRef,
    name: String,
    tabs: String,
    config: typingsJapgolly.ionicAngular.providersConfigMod.Config,
    navCtrl: typingsJapgolly.ionicAngular.providersNavControllerMod.NavController,
    componentFactoryResolver: ComponentFactoryResolver,
    commonLocation: Location,
    elementRef: ElementRef[Any],
    router: Router,
    zone: NgZone,
    activatedRoute: ActivatedRoute,
    parentOutlet: typingsJapgolly.ionicAngular.directivesNavigationIonRouterOutletMod.IonRouterOutlet
  ) = this()
}
/* static members */
object IonRouterOutlet {
  
  @JSImport("@ionic/angular", "IonRouterOutlet")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "IonRouterOutlet.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    typingsJapgolly.ionicAngular.directivesNavigationIonRouterOutletMod.IonRouterOutlet, 
    `ion-router-outlet`, 
    js.Array[outlet], 
    Animated, 
    ActivateEvents, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      typingsJapgolly.ionicAngular.directivesNavigationIonRouterOutletMod.IonRouterOutlet, 
      `ion-router-outlet`, 
      js.Array[outlet], 
      Animated, 
      ActivateEvents, 
      scala.Nothing, 
      scala.Nothing, 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "IonRouterOutlet.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[
    typingsJapgolly.ionicAngular.directivesNavigationIonRouterOutletMod.IonRouterOutlet, 
    js.Tuple13[Null, Null, Attribute, AttributeOptional, Null, Null, Optional, Null, Null, Null, Null, Null, SkipSelf]
  ] = js.native
  inline def ɵfac_=(
    x: ɵɵFactoryDeclaration[
      typingsJapgolly.ionicAngular.directivesNavigationIonRouterOutletMod.IonRouterOutlet, 
      js.Tuple13[Null, Null, Attribute, AttributeOptional, Null, Null, Optional, Null, Null, Null, Null, Null, SkipSelf]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
