package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCommon.mod.Location
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectableDeclaration
import typingsJapgolly.angularRouter.mod.NavigationExtras
import typingsJapgolly.angularRouter.mod.Router
import typingsJapgolly.angularRouter.mod.UrlSerializer
import typingsJapgolly.angularRouter.mod.UrlTree
import typingsJapgolly.ionicAngular.anon.AnimationBuilder
import typingsJapgolly.ionicAngular.anon.Optional
import typingsJapgolly.ionicAngular.directivesNavigationIonRouterOutletMod.IonRouterOutlet
import typingsJapgolly.ionicAngular.ionicAngularStrings.back
import typingsJapgolly.ionicAngular.ionicAngularStrings.forward
import typingsJapgolly.ionicAngular.providersPlatformMod.Platform
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersNavControllerMod {
  
  @JSImport("@ionic/angular/providers/nav-controller", "NavController")
  @js.native
  open class NavController protected () extends StObject {
    def this(platform: Platform, location: Location, serializer: UrlSerializer) = this()
    def this(platform: Platform, location: Location, serializer: UrlSerializer, router: Router) = this()
    
    /* private */ var animated: Any = js.native
    
    /* private */ var animationBuilder: Any = js.native
    
    /**
      * Same as [Location](https://angular.io/api/common/Location)'s back() method.
      * It will use the standard `window.history.back()` under the hood, but featuring a `back` animation
      * by default.
      */
    def back(): Unit = js.native
    def back(options: AnimationOptions): Unit = js.native
    
    /**
      * @internal
      */
    def consumeTransition(): AnimationBuilder = js.native
    
    /* private */ var direction: Any = js.native
    
    /* private */ var guessAnimation: Any = js.native
    
    /* private */ var guessDirection: Any = js.native
    
    /* private */ var lastNavId: Any = js.native
    
    /* private */ var location: Any = js.native
    
    /* private */ var navigate: Any = js.native
    
    /**
      * This method uses Angular's [Router](https://angular.io/api/router/Router) under the hood,
      * it's equivalent to calling:
      *
      * ```ts
      * this.navController.setDirection('back');
      * this.router.navigateByUrl(path);
      * ```
      *
      * Going **back** means that all the pages in the stack until the navigated page is found will be popped,
      * and that it will show a "back" animation by default.
      *
      * Navigating back can also be triggered in a declarative manner by using the `[routerDirection]` directive:
      *
      * ```html
      * <a routerLink="/path/to/page" routerDirection="back">Link</a>
      * ```
      */
    def navigateBack(url: String): js.Promise[Boolean] = js.native
    def navigateBack(url: String, options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateBack(url: js.Array[Any]): js.Promise[Boolean] = js.native
    def navigateBack(url: js.Array[Any], options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateBack(url: UrlTree): js.Promise[Boolean] = js.native
    def navigateBack(url: UrlTree, options: NavigationOptions): js.Promise[Boolean] = js.native
    
    /**
      * This method uses Angular's [Router](https://angular.io/api/router/Router) under the hood,
      * it's equivalent to calling `this.router.navigateByUrl()`, but it's explicit about the **direction** of the transition.
      *
      * Going **forward** means that a new page is going to be pushed to the stack of the outlet (ion-router-outlet),
      * and that it will show a "forward" animation by default.
      *
      * Navigating forward can also be triggered in a declarative manner by using the `[routerDirection]` directive:
      *
      * ```html
      * <a routerLink="/path/to/page" routerDirection="forward">Link</a>
      * ```
      */
    def navigateForward(url: String): js.Promise[Boolean] = js.native
    def navigateForward(url: String, options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateForward(url: js.Array[Any]): js.Promise[Boolean] = js.native
    def navigateForward(url: js.Array[Any], options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateForward(url: UrlTree): js.Promise[Boolean] = js.native
    def navigateForward(url: UrlTree, options: NavigationOptions): js.Promise[Boolean] = js.native
    
    /**
      * This method uses Angular's [Router](https://angular.io/api/router/Router) under the hood,
      * it's equivalent to calling:
      *
      * ```ts
      * this.navController.setDirection('root');
      * this.router.navigateByUrl(path);
      * ```
      *
      * Going **root** means that all existing pages in the stack will be removed,
      * and the navigated page will become the single page in the stack.
      *
      * Navigating root can also be triggered in a declarative manner by using the `[routerDirection]` directive:
      *
      * ```html
      * <a routerLink="/path/to/page" routerDirection="root">Link</a>
      * ```
      */
    def navigateRoot(url: String): js.Promise[Boolean] = js.native
    def navigateRoot(url: String, options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateRoot(url: js.Array[Any]): js.Promise[Boolean] = js.native
    def navigateRoot(url: js.Array[Any], options: NavigationOptions): js.Promise[Boolean] = js.native
    def navigateRoot(url: UrlTree): js.Promise[Boolean] = js.native
    def navigateRoot(url: UrlTree, options: NavigationOptions): js.Promise[Boolean] = js.native
    
    /**
      * This methods goes back in the context of Ionic's stack navigation.
      *
      * It recursively finds the top active `ion-router-outlet` and calls `pop()`.
      * This is the recommended way to go back when you are using `ion-router-outlet`.
      */
    def pop(): js.Promise[Unit] = js.native
    
    /* private */ var router: Any = js.native
    
    /* private */ var serializer: Any = js.native
    
    /**
      * This methods specifies the direction of the next navigation performed by the Angular router.
      *
      * `setDirection()` does not trigger any transition, it just sets some flags to be consumed by `ion-router-outlet`.
      *
      * It's recommended to use `navigateForward()`, `navigateBack()` and `navigateRoot()` instead of `setDirection()`.
      */
    def setDirection(direction: RouterDirection): Unit = js.native
    def setDirection(direction: RouterDirection, animated: Boolean): Unit = js.native
    def setDirection(direction: RouterDirection, animated: Boolean, animationDirection: forward | back): Unit = js.native
    def setDirection(
      direction: RouterDirection,
      animated: Boolean,
      animationDirection: forward | back,
      animationBuilder: typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
    ): Unit = js.native
    def setDirection(
      direction: RouterDirection,
      animated: Boolean,
      animationDirection: Unit,
      animationBuilder: typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
    ): Unit = js.native
    def setDirection(direction: RouterDirection, animated: Unit, animationDirection: forward | back): Unit = js.native
    def setDirection(
      direction: RouterDirection,
      animated: Unit,
      animationDirection: forward | back,
      animationBuilder: typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
    ): Unit = js.native
    def setDirection(
      direction: RouterDirection,
      animated: Unit,
      animationDirection: Unit,
      animationBuilder: typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
    ): Unit = js.native
    
    /**
      * @internal
      */
    def setTopOutlet(outlet: IonRouterOutlet): Unit = js.native
    
    /* private */ var topOutlet: Any = js.native
  }
  /* static members */
  object NavController {
    
    @JSImport("@ionic/angular/providers/nav-controller", "NavController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/providers/nav-controller", "NavController.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[NavController, js.Tuple4[Null, Null, Null, Optional]] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[NavController, js.Tuple4[Null, Null, Null, Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/providers/nav-controller", "NavController.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[NavController] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[NavController]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
  
  trait AnimationOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[
        typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
      ] = js.undefined
    
    var animationDirection: js.UndefOr[forward | back] = js.undefined
  }
  object AnimationOptions {
    
    inline def apply(): AnimationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationOptions]
    }
    
    extension [Self <: AnimationOptions](x: Self) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "animation", js.Any.fromFunction2(value))
      
      inline def setAnimationDirection(value: forward | back): Self = StObject.set(x, "animationDirection", value.asInstanceOf[js.Any])
      
      inline def setAnimationDirectionUndefined: Self = StObject.set(x, "animationDirection", js.undefined)
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    }
  }
  
  trait NavigationOptions
    extends StObject
       with NavigationExtras
       with AnimationOptions
  object NavigationOptions {
    
    inline def apply(): NavigationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationOptions]
    }
  }
}
