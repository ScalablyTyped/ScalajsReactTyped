package typingsJapgolly.p5.p5Mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioVoice extends js.Object {
  /**
    *   Connect to p5 objects or Web Audio Nodes
    */
  def connect(unit: js.Object): Unit
  /**
    *   Disconnect from soundOut
    */
  def disconnect(): Unit
}

object AudioVoice {
  @scala.inline
  def apply(connect: js.Object => Callback, disconnect: Callback): AudioVoice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connect")(js.Any.fromFunction1((t0: js.Object) => connect(t0).runNow()))
    __obj.updateDynamic("disconnect")(disconnect.toJsFn)
    __obj.asInstanceOf[AudioVoice]
  }
}

