package typingsJapgolly.rdfjsFetchLite.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.experimental.ResponseType
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import typingsJapgolly.rdfJs.mod.BaseQuad
import typingsJapgolly.rdfJs.mod.DatasetCore
import typingsJapgolly.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetResponse[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] extends RdfFetchResponse[OutQuad] {
  def dataset(): js.Promise[D]
}

object DatasetResponse {
  @scala.inline
  def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](
    arrayBuffer: CallbackTo[js.Promise[scala.scalajs.js.typedarray.ArrayBuffer]],
    blob: CallbackTo[js.Promise[Blob]],
    bodyUsed: Boolean,
    dataset: CallbackTo[js.Promise[D]],
    formData: CallbackTo[js.Promise[FormData]],
    headers: Headers,
    json: CallbackTo[js.Promise[js.Any]],
    ok: Boolean,
    quadStream: CallbackTo[js.Promise[Stream[OutQuad]]],
    redirected: Boolean,
    status: Double,
    statusText: String,
    text: CallbackTo[js.Promise[String]],
    trailer: js.Promise[Headers],
    `type`: ResponseType,
    url: String,
    body: ReadableStream[scala.scalajs.js.typedarray.Uint8Array] = null
  ): DatasetResponse[D, OutQuad, InQuad] = {
    val __obj = js.Dynamic.literal(bodyUsed = bodyUsed.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("arrayBuffer")(arrayBuffer.toJsFn)
    __obj.updateDynamic("blob")(blob.toJsFn)
    __obj.updateDynamic("dataset")(dataset.toJsFn)
    __obj.updateDynamic("formData")(formData.toJsFn)
    __obj.updateDynamic("json")(json.toJsFn)
    __obj.updateDynamic("quadStream")(quadStream.toJsFn)
    __obj.updateDynamic("text")(text.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetResponse[D, OutQuad, InQuad]]
  }
}

