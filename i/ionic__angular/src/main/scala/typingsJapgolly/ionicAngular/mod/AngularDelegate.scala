package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCore.mod.ApplicationRef
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "AngularDelegate")
@js.native
open class AngularDelegate protected ()
  extends typingsJapgolly.ionicAngular.providersAngularDelegateMod.AngularDelegate {
  def this(zone: NgZone, appRef: ApplicationRef) = this()
}
/* static members */
object AngularDelegate {
  
  @JSImport("@ionic/angular", "AngularDelegate")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "AngularDelegate.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[
    typingsJapgolly.ionicAngular.providersAngularDelegateMod.AngularDelegate, 
    scala.Nothing
  ] = js.native
  inline def ɵfac_=(
    x: ɵɵFactoryDeclaration[
      typingsJapgolly.ionicAngular.providersAngularDelegateMod.AngularDelegate, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "AngularDelegate.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[typingsJapgolly.ionicAngular.providersAngularDelegateMod.AngularDelegate] = js.native
  inline def ɵprov_=(
    x: ɵɵInjectableDeclaration[typingsJapgolly.ionicAngular.providersAngularDelegateMod.AngularDelegate]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
