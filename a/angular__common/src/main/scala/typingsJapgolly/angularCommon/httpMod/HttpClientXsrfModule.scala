package typingsJapgolly.angularCommon.httpMod

import typingsJapgolly.angularCommon.AnonCookieName
import typingsJapgolly.angularCore.mod.ModuleWithProviders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http", "HttpClientXsrfModule")
@js.native
class HttpClientXsrfModule ()
  extends typingsJapgolly.angularCommon.httpHttpMod.HttpClientXsrfModule

/* static members */
@JSImport("@angular/common/http", "HttpClientXsrfModule")
@js.native
object HttpClientXsrfModule extends js.Object {
  /**
    * Disable the default XSRF protection.
    */
  def disable(): ModuleWithProviders[typingsJapgolly.angularCommon.httpHttpMod.HttpClientXsrfModule] = js.native
  /**
    * Configure XSRF protection.
    * @param options An object that can specify either or both
    * cookie name or header name.
    * - Cookie name default is `XSRF-TOKEN`.
    * - Header name default is `X-XSRF-TOKEN`.
    *
    */
  def withOptions(): ModuleWithProviders[typingsJapgolly.angularCommon.httpHttpMod.HttpClientXsrfModule] = js.native
  def withOptions(options: AnonCookieName): ModuleWithProviders[typingsJapgolly.angularCommon.httpHttpMod.HttpClientXsrfModule] = js.native
}

