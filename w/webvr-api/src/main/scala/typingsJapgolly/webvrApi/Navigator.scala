package typingsJapgolly.webvrApi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  val activeVRDisplays: js.Array[VRDisplay]
  def getVRDisplays(): js.Promise[js.Array[VRDisplay]]
}

object Navigator {
  @scala.inline
  def apply(activeVRDisplays: js.Array[VRDisplay], getVRDisplays: CallbackTo[js.Promise[js.Array[VRDisplay]]]): Navigator = {
    val __obj = js.Dynamic.literal(activeVRDisplays = activeVRDisplays.asInstanceOf[js.Any])
    __obj.updateDynamic("getVRDisplays")(getVRDisplays.toJsFn)
    __obj.asInstanceOf[Navigator]
  }
}

