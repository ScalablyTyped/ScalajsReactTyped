package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILicenseStatus extends js.Object {
  val EvaluationDaysLeft: Double
  val EvaluationMode: Boolean
  val Expired: Boolean
  val LicenseCode: String
  val NumOfConcurrentUserLicenses: Double
  val NumOfNamedUserLicenses: Double
  val NumOfReadonlyLicenses: Double
  val SerialNumber: String
  def ClearLicenseCode(): Unit
}

object ILicenseStatus {
  @scala.inline
  def apply(
    ClearLicenseCode: Callback,
    EvaluationDaysLeft: Double,
    EvaluationMode: Boolean,
    Expired: Boolean,
    LicenseCode: String,
    NumOfConcurrentUserLicenses: Double,
    NumOfNamedUserLicenses: Double,
    NumOfReadonlyLicenses: Double,
    SerialNumber: String
  ): ILicenseStatus = {
    val __obj = js.Dynamic.literal(EvaluationDaysLeft = EvaluationDaysLeft.asInstanceOf[js.Any], EvaluationMode = EvaluationMode.asInstanceOf[js.Any], Expired = Expired.asInstanceOf[js.Any], LicenseCode = LicenseCode.asInstanceOf[js.Any], NumOfConcurrentUserLicenses = NumOfConcurrentUserLicenses.asInstanceOf[js.Any], NumOfNamedUserLicenses = NumOfNamedUserLicenses.asInstanceOf[js.Any], NumOfReadonlyLicenses = NumOfReadonlyLicenses.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("ClearLicenseCode")(ClearLicenseCode.toJsFn)
    __obj.asInstanceOf[ILicenseStatus]
  }
}

