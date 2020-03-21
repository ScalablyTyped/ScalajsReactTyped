package typingsJapgolly.bittorrentProtocol.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var length: Double
  var offset: Double
  var piece: Double
  def callback(): Unit
}

object Request {
  @scala.inline
  def apply(callback: Callback, length: Double, offset: Double, piece: Double): Request = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], piece = piece.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(callback.toJsFn)
    __obj.asInstanceOf[Request]
  }
}

