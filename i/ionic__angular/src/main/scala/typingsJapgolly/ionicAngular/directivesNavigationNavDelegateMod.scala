package typingsJapgolly.ionicAngular

import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ComponentFactoryResolver
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.ViewContainerRef
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-nav`
import typingsJapgolly.ionicAngular.providersAngularDelegateMod.AngularDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesNavigationNavDelegateMod {
  
  @JSImport("@ionic/angular/directives/navigation/nav-delegate", "NavDelegate")
  @js.native
  open class NavDelegate protected () extends StObject {
    def this(
      ref: ElementRef[Any],
      resolver: ComponentFactoryResolver,
      injector: Injector,
      angularDelegate: AngularDelegate,
      location: ViewContainerRef
    ) = this()
    
    /* protected */ var el: HTMLElement = js.native
  }
  /* static members */
  object NavDelegate {
    
    @JSImport("@ionic/angular/directives/navigation/nav-delegate", "NavDelegate")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/directives/navigation/nav-delegate", "NavDelegate.\u0275dir")
    @js.native
    def ɵdir: ɵɵDirectiveDeclaration[
        NavDelegate, 
        `ion-nav`, 
        scala.Nothing, 
        js.Object, 
        js.Object, 
        scala.Nothing, 
        scala.Nothing, 
        `false`
      ] = js.native
    inline def ɵdir_=(
      x: ɵɵDirectiveDeclaration[
          NavDelegate, 
          `ion-nav`, 
          scala.Nothing, 
          js.Object, 
          js.Object, 
          scala.Nothing, 
          scala.Nothing, 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/directives/navigation/nav-delegate", "NavDelegate.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[NavDelegate, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[NavDelegate, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
}
