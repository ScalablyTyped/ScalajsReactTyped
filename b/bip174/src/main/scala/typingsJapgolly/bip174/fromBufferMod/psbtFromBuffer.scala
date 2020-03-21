package typingsJapgolly.bip174.fromBufferMod

import typingsJapgolly.bip174.interfacesMod.TransactionFromBuffer
import typingsJapgolly.bip174.parserMod.PsbtAttributes
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/parser/fromBuffer", "psbtFromBuffer")
@js.native
object psbtFromBuffer extends js.Object {
  def apply(buffer: Buffer, txGetter: TransactionFromBuffer): PsbtAttributes = js.native
}

