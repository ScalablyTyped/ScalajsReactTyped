package typingsJapgolly.xhrMock

import typingsJapgolly.xhrMock.typesMod.MockFunction
import typingsJapgolly.xhrMock.typesMod.MockObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/utils/sequence", JSImport.Namespace)
@js.native
object sequenceMod extends js.Object {
  def sequence(mocks: js.Array[MockFunction | MockObject]): MockFunction = js.native
}

