package typingsJapgolly.dplayer.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullScreen extends js.Object {
  def cancel(`type`: FullScreenType): Unit
  def request(`type`: FullScreenType): Unit
}

object FullScreen {
  @scala.inline
  def apply(cancel: FullScreenType => Callback, request: FullScreenType => Callback): FullScreen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: typingsJapgolly.dplayer.mod.FullScreenType) => cancel(t0).runNow()))
    __obj.updateDynamic("request")(js.Any.fromFunction1((t0: typingsJapgolly.dplayer.mod.FullScreenType) => request(t0).runNow()))
    __obj.asInstanceOf[FullScreen]
  }
}

