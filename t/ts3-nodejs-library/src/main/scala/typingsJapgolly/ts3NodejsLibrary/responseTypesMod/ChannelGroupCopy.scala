package typingsJapgolly.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelGroupCopy extends js.Object {
  /** only available when a new group gets created */
  var cgid: js.UndefOr[Double] = js.undefined
}

object ChannelGroupCopy {
  @scala.inline
  def apply(cgid: Int | Double = null): ChannelGroupCopy = {
    val __obj = js.Dynamic.literal()
    if (cgid != null) __obj.updateDynamic("cgid")(cgid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelGroupCopy]
  }
}

