package typingsJapgolly.xhrMock

import typingsJapgolly.xhrMock.mockRequestMod.default
import typingsJapgolly.xhrMock.typesMod.MockFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/handle", JSImport.Namespace)
@js.native
object handleMod extends js.Object {
  def async(
    handlers: js.Array[MockFunction],
    request: default,
    response: typingsJapgolly.xhrMock.mockResponseMod.default
  ): js.Promise[typingsJapgolly.xhrMock.mockResponseMod.default] = js.native
  def sync(
    handlers: js.Array[MockFunction],
    request: default,
    response: typingsJapgolly.xhrMock.mockResponseMod.default
  ): typingsJapgolly.xhrMock.mockResponseMod.default = js.native
}

