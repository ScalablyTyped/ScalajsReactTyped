package typingsJapgolly.sharepoint.SP.UserProfiles

import typingsJapgolly.sharepoint.SP.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returns information about a request to follow an item. */
@JSGlobal("SP.UserProfiles.FollowResult")
@js.native
class FollowResult () extends ClientValueObject {
  /** Contains the item being followed. */
  def get_item(): FollowedItem = js.native
  /** Provides information about the attempt to follow an item. */
  def get_resultType(): FollowResultType = js.native
}

