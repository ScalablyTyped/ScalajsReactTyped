package typingsJapgolly.libraCore.vmErrorsPbMod

import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.libraCore.vmErrorsPbMod.DynamicReferenceError.DynamicReferenceErrorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError")
@js.native
class DynamicReferenceError_ () extends Message {
  def getErrorCode(): DynamicReferenceErrorType = js.native
  def setErrorCode(value: DynamicReferenceErrorType): Unit = js.native
}

