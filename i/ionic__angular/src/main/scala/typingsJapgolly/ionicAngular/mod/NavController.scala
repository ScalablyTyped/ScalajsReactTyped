package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCommon.mod.Location
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectableDeclaration
import typingsJapgolly.angularRouter.mod.Router
import typingsJapgolly.angularRouter.mod.UrlSerializer
import typingsJapgolly.ionicAngular.anon.Optional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "NavController")
@js.native
open class NavController protected ()
  extends typingsJapgolly.ionicAngular.providersNavControllerMod.NavController {
  def this(
    platform: typingsJapgolly.ionicAngular.providersPlatformMod.Platform,
    location: Location,
    serializer: UrlSerializer
  ) = this()
  def this(
    platform: typingsJapgolly.ionicAngular.providersPlatformMod.Platform,
    location: Location,
    serializer: UrlSerializer,
    router: Router
  ) = this()
}
/* static members */
object NavController {
  
  @JSImport("@ionic/angular", "NavController")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "NavController.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[
    typingsJapgolly.ionicAngular.providersNavControllerMod.NavController, 
    js.Tuple4[Null, Null, Null, Optional]
  ] = js.native
  inline def ɵfac_=(
    x: ɵɵFactoryDeclaration[
      typingsJapgolly.ionicAngular.providersNavControllerMod.NavController, 
      js.Tuple4[Null, Null, Null, Optional]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "NavController.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[typingsJapgolly.ionicAngular.providersNavControllerMod.NavController] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[typingsJapgolly.ionicAngular.providersNavControllerMod.NavController]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
