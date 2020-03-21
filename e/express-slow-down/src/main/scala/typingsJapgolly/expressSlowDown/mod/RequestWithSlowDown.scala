package typingsJapgolly.expressSlowDown.mod

import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Express Request with the added `slowDown` property
  */
@js.native
trait RequestWithSlowDown
  extends Request[ParamsDictionary, js.Any, js.Any] {
  var slowDown: SlowDownRequestAugmentation = js.native
}

