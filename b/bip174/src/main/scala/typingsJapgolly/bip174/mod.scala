package typingsJapgolly.bip174

import typingsJapgolly.bip174.interfacesMod.KeyValue
import typingsJapgolly.bip174.interfacesMod.PsbtGlobal
import typingsJapgolly.bip174.interfacesMod.PsbtGlobalUpdate
import typingsJapgolly.bip174.interfacesMod.PsbtInput
import typingsJapgolly.bip174.interfacesMod.PsbtInputExtended
import typingsJapgolly.bip174.interfacesMod.PsbtInputUpdate
import typingsJapgolly.bip174.interfacesMod.PsbtOutput
import typingsJapgolly.bip174.interfacesMod.PsbtOutputExtended
import typingsJapgolly.bip174.interfacesMod.PsbtOutputUpdate
import typingsJapgolly.bip174.interfacesMod.Transaction
import typingsJapgolly.bip174.interfacesMod.TransactionFromBuffer
import typingsJapgolly.node.Buffer
import typingsJapgolly.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Psbt protected () extends js.Object {
    def this(tx: Transaction) = this()
    val globalMap: PsbtGlobal = js.native
    val inputs: js.Array[PsbtInput] = js.native
    val outputs: js.Array[PsbtOutput] = js.native
    def addInput(inputData: PsbtInputExtended): this.type = js.native
    def addOutput(outputData: PsbtOutputExtended): this.type = js.native
    def addUnknownKeyValToGlobal(keyVal: KeyValue): this.type = js.native
    def addUnknownKeyValToInput(inputIndex: Double, keyVal: KeyValue): this.type = js.native
    def addUnknownKeyValToOutput(outputIndex: Double, keyVal: KeyValue): this.type = js.native
    def clearFinalizedInput(inputIndex: Double): this.type = js.native
    def combine(those: this.type*): this.type = js.native
    def getTransaction(): Buffer = js.native
    def toBase64(): String = js.native
    def toBuffer(): Buffer = js.native
    def toHex(): String = js.native
    def updateGlobal(updateData: PsbtGlobalUpdate): this.type = js.native
    def updateInput(inputIndex: Double, updateData: PsbtInputUpdate): this.type = js.native
    def updateOutput(outputIndex: Double, updateData: PsbtOutputUpdate): this.type = js.native
  }
  
  /* static members */
  @js.native
  object Psbt extends js.Object {
    def fromBase64[T /* <: TypeofPsbt */](data: String, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
    def fromBuffer[T /* <: TypeofPsbt */](buffer: Buffer, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
    def fromHex[T /* <: TypeofPsbt */](data: String, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
  }
  
}

