package typingsJapgolly.thrift.mod.Thrift

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "Thrift.TProtocolException")
@js.native
class TProtocolException protected () extends Error {
  def this(`type`: TProtocolExceptionType, message: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var `type`: TProtocolExceptionType = js.native
}

