package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptimizeVaultJob extends js.Object {
  var GarbageCollectFiles: Boolean
  val Thorough: Boolean
  val VaultGUID: String
  def GetNumberOfSteps(): Double
  def GetOneBasedIndexOfStep(CurrentStep: Double): Double
  def GetStepProgressText(CurrentStep: Double): String
  def Set(GuidVault: String, Thorough: Boolean): Unit
}

object IOptimizeVaultJob {
  @scala.inline
  def apply(
    GarbageCollectFiles: Boolean,
    GetNumberOfSteps: CallbackTo[Double],
    GetOneBasedIndexOfStep: Double => CallbackTo[Double],
    GetStepProgressText: Double => CallbackTo[String],
    Set: (String, Boolean) => Callback,
    Thorough: Boolean,
    VaultGUID: String
  ): IOptimizeVaultJob = {
    val __obj = js.Dynamic.literal(GarbageCollectFiles = GarbageCollectFiles.asInstanceOf[js.Any], Thorough = Thorough.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any])
    __obj.updateDynamic("GetNumberOfSteps")(GetNumberOfSteps.toJsFn)
    __obj.updateDynamic("GetOneBasedIndexOfStep")(js.Any.fromFunction1((t0: scala.Double) => GetOneBasedIndexOfStep(t0).runNow()))
    __obj.updateDynamic("GetStepProgressText")(js.Any.fromFunction1((t0: scala.Double) => GetStepProgressText(t0).runNow()))
    __obj.updateDynamic("Set")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => Set(t0, t1).runNow()))
    __obj.asInstanceOf[IOptimizeVaultJob]
  }
}

