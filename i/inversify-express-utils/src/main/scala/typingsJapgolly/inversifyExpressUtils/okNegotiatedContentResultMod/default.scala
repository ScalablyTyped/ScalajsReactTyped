package typingsJapgolly.inversifyExpressUtils.okNegotiatedContentResultMod

import typingsJapgolly.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typingsJapgolly.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results/OkNegotiatedContentResult", JSImport.Default)
@js.native
class default[T] protected () extends OkNegotiatedContentResult[T] {
  def this(content: T, apiController: BaseHttpController) = this()
  /* CompleteClass */
  override var apiController: js.Any = js.native
  /* CompleteClass */
  override var content: js.Any = js.native
  /* CompleteClass */
  override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
}

