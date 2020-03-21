package typingsJapgolly.angularMocks.mod.angularAugmentingMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// LogService
// see https://docs.angularjs.org/api/ngMock/service/$log
// Augments the original service
///////////////////////////////////////////////////////////////////////////
trait ILogService extends js.Object {
  def assertEmpty(): Unit
  def reset(): Unit
}

object ILogService {
  @scala.inline
  def apply(assertEmpty: Callback, reset: Callback): ILogService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assertEmpty")(assertEmpty.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[ILogService]
  }
}

