package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultExtensionMethodOperations extends js.Object {
  def DoesActiveVaultExtensionMethodExist(MethodIdentifier: String): Boolean
  def ExecuteVaultExtensionMethod(MethodIdentifier: String, Input: String): String
}

object IVaultExtensionMethodOperations {
  @scala.inline
  def apply(
    DoesActiveVaultExtensionMethodExist: String => CallbackTo[Boolean],
    ExecuteVaultExtensionMethod: (String, String) => CallbackTo[String]
  ): IVaultExtensionMethodOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DoesActiveVaultExtensionMethodExist")(js.Any.fromFunction1((t0: java.lang.String) => DoesActiveVaultExtensionMethodExist(t0).runNow()))
    __obj.updateDynamic("ExecuteVaultExtensionMethod")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => ExecuteVaultExtensionMethod(t0, t1).runNow()))
    __obj.asInstanceOf[IVaultExtensionMethodOperations]
  }
}

