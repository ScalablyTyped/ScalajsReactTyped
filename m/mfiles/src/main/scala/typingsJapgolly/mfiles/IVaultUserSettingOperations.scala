package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultUserSettingOperations extends js.Object {
  def ChangeVaultLanguage(Language: Double): Unit
  def GetSubstituteUsers(): IUserOrUserGroupIDs
  def GetVaultLanguage(): Double
  def GetVaultLanguageCode(): String
  def SetSubstituteUsers(UserOrUserGroupIDs: IUserOrUserGroupIDs): Unit
}

object IVaultUserSettingOperations {
  @scala.inline
  def apply(
    ChangeVaultLanguage: Double => Callback,
    GetSubstituteUsers: CallbackTo[IUserOrUserGroupIDs],
    GetVaultLanguage: CallbackTo[Double],
    GetVaultLanguageCode: CallbackTo[String],
    SetSubstituteUsers: IUserOrUserGroupIDs => Callback
  ): IVaultUserSettingOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ChangeVaultLanguage")(js.Any.fromFunction1((t0: scala.Double) => ChangeVaultLanguage(t0).runNow()))
    __obj.updateDynamic("GetSubstituteUsers")(GetSubstituteUsers.toJsFn)
    __obj.updateDynamic("GetVaultLanguage")(GetVaultLanguage.toJsFn)
    __obj.updateDynamic("GetVaultLanguageCode")(GetVaultLanguageCode.toJsFn)
    __obj.updateDynamic("SetSubstituteUsers")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IUserOrUserGroupIDs) => SetSubstituteUsers(t0).runNow()))
    __obj.asInstanceOf[IVaultUserSettingOperations]
  }
}

