package typingsJapgolly.bip174.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.bip174.mod.Psbt
import typingsJapgolly.bip174.srcLibInterfacesMod.Transaction
import typingsJapgolly.bip174.srcLibInterfacesMod.TransactionFromBuffer
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPsbt
  extends StObject
     with Instantiable1[/* tx */ Transaction, Psbt] {
  
  def fromBase64[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Psbt */ js.Any */](data: String, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
  
  def fromBuffer[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Psbt */ js.Any */](buffer: Buffer, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
  
  def fromHex[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Psbt */ js.Any */](data: String, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
}
