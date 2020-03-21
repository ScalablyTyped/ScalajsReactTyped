package typingsJapgolly.rnFetchBlob.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.base64
import typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.path
import typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchBlobResponse extends js.Object {
  var data: js.Any
  var respInfo: RNFetchBlobResponseInfo
  var taskId: String
  var `type`: base64 | path | utf8
  /**
    * Return BASE64 string directly.
    * @return BASE64 string of response body.
    */
  def base64(): js.Any
  /**
    * Convert result to javascript RNFetchBlob object.
    * @return Return a promise resolves Blob object.
    */
  def blob(contentType: String, sliceSize: Double): js.Promise[PolyfillBlob]
  /**
    * Remove cahced file
    */
  def flush(): Unit
  /**
    * Convert result to JSON object.
    * @return Parsed javascript object.
    */
  def json(): js.Any
  /**
    * get path of response temp file
    * @return File path of temp file.
    */
  def path(): String
  /**
    * Read file content with given encoding, if the response does not contains
    * a file path, show warning message
    * @param  encode Encode type, should be one of `base64`, `ascrii`, `utf8`.
    */
  def readFile(encode: Encoding): js.Promise[_] | Null
  /**
    * Start read stream from cached file
    * @param  encode Encode type, should be one of `base64`, `ascrii`, `utf8`.
    */
  def readStream(encode: Encoding): RNFetchBlobStream | Null
  def session(name: String): RNFetchBlobSession | Null
  /**
    * Convert result to text.
    * @return Decoded base64 string.
    */
  def text(): String | js.Promise[_]
}

object FetchBlobResponse {
  @scala.inline
  def apply(
    base64: CallbackTo[js.Any],
    blob: (String, Double) => CallbackTo[js.Promise[PolyfillBlob]],
    data: js.Any,
    flush: Callback,
    json: CallbackTo[js.Any],
    path: CallbackTo[String],
    readFile: Encoding => CallbackTo[js.Promise[js.Any] | Null],
    readStream: Encoding => CallbackTo[RNFetchBlobStream | Null],
    respInfo: RNFetchBlobResponseInfo,
    session: String => CallbackTo[RNFetchBlobSession | Null],
    taskId: String,
    text: CallbackTo[String | js.Promise[js.Any]],
    `type`: base64 | path | utf8
  ): FetchBlobResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], respInfo = respInfo.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.updateDynamic("base64")(base64.toJsFn)
    __obj.updateDynamic("blob")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => blob(t0, t1).runNow()))
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("json")(json.toJsFn)
    __obj.updateDynamic("path")(path.toJsFn)
    __obj.updateDynamic("readFile")(js.Any.fromFunction1((t0: typingsJapgolly.rnFetchBlob.mod.Encoding) => readFile(t0).runNow()))
    __obj.updateDynamic("readStream")(js.Any.fromFunction1((t0: typingsJapgolly.rnFetchBlob.mod.Encoding) => readStream(t0).runNow()))
    __obj.updateDynamic("session")(js.Any.fromFunction1((t0: java.lang.String) => session(t0).runNow()))
    __obj.updateDynamic("text")(text.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchBlobResponse]
  }
}

