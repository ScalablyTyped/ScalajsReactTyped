package typingsJapgolly.expressAsyncWrap

import typingsJapgolly.connect.mod.NextFunction
import typingsJapgolly.expressServeStaticCore.mod.ErrorRequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-async-wrap", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default(
    handler: js.Function3[
      /* req */ Request[ParamsDictionary, _, _], 
      /* res */ Response[_], 
      /* next */ NextFunction, 
      js.Promise[Unit]
    ]
  ): RequestHandler[ParamsDictionary, _, _] = js.native
  def default(
    handler: js.Function4[
      /* err */ js.Any, 
      /* req */ Request[ParamsDictionary, _, _], 
      /* res */ Response[_], 
      /* next */ NextFunction, 
      js.Promise[Unit]
    ]
  ): ErrorRequestHandler[ParamsDictionary, _, _] = js.native
}

