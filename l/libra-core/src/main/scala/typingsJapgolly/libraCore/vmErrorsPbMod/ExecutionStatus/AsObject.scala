package typingsJapgolly.libraCore.vmErrorsPbMod.ExecutionStatus

import typingsJapgolly.libraCore.vmErrorsPbMod.RuntimeStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var arithmeticError: js.UndefOr[typingsJapgolly.libraCore.vmErrorsPbMod.ArithmeticError.AsObject] = js.undefined
  var assertionFailure: js.UndefOr[typingsJapgolly.libraCore.vmErrorsPbMod.AssertionFailure.AsObject] = js.undefined
  var referenceError: js.UndefOr[typingsJapgolly.libraCore.vmErrorsPbMod.DynamicReferenceError.AsObject] = js.undefined
  var runtimeStatus: RuntimeStatus
}

object AsObject {
  @scala.inline
  def apply(
    runtimeStatus: RuntimeStatus,
    arithmeticError: typingsJapgolly.libraCore.vmErrorsPbMod.ArithmeticError.AsObject = null,
    assertionFailure: typingsJapgolly.libraCore.vmErrorsPbMod.AssertionFailure.AsObject = null,
    referenceError: typingsJapgolly.libraCore.vmErrorsPbMod.DynamicReferenceError.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(runtimeStatus = runtimeStatus.asInstanceOf[js.Any])
    if (arithmeticError != null) __obj.updateDynamic("arithmeticError")(arithmeticError.asInstanceOf[js.Any])
    if (assertionFailure != null) __obj.updateDynamic("assertionFailure")(assertionFailure.asInstanceOf[js.Any])
    if (referenceError != null) __obj.updateDynamic("referenceError")(referenceError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

