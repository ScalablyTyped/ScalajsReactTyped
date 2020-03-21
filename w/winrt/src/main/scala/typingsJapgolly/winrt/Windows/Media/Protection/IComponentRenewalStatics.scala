package typingsJapgolly.winrt.Windows.Media.Protection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponentRenewalStatics extends js.Object {
  def renewSystemComponentsAsync(information: RevocationAndRenewalInformation): IAsyncOperationWithProgress[RenewalStatus, Double]
}

object IComponentRenewalStatics {
  @scala.inline
  def apply(
    renewSystemComponentsAsync: RevocationAndRenewalInformation => CallbackTo[IAsyncOperationWithProgress[RenewalStatus, Double]]
  ): IComponentRenewalStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renewSystemComponentsAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Media.Protection.RevocationAndRenewalInformation) => renewSystemComponentsAsync(t0).runNow()))
    __obj.asInstanceOf[IComponentRenewalStatics]
  }
}

