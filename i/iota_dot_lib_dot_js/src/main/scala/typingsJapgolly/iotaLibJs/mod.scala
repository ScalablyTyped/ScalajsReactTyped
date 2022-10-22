package typingsJapgolly.iotaLibJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.iotaLibJs.anon.Address
import typingsJapgolly.iotaLibJs.anon.AddressInputs
import typingsJapgolly.iotaLibJs.anon.Addresses
import typingsJapgolly.iotaLibJs.anon.Balance
import typingsJapgolly.iotaLibJs.anon.Balances
import typingsJapgolly.iotaLibJs.anon.BranchTransaction
import typingsJapgolly.iotaLibJs.anon.Checksum
import typingsJapgolly.iotaLibJs.anon.End
import typingsJapgolly.iotaLibJs.anon.Host
import typingsJapgolly.iotaLibJs.anon.InclusionStates
import typingsJapgolly.iotaLibJs.anon.Inputs
import typingsJapgolly.iotaLibJs.anon.InputsArray
import typingsJapgolly.iotaLibJs.anon.Provider
import typingsJapgolly.iotaLibJs.anon.Received
import typingsJapgolly.iotaLibJs.anon.Trytes
import typingsJapgolly.iotaLibJs.iotaLibJsStrings.tcp
import typingsJapgolly.iotaLibJs.iotaLibJsStrings.udp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iota.lib.js", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with IotaClass {
    def this(settings: Host) = this()
    def this(settings: Provider) = this()
    
    /* CompleteClass */
    var api: IotaApi = js.native
    
    /* CompleteClass */
    var multisig: IotaMultisig = js.native
    
    /* CompleteClass */
    var utils: IotaUtils = js.native
    
    /* CompleteClass */
    var valid: IotaValid = js.native
    
    /* CompleteClass */
    var version: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.iotaLibJs.iotaLibJsStrings.i
    - typingsJapgolly.iotaLibJs.iotaLibJsStrings.Ki
    - typingsJapgolly.iotaLibJs.iotaLibJsStrings.Mi
    - typingsJapgolly.iotaLibJs.iotaLibJsStrings.Gi
    - typingsJapgolly.iotaLibJs.iotaLibJsStrings.Ti
    - typingsJapgolly.iotaLibJs.iotaLibJsStrings.Pi
  */
  trait IOTAUnit extends StObject
  object IOTAUnit {
    
    inline def Gi: typingsJapgolly.iotaLibJs.iotaLibJsStrings.Gi = "Gi".asInstanceOf[typingsJapgolly.iotaLibJs.iotaLibJsStrings.Gi]
    
    inline def Ki: typingsJapgolly.iotaLibJs.iotaLibJsStrings.Ki = "Ki".asInstanceOf[typingsJapgolly.iotaLibJs.iotaLibJsStrings.Ki]
    
    inline def Mi: typingsJapgolly.iotaLibJs.iotaLibJsStrings.Mi = "Mi".asInstanceOf[typingsJapgolly.iotaLibJs.iotaLibJsStrings.Mi]
    
    inline def Pi: typingsJapgolly.iotaLibJs.iotaLibJsStrings.Pi = "Pi".asInstanceOf[typingsJapgolly.iotaLibJs.iotaLibJsStrings.Pi]
    
    inline def Ti: typingsJapgolly.iotaLibJs.iotaLibJsStrings.Ti = "Ti".asInstanceOf[typingsJapgolly.iotaLibJs.iotaLibJsStrings.Ti]
    
    inline def i: typingsJapgolly.iotaLibJs.iotaLibJsStrings.i = "i".asInstanceOf[typingsJapgolly.iotaLibJs.iotaLibJsStrings.i]
  }
  
  trait InputObject extends StObject {
    
    var address: String
    
    var balance: Double
    
    var keyIndex: Double
    
    var security: Security
  }
  object InputObject {
    
    inline def apply(address: String, balance: Double, keyIndex: Double, security: Security): InputObject = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], keyIndex = keyIndex.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputObject]
    }
    
    extension [Self <: InputObject](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      inline def setKeyIndex(value: Double): Self = StObject.set(x, "keyIndex", value.asInstanceOf[js.Any])
      
      inline def setSecurity(value: Security): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    }
  }
  
  //
  // iota.api
  //
  @js.native
  trait IotaApi
    extends StObject
       with IriApi {
    
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
    
    def findTransactionObjects(searchValues: Addresses): Unit = js.native
    def findTransactionObjects(
      searchValues: Addresses,
      callback: js.Function2[/* error */ js.Error, /* transactions */ js.Array[TransactionObject], Unit]
    ): Unit = js.native
    
    def getAccountData(seed: String): Unit = js.native
    def getAccountData(
      seed: String,
      options: Unit,
      callback: js.Function2[/* error */ js.Error, /* response */ Balance, Unit]
    ): Unit = js.native
    def getAccountData(seed: String, options: typingsJapgolly.iotaLibJs.anon.Security): Unit = js.native
    def getAccountData(
      seed: String,
      options: typingsJapgolly.iotaLibJs.anon.Security,
      callback: js.Function2[/* error */ js.Error, /* response */ Balance, Unit]
    ): Unit = js.native
    
    def getBundle(transactionHash: String): Unit = js.native
    def getBundle(
      transactionHash: String,
      callback: js.Function2[/* error */ js.Error, /* bundle */ js.Array[TransactionObject], Unit]
    ): Unit = js.native
    
    def getInputs(seed: String): Unit = js.native
    def getInputs(
      seed: String,
      options: Unit,
      callback: js.Function2[/* error */ js.Error, /* response */ Inputs, Unit]
    ): Unit = js.native
    def getInputs(seed: String, options: End): Unit = js.native
    def getInputs(
      seed: String,
      options: End,
      callback: js.Function2[/* error */ js.Error, /* response */ Inputs, Unit]
    ): Unit = js.native
    
    def getLatestInclusion(hashes: js.Array[String]): Unit = js.native
    def getLatestInclusion(
      hashes: js.Array[String],
      callback: js.Function2[/* error */ js.Error, /* states */ js.Array[Boolean], Unit]
    ): Unit = js.native
    
    def getNewAddress(seed: String): Unit = js.native
    def getNewAddress(
      seed: String,
      options: Unit,
      callback: js.Function2[/* error */ js.Error, /* response */ String | js.Array[String], Unit]
    ): Unit = js.native
    def getNewAddress(seed: String, options: Checksum): Unit = js.native
    def getNewAddress(
      seed: String,
      options: Checksum,
      callback: js.Function2[/* error */ js.Error, /* response */ String | js.Array[String], Unit]
    ): Unit = js.native
    
    def getTransactionsObjects(hashes: js.Array[String]): Unit = js.native
    def getTransactionsObjects(
      hashes: js.Array[String],
      callback: js.Function2[/* error */ js.Error, /* transactions */ js.Array[TransactionObject], Unit]
    ): Unit = js.native
    
    def getTransfers(seed: String): Unit = js.native
    def getTransfers(
      seed: String,
      options: Unit,
      callback: js.Function2[/* error */ js.Error, /* transfers */ js.Array[js.Array[TransactionObject]], Unit]
    ): Unit = js.native
    def getTransfers(seed: String, options: InclusionStates): Unit = js.native
    def getTransfers(
      seed: String,
      options: InclusionStates,
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
    def prepareTransfers(
      seed: String,
      transfers: js.Array[TransferObject],
      options: Unit,
      callback: js.Function2[/* error */ js.Error, /* response */ Trytes, Unit]
    ): Unit = js.native
    def prepareTransfers(seed: String, transfers: js.Array[TransferObject], options: Address): Unit = js.native
    def prepareTransfers(
      seed: String,
      transfers: js.Array[TransferObject],
      options: Address,
      callback: js.Function2[/* error */ js.Error, /* response */ Trytes, Unit]
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
      options: Unit,
      callback: js.Function2[/* error */ js.Error, /* response */ InputsArray, Unit]
    ): Unit = js.native
    def sendTransfer(
      seed: String,
      depth: Double,
      minWeightMagnitude: Double,
      transfers: js.Array[TransferObject],
      options: AddressInputs
    ): Unit = js.native
    def sendTransfer(
      seed: String,
      depth: Double,
      minWeightMagnitude: Double,
      transfers: js.Array[TransferObject],
      options: AddressInputs,
      callback: js.Function2[/* error */ js.Error, /* response */ InputsArray, Unit]
    ): Unit = js.native
    
    def sendTrytes(trytes: js.Array[String], depth: Double, minWeightMagnitude: Double): Unit = js.native
    def sendTrytes(
      trytes: js.Array[String],
      depth: Double,
      minWeightMagnitude: Double,
      callback: js.Function2[/* error */ js.Error, /* response */ InputsArray, Unit]
    ): Unit = js.native
  }
  
  trait IotaClass extends StObject {
    
    var api: IotaApi
    
    var multisig: IotaMultisig
    
    var utils: IotaUtils
    
    var valid: IotaValid
    
    var version: String
  }
  object IotaClass {
    
    inline def apply(api: IotaApi, multisig: IotaMultisig, utils: IotaUtils, valid: IotaValid, version: String): IotaClass = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], multisig = multisig.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[IotaClass]
    }
    
    extension [Self <: IotaClass](x: Self) {
      
      inline def setApi(value: IotaApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setMultisig(value: IotaMultisig): Self = StObject.set(x, "multisig", value.asInstanceOf[js.Any])
      
      inline def setUtils(value: IotaUtils): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
      
      inline def setValid(value: IotaValid): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  //
  // iota.multisig
  //
  @js.native
  trait IotaMultisig extends StObject {
    
    def addSignature(bundleToSign: js.Array[TransactionObject], inputAddress: String, key: String): Unit = js.native
    def addSignature(
      bundleToSign: js.Array[TransactionObject],
      inputAddress: String,
      key: String,
      callback: js.Function2[/* error */ js.Error, /* bundle */ js.Array[TransactionObject], Unit]
    ): Unit = js.native
    
    def address(digestTrytes: String): MultisigAddress = js.native
    def address(digestTrytes: js.Array[String]): MultisigAddress = js.native
    
    def getDigest(seed: String, index: Double, security: Security): String = js.native
    
    def getKey(seed: String, index: Double, security: Security): String = js.native
    
    def initiateTransfer(
      securitySum: Double,
      inputAddress: String,
      remainderAddress: String,
      transfers: js.Array[TransferObject]
    ): Unit = js.native
    def initiateTransfer(
      securitySum: Double,
      inputAddress: String,
      remainderAddress: String,
      transfers: js.Array[TransferObject],
      callback: js.Function2[/* error */ js.Error, /* bundle */ js.Array[TransactionObject], Unit]
    ): Unit = js.native
    
    def validateAddress(multisigAddress: String, digests: js.Array[String]): Boolean = js.native
  }
  
  //
  // iota.utils
  //
  @js.native
  trait IotaUtils extends StObject {
    
    def addChecksum(inputValue: String): String = js.native
    def addChecksum(inputValue: String, checksumLength: Double): String = js.native
    def addChecksum(inputValue: String, checksumLength: Double, isAddress: Boolean): String = js.native
    def addChecksum(inputValue: String, checksumLength: Unit, isAddress: Boolean): String = js.native
    def addChecksum(inputValue: js.Array[String]): js.Array[String] = js.native
    def addChecksum(inputValue: js.Array[String], checksumLength: Double): js.Array[String] = js.native
    def addChecksum(inputValue: js.Array[String], checksumLength: Double, isAddress: Boolean): js.Array[String] = js.native
    def addChecksum(inputValue: js.Array[String], checksumLength: Unit, isAddress: Boolean): js.Array[String] = js.native
    
    def categorizeTransfers(transfers: js.Array[TransactionObject], addresses: js.Array[String]): Received = js.native
    
    def convertUnits(value: Double, fromUnit: IOTAUnit, toUnit: IOTAUnit): Double = js.native
    
    def extractJson(bundle: js.Array[TransactionObject]): String = js.native
    
    def fromTrytes(trytes: String): String = js.native
    
    def isBundle(bundle: js.Array[TransactionObject]): Boolean = js.native
    
    def isValidChecksum(addressWithChecksum: String): Boolean = js.native
    
    def noChecksum(address: String): String = js.native
    
    def toTrytes(input: String): String = js.native
    
    def transactionObject(trytes: String): TransactionObject = js.native
    
    def transactionTrytes(transaction: TransactionObject): String = js.native
    
    def validateSignatures(signedBundle: js.Array[String], inputAddress: String): Boolean = js.native
  }
  
  //
  // iota.valid
  //
  @js.native
  trait IotaValid extends StObject {
    
    def isAddress(address: String): Boolean = js.native
    
    def isArray(array: Any): Boolean = js.native
    
    def isArrayOfAttachedTrytes(trytes: Any): Boolean = js.native
    
    def isArrayOfHashes(hashes: Any): Boolean = js.native
    
    def isArrayOfTrytes(trytes: Any): Boolean = js.native
    
    def isArrayOfTxObjects(transactions: Any): Boolean = js.native
    
    def isHash(hash: Any): Boolean = js.native
    
    def isInputs(inputs: Any): Boolean = js.native
    
    def isNum(value: Any): Boolean = js.native
    
    def isObject(`object`: Any): Boolean = js.native
    
    def isString(string: Any): Boolean = js.native
    
    def isTransfersArray(transfers: Any): Boolean = js.native
    
    def isTrytes(trytes: String): Boolean = js.native
    def isTrytes(trytes: String, length: Double): Boolean = js.native
    
    def isUri(uri: Any): Boolean = js.native
    
    def isValue(value: Any): Boolean = js.native
  }
  
  //
  // iota.api
  //
  trait IriApi extends StObject {
    
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
      searchValues: Addresses,
      callback: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]
    ): Unit
    
    def getBalances(
      addresses: js.Array[String],
      treshold: Double,
      callback: js.Function2[/* error */ js.Error, /* response */ Balances, Unit]
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
      callback: js.Function2[/* error */ js.Error, /* response */ BranchTransaction, Unit]
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
    
    inline def apply(
      addNeighbors: (js.Array[String], js.Function2[/* error */ js.Error, /* addedNeighbors */ Double, Unit]) => Callback,
      attachToTangle: (String, String, Double, js.Array[String], js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]) => Callback,
      broadcastTransactions: (js.Array[String], js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => Callback,
      findTransactions: (Addresses, js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]) => Callback,
      getBalances: (js.Array[String], Double, js.Function2[/* error */ js.Error, /* response */ Balances, Unit]) => Callback,
      getInclusionStates: (js.Array[String], js.Array[String], js.Function2[/* error */ js.Error, /* states */ js.Array[Boolean], Unit]) => Callback,
      getNeighbors: js.Function2[/* error */ js.Error, /* neighbors */ js.Array[Neighbor], Unit] => Callback,
      getNodeInfo: js.Function2[/* error */ js.Error, /* info */ NodeInfo, Unit] => Callback,
      getTips: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit] => Callback,
      getTransactionsToApprove: (Double, js.Function2[/* error */ js.Error, /* response */ BranchTransaction, Unit]) => Callback,
      getTrytes: (js.Array[String], js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]) => Callback,
      interruptAttachingToTangle: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit] => Callback,
      removeNeighbors: (js.Array[String], js.Function2[/* error */ js.Error, /* removedNeighbors */ js.Array[Double], Unit]) => Callback,
      storeTransactions: (js.Array[String], js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => Callback
    ): IriApi = {
      val __obj = js.Dynamic.literal(addNeighbors = js.Any.fromFunction2((t0: js.Array[String], t1: js.Function2[/* error */ js.Error, /* addedNeighbors */ Double, Unit]) => (addNeighbors(t0, t1)).runNow()), attachToTangle = js.Any.fromFunction5((t0: String, t1: String, t2: Double, t3: js.Array[String], t4: js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]) => (attachToTangle(t0, t1, t2, t3, t4)).runNow()), broadcastTransactions = js.Any.fromFunction2((t0: js.Array[String], t1: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => (broadcastTransactions(t0, t1)).runNow()), findTransactions = js.Any.fromFunction2((t0: Addresses, t1: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]) => (findTransactions(t0, t1)).runNow()), getBalances = js.Any.fromFunction3((t0: js.Array[String], t1: Double, t2: js.Function2[/* error */ js.Error, /* response */ Balances, Unit]) => (getBalances(t0, t1, t2)).runNow()), getInclusionStates = js.Any.fromFunction3((t0: js.Array[String], t1: js.Array[String], t2: js.Function2[/* error */ js.Error, /* states */ js.Array[Boolean], Unit]) => (getInclusionStates(t0, t1, t2)).runNow()), getNeighbors = js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* neighbors */ js.Array[Neighbor], Unit]) => getNeighbors(t0).runNow()), getNodeInfo = js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* info */ NodeInfo, Unit]) => getNodeInfo(t0).runNow()), getTips = js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]) => getTips(t0).runNow()), getTransactionsToApprove = js.Any.fromFunction2((t0: Double, t1: js.Function2[/* error */ js.Error, /* response */ BranchTransaction, Unit]) => (getTransactionsToApprove(t0, t1)).runNow()), getTrytes = js.Any.fromFunction2((t0: js.Array[String], t1: js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]) => (getTrytes(t0, t1)).runNow()), interruptAttachingToTangle = js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => interruptAttachingToTangle(t0).runNow()), removeNeighbors = js.Any.fromFunction2((t0: js.Array[String], t1: js.Function2[/* error */ js.Error, /* removedNeighbors */ js.Array[Double], Unit]) => (removeNeighbors(t0, t1)).runNow()), storeTransactions = js.Any.fromFunction2((t0: js.Array[String], t1: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => (storeTransactions(t0, t1)).runNow()))
      __obj.asInstanceOf[IriApi]
    }
    
    extension [Self <: IriApi](x: Self) {
      
      inline def setAddNeighbors(
        value: (js.Array[String], js.Function2[/* error */ js.Error, /* addedNeighbors */ Double, Unit]) => Callback
      ): Self = StObject.set(x, "addNeighbors", js.Any.fromFunction2((t0: js.Array[String], t1: js.Function2[/* error */ js.Error, /* addedNeighbors */ Double, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setAttachToTangle(
        value: (String, String, Double, js.Array[String], js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]) => Callback
      ): Self = StObject.set(x, "attachToTangle", js.Any.fromFunction5((t0: String, t1: String, t2: Double, t3: js.Array[String], t4: js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setBroadcastTransactions(
        value: (js.Array[String], js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => Callback
      ): Self = StObject.set(x, "broadcastTransactions", js.Any.fromFunction2((t0: js.Array[String], t1: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setFindTransactions(
        value: (Addresses, js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]) => Callback
      ): Self = StObject.set(x, "findTransactions", js.Any.fromFunction2((t0: Addresses, t1: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]) => (value(t0, t1)).runNow()))
      
      inline def setGetBalances(
        value: (js.Array[String], Double, js.Function2[/* error */ js.Error, /* response */ Balances, Unit]) => Callback
      ): Self = StObject.set(x, "getBalances", js.Any.fromFunction3((t0: js.Array[String], t1: Double, t2: js.Function2[/* error */ js.Error, /* response */ Balances, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGetInclusionStates(
        value: (js.Array[String], js.Array[String], js.Function2[/* error */ js.Error, /* states */ js.Array[Boolean], Unit]) => Callback
      ): Self = StObject.set(x, "getInclusionStates", js.Any.fromFunction3((t0: js.Array[String], t1: js.Array[String], t2: js.Function2[/* error */ js.Error, /* states */ js.Array[Boolean], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGetNeighbors(value: js.Function2[/* error */ js.Error, /* neighbors */ js.Array[Neighbor], Unit] => Callback): Self = StObject.set(x, "getNeighbors", js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* neighbors */ js.Array[Neighbor], Unit]) => value(t0).runNow()))
      
      inline def setGetNodeInfo(value: js.Function2[/* error */ js.Error, /* info */ NodeInfo, Unit] => Callback): Self = StObject.set(x, "getNodeInfo", js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* info */ NodeInfo, Unit]) => value(t0).runNow()))
      
      inline def setGetTips(value: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit] => Callback): Self = StObject.set(x, "getTips", js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]) => value(t0).runNow()))
      
      inline def setGetTransactionsToApprove(
        value: (Double, js.Function2[/* error */ js.Error, /* response */ BranchTransaction, Unit]) => Callback
      ): Self = StObject.set(x, "getTransactionsToApprove", js.Any.fromFunction2((t0: Double, t1: js.Function2[/* error */ js.Error, /* response */ BranchTransaction, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setGetTrytes(
        value: (js.Array[String], js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]) => Callback
      ): Self = StObject.set(x, "getTrytes", js.Any.fromFunction2((t0: js.Array[String], t1: js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]) => (value(t0, t1)).runNow()))
      
      inline def setInterruptAttachingToTangle(value: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit] => Callback): Self = StObject.set(x, "interruptAttachingToTangle", js.Any.fromFunction1((t0: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => value(t0).runNow()))
      
      inline def setRemoveNeighbors(
        value: (js.Array[String], js.Function2[/* error */ js.Error, /* removedNeighbors */ js.Array[Double], Unit]) => Callback
      ): Self = StObject.set(x, "removeNeighbors", js.Any.fromFunction2((t0: js.Array[String], t1: js.Function2[/* error */ js.Error, /* removedNeighbors */ js.Array[Double], Unit]) => (value(t0, t1)).runNow()))
      
      inline def setStoreTransactions(
        value: (js.Array[String], js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => Callback
      ): Self = StObject.set(x, "storeTransactions", js.Any.fromFunction2((t0: js.Array[String], t1: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  @js.native
  trait MultisigAddress extends StObject {
    
    def absorb(digest: String): MultisigAddress = js.native
    def absorb(digest: js.Array[String]): MultisigAddress = js.native
  }
  
  trait Neighbor extends StObject {
    
    var address: String
    
    var connectionType: udp | tcp
    
    var numberOfAllTransactions: Double
    
    var numberOfInvalidTransactions: Double
    
    var numberOfNewTransactions: Double
    
    var numberOfRandomTransactionRequests: Double
    
    var numberOfSentTransactions: Double
  }
  object Neighbor {
    
    inline def apply(
      address: String,
      connectionType: udp | tcp,
      numberOfAllTransactions: Double,
      numberOfInvalidTransactions: Double,
      numberOfNewTransactions: Double,
      numberOfRandomTransactionRequests: Double,
      numberOfSentTransactions: Double
    ): Neighbor = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], connectionType = connectionType.asInstanceOf[js.Any], numberOfAllTransactions = numberOfAllTransactions.asInstanceOf[js.Any], numberOfInvalidTransactions = numberOfInvalidTransactions.asInstanceOf[js.Any], numberOfNewTransactions = numberOfNewTransactions.asInstanceOf[js.Any], numberOfRandomTransactionRequests = numberOfRandomTransactionRequests.asInstanceOf[js.Any], numberOfSentTransactions = numberOfSentTransactions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Neighbor]
    }
    
    extension [Self <: Neighbor](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setConnectionType(value: udp | tcp): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
      
      inline def setNumberOfAllTransactions(value: Double): Self = StObject.set(x, "numberOfAllTransactions", value.asInstanceOf[js.Any])
      
      inline def setNumberOfInvalidTransactions(value: Double): Self = StObject.set(x, "numberOfInvalidTransactions", value.asInstanceOf[js.Any])
      
      inline def setNumberOfNewTransactions(value: Double): Self = StObject.set(x, "numberOfNewTransactions", value.asInstanceOf[js.Any])
      
      inline def setNumberOfRandomTransactionRequests(value: Double): Self = StObject.set(x, "numberOfRandomTransactionRequests", value.asInstanceOf[js.Any])
      
      inline def setNumberOfSentTransactions(value: Double): Self = StObject.set(x, "numberOfSentTransactions", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeInfo extends StObject {
    
    var appName: String
    
    var appVersion: String
    
    var duration: Double
    
    var jreAvailableProcessors: Double
    
    var jreFreeMemory: Double
    
    var jreMaxMemory: Double
    
    var jreTotalMemory: Double
    
    var jreVersion: String
    
    var latestMilestone: String
    
    var latestMilestoneIndex: Double
    
    var latestSolidSubtangleMilestone: String
    
    var latestSolidSubtangleMilestoneIndex: Double
    
    var neighbors: Double
    
    var packetsQueueSize: Double
    
    var time: Double
    
    var tips: Double
    
    var transactionsToRequest: Double
  }
  object NodeInfo {
    
    inline def apply(
      appName: String,
      appVersion: String,
      duration: Double,
      jreAvailableProcessors: Double,
      jreFreeMemory: Double,
      jreMaxMemory: Double,
      jreTotalMemory: Double,
      jreVersion: String,
      latestMilestone: String,
      latestMilestoneIndex: Double,
      latestSolidSubtangleMilestone: String,
      latestSolidSubtangleMilestoneIndex: Double,
      neighbors: Double,
      packetsQueueSize: Double,
      time: Double,
      tips: Double,
      transactionsToRequest: Double
    ): NodeInfo = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], jreAvailableProcessors = jreAvailableProcessors.asInstanceOf[js.Any], jreFreeMemory = jreFreeMemory.asInstanceOf[js.Any], jreMaxMemory = jreMaxMemory.asInstanceOf[js.Any], jreTotalMemory = jreTotalMemory.asInstanceOf[js.Any], jreVersion = jreVersion.asInstanceOf[js.Any], latestMilestone = latestMilestone.asInstanceOf[js.Any], latestMilestoneIndex = latestMilestoneIndex.asInstanceOf[js.Any], latestSolidSubtangleMilestone = latestSolidSubtangleMilestone.asInstanceOf[js.Any], latestSolidSubtangleMilestoneIndex = latestSolidSubtangleMilestoneIndex.asInstanceOf[js.Any], neighbors = neighbors.asInstanceOf[js.Any], packetsQueueSize = packetsQueueSize.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any], transactionsToRequest = transactionsToRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeInfo]
    }
    
    extension [Self <: NodeInfo](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setJreAvailableProcessors(value: Double): Self = StObject.set(x, "jreAvailableProcessors", value.asInstanceOf[js.Any])
      
      inline def setJreFreeMemory(value: Double): Self = StObject.set(x, "jreFreeMemory", value.asInstanceOf[js.Any])
      
      inline def setJreMaxMemory(value: Double): Self = StObject.set(x, "jreMaxMemory", value.asInstanceOf[js.Any])
      
      inline def setJreTotalMemory(value: Double): Self = StObject.set(x, "jreTotalMemory", value.asInstanceOf[js.Any])
      
      inline def setJreVersion(value: String): Self = StObject.set(x, "jreVersion", value.asInstanceOf[js.Any])
      
      inline def setLatestMilestone(value: String): Self = StObject.set(x, "latestMilestone", value.asInstanceOf[js.Any])
      
      inline def setLatestMilestoneIndex(value: Double): Self = StObject.set(x, "latestMilestoneIndex", value.asInstanceOf[js.Any])
      
      inline def setLatestSolidSubtangleMilestone(value: String): Self = StObject.set(x, "latestSolidSubtangleMilestone", value.asInstanceOf[js.Any])
      
      inline def setLatestSolidSubtangleMilestoneIndex(value: Double): Self = StObject.set(x, "latestSolidSubtangleMilestoneIndex", value.asInstanceOf[js.Any])
      
      inline def setNeighbors(value: Double): Self = StObject.set(x, "neighbors", value.asInstanceOf[js.Any])
      
      inline def setPacketsQueueSize(value: Double): Self = StObject.set(x, "packetsQueueSize", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTips(value: Double): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
      
      inline def setTransactionsToRequest(value: Double): Self = StObject.set(x, "transactionsToRequest", value.asInstanceOf[js.Any])
    }
  }
  
  //
  // Types
  //
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.iotaLibJs.iotaLibJsInts.`1`
    - typingsJapgolly.iotaLibJs.iotaLibJsInts.`2`
    - typingsJapgolly.iotaLibJs.iotaLibJsInts.`3`
  */
  trait Security extends StObject
  object Security {
    
    inline def `1`: typingsJapgolly.iotaLibJs.iotaLibJsInts.`1` = 1.asInstanceOf[typingsJapgolly.iotaLibJs.iotaLibJsInts.`1`]
    
    inline def `2`: typingsJapgolly.iotaLibJs.iotaLibJsInts.`2` = 2.asInstanceOf[typingsJapgolly.iotaLibJs.iotaLibJsInts.`2`]
    
    inline def `3`: typingsJapgolly.iotaLibJs.iotaLibJsInts.`3` = 3.asInstanceOf[typingsJapgolly.iotaLibJs.iotaLibJsInts.`3`]
  }
  
  //
  // Objects
  //
  trait TransactionObject extends StObject {
    
    var address: String
    
    var attachmentTimestamp: Double
    
    var attachmentTimestampLowerBound: Double
    
    var attachmentTimestampUpperBound: Double
    
    var branchTransaction: String
    
    var bundle: Double
    
    var currentIndex: Double
    
    var hash: String
    
    var lastIndex: Double
    
    var nonce: String
    
    var signatureMessageFragment: String
    
    var tag: String
    
    var timestamp: Double
    
    var trunkTransaction: String
    
    var value: Double
  }
  object TransactionObject {
    
    inline def apply(
      address: String,
      attachmentTimestamp: Double,
      attachmentTimestampLowerBound: Double,
      attachmentTimestampUpperBound: Double,
      branchTransaction: String,
      bundle: Double,
      currentIndex: Double,
      hash: String,
      lastIndex: Double,
      nonce: String,
      signatureMessageFragment: String,
      tag: String,
      timestamp: Double,
      trunkTransaction: String,
      value: Double
    ): TransactionObject = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], attachmentTimestamp = attachmentTimestamp.asInstanceOf[js.Any], attachmentTimestampLowerBound = attachmentTimestampLowerBound.asInstanceOf[js.Any], attachmentTimestampUpperBound = attachmentTimestampUpperBound.asInstanceOf[js.Any], branchTransaction = branchTransaction.asInstanceOf[js.Any], bundle = bundle.asInstanceOf[js.Any], currentIndex = currentIndex.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], signatureMessageFragment = signatureMessageFragment.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], trunkTransaction = trunkTransaction.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionObject]
    }
    
    extension [Self <: TransactionObject](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAttachmentTimestamp(value: Double): Self = StObject.set(x, "attachmentTimestamp", value.asInstanceOf[js.Any])
      
      inline def setAttachmentTimestampLowerBound(value: Double): Self = StObject.set(x, "attachmentTimestampLowerBound", value.asInstanceOf[js.Any])
      
      inline def setAttachmentTimestampUpperBound(value: Double): Self = StObject.set(x, "attachmentTimestampUpperBound", value.asInstanceOf[js.Any])
      
      inline def setBranchTransaction(value: String): Self = StObject.set(x, "branchTransaction", value.asInstanceOf[js.Any])
      
      inline def setBundle(value: Double): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
      
      inline def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setLastIndex(value: Double): Self = StObject.set(x, "lastIndex", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setSignatureMessageFragment(value: String): Self = StObject.set(x, "signatureMessageFragment", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTrunkTransaction(value: String): Self = StObject.set(x, "trunkTransaction", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransferObject extends StObject {
    
    var address: String
    
    var message: String
    
    var tag: String
    
    var value: Double
  }
  object TransferObject {
    
    inline def apply(address: String, message: String, tag: String, value: Double): TransferObject = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferObject]
    }
    
    extension [Self <: TransferObject](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
