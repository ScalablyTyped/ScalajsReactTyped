package typingsJapgolly.ckeditorCkeditor5Engine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeaveUnmerged extends js.Object {
  var doNotResetEntireContent: js.UndefOr[Boolean] = js.undefined
  var leaveUnmerged: js.UndefOr[Boolean] = js.undefined
}

object AnonLeaveUnmerged {
  @scala.inline
  def apply(
    doNotResetEntireContent: js.UndefOr[Boolean] = js.undefined,
    leaveUnmerged: js.UndefOr[Boolean] = js.undefined
  ): AnonLeaveUnmerged = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doNotResetEntireContent)) __obj.updateDynamic("doNotResetEntireContent")(doNotResetEntireContent.asInstanceOf[js.Any])
    if (!js.isUndefined(leaveUnmerged)) __obj.updateDynamic("leaveUnmerged")(leaveUnmerged.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeaveUnmerged]
  }
}

