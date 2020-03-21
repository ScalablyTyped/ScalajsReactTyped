package typingsJapgolly.libraCore.transactionPbMod

import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_pb", "Program")
@js.native
class Program_ () extends Message {
  def addArguments(): TransactionArgument = js.native
  def addArguments(value: TransactionArgument): TransactionArgument = js.native
  def addArguments(value: TransactionArgument, index: Double): TransactionArgument = js.native
  def addModules(value: String): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def addModules(value: String, index: Double): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def addModules(value: Uint8Array): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def addModules(value: Uint8Array, index: Double): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def clearArgumentsList(): Unit = js.native
  def clearModulesList(): Unit = js.native
  def getArgumentsList(): js.Array[TransactionArgument] = js.native
  def getCode(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getCode_asB64(): String = js.native
  def getCode_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def getModulesList(): js.Array[scala.scalajs.js.typedarray.Uint8Array | String] = js.native
  def getModulesList_asB64(): js.Array[String] = js.native
  def getModulesList_asU8(): js.Array[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def setArgumentsList(value: js.Array[TransactionArgument]): Unit = js.native
  def setCode(value: String): Unit = js.native
  def setCode(value: Uint8Array): Unit = js.native
  def setModulesList(value: js.Array[scala.scalajs.js.typedarray.Uint8Array | String]): Unit = js.native
}

