package typingsJapgolly.yog2Kernel.mod

import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.yog2Kernel.TypeofRAL
import typingsJapgolly.yog2Kernel.TypeofRALPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends typingsJapgolly.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any] {
  var CURRENT_APP: String = js.native
  var ral: TypeofRAL = js.native
  var ralP: TypeofRALPromise = js.native
}

