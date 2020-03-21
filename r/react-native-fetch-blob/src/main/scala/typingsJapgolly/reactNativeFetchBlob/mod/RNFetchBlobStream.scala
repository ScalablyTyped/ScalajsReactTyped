package typingsJapgolly.reactNativeFetchBlob.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobStream extends js.Object {
  def onData(): Unit
  def onEnd(): Unit
  def onError(): Unit
}

object RNFetchBlobStream {
  @scala.inline
  def apply(onData: Callback, onEnd: Callback, onError: Callback): RNFetchBlobStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onData")(onData.toJsFn)
    __obj.updateDynamic("onEnd")(onEnd.toJsFn)
    __obj.updateDynamic("onError")(onError.toJsFn)
    __obj.asInstanceOf[RNFetchBlobStream]
  }
}

