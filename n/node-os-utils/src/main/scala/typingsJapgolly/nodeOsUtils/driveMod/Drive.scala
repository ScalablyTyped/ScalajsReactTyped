package typingsJapgolly.nodeOsUtils.driveMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Drive extends js.Object {
  def free(diskName: String): js.Promise[DriveFreeInfo]
  def info(diskName: String): js.Promise[DriveInfo]
  def used(diskName: String): js.Promise[DriveUsedInfo]
}

object Drive {
  @scala.inline
  def apply(
    free: String => CallbackTo[js.Promise[DriveFreeInfo]],
    info: String => CallbackTo[js.Promise[DriveInfo]],
    used: String => CallbackTo[js.Promise[DriveUsedInfo]]
  ): Drive = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("free")(js.Any.fromFunction1((t0: java.lang.String) => free(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: java.lang.String) => info(t0).runNow()))
    __obj.updateDynamic("used")(js.Any.fromFunction1((t0: java.lang.String) => used(t0).runNow()))
    __obj.asInstanceOf[Drive]
  }
}

