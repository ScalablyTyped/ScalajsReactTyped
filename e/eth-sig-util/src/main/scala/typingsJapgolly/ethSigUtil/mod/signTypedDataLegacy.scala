package typingsJapgolly.ethSigUtil.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eth-sig-util", "signTypedDataLegacy")
@js.native
object signTypedDataLegacy extends js.Object {
  def apply(privateKey: Buffer, message: MessageData[EIP712LegacyData]): String = js.native
}

