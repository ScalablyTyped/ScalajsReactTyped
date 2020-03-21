package typingsJapgolly.bip174

import typingsJapgolly.bip174.interfacesMod.KeyValue
import typingsJapgolly.bip174.interfacesMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter/global/unsignedTx", JSImport.Namespace)
@js.native
object unsignedTxMod extends js.Object {
  def encode(data: Transaction): KeyValue = js.native
}

