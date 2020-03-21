package typingsJapgolly.rnFetchBlob.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobReadStream extends js.Object {
  var bufferSize: js.UndefOr[Double] = js.undefined
  var closed: Boolean
  var encoding: Encoding
  var path: String
  var tick: Double
  def onData(fn: js.Function1[/* chunk */ String | js.Array[Double], Unit]): Unit
  def onEnd(fn: js.Function0[Unit]): Unit
  def onError(fn: js.Function1[/* err */ js.Any, Unit]): Unit
  def open(): Unit
}

object RNFetchBlobReadStream {
  @scala.inline
  def apply(
    closed: Boolean,
    encoding: Encoding,
    onData: js.Function1[/* chunk */ String | js.Array[Double], Unit] => Callback,
    onEnd: js.Function0[Unit] => Callback,
    onError: js.Function1[/* err */ js.Any, Unit] => Callback,
    open: Callback,
    path: String,
    tick: Double,
    bufferSize: Int | Double = null
  ): RNFetchBlobReadStream = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any])
    __obj.updateDynamic("onData")(js.Any.fromFunction1((t0: js.Function1[/* chunk */ java.lang.String | js.Array[scala.Double], scala.Unit]) => onData(t0).runNow()))
    __obj.updateDynamic("onEnd")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onEnd(t0).runNow()))
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: js.Function1[/* err */ js.Any, scala.Unit]) => onError(t0).runNow()))
    __obj.updateDynamic("open")(open.toJsFn)
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNFetchBlobReadStream]
  }
}

