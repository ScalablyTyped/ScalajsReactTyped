package typingsJapgolly.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionStatus extends js.Object {
  /**
    * Timestamp which tells the creation date for the entity.
    */
  var CreationDate: js.Date = js.native
  /**
    * Indicates whether the Elasticsearch domain is being deleted.
    */
  var PendingDeletion: js.UndefOr[Boolean] = js.native
  /**
    * Provides the OptionState for the Elasticsearch domain.
    */
  var State: OptionState = js.native
  /**
    * Timestamp which tells the last updated time for the entity.
    */
  var UpdateDate: js.Date = js.native
  /**
    * Specifies the latest version for the entity.
    */
  var UpdateVersion: js.UndefOr[UIntValue] = js.native
}

object OptionStatus {
  @scala.inline
  def apply(
    CreationDate: js.Date,
    State: OptionState,
    UpdateDate: js.Date,
    PendingDeletion: js.UndefOr[scala.Boolean] = js.undefined,
    UpdateVersion: Int | scala.Double = null
  ): OptionStatus = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], UpdateDate = UpdateDate.asInstanceOf[js.Any])
    if (!js.isUndefined(PendingDeletion)) __obj.updateDynamic("PendingDeletion")(PendingDeletion.asInstanceOf[js.Any])
    if (UpdateVersion != null) __obj.updateDynamic("UpdateVersion")(UpdateVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionStatus]
  }
}

