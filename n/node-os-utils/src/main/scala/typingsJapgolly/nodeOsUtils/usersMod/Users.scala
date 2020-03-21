package typingsJapgolly.nodeOsUtils.usersMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Users extends js.Object {
  def openedCount(): js.Promise[Double | String]
}

object Users {
  @scala.inline
  def apply(openedCount: CallbackTo[js.Promise[Double | String]]): Users = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openedCount")(openedCount.toJsFn)
    __obj.asInstanceOf[Users]
  }
}

