package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerLicenseManagementOperations extends js.Object {
  def GetLicenseStatus(): ILicenseStatus
  def SetLicenseCodeAndSerialNumber(SerialNumber: String, LicenseCode: String): Unit
}

object IServerLicenseManagementOperations {
  @scala.inline
  def apply(
    GetLicenseStatus: CallbackTo[ILicenseStatus],
    SetLicenseCodeAndSerialNumber: (String, String) => Callback
  ): IServerLicenseManagementOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetLicenseStatus")(GetLicenseStatus.toJsFn)
    __obj.updateDynamic("SetLicenseCodeAndSerialNumber")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => SetLicenseCodeAndSerialNumber(t0, t1).runNow()))
    __obj.asInstanceOf[IServerLicenseManagementOperations]
  }
}

