package typingsJapgolly.xhrMock

import typingsJapgolly.xhrMock.typesMod.MockFunction
import typingsJapgolly.xhrMock.typesMod.MockObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/utils/once", JSImport.Namespace)
@js.native
object onceMod extends js.Object {
  def once(mock: MockFunction): MockFunction = js.native
  def once(mock: MockObject): MockFunction = js.native
}

