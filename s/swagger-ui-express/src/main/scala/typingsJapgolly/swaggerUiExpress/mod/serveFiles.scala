package typingsJapgolly.swaggerUiExpress.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-ui-express", "serveFiles")
@js.native
object serveFiles extends js.Object {
  def apply(): js.Array[RequestHandler[ParamsDictionary]] = js.native
  def apply(swaggerDoc: JsonObject): js.Array[RequestHandler[ParamsDictionary]] = js.native
  def apply(swaggerDoc: JsonObject, opts: SwaggerUiOptions): js.Array[RequestHandler[ParamsDictionary]] = js.native
}

