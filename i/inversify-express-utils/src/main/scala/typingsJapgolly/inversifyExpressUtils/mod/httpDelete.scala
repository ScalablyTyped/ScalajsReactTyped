package typingsJapgolly.inversifyExpressUtils.mod

import typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.HandlerDecorator
import typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils", "httpDelete")
@js.native
object httpDelete extends js.Object {
  def apply(path: String, middleware: Middleware*): HandlerDecorator = js.native
}

