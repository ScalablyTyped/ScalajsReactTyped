package typingsJapgolly.rnFetchBlob.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobWriteStream extends js.Object {
  var append: Boolean
  var encoding: String
  var id: String
  def close(): Unit
  def write(data: String): js.Promise[Unit]
}

object RNFetchBlobWriteStream {
  @scala.inline
  def apply(
    append: Boolean,
    close: Callback,
    encoding: String,
    id: String,
    write: String => CallbackTo[js.Promise[Unit]]
  ): RNFetchBlobWriteStream = {
    val __obj = js.Dynamic.literal(append = append.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: java.lang.String) => write(t0).runNow()))
    __obj.asInstanceOf[RNFetchBlobWriteStream]
  }
}

