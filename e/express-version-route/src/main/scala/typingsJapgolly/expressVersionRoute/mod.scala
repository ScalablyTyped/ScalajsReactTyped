package typingsJapgolly.expressVersionRoute

import typingsJapgolly.express.mod.Handler
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-version-route", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def route(versionsMap: Map[String, Handler]): Handler = js.native
}

