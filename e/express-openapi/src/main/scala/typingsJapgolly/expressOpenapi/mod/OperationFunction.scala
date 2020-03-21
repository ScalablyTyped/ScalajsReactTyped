package typingsJapgolly.expressOpenapi.mod

import typingsJapgolly.expressServeStaticCore.mod.NextFunction
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationFunction
  extends RequestHandler[ParamsDictionary, js.Any, js.Any]
     with Operation {
  var apiDoc: js.UndefOr[typingsJapgolly.openapiTypes.mod.OpenAPI.Operation] = js.native
  /* InferMemberOverrides */
  override def apply(
    T0: /* req */ Request[ParamsDictionary, js.Any, js.Any],
    T1: /* res */ Response[js.Any],
    T2: /* next */ NextFunction
  ): js.Any = js.native
}

