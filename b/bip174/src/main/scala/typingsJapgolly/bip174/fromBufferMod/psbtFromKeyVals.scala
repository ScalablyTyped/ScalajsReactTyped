package typingsJapgolly.bip174.fromBufferMod

import typingsJapgolly.bip174.interfacesMod.Transaction
import typingsJapgolly.bip174.parserMod.PsbtAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/parser/fromBuffer", "psbtFromKeyVals")
@js.native
object psbtFromKeyVals extends js.Object {
  def apply(unsignedTx: Transaction, hasGlobalMapKeyValsInputKeyValsOutputKeyVals: PsbtFromKeyValsArg): PsbtAttributes = js.native
}

