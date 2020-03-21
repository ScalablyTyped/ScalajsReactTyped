package typingsJapgolly.oauthShim.mod

import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.oauthShim.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any] {
  var oauthshim: js.UndefOr[AnonData] = js.native
}

