package typingsJapgolly.bip174

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.bip174.interfacesMod.Transaction
import typingsJapgolly.bip174.interfacesMod.TransactionFromBuffer
import typingsJapgolly.bip174.mod.Psbt
import typingsJapgolly.node.Buffer
import typingsJapgolly.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofPsbt extends Instantiable1[/* tx */ Transaction, Psbt] {
  def fromBase64[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Psbt */ js.Any */](data: String, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
  def fromBuffer[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Psbt */ js.Any */](buffer: Buffer, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
  def fromHex[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Psbt */ js.Any */](data: String, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
}

