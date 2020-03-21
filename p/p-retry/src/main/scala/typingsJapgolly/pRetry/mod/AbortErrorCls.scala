package typingsJapgolly.pRetry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-retry", "AbortError")
@js.native
class AbortErrorCls protected () extends AbortErrorClass {
  /**
  	Abort retrying and reject the promise.
  	@param message - Error message or custom error.
  	*/
  def this(message: String) = this()
  def this(message: js.Error) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  @JSName("name")
  override val name_AbortErrorClass: typingsJapgolly.pRetry.pRetryStrings.AbortError = js.native
  /* CompleteClass */
  override val originalError: js.Error = js.native
}

