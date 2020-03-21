package typingsJapgolly.steamLogin.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SteamRequest
  extends Request[ParamsDictionary, js.Any, js.Any] {
  var logout: js.UndefOr[
    js.Function0[js.Function1[/* req */ Request_[ParamsDictionary], js.Function0[Unit]]]
  ] = js.native
  var user: js.UndefOr[SteamUser] = js.native
}

