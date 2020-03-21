package typingsJapgolly.iotaLibJs.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.iotaLibJs.AnonAddresses
import typingsJapgolly.iotaLibJs.AnonBalances
import typingsJapgolly.iotaLibJs.AnonBranchTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// iota.api
//
trait IriApi extends js.Object {
  def addNeighbors(
    uris: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* addedNeighbors */ Double, Unit]
  ): Unit
  def attachToTangle(
    trunkTransaction: String,
    branchTransaction: String,
    minWeightMagnitude: Double,
    trytes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]
  ): Unit
  def broadcastTransactions(
    trytes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]
  ): Unit
  def findTransactions(
    searchValues: AnonAddresses,
    callback: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]
  ): Unit
  def getBalances(
    addresses: js.Array[String],
    treshold: Double,
    callback: js.Function2[/* error */ js.Error, /* response */ AnonBalances, Unit]
  ): Unit
  def getInclusionStates(
    transactions: js.Array[String],
    tips: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* states */ js.Array[Boolean], Unit]
  ): Unit
  def getNeighbors(callback: js.Function2[/* error */ js.Error, /* neighbors */ js.Array[Neighbor], Unit]): Unit
  def getNodeInfo(callback: js.Function2[/* error */ js.Error, /* info */ NodeInfo, Unit]): Unit
  def getTips(callback: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]): Unit
  def getTransactionsToApprove(
    depth: Double,
    callback: js.Function2[/* error */ js.Error, /* response */ AnonBranchTransaction, Unit]
  ): Unit
  def getTrytes(
    hashes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]
  ): Unit
  def interruptAttachingToTangle(callback: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]): Unit
  def removeNeighbors(
    uris: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* removedNeighbors */ js.Array[Double], Unit]
  ): Unit
  def storeTransactions(
    trytes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]
  ): Unit
}

object IriApi {
  @scala.inline
  def apply(
    addNeighbors: (js.Array[String], js.Function2[/* error */ js.Error, /* addedNeighbors */ Double, Unit]) => Callback,
    attachToTangle: (String, String, Double, js.Array[String], js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]) => Callback,
    broadcastTransactions: (js.Array[String], js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => Callback,
    findTransactions: (AnonAddresses, js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]) => Callback,
    getBalances: (js.Array[String], Double, js.Function2[/* error */ js.Error, /* response */ AnonBalances, Unit]) => Callback,
    getInclusionStates: (js.Array[String], js.Array[String], js.Function2[/* error */ js.Error, /* states */ js.Array[Boolean], Unit]) => Callback,
    getNeighbors: js.Function2[/* error */ js.Error, /* neighbors */ js.Array[Neighbor], Unit] => Callback,
    getNodeInfo: js.Function2[/* error */ js.Error, /* info */ NodeInfo, Unit] => Callback,
    getTips: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit] => Callback,
    getTransactionsToApprove: (Double, js.Function2[/* error */ js.Error, /* response */ AnonBranchTransaction, Unit]) => Callback,
    getTrytes: (js.Array[String], js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]) => Callback,
    interruptAttachingToTangle: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit] => Callback,
    removeNeighbors: (js.Array[String], js.Function2[/* error */ js.Error, /* removedNeighbors */ js.Array[Double], Unit]) => Callback,
    storeTransactions: (js.Array[String], js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => Callback
  ): IriApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNeighbors")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Function2[/* error */ js.Error, /* addedNeighbors */ scala.Double, scala.Unit]) => addNeighbors(t0, t1).runNow()))
    __obj.updateDynamic("attachToTangle")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: scala.Double, t3: js.Array[java.lang.String], t4: js.Function2[/* error */ js.Error, /* trytes */ js.Array[java.lang.String], scala.Unit]) => attachToTangle(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("broadcastTransactions")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Function2[/* error */ js.Error, /* response */ js.Object, scala.Unit]) => broadcastTransactions(t0, t1).runNow()))
    __obj.updateDynamic("findTransactions")(js.Any.fromFunction2((t0: typingsJapgolly.iotaLibJs.AnonAddresses, t1: js.Function2[/* error */ js.Error, /* hashes */ js.Array[java.lang.String], scala.Unit]) => findTransactions(t0, t1).runNow()))
    __obj.updateDynamic("getBalances")(js.Any.fromFunction3((t0: js.Array[java.lang.String], t1: scala.Double, t2: js.Function2[
  /* error */ js.Error, 
  /* response */ typingsJapgolly.iotaLibJs.AnonBalances, 
  scala.Unit]) => getBalances(t0, t1, t2).runNow()))
    __obj.updateDynamic("getInclusionStates")(js.Any.fromFunction3((t0: js.Array[java.lang.String], t1: js.Array[java.lang.String], t2: js.Function2[/* error */ js.Error, /* states */ js.Array[scala.Boolean], scala.Unit]) => getInclusionStates(t0, t1, t2).runNow()))
    __obj.updateDynamic("getNeighbors")(js.Any.fromFunction1((t0: js.Function2[
  /* error */ js.Error, 
  /* neighbors */ js.Array[typingsJapgolly.iotaLibJs.mod.Neighbor], 
  scala.Unit]) => getNeighbors(t0).runNow()))
    __obj.updateDynamic("getNodeInfo")(js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* info */ typingsJapgolly.iotaLibJs.mod.NodeInfo, scala.Unit]) => getNodeInfo(t0).runNow()))
    __obj.updateDynamic("getTips")(js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* hashes */ js.Array[java.lang.String], scala.Unit]) => getTips(t0).runNow()))
    __obj.updateDynamic("getTransactionsToApprove")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function2[
  /* error */ js.Error, 
  /* response */ typingsJapgolly.iotaLibJs.AnonBranchTransaction, 
  scala.Unit]) => getTransactionsToApprove(t0, t1).runNow()))
    __obj.updateDynamic("getTrytes")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Function2[/* error */ js.Error, /* trytes */ js.Array[java.lang.String], scala.Unit]) => getTrytes(t0, t1).runNow()))
    __obj.updateDynamic("interruptAttachingToTangle")(js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* response */ js.Object, scala.Unit]) => interruptAttachingToTangle(t0).runNow()))
    __obj.updateDynamic("removeNeighbors")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Function2[/* error */ js.Error, /* removedNeighbors */ js.Array[scala.Double], scala.Unit]) => removeNeighbors(t0, t1).runNow()))
    __obj.updateDynamic("storeTransactions")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Function2[/* error */ js.Error, /* response */ js.Object, scala.Unit]) => storeTransactions(t0, t1).runNow()))
    __obj.asInstanceOf[IriApi]
  }
}

