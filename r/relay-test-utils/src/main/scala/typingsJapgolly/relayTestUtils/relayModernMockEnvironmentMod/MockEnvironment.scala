package typingsJapgolly.relayTestUtils.relayModernMockEnvironmentMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockEnvironment extends js.Object {
  var mock: MockFunctions
  def mockClear(): Unit
}

object MockEnvironment {
  @scala.inline
  def apply(mock: MockFunctions, mockClear: Callback): MockEnvironment = {
    val __obj = js.Dynamic.literal(mock = mock.asInstanceOf[js.Any])
    __obj.updateDynamic("mockClear")(mockClear.toJsFn)
    __obj.asInstanceOf[MockEnvironment]
  }
}

