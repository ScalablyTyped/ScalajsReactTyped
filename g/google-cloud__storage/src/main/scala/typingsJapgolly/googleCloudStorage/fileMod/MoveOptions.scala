package typingsJapgolly.googleCloudStorage.fileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveOptions extends js.Object {
  var userProject: js.UndefOr[String] = js.undefined
}

object MoveOptions {
  @scala.inline
  def apply(userProject: String = null): MoveOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveOptions]
  }
}

