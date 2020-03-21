package typingsJapgolly.keycloakConnect.mod

import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.keycloakConnect.AnonGrant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantedRequest
  extends Request[ParamsDictionary, js.Any, js.Any] {
  var kauth: AnonGrant = js.native
}

