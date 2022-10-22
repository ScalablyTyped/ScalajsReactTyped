package typingsJapgolly.inversifyExpressUtils

import typingsJapgolly.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage
import typingsJapgolly.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultsMod {
  
  @JSImport("inversify-express-utils/lib/results", "BadRequestErrorMessageResult")
  @js.native
  open class BadRequestErrorMessageResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.libResultsBadRequestErrorMessageResultMod.BadRequestErrorMessageResult {
    def this(message: String) = this()
  }
  
  @JSImport("inversify-express-utils/lib/results", "BadRequestResult")
  @js.native
  open class BadRequestResult ()
    extends typingsJapgolly.inversifyExpressUtils.libResultsBadRequestResultMod.BadRequestResult
  
  @JSImport("inversify-express-utils/lib/results", "ConflictResult")
  @js.native
  open class ConflictResult ()
    extends typingsJapgolly.inversifyExpressUtils.libResultsConflictResultMod.ConflictResult
  
  @JSImport("inversify-express-utils/lib/results", "CreatedNegotiatedContentResult")
  @js.native
  open class CreatedNegotiatedContentResult[T] protected ()
    extends typingsJapgolly.inversifyExpressUtils.libResultsCreatedNegotiatedContentResultMod.CreatedNegotiatedContentResult[T] {
    def this(location: String, content: T) = this()
    def this(location: URL_, content: T) = this()
  }
  
  @JSImport("inversify-express-utils/lib/results", "ExceptionResult")
  @js.native
  open class ExceptionResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.libResultsExceptionResultMod.ExceptionResult {
    def this(error: js.Error) = this()
  }
  
  @JSImport("inversify-express-utils/lib/results", "InternalServerErrorResult")
  @js.native
  open class InternalServerErrorResult ()
    extends typingsJapgolly.inversifyExpressUtils.libResultsInternalServerErrorMod.InternalServerErrorResult
  
  @JSImport("inversify-express-utils/lib/results", "JsonResult")
  @js.native
  open class JsonResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.libResultsJsonResultMod.JsonResult {
    def this(json: Any, statusCode: Double) = this()
  }
  
  @JSImport("inversify-express-utils/lib/results", "NotFoundResult")
  @js.native
  open class NotFoundResult ()
    extends typingsJapgolly.inversifyExpressUtils.libResultsNotFoundResultMod.NotFoundResult
  
  @JSImport("inversify-express-utils/lib/results", "OkNegotiatedContentResult")
  @js.native
  open class OkNegotiatedContentResult[T] protected ()
    extends typingsJapgolly.inversifyExpressUtils.libResultsOkNegotiatedContentResultMod.OkNegotiatedContentResult[T] {
    def this(content: T) = this()
  }
  
  @JSImport("inversify-express-utils/lib/results", "OkResult")
  @js.native
  open class OkResult ()
    extends typingsJapgolly.inversifyExpressUtils.libResultsOkResultMod.OkResult
  
  @JSImport("inversify-express-utils/lib/results", "RedirectResult")
  @js.native
  open class RedirectResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.libResultsRedirectResultMod.RedirectResult {
    def this(location: String) = this()
    def this(location: URL_) = this()
  }
  
  @JSImport("inversify-express-utils/lib/results", "ResponseMessageResult")
  @js.native
  open class ResponseMessageResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.libResultsResponseMessageResultMod.ResponseMessageResult {
    def this(message: HttpResponseMessage) = this()
  }
  
  @JSImport("inversify-express-utils/lib/results", "StatusCodeResult")
  @js.native
  open class StatusCodeResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.libResultsStatusCodeResultMod.StatusCodeResult {
    def this(statusCode: Double) = this()
  }
}
