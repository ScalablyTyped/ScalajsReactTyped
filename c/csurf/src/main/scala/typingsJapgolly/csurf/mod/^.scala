package typingsJapgolly.csurf.mod

import typingsJapgolly.csurf.AnonCookie
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csurf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _] = js.native
  def apply(options: AnonCookie): RequestHandler[ParamsDictionary, _, _] = js.native
}

