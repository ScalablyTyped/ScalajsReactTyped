package typingsJapgolly.resourcejs.mod

import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any] {
  var countQuery: js.Any = js.native
  var modelQuery: js.Any = js.native
  var noResponse: Boolean = js.native
  var skipDelete: Boolean = js.native
  var skipResource: Boolean = js.native
}

