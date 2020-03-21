package typingsJapgolly.reactNativeFs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileOptions extends js.Object {
  // deprecated
  var begin: js.UndefOr[js.Function1[/* res */ UploadBeginCallbackResult, Unit]] = js.undefined
  // Default is 'POST', supports 'POST' and 'PUT'
  var beginCallback: js.UndefOr[js.Function1[/* res */ UploadBeginCallbackResult, Unit]] = js.undefined
  // URL to upload file to
  var binaryStreamOnly: js.UndefOr[Boolean] = js.undefined
  // An object of headers to be passed to the server
  var fields: js.UndefOr[Fields] = js.undefined
  // Allow for binary data stream for file to be uploaded without extra headers, Default is 'false'
  var files: js.Array[UploadFileItem]
  // An array of objects with the file information to be uploaded.
  var headers: js.UndefOr[Headers] = js.undefined
  // An object of fields to be passed to the server
  var method: js.UndefOr[String] = js.undefined
  var progress: js.UndefOr[js.Function1[/* res */ UploadProgressCallbackResult, Unit]] = js.undefined
  // deprecated
  var progressCallback: js.UndefOr[js.Function1[/* res */ UploadProgressCallbackResult, Unit]] = js.undefined
  var toUrl: String
}

object UploadFileOptions {
  @scala.inline
  def apply(
    files: js.Array[UploadFileItem],
    toUrl: String,
    begin: /* res */ UploadBeginCallbackResult => Callback = null,
    beginCallback: /* res */ UploadBeginCallbackResult => Callback = null,
    binaryStreamOnly: js.UndefOr[Boolean] = js.undefined,
    fields: Fields = null,
    headers: Headers = null,
    method: String = null,
    progress: /* res */ UploadProgressCallbackResult => Callback = null,
    progressCallback: /* res */ UploadProgressCallbackResult => Callback = null
  ): UploadFileOptions = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], toUrl = toUrl.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.reactNativeFs.mod.UploadBeginCallbackResult) => begin(t0).runNow()))
    if (beginCallback != null) __obj.updateDynamic("beginCallback")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.reactNativeFs.mod.UploadBeginCallbackResult) => beginCallback(t0).runNow()))
    if (!js.isUndefined(binaryStreamOnly)) __obj.updateDynamic("binaryStreamOnly")(binaryStreamOnly.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.reactNativeFs.mod.UploadProgressCallbackResult) => progress(t0).runNow()))
    if (progressCallback != null) __obj.updateDynamic("progressCallback")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.reactNativeFs.mod.UploadProgressCallbackResult) => progressCallback(t0).runNow()))
    __obj.asInstanceOf[UploadFileOptions]
  }
}

