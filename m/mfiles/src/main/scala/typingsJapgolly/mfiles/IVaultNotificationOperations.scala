package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultNotificationOperations extends js.Object {
  def SendCustomNotification(
    UserOrUserGroupIDs: IUserOrUserGroupIDs,
    IncludeSubstituteUsers: Boolean,
    ExternalRecipients: IStrings,
    SendWithServerEmailIdentity: Boolean,
    Subject: String,
    Body: String
  ): Unit
}

object IVaultNotificationOperations {
  @scala.inline
  def apply(
    SendCustomNotification: (IUserOrUserGroupIDs, Boolean, IStrings, Boolean, String, String) => Callback
  ): IVaultNotificationOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SendCustomNotification")(js.Any.fromFunction6((t0: typingsJapgolly.mfiles.IUserOrUserGroupIDs, t1: scala.Boolean, t2: typingsJapgolly.mfiles.IStrings, t3: scala.Boolean, t4: java.lang.String, t5: java.lang.String) => SendCustomNotification(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.asInstanceOf[IVaultNotificationOperations]
  }
}

