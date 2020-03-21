package typingsJapgolly.angularHttpAuth

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReject extends js.Object {
  def reject(data: js.Any): Unit
  def resolve(data: js.Any): Unit
}

object AnonReject {
  @scala.inline
  def apply(reject: js.Any => Callback, resolve: js.Any => Callback): AnonReject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reject")(js.Any.fromFunction1((t0: js.Any) => reject(t0).runNow()))
    __obj.updateDynamic("resolve")(js.Any.fromFunction1((t0: js.Any) => resolve(t0).runNow()))
    __obj.asInstanceOf[AnonReject]
  }
}

