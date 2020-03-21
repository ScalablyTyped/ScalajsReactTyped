package typingsJapgolly.webgme.GmeCommon

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promisable extends js.Object {
  def `catch`(callback: CatchCallback): Promisable
  def `then`(callback: ThenCallback): Promisable
}

object Promisable {
  @scala.inline
  def apply(`catch`: CatchCallback => CallbackTo[Promisable], `then`: ThenCallback => CallbackTo[Promisable]): Promisable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction1((t0: typingsJapgolly.webgme.GmeCommon.CatchCallback) => `catch`(t0).runNow()))
    __obj.updateDynamic("then")(js.Any.fromFunction1((t0: typingsJapgolly.webgme.GmeCommon.ThenCallback) => `then`(t0).runNow()))
    __obj.asInstanceOf[Promisable]
  }
}

