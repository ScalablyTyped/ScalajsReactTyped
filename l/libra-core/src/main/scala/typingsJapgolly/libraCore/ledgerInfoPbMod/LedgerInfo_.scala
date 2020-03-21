package typingsJapgolly.libraCore.ledgerInfoPbMod

import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfo")
@js.native
class LedgerInfo_ () extends Message {
  def getConsensusBlockId(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getConsensusBlockId_asB64(): String = js.native
  def getConsensusBlockId_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def getConsensusDataHash(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getConsensusDataHash_asB64(): String = js.native
  def getConsensusDataHash_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def getEpochNum(): String = js.native
  def getTimestampUsecs(): String = js.native
  def getTransactionAccumulatorHash(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getTransactionAccumulatorHash_asB64(): String = js.native
  def getTransactionAccumulatorHash_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def getVersion(): String = js.native
  def setConsensusBlockId(value: String): Unit = js.native
  def setConsensusBlockId(value: Uint8Array): Unit = js.native
  def setConsensusDataHash(value: String): Unit = js.native
  def setConsensusDataHash(value: Uint8Array): Unit = js.native
  def setEpochNum(value: String): Unit = js.native
  def setTimestampUsecs(value: String): Unit = js.native
  def setTransactionAccumulatorHash(value: String): Unit = js.native
  def setTransactionAccumulatorHash(value: Uint8Array): Unit = js.native
  def setVersion(value: String): Unit = js.native
}

