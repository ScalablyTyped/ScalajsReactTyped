package typingsJapgolly.tensorflowTfjsData.testUtilsMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakeMediaStreamAudioSourceNode extends js.Object {
  def connect(node: js.Object): Unit
}

object FakeMediaStreamAudioSourceNode {
  @scala.inline
  def apply(connect: js.Object => Callback): FakeMediaStreamAudioSourceNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connect")(js.Any.fromFunction1((t0: js.Object) => connect(t0).runNow()))
    __obj.asInstanceOf[FakeMediaStreamAudioSourceNode]
  }
}

