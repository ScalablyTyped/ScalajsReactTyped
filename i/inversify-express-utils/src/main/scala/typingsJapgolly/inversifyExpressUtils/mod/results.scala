package typingsJapgolly.inversifyExpressUtils.mod

import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils", "results")
@js.native
object results extends js.Object {
  @js.native
  class BadRequestErrorMessageResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.resultsMod.BadRequestErrorMessageResult {
    def this(
      message: String,
      apiController: typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class BadRequestResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.resultsMod.BadRequestResult {
    def this(apiController: typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class ConflictResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.resultsMod.ConflictResult {
    def this(apiController: typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class CreatedNegotiatedContentResult[T] protected ()
    extends typingsJapgolly.inversifyExpressUtils.resultsMod.CreatedNegotiatedContentResult[T] {
    def this(
      location: String,
      content: T,
      apiController: typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
    def this(
      location: URL_,
      content: T,
      apiController: typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class ExceptionResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.resultsMod.ExceptionResult {
    def this(
      error: js.Error,
      apiController: typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class InternalServerErrorResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.resultsMod.InternalServerErrorResult {
    def this(apiController: typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class JsonResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.resultsMod.JsonResult {
    def this(
      json: js.Any,
      statusCode: Double,
      apiController: typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class NotFoundResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.resultsMod.NotFoundResult {
    def this(apiController: typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class OkNegotiatedContentResult[T] protected ()
    extends typingsJapgolly.inversifyExpressUtils.resultsMod.OkNegotiatedContentResult[T] {
    def this(
      content: T,
      apiController: typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class OkResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.resultsMod.OkResult {
    def this(apiController: typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class RedirectResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.resultsMod.RedirectResult {
    def this(
      location: String,
      apiController: typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
    def this(
      location: URL_,
      apiController: typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class ResponseMessageResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.resultsMod.ResponseMessageResult {
    def this(
      message: typingsJapgolly.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage,
      apiController: typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class StatusCodeResult protected ()
    extends typingsJapgolly.inversifyExpressUtils.resultsMod.StatusCodeResult {
    def this(
      statusCode: Double,
      apiController: typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
}

