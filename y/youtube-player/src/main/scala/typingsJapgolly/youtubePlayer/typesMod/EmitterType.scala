package typingsJapgolly.youtubePlayer.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitterType extends js.Object {
  def trigger(eventName: String, event: js.Object): Unit
}

object EmitterType {
  @scala.inline
  def apply(trigger: (String, js.Object) => Callback): EmitterType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("trigger")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => trigger(t0, t1).runNow()))
    __obj.asInstanceOf[EmitterType]
  }
}

