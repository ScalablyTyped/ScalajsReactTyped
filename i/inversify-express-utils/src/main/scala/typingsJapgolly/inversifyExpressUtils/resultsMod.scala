package typingsJapgolly.inversifyExpressUtils

import typingsJapgolly.inversifyExpressUtils.badRequestErrorMessageResultMod.default
import typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typingsJapgolly.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results", JSImport.Namespace)
@js.native
object resultsMod extends js.Object {
  @js.native
  class BadRequestErrorMessageResult protected () extends default {
    def this(message: String, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class BadRequestResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.badRequestResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class ConflictResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.conflictResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class CreatedNegotiatedContentResult[T] protected ()
    extends typingsJapgolly.inversifyExpressUtils.createdNegotiatedContentResultMod.default[T] {
    def this(location: String, content: T, apiController: BaseHttpController) = this()
    def this(location: URL_, content: T, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class ExceptionResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.exceptionResultMod.default {
    def this(error: js.Error, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class InternalServerErrorResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.internalServerErrorMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class JsonResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.jsonResultMod.default {
    def this(json: js.Any, statusCode: Double, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class NotFoundResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.notFoundResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class OkNegotiatedContentResult[T] protected ()
    extends typingsJapgolly.inversifyExpressUtils.okNegotiatedContentResultMod.default[T] {
    def this(content: T, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class OkResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.okResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class RedirectResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.redirectResultMod.default {
    def this(location: String, apiController: BaseHttpController) = this()
    def this(location: URL_, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class ResponseMessageResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.responseMessageResultMod.default {
    def this(message: HttpResponseMessage, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class StatusCodeResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.statusCodeResultMod.default {
    def this(statusCode: Double, apiController: BaseHttpController) = this()
  }
  
}

