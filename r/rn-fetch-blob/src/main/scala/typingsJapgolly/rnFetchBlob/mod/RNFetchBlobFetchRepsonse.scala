package typingsJapgolly.rnFetchBlob.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobFetchRepsonse extends js.Object {
  var bodyUsed: Boolean
  var headers: js.Any
  var ok: Boolean
  var resp: FetchBlobResponse
  var rnfbResp: FetchBlobResponse
  var rnfbRespInfo: RNFetchBlobResponseInfo
  var status: Double
  var `type`: String
  def arrayBuffer(): js.Promise[js.Array[_]]
  def blob(): js.Promise[PolyfillBlob]
  def json(): js.Promise[_]
  def rawResp(): js.Promise[FetchBlobResponse]
  def text(): js.Promise[String]
}

object RNFetchBlobFetchRepsonse {
  @scala.inline
  def apply(
    arrayBuffer: CallbackTo[js.Promise[js.Array[js.Any]]],
    blob: CallbackTo[js.Promise[PolyfillBlob]],
    bodyUsed: Boolean,
    headers: js.Any,
    json: CallbackTo[js.Promise[js.Any]],
    ok: Boolean,
    rawResp: CallbackTo[js.Promise[FetchBlobResponse]],
    resp: FetchBlobResponse,
    rnfbResp: FetchBlobResponse,
    rnfbRespInfo: RNFetchBlobResponseInfo,
    status: Double,
    text: CallbackTo[js.Promise[String]],
    `type`: String
  ): RNFetchBlobFetchRepsonse = {
    val __obj = js.Dynamic.literal(bodyUsed = bodyUsed.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], resp = resp.asInstanceOf[js.Any], rnfbResp = rnfbResp.asInstanceOf[js.Any], rnfbRespInfo = rnfbRespInfo.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("arrayBuffer")(arrayBuffer.toJsFn)
    __obj.updateDynamic("blob")(blob.toJsFn)
    __obj.updateDynamic("json")(json.toJsFn)
    __obj.updateDynamic("rawResp")(rawResp.toJsFn)
    __obj.updateDynamic("text")(text.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNFetchBlobFetchRepsonse]
  }
}

