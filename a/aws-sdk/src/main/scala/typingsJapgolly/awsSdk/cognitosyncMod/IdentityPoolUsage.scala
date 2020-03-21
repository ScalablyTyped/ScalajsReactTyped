package typingsJapgolly.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolUsage extends js.Object {
  /**
    * Data storage information for the identity pool.
    */
  var DataStorage: js.UndefOr[Long] = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: js.UndefOr[typingsJapgolly.awsSdk.cognitosyncMod.IdentityPoolId] = js.native
  /**
    * Date on which the identity pool was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * Number of sync sessions for the identity pool.
    */
  var SyncSessionsCount: js.UndefOr[Long] = js.native
}

object IdentityPoolUsage {
  @scala.inline
  def apply(
    DataStorage: Int | Double = null,
    IdentityPoolId: IdentityPoolId = null,
    LastModifiedDate: js.Date = null,
    SyncSessionsCount: Int | Double = null
  ): IdentityPoolUsage = {
    val __obj = js.Dynamic.literal()
    if (DataStorage != null) __obj.updateDynamic("DataStorage")(DataStorage.asInstanceOf[js.Any])
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (SyncSessionsCount != null) __obj.updateDynamic("SyncSessionsCount")(SyncSessionsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolUsage]
  }
}

