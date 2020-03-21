package typingsJapgolly.audioPlay.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioPlayHandle extends js.Object {
  def pause(): js.Any
  def play(): js.Any
}

object AudioPlayHandle {
  @scala.inline
  def apply(pause: CallbackTo[js.Any], play: CallbackTo[js.Any]): AudioPlayHandle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.asInstanceOf[AudioPlayHandle]
  }
}

