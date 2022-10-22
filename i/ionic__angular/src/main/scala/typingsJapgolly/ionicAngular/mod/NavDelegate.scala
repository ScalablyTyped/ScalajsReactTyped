package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCore.mod.ComponentFactoryResolver
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.ViewContainerRef
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-nav`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "NavDelegate")
@js.native
open class NavDelegate protected ()
  extends typingsJapgolly.ionicAngular.directivesNavigationNavDelegateMod.NavDelegate {
  def this(
    ref: ElementRef[Any],
    resolver: ComponentFactoryResolver,
    injector: Injector,
    angularDelegate: typingsJapgolly.ionicAngular.providersAngularDelegateMod.AngularDelegate,
    location: ViewContainerRef
  ) = this()
}
/* static members */
object NavDelegate {
  
  @JSImport("@ionic/angular", "NavDelegate")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "NavDelegate.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    typingsJapgolly.ionicAngular.directivesNavigationNavDelegateMod.NavDelegate, 
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
      typingsJapgolly.ionicAngular.directivesNavigationNavDelegateMod.NavDelegate, 
      `ion-nav`, 
      scala.Nothing, 
      js.Object, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "NavDelegate.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[
    typingsJapgolly.ionicAngular.directivesNavigationNavDelegateMod.NavDelegate, 
    scala.Nothing
  ] = js.native
  inline def ɵfac_=(
    x: ɵɵFactoryDeclaration[
      typingsJapgolly.ionicAngular.directivesNavigationNavDelegateMod.NavDelegate, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
