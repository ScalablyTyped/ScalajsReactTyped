package typingsJapgolly.inversifyExpressUtils

import typingsJapgolly.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.HttpContext
import typingsJapgolly.inversifyExpressUtils.resultsMod.BadRequestErrorMessageResult
import typingsJapgolly.inversifyExpressUtils.resultsMod.BadRequestResult
import typingsJapgolly.inversifyExpressUtils.resultsMod.ConflictResult
import typingsJapgolly.inversifyExpressUtils.resultsMod.CreatedNegotiatedContentResult
import typingsJapgolly.inversifyExpressUtils.resultsMod.ExceptionResult
import typingsJapgolly.inversifyExpressUtils.resultsMod.InternalServerErrorResult
import typingsJapgolly.inversifyExpressUtils.resultsMod.JsonResult
import typingsJapgolly.inversifyExpressUtils.resultsMod.NotFoundResult
import typingsJapgolly.inversifyExpressUtils.resultsMod.OkNegotiatedContentResult
import typingsJapgolly.inversifyExpressUtils.resultsMod.OkResult
import typingsJapgolly.inversifyExpressUtils.resultsMod.RedirectResult
import typingsJapgolly.inversifyExpressUtils.resultsMod.ResponseMessageResult
import typingsJapgolly.inversifyExpressUtils.resultsMod.StatusCodeResult
import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/base_http_controller", JSImport.Namespace)
@js.native
object baseHttpControllerMod extends js.Object {
  @js.native
  class BaseHttpController () extends js.Object {
    val httpContext: HttpContext = js.native
    /* protected */ def badRequest(): BadRequestResult = js.native
    /* protected */ def badRequest(message: String): BadRequestErrorMessageResult = js.native
    /* protected */ def conflict(): ConflictResult = js.native
    /* protected */ def created[T](location: String, content: T): CreatedNegotiatedContentResult[T] = js.native
    /* protected */ def created[T](location: URL_, content: T): CreatedNegotiatedContentResult[T] = js.native
    /* protected */ def internalServerError(): InternalServerErrorResult = js.native
    /* protected */ def internalServerError(error: js.Error): ExceptionResult = js.native
    /* protected */ def json(content: js.Any): JsonResult = js.native
    /* protected */ def json(content: js.Any, statusCode: Double): JsonResult = js.native
    /* protected */ def notFound(): NotFoundResult = js.native
    /* protected */ def ok(): OkResult = js.native
    /* protected */ def ok[T](content: T): OkNegotiatedContentResult[T] = js.native
    /* protected */ def redirect(uri: String): RedirectResult = js.native
    /* protected */ def redirect(uri: URL_): RedirectResult = js.native
    /* protected */ def responseMessage(message: HttpResponseMessage): ResponseMessageResult = js.native
    /* protected */ def statusCode(statusCode: Double): StatusCodeResult = js.native
  }
  
}

