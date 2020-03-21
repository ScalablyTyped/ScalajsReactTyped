package typingsJapgolly.bitcoinjsLib.transactionBuilderMod

import typingsJapgolly.bitcoinjsLib.ecpairMod.Signer
import typingsJapgolly.bitcoinjsLib.networksMod.Network
import typingsJapgolly.bitcoinjsLib.transactionMod.Transaction
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/transaction_builder", "TransactionBuilder")
@js.native
class TransactionBuilder () extends js.Object {
  def this(network: Network) = this()
  def this(network: Network, maximumFeeRate: Double) = this()
  var __INPUTS: js.Any = js.native
  var __PREV_TX_SET: js.Any = js.native
  var __TX: js.Any = js.native
  var __USE_LOW_R: js.Any = js.native
  var __addInputUnsafe: js.Any = js.native
  var __build: js.Any = js.native
  var __canModifyInputs: js.Any = js.native
  var __canModifyOutputs: js.Any = js.native
  var __needsOutputs: js.Any = js.native
  var __overMaximumFees: js.Any = js.native
  var maximumFeeRate: Double = js.native
  var network: Network = js.native
  def addInput(txHash: String, vout: Double): Double = js.native
  def addInput(txHash: String, vout: Double, sequence: Double): Double = js.native
  def addInput(txHash: String, vout: Double, sequence: Double, prevOutScript: Buffer): Double = js.native
  def addInput(txHash: Transaction, vout: Double): Double = js.native
  def addInput(txHash: Transaction, vout: Double, sequence: Double): Double = js.native
  def addInput(txHash: Transaction, vout: Double, sequence: Double, prevOutScript: Buffer): Double = js.native
  def addInput(txHash: Buffer, vout: Double): Double = js.native
  def addInput(txHash: Buffer, vout: Double, sequence: Double): Double = js.native
  def addInput(txHash: Buffer, vout: Double, sequence: Double, prevOutScript: Buffer): Double = js.native
  def addOutput(scriptPubKey: String, value: Double): Double = js.native
  def addOutput(scriptPubKey: Buffer, value: Double): Double = js.native
  def build(): Transaction = js.native
  def buildIncomplete(): Transaction = js.native
  def setLockTime(locktime: Double): Unit = js.native
  def setLowR(): Boolean = js.native
  def setLowR(setting: Boolean): Boolean = js.native
  def setVersion(version: Double): Unit = js.native
  def sign(signParams: Double): Unit = js.native
  def sign(signParams: Double, keyPair: Signer): Unit = js.native
  def sign(signParams: Double, keyPair: Signer, redeemScript: Buffer): Unit = js.native
  def sign(signParams: Double, keyPair: Signer, redeemScript: Buffer, hashType: Double): Unit = js.native
  def sign(signParams: Double, keyPair: Signer, redeemScript: Buffer, hashType: Double, witnessValue: Double): Unit = js.native
  def sign(
    signParams: Double,
    keyPair: Signer,
    redeemScript: Buffer,
    hashType: Double,
    witnessValue: Double,
    witnessScript: Buffer
  ): Unit = js.native
  def sign(signParams: TxbSignArg): Unit = js.native
  def sign(signParams: TxbSignArg, keyPair: Signer): Unit = js.native
  def sign(signParams: TxbSignArg, keyPair: Signer, redeemScript: Buffer): Unit = js.native
  def sign(signParams: TxbSignArg, keyPair: Signer, redeemScript: Buffer, hashType: Double): Unit = js.native
  def sign(
    signParams: TxbSignArg,
    keyPair: Signer,
    redeemScript: Buffer,
    hashType: Double,
    witnessValue: Double
  ): Unit = js.native
  def sign(
    signParams: TxbSignArg,
    keyPair: Signer,
    redeemScript: Buffer,
    hashType: Double,
    witnessValue: Double,
    witnessScript: Buffer
  ): Unit = js.native
}

/* static members */
@JSImport("bitcoinjs-lib/types/transaction_builder", "TransactionBuilder")
@js.native
object TransactionBuilder extends js.Object {
  def fromTransaction(transaction: Transaction): TransactionBuilder = js.native
  def fromTransaction(transaction: Transaction, network: Network): TransactionBuilder = js.native
}

