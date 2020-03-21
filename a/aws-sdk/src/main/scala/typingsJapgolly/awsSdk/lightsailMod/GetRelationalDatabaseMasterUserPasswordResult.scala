package typingsJapgolly.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseMasterUserPasswordResult extends js.Object {
  /**
    * The timestamp when the specified version of the master user password was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The master user password for the password version specified.
    */
  var masterUserPassword: js.UndefOr[SensitiveString] = js.native
}

object GetRelationalDatabaseMasterUserPasswordResult {
  @scala.inline
  def apply(createdAt: js.Date = null, masterUserPassword: SensitiveString = null): GetRelationalDatabaseMasterUserPasswordResult = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (masterUserPassword != null) __obj.updateDynamic("masterUserPassword")(masterUserPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseMasterUserPasswordResult]
  }
}

