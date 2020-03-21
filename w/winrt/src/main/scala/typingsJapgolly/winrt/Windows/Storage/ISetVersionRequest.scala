package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetVersionRequest extends js.Object {
  var currentVersion: Double
  var desiredVersion: Double
  def getDeferral(): SetVersionDeferral
}

object ISetVersionRequest {
  @scala.inline
  def apply(currentVersion: Double, desiredVersion: Double, getDeferral: CallbackTo[SetVersionDeferral]): ISetVersionRequest = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], desiredVersion = desiredVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("getDeferral")(getDeferral.toJsFn)
    __obj.asInstanceOf[ISetVersionRequest]
  }
}

