package typingsJapgolly.ionicAngular

import org.scalajs.dom.UIEvent
import typingsJapgolly.angularCommon.mod.LocationStrategy
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.OnChanges
import typingsJapgolly.angularCore.mod.OnInit
import typingsJapgolly.angularCore.mod.SimpleChanges
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularRouter.mod.Router
import typingsJapgolly.angularRouter.mod.RouterLink
import typingsJapgolly.ionicAngular.anon.Optional
import typingsJapgolly.ionicAngular.anon.RouterAnimation
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`a[routerLink]Commaarea[routerLink]`
import typingsJapgolly.ionicAngular.providersNavControllerMod.NavController
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesNavigationRouterLinkDelegateMod {
  
  @JSImport("@ionic/angular/directives/navigation/router-link-delegate", "RouterLinkDelegateDirective")
  @js.native
  open class RouterLinkDelegateDirective protected ()
    extends StObject
       with OnInit
       with OnChanges {
    def this(
      locationStrategy: LocationStrategy,
      navCtrl: NavController,
      elementRef: ElementRef[Any],
      router: Router
    ) = this()
    def this(
      locationStrategy: LocationStrategy,
      navCtrl: NavController,
      elementRef: ElementRef[Any],
      router: Router,
      routerLink: RouterLink
    ) = this()
    
    /* private */ var elementRef: Any = js.native
    
    /* private */ var locationStrategy: Any = js.native
    
    /* private */ var navCtrl: Any = js.native
    
    def ngOnChanges(): Unit = js.native
    /**
      * A callback method that is invoked immediately after the
      * default change detector has checked data-bound properties
      * if at least one has changed, and before the view and content
      * children are checked.
      * @param changes The changed properties.
      */
    /* CompleteClass */
    override def ngOnChanges(changes: SimpleChanges): Unit = js.native
    
    /**
      * A callback method that is invoked immediately after the
      * default change detector has checked the directive's
      * data-bound properties for the first time,
      * and before any of the view or content children have been checked.
      * It is invoked only once when the directive is instantiated.
      */
    /* CompleteClass */
    override def ngOnInit(): Unit = js.native
    
    /**
      * @internal
      */
    def onClick(ev: UIEvent): Unit = js.native
    
    /* private */ var router: Any = js.native
    
    var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var routerDirection: RouterDirection = js.native
    
    /* private */ var routerLink: Any = js.native
    
    /* private */ var updateTargetUrlAndHref: Any = js.native
  }
  /* static members */
  object RouterLinkDelegateDirective {
    
    @JSImport("@ionic/angular/directives/navigation/router-link-delegate", "RouterLinkDelegateDirective")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/directives/navigation/router-link-delegate", "RouterLinkDelegateDirective.\u0275dir")
    @js.native
    def ɵdir: ɵɵDirectiveDeclaration[
        RouterLinkDelegateDirective, 
        /* :not(a):not(area)[routerLink] */ String, 
        scala.Nothing, 
        RouterAnimation, 
        js.Object, 
        scala.Nothing, 
        scala.Nothing, 
        `false`
      ] = js.native
    inline def ɵdir_=(
      x: ɵɵDirectiveDeclaration[
          RouterLinkDelegateDirective, 
          /* :not(a):not(area)[routerLink] */ String, 
          scala.Nothing, 
          RouterAnimation, 
          js.Object, 
          scala.Nothing, 
          scala.Nothing, 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/directives/navigation/router-link-delegate", "RouterLinkDelegateDirective.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[RouterLinkDelegateDirective, js.Tuple5[Null, Null, Null, Null, Optional]] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[RouterLinkDelegateDirective, js.Tuple5[Null, Null, Null, Null, Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ionic/angular/directives/navigation/router-link-delegate", "RouterLinkWithHrefDelegateDirective")
  @js.native
  open class RouterLinkWithHrefDelegateDirective protected ()
    extends StObject
       with OnInit
       with OnChanges {
    def this(
      locationStrategy: LocationStrategy,
      navCtrl: NavController,
      elementRef: ElementRef[Any],
      router: Router
    ) = this()
    def this(
      locationStrategy: LocationStrategy,
      navCtrl: NavController,
      elementRef: ElementRef[Any],
      router: Router,
      routerLink: RouterLink
    ) = this()
    
    /* private */ var elementRef: Any = js.native
    
    /* private */ var locationStrategy: Any = js.native
    
    /* private */ var navCtrl: Any = js.native
    
    def ngOnChanges(): Unit = js.native
    /**
      * A callback method that is invoked immediately after the
      * default change detector has checked data-bound properties
      * if at least one has changed, and before the view and content
      * children are checked.
      * @param changes The changed properties.
      */
    /* CompleteClass */
    override def ngOnChanges(changes: SimpleChanges): Unit = js.native
    
    /**
      * A callback method that is invoked immediately after the
      * default change detector has checked the directive's
      * data-bound properties for the first time,
      * and before any of the view or content children have been checked.
      * It is invoked only once when the directive is instantiated.
      */
    /* CompleteClass */
    override def ngOnInit(): Unit = js.native
    
    /**
      * @internal
      */
    def onClick(): Unit = js.native
    
    /* private */ var router: Any = js.native
    
    var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var routerDirection: RouterDirection = js.native
    
    /* private */ var routerLink: Any = js.native
    
    /* private */ var updateTargetUrlAndHref: Any = js.native
  }
  /* static members */
  object RouterLinkWithHrefDelegateDirective {
    
    @JSImport("@ionic/angular/directives/navigation/router-link-delegate", "RouterLinkWithHrefDelegateDirective")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/directives/navigation/router-link-delegate", "RouterLinkWithHrefDelegateDirective.\u0275dir")
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
    
    @JSImport("@ionic/angular/directives/navigation/router-link-delegate", "RouterLinkWithHrefDelegateDirective.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[RouterLinkWithHrefDelegateDirective, js.Tuple5[Null, Null, Null, Null, Optional]] = js.native
    inline def ɵfac_=(
      x: ɵɵFactoryDeclaration[RouterLinkWithHrefDelegateDirective, js.Tuple5[Null, Null, Null, Null, Optional]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
}
