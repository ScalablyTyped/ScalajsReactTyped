package typingsJapgolly.xhrMock

import typingsJapgolly.xhrMock.typesMod.MockFunction
import typingsJapgolly.xhrMock.typesMod.MockObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/utils/delay", JSImport.Namespace)
@js.native
object delayMod extends js.Object {
  def delay(mock: MockFunction): MockFunction = js.native
  def delay(mock: MockFunction, ms: Double): MockFunction = js.native
  def delay(mock: MockObject): MockFunction = js.native
  def delay(mock: MockObject, ms: Double): MockFunction = js.native
}

