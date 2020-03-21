package typingsJapgolly.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlacklistEntry extends js.Object {
  /**
    * Additional information about the blacklisting event, as provided by the blacklist maintainer.
    */
  var Description: js.UndefOr[BlacklistingDescription] = js.native
  /**
    * The time when the blacklisting event occurred, shown in Unix time format.
    */
  var ListingTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the blacklist that the IP address appears on.
    */
  var RblName: js.UndefOr[typingsJapgolly.awsSdk.pinpointemailMod.RblName] = js.native
}

object BlacklistEntry {
  @scala.inline
  def apply(Description: BlacklistingDescription = null, ListingTime: js.Date = null, RblName: RblName = null): BlacklistEntry = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ListingTime != null) __obj.updateDynamic("ListingTime")(ListingTime.asInstanceOf[js.Any])
    if (RblName != null) __obj.updateDynamic("RblName")(RblName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlacklistEntry]
  }
}

