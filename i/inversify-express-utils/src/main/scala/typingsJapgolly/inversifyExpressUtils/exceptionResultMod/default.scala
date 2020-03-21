package typingsJapgolly.inversifyExpressUtils.exceptionResultMod

import typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typingsJapgolly.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results/ExceptionResult", JSImport.Default)
@js.native
class default protected () extends ExceptionResult {
  def this(error: js.Error, apiController: BaseHttpController) = this()
  /* CompleteClass */
  override var apiController: js.Any = js.native
  /* CompleteClass */
  override var error: js.Any = js.native
  /* CompleteClass */
  override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
}

