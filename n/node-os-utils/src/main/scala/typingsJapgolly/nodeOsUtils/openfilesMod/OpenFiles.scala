package typingsJapgolly.nodeOsUtils.openfilesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFiles extends js.Object {
  def openFd(): js.Promise[Double]
}

object OpenFiles {
  @scala.inline
  def apply(openFd: CallbackTo[js.Promise[Double]]): OpenFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openFd")(openFd.toJsFn)
    __obj.asInstanceOf[OpenFiles]
  }
}

