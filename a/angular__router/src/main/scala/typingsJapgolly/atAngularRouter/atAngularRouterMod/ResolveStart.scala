package typingsJapgolly.atAngularRouter.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "ResolveStart")
@js.native
class ResolveStart protected () extends RouterEvent {
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /** @docsNotRequired */
  urlAfterRedirects: String,
    /** @docsNotRequired */
  state: RouterStateSnapshot
  ) = this()
  /** @docsNotRequired */
  var state: RouterStateSnapshot = js.native
  /** @docsNotRequired */
  var urlAfterRedirects: String = js.native
}

