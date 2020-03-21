package typingsJapgolly.nise.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakeXHR_ extends js.Object {
  var FakeXMLHttpRequest: FakeXMLHttpRequestStatic
  def useFakeXMLHttpRequest(): FakeXMLHttpRequestStatic
}

object FakeXHR_ {
  @scala.inline
  def apply(
    FakeXMLHttpRequest: FakeXMLHttpRequestStatic,
    useFakeXMLHttpRequest: CallbackTo[FakeXMLHttpRequestStatic]
  ): FakeXHR_ = {
    val __obj = js.Dynamic.literal(FakeXMLHttpRequest = FakeXMLHttpRequest.asInstanceOf[js.Any])
    __obj.updateDynamic("useFakeXMLHttpRequest")(useFakeXMLHttpRequest.toJsFn)
    __obj.asInstanceOf[FakeXHR_]
  }
}

