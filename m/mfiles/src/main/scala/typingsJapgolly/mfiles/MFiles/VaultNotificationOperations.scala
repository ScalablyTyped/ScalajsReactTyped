package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IStrings
import typingsJapgolly.mfiles.IUserOrUserGroupIDs
import typingsJapgolly.mfiles.IVaultNotificationOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultNotificationOperations")
@js.native
class VaultNotificationOperations () extends IVaultNotificationOperations {
  /* CompleteClass */
  override def SendCustomNotification(
    UserOrUserGroupIDs: IUserOrUserGroupIDs,
    IncludeSubstituteUsers: Boolean,
    ExternalRecipients: IStrings,
    SendWithServerEmailIdentity: Boolean,
    Subject: String,
    Body: String
  ): Unit = js.native
}

@JSGlobal("MFiles.VaultNotificationOperations")
@js.native
object VaultNotificationOperations extends Instantiable0[IVaultNotificationOperations]

