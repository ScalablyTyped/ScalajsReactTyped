package typingsJapgolly.xhrMock

import typingsJapgolly.xhrMock.typesMod.MockFunction
import typingsJapgolly.xhrMock.typesMod.MockObject
import typingsJapgolly.xhrMock.xhrmockMod.XHRMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MockRequest ()
    extends typingsJapgolly.xhrMock.mockRequestMod.MockRequest
  
  @js.native
  class MockResponse ()
    extends typingsJapgolly.xhrMock.mockResponseMod.MockResponse
  
  val default: XHRMock = js.native
  def delay(mock: MockFunction): MockFunction = js.native
  def delay(mock: MockFunction, ms: Double): MockFunction = js.native
  def delay(mock: MockObject): MockFunction = js.native
  def delay(mock: MockObject, ms: Double): MockFunction = js.native
  def once(mock: MockFunction): MockFunction = js.native
  def once(mock: MockObject): MockFunction = js.native
  def proxy(
    req: typingsJapgolly.xhrMock.mockRequestMod.default,
    res: typingsJapgolly.xhrMock.mockResponseMod.default
  ): js.Promise[typingsJapgolly.xhrMock.mockResponseMod.default] = js.native
  def sequence(mocks: js.Array[MockFunction | MockObject]): MockFunction = js.native
}

