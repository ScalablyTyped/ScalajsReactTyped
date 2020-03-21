package typingsJapgolly.requestPromiseNative.errorsMod

import typingsJapgolly.requestPromiseNative.mod.FullResponse
import typingsJapgolly.requestPromiseNative.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("request-promise-native/errors", "TransformError")
@js.native
class TransformErrorCls protected () extends TransformError {
  def this(cause: js.Any, options: Options, response: FullResponse) = this()
  /* CompleteClass */
  override var cause: js.Any = js.native
  /* CompleteClass */
  override var error: js.Any = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var options: Options = js.native
  /* CompleteClass */
  override var response: FullResponse = js.native
}

