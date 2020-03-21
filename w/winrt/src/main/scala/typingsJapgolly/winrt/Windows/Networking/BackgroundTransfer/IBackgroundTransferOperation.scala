package typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTransferOperation extends js.Object {
  var costPolicy: BackgroundTransferCostPolicy
  var group: String
  var guid: String
  var method: String
  var requestedUri: Uri
  def getResponseInformation(): ResponseInformation
  def getResultStreamAt(position: Double): IInputStream
}

object IBackgroundTransferOperation {
  @scala.inline
  def apply(
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: CallbackTo[ResponseInformation],
    getResultStreamAt: Double => CallbackTo[IInputStream],
    group: String,
    guid: String,
    method: String,
    requestedUri: Uri
  ): IBackgroundTransferOperation = {
    val __obj = js.Dynamic.literal(costPolicy = costPolicy.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any])
    __obj.updateDynamic("getResponseInformation")(getResponseInformation.toJsFn)
    __obj.updateDynamic("getResultStreamAt")(js.Any.fromFunction1((t0: scala.Double) => getResultStreamAt(t0).runNow()))
    __obj.asInstanceOf[IBackgroundTransferOperation]
  }
}

