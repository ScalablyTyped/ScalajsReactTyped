package typingsJapgolly.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchItemError extends js.Object {
  /**
    * The numeric error code of the error.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * A text description of the error.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
}

object BatchItemError {
  @scala.inline
  def apply(ErrorCode: String = null, ErrorMessage: String = null, Index: Int | scala.Double = null): BatchItemError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (Index != null) __obj.updateDynamic("Index")(Index.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchItemError]
  }
}

