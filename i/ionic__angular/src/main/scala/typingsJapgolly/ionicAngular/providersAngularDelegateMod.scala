package typingsJapgolly.ionicAngular

import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ApplicationRef
import typingsJapgolly.angularCore.mod.ComponentFactoryResolver
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ViewContainerRef
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectableDeclaration
import typingsJapgolly.ionicAngular.diR3InjectorMod.EnvironmentInjector
import typingsJapgolly.ionicCore.mod.FrameworkDelegate
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersAngularDelegateMod {
  
  @JSImport("@ionic/angular/providers/angular-delegate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/providers/angular-delegate", "AngularDelegate")
  @js.native
  open class AngularDelegate protected () extends StObject {
    def this(zone: NgZone, appRef: ApplicationRef) = this()
    
    /* private */ var appRef: Any = js.native
    
    def create(resolverOrInjector: ComponentFactoryResolver, injector: Injector): AngularFrameworkDelegate = js.native
    def create(resolverOrInjector: ComponentFactoryResolver, injector: Injector, location: ViewContainerRef): AngularFrameworkDelegate = js.native
    
    /* private */ var zone: Any = js.native
  }
  /* static members */
  object AngularDelegate {
    
    @JSImport("@ionic/angular/providers/angular-delegate", "AngularDelegate")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/providers/angular-delegate", "AngularDelegate.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[AngularDelegate, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[AngularDelegate, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/providers/angular-delegate", "AngularDelegate.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[AngularDelegate] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[AngularDelegate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ionic/angular/providers/angular-delegate", "AngularFrameworkDelegate")
  @js.native
  open class AngularFrameworkDelegate protected ()
    extends StObject
       with FrameworkDelegate {
    def this(
      resolverOrInjector: ComponentFactoryResolver,
      injector: Injector,
      location: Unit,
      appRef: ApplicationRef,
      zone: NgZone
    ) = this()
    def this(
      resolverOrInjector: ComponentFactoryResolver,
      injector: Injector,
      location: ViewContainerRef,
      appRef: ApplicationRef,
      zone: NgZone
    ) = this()
    def this(
      resolverOrInjector: EnvironmentInjector,
      injector: Injector,
      location: Unit,
      appRef: ApplicationRef,
      zone: NgZone
    ) = this()
    def this(
      resolverOrInjector: EnvironmentInjector,
      injector: Injector,
      location: ViewContainerRef,
      appRef: ApplicationRef,
      zone: NgZone
    ) = this()
    
    /* private */ var appRef: Any = js.native
    
    /* private */ var elEventsMap: Any = js.native
    
    /* private */ var elRefMap: Any = js.native
    
    /* private */ var injector: Any = js.native
    
    /* private */ var location: Any = js.native
    
    /* private */ var resolverOrInjector: Any = js.native
    
    /* private */ var zone: Any = js.native
  }
  
  inline def attachView(
    zone: NgZone,
    resolverOrInjector: ComponentFactoryResolver,
    injector: Injector,
    location: Unit,
    appRef: ApplicationRef,
    elRefMap: WeakMap[HTMLElement, Any],
    elEventsMap: WeakMap[HTMLElement, js.Function0[Unit]],
    container: Any,
    component: Any,
    params: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("attachView")(zone.asInstanceOf[js.Any], resolverOrInjector.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], location.asInstanceOf[js.Any], appRef.asInstanceOf[js.Any], elRefMap.asInstanceOf[js.Any], elEventsMap.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def attachView(
    zone: NgZone,
    resolverOrInjector: ComponentFactoryResolver,
    injector: Injector,
    location: Unit,
    appRef: ApplicationRef,
    elRefMap: WeakMap[HTMLElement, Any],
    elEventsMap: WeakMap[HTMLElement, js.Function0[Unit]],
    container: Any,
    component: Any,
    params: Any,
    cssClasses: js.Array[String]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("attachView")(zone.asInstanceOf[js.Any], resolverOrInjector.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], location.asInstanceOf[js.Any], appRef.asInstanceOf[js.Any], elRefMap.asInstanceOf[js.Any], elEventsMap.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any], params.asInstanceOf[js.Any], cssClasses.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def attachView(
    zone: NgZone,
    resolverOrInjector: ComponentFactoryResolver,
    injector: Injector,
    location: ViewContainerRef,
    appRef: ApplicationRef,
    elRefMap: WeakMap[HTMLElement, Any],
    elEventsMap: WeakMap[HTMLElement, js.Function0[Unit]],
    container: Any,
    component: Any,
    params: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("attachView")(zone.asInstanceOf[js.Any], resolverOrInjector.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], location.asInstanceOf[js.Any], appRef.asInstanceOf[js.Any], elRefMap.asInstanceOf[js.Any], elEventsMap.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def attachView(
    zone: NgZone,
    resolverOrInjector: ComponentFactoryResolver,
    injector: Injector,
    location: ViewContainerRef,
    appRef: ApplicationRef,
    elRefMap: WeakMap[HTMLElement, Any],
    elEventsMap: WeakMap[HTMLElement, js.Function0[Unit]],
    container: Any,
    component: Any,
    params: Any,
    cssClasses: js.Array[String]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("attachView")(zone.asInstanceOf[js.Any], resolverOrInjector.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], location.asInstanceOf[js.Any], appRef.asInstanceOf[js.Any], elRefMap.asInstanceOf[js.Any], elEventsMap.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any], params.asInstanceOf[js.Any], cssClasses.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def attachView(
    zone: NgZone,
    resolverOrInjector: EnvironmentInjector,
    injector: Injector,
    location: Unit,
    appRef: ApplicationRef,
    elRefMap: WeakMap[HTMLElement, Any],
    elEventsMap: WeakMap[HTMLElement, js.Function0[Unit]],
    container: Any,
    component: Any,
    params: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("attachView")(zone.asInstanceOf[js.Any], resolverOrInjector.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], location.asInstanceOf[js.Any], appRef.asInstanceOf[js.Any], elRefMap.asInstanceOf[js.Any], elEventsMap.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def attachView(
    zone: NgZone,
    resolverOrInjector: EnvironmentInjector,
    injector: Injector,
    location: Unit,
    appRef: ApplicationRef,
    elRefMap: WeakMap[HTMLElement, Any],
    elEventsMap: WeakMap[HTMLElement, js.Function0[Unit]],
    container: Any,
    component: Any,
    params: Any,
    cssClasses: js.Array[String]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("attachView")(zone.asInstanceOf[js.Any], resolverOrInjector.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], location.asInstanceOf[js.Any], appRef.asInstanceOf[js.Any], elRefMap.asInstanceOf[js.Any], elEventsMap.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any], params.asInstanceOf[js.Any], cssClasses.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def attachView(
    zone: NgZone,
    resolverOrInjector: EnvironmentInjector,
    injector: Injector,
    location: ViewContainerRef,
    appRef: ApplicationRef,
    elRefMap: WeakMap[HTMLElement, Any],
    elEventsMap: WeakMap[HTMLElement, js.Function0[Unit]],
    container: Any,
    component: Any,
    params: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("attachView")(zone.asInstanceOf[js.Any], resolverOrInjector.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], location.asInstanceOf[js.Any], appRef.asInstanceOf[js.Any], elRefMap.asInstanceOf[js.Any], elEventsMap.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def attachView(
    zone: NgZone,
    resolverOrInjector: EnvironmentInjector,
    injector: Injector,
    location: ViewContainerRef,
    appRef: ApplicationRef,
    elRefMap: WeakMap[HTMLElement, Any],
    elEventsMap: WeakMap[HTMLElement, js.Function0[Unit]],
    container: Any,
    component: Any,
    params: Any,
    cssClasses: js.Array[String]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("attachView")(zone.asInstanceOf[js.Any], resolverOrInjector.asInstanceOf[js.Any], injector.asInstanceOf[js.Any], location.asInstanceOf[js.Any], appRef.asInstanceOf[js.Any], elRefMap.asInstanceOf[js.Any], elEventsMap.asInstanceOf[js.Any], container.asInstanceOf[js.Any], component.asInstanceOf[js.Any], params.asInstanceOf[js.Any], cssClasses.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def bindLifecycleEvents(zone: NgZone, instance: Any, element: HTMLElement): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindLifecycleEvents")(zone.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
