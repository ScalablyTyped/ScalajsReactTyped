package typingsJapgolly.inversifyExpressUtils

import typingsJapgolly.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage
import typingsJapgolly.inversifyExpressUtils.libInterfacesMod.HttpContext
import typingsJapgolly.inversifyExpressUtils.libResultsMod.BadRequestErrorMessageResult
import typingsJapgolly.inversifyExpressUtils.libResultsMod.BadRequestResult
import typingsJapgolly.inversifyExpressUtils.libResultsMod.ConflictResult
import typingsJapgolly.inversifyExpressUtils.libResultsMod.CreatedNegotiatedContentResult
import typingsJapgolly.inversifyExpressUtils.libResultsMod.ExceptionResult
import typingsJapgolly.inversifyExpressUtils.libResultsMod.InternalServerErrorResult
import typingsJapgolly.inversifyExpressUtils.libResultsMod.JsonResult
import typingsJapgolly.inversifyExpressUtils.libResultsMod.NotFoundResult
import typingsJapgolly.inversifyExpressUtils.libResultsMod.OkNegotiatedContentResult
import typingsJapgolly.inversifyExpressUtils.libResultsMod.OkResult
import typingsJapgolly.inversifyExpressUtils.libResultsMod.RedirectResult
import typingsJapgolly.inversifyExpressUtils.libResultsMod.ResponseMessageResult
import typingsJapgolly.inversifyExpressUtils.libResultsMod.StatusCodeResult
import typingsJapgolly.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseHttpControllerMod {
  
  @JSImport("inversify-express-utils/lib/base_http_controller", "BaseHttpController")
  @js.native
  open class BaseHttpController () extends StObject {
    
    /* protected */ def badRequest(): BadRequestResult = js.native
    /* protected */ def badRequest(message: String): BadRequestErrorMessageResult = js.native
    
    /* protected */ def conflict(): ConflictResult = js.native
    
    /* protected */ def created[T](location: String, content: T): CreatedNegotiatedContentResult[T] = js.native
    /* protected */ def created[T](location: URL_, content: T): CreatedNegotiatedContentResult[T] = js.native
    
    /* protected */ val httpContext: HttpContext = js.native
    
    /* protected */ def internalServerError(): InternalServerErrorResult = js.native
    /* protected */ def internalServerError(error: js.Error): ExceptionResult = js.native
    
    /* protected */ def json(content: Any): JsonResult = js.native
    /* protected */ def json(content: Any, statusCode: Double): JsonResult = js.native
    
    /* protected */ def notFound(): NotFoundResult = js.native
    
    /* protected */ def ok(): OkResult = js.native
    /* protected */ def ok[T](content: T): OkNegotiatedContentResult[T] = js.native
    
    /* protected */ def redirect(uri: String): RedirectResult = js.native
    /* protected */ def redirect(uri: URL_): RedirectResult = js.native
    
    /* protected */ def responseMessage(message: HttpResponseMessage): ResponseMessageResult = js.native
    
    /* protected */ def statusCode(statusCode: Double): StatusCodeResult = js.native
  }
}
