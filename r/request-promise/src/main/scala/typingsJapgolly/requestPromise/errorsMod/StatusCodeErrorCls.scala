package typingsJapgolly.requestPromise.errorsMod

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.requestPromise.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("request-promise/errors", "StatusCodeError")
@js.native
class StatusCodeErrorCls protected () extends StatusCodeError {
  def this(statusCode: Double, body: js.Any, options: Options, response: IncomingMessage) = this()
  /* CompleteClass */
  override var error: js.Any = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var options: Options = js.native
  /* CompleteClass */
  override var response: IncomingMessage = js.native
  /* CompleteClass */
  override var statusCode: Double = js.native
}

