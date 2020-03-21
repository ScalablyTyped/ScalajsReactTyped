package typingsJapgolly.iotaLibJs.mod

import typingsJapgolly.iotaLibJs.AnonAddress
import typingsJapgolly.iotaLibJs.AnonAddressInputs
import typingsJapgolly.iotaLibJs.AnonAddresses
import typingsJapgolly.iotaLibJs.AnonBalance
import typingsJapgolly.iotaLibJs.AnonChecksum
import typingsJapgolly.iotaLibJs.AnonEnd
import typingsJapgolly.iotaLibJs.AnonInclusionStates
import typingsJapgolly.iotaLibJs.AnonInputs
import typingsJapgolly.iotaLibJs.AnonInputsArray
import typingsJapgolly.iotaLibJs.AnonSecurity
import typingsJapgolly.iotaLibJs.AnonTrytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// iota.api
//
@js.native
trait IotaApi extends IriApi {
  def broadcastAndStore(trytes: js.Array[String]): Unit = js.native
  def broadcastAndStore(
    trytes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]
  ): Unit = js.native
  def broadcastBundle(transactionHash: String): Unit = js.native
  def broadcastBundle(
    transactionHash: String,
    callback: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]
  ): Unit = js.native
  def findTransactionObjects(searchValues: AnonAddresses): Unit = js.native
  def findTransactionObjects(
    searchValues: AnonAddresses,
    callback: js.Function2[/* error */ js.Error, /* transactions */ js.Array[TransactionObject], Unit]
  ): Unit = js.native
  def getAccountData(seed: String): Unit = js.native
  def getAccountData(seed: String, options: AnonSecurity): Unit = js.native
  def getAccountData(
    seed: String,
    options: AnonSecurity,
    callback: js.Function2[/* error */ js.Error, /* response */ AnonBalance, Unit]
  ): Unit = js.native
  def getBundle(transactionHash: String): Unit = js.native
  def getBundle(
    transactionHash: String,
    callback: js.Function2[/* error */ js.Error, /* bundle */ js.Array[TransactionObject], Unit]
  ): Unit = js.native
  def getInputs(seed: String): Unit = js.native
  def getInputs(seed: String, options: AnonEnd): Unit = js.native
  def getInputs(
    seed: String,
    options: AnonEnd,
    callback: js.Function2[/* error */ js.Error, /* response */ AnonInputs, Unit]
  ): Unit = js.native
  def getLatestInclusion(hashes: js.Array[String]): Unit = js.native
  def getLatestInclusion(
    hashes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* states */ js.Array[Boolean], Unit]
  ): Unit = js.native
  def getNewAddress(seed: String): Unit = js.native
  def getNewAddress(seed: String, options: AnonChecksum): Unit = js.native
  def getNewAddress(
    seed: String,
    options: AnonChecksum,
    callback: js.Function2[/* error */ js.Error, /* response */ String | js.Array[String], Unit]
  ): Unit = js.native
  def getTransactionsObjects(hashes: js.Array[String]): Unit = js.native
  def getTransactionsObjects(
    hashes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* transactions */ js.Array[TransactionObject], Unit]
  ): Unit = js.native
  def getTransfers(seed: String): Unit = js.native
  def getTransfers(seed: String, options: AnonInclusionStates): Unit = js.native
  def getTransfers(
    seed: String,
    options: AnonInclusionStates,
    callback: js.Function2[/* error */ js.Error, /* transfers */ js.Array[js.Array[TransactionObject]], Unit]
  ): Unit = js.native
  def isReattachable(address: String): Unit = js.native
  def isReattachable(
    address: String,
    callback: js.Function2[/* error */ js.Error, /* response */ Boolean | js.Array[Boolean], Unit]
  ): Unit = js.native
  def isReattachable(address: js.Array[String]): Unit = js.native
  def isReattachable(
    address: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* response */ Boolean | js.Array[Boolean], Unit]
  ): Unit = js.native
  def prepareTransfers(seed: String, transfers: js.Array[TransferObject]): Unit = js.native
  def prepareTransfers(seed: String, transfers: js.Array[TransferObject], options: AnonAddress): Unit = js.native
  def prepareTransfers(
    seed: String,
    transfers: js.Array[TransferObject],
    options: AnonAddress,
    callback: js.Function2[/* error */ js.Error, /* response */ AnonTrytes, Unit]
  ): Unit = js.native
  def replayBundle(transactionHash: String, depth: Double, minWeightMagnitude: Double): Unit = js.native
  def replayBundle(
    transactionHash: String,
    depth: Double,
    minWeightMagnitude: Double,
    callback: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]
  ): Unit = js.native
  def sendTransfer(seed: String, depth: Double, minWeightMagnitude: Double, transfers: js.Array[TransferObject]): Unit = js.native
  def sendTransfer(
    seed: String,
    depth: Double,
    minWeightMagnitude: Double,
    transfers: js.Array[TransferObject],
    options: AnonAddressInputs
  ): Unit = js.native
  def sendTransfer(
    seed: String,
    depth: Double,
    minWeightMagnitude: Double,
    transfers: js.Array[TransferObject],
    options: AnonAddressInputs,
    callback: js.Function2[/* error */ js.Error, /* response */ AnonInputsArray, Unit]
  ): Unit = js.native
  def sendTrytes(trytes: js.Array[String], depth: Double, minWeightMagnitude: Double): Unit = js.native
  def sendTrytes(
    trytes: js.Array[String],
    depth: Double,
    minWeightMagnitude: Double,
    callback: js.Function2[/* error */ js.Error, /* response */ AnonInputsArray, Unit]
  ): Unit = js.native
}

