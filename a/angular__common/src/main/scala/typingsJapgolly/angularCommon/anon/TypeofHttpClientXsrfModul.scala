package typingsJapgolly.angularCommon.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.angularCommon.httpMod.HttpClientXsrfModule
import typingsJapgolly.angularCore.mod.ModuleWithProviders
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectorDeclaration
import typingsJapgolly.angularCore.mod.ɵɵNgModuleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHttpClientXsrfModul
  extends StObject
     with Instantiable0[HttpClientXsrfModule] {
  
  /**
    * Disable the default XSRF protection.
    */
  def disable(): ModuleWithProviders[HttpClientXsrfModule] = js.native
  
  /**
    * Configure XSRF protection.
    * @param options An object that can specify either or both
    * cookie name or header name.
    * - Cookie name default is `XSRF-TOKEN`.
    * - Header name default is `X-XSRF-TOKEN`.
    *
    */
  def withOptions(): ModuleWithProviders[HttpClientXsrfModule] = js.native
  def withOptions(options: CookieName): ModuleWithProviders[HttpClientXsrfModule] = js.native
  
  var ɵfac: ɵɵFactoryDeclaration[HttpClientXsrfModule, scala.Nothing] = js.native
  
  var ɵinj: ɵɵInjectorDeclaration[HttpClientXsrfModule] = js.native
  
  var ɵmod: ɵɵNgModuleDeclaration[HttpClientXsrfModule, scala.Nothing, scala.Nothing, scala.Nothing] = js.native
}
