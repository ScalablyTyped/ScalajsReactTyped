package typingsJapgolly.matrixJsSdk

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var includeFilename: Boolean
  // <optional> Return the raw body, rather than parsing the JSON. Defaults to false (except on node.js, where it defaults to true for backwards compatibility).
  var onlyContentUri: Boolean
  // <optional> Content-type for the upload. Defaults to file.type, or applicaton/octet-stream.
  var rawResponse: Boolean
  // <optional> if false will not send the filename, e.g for encrypted file uploads where filename leaks are undesirable. Defaults to true.
  var `type`: String
  // <optional> Just return the content URI, rather than the whole body. Defaults to false (except on browsers, where it defaults to true for backwards compatibility).
  def callback(args: js.Any*): js.Any
  // <optional> Deprecated. Optional. The callback to invoke on success/failure. See the promise return values for more information.
  def progressHandler(args: js.Any*): js.Any
}

object AnonCallback {
  @scala.inline
  def apply(
    callback: /* repeated */ js.Any => CallbackTo[js.Any],
    includeFilename: Boolean,
    onlyContentUri: Boolean,
    progressHandler: /* repeated */ js.Any => CallbackTo[js.Any],
    rawResponse: Boolean,
    `type`: String
  ): AnonCallback = {
    val __obj = js.Dynamic.literal(includeFilename = includeFilename.asInstanceOf[js.Any], onlyContentUri = onlyContentUri.asInstanceOf[js.Any], rawResponse = rawResponse.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => callback(t0).runNow()))
    __obj.updateDynamic("progressHandler")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => progressHandler(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallback]
  }
}

