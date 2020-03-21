package typingsJapgolly.popmotion.scrubberMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrubberSubscription extends js.Object {
  def seek(progress: Double): js.Any
}

object ScrubberSubscription {
  @scala.inline
  def apply(seek: Double => CallbackTo[js.Any]): ScrubberSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: scala.Double) => seek(t0).runNow()))
    __obj.asInstanceOf[ScrubberSubscription]
  }
}

