package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVerifyVaultJob extends js.Object {
  val FixErrors: Boolean
  val VaultGUID: String
  val VerifyFileContents: Boolean
  def Clone(): IVerifyVaultJob
  def GetNumberOfSteps(): Double
  def GetOneBasedIndexOfStep(CurrentStep: Double): Double
  def GetStepProgressText(CurrentStep: Double): String
  def Set(GuidVault: String, FixErrors: Boolean, VerifyFileContents: Boolean): Unit
}

object IVerifyVaultJob {
  @scala.inline
  def apply(
    Clone: CallbackTo[IVerifyVaultJob],
    FixErrors: Boolean,
    GetNumberOfSteps: CallbackTo[Double],
    GetOneBasedIndexOfStep: Double => CallbackTo[Double],
    GetStepProgressText: Double => CallbackTo[String],
    Set: (String, Boolean, Boolean) => Callback,
    VaultGUID: String,
    VerifyFileContents: Boolean
  ): IVerifyVaultJob = {
    val __obj = js.Dynamic.literal(FixErrors = FixErrors.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any], VerifyFileContents = VerifyFileContents.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetNumberOfSteps")(GetNumberOfSteps.toJsFn)
    __obj.updateDynamic("GetOneBasedIndexOfStep")(js.Any.fromFunction1((t0: scala.Double) => GetOneBasedIndexOfStep(t0).runNow()))
    __obj.updateDynamic("GetStepProgressText")(js.Any.fromFunction1((t0: scala.Double) => GetStepProgressText(t0).runNow()))
    __obj.updateDynamic("Set")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Boolean, t2: scala.Boolean) => Set(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IVerifyVaultJob]
  }
}

