package typingsJapgolly.trezorConnect

import typingsJapgolly.trezorConnect.anon.Account
import typingsJapgolly.trezorConnect.anon.Active
import typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamestri
import typingsJapgolly.trezorConnect.anon.From
import typingsJapgolly.trezorConnect.anon.Payer
import typingsJapgolly.trezorConnect.anon.Permission
import typingsJapgolly.trezorConnect.anon.Producers
import typingsJapgolly.trezorConnect.anon.Receiver
import typingsJapgolly.trezorConnect.anon.Unstakecpuquantity
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EosActionBuyRamBytes
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EosActionDeleteAuth
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EosActionLinkAuth
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EosActionRefund
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EosActionSellRam
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EosActionUnlinkAuth
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EosAuthorizationKey
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EosAuthorizationWait
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EosPermissionLevel
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.UintType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptNetworksEosMod {
  
  trait EosAuthorization extends StObject {
    
    var accounts: js.Array[Permission]
    
    var keys: js.Array[EosAuthorizationKey]
    
    var threshold: Double
    
    var waits: js.Array[EosAuthorizationWait]
  }
  object EosAuthorization {
    
    inline def apply(
      accounts: js.Array[Permission],
      keys: js.Array[EosAuthorizationKey],
      threshold: Double,
      waits: js.Array[EosAuthorizationWait]
    ): EosAuthorization = {
      val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], waits = waits.asInstanceOf[js.Any])
      __obj.asInstanceOf[EosAuthorization]
    }
    
    extension [Self <: EosAuthorization](x: Self) {
      
      inline def setAccounts(value: js.Array[Permission]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
      
      inline def setAccountsVarargs(value: Permission*): Self = StObject.set(x, "accounts", js.Array(value*))
      
      inline def setKeys(value: js.Array[EosAuthorizationKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: EosAuthorizationKey*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setWaits(value: js.Array[EosAuthorizationWait]): Self = StObject.set(x, "waits", value.asInstanceOf[js.Any])
      
      inline def setWaitsVarargs(value: EosAuthorizationWait*): Self = StObject.set(x, "waits", js.Array(value*))
    }
  }
  
  trait EosGetPublicKey extends StObject {
    
    var path: String | js.Array[Double]
    
    var showOnTrezor: js.UndefOr[Boolean] = js.undefined
  }
  object EosGetPublicKey {
    
    inline def apply(path: String | js.Array[Double]): EosGetPublicKey = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[EosGetPublicKey]
    }
    
    extension [Self <: EosGetPublicKey](x: Self) {
      
      inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setShowOnTrezor(value: Boolean): Self = StObject.set(x, "showOnTrezor", value.asInstanceOf[js.Any])
      
      inline def setShowOnTrezorUndefined: Self = StObject.set(x, "showOnTrezor", js.undefined)
    }
  }
  
  trait EosPublicKey extends StObject {
    
    var path: js.Array[Double]
    
    var rawPublicKey: String
    
    var serializedPath: String
    
    var wifPublicKey: String
  }
  object EosPublicKey {
    
    inline def apply(path: js.Array[Double], rawPublicKey: String, serializedPath: String, wifPublicKey: String): EosPublicKey = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], rawPublicKey = rawPublicKey.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any], wifPublicKey = wifPublicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[EosPublicKey]
    }
    
    extension [Self <: EosPublicKey](x: Self) {
      
      inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRawPublicKey(value: String): Self = StObject.set(x, "rawPublicKey", value.asInstanceOf[js.Any])
      
      inline def setSerializedPath(value: String): Self = StObject.set(x, "serializedPath", value.asInstanceOf[js.Any])
      
      inline def setWifPublicKey(value: String): Self = StObject.set(x, "wifPublicKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait EosSDKTransaction extends StObject {
    
    var actions: js.Array[EosTxAction | EosTxActionCommonnamestri]
    
    var chainId: String
    
    var header: EosTxHeader
  }
  object EosSDKTransaction {
    
    inline def apply(actions: js.Array[EosTxAction | EosTxActionCommonnamestri], chainId: String, header: EosTxHeader): EosSDKTransaction = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], chainId = chainId.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[EosSDKTransaction]
    }
    
    extension [Self <: EosSDKTransaction](x: Self) {
      
      inline def setActions(value: js.Array[EosTxAction | EosTxActionCommonnamestri]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: (EosTxAction | EosTxActionCommonnamestri)*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setChainId(value: String): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: EosTxHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  trait EosSignTransaction extends StObject {
    
    var path: String | js.Array[Double]
    
    var transaction: EosSDKTransaction
  }
  object EosSignTransaction {
    
    inline def apply(path: String | js.Array[Double], transaction: EosSDKTransaction): EosSignTransaction = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[EosSignTransaction]
    }
    
    extension [Self <: EosSignTransaction](x: Self) {
      
      inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setTransaction(value: EosSDKTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.trezorConnect.anon.EosTxActionCommonnametran
    - typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamedele
    - typingsJapgolly.trezorConnect.anon.EosTxActionCommonnameunde
    - typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamebuyr
    - typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamebuyrAccount
    - typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamesell
    - typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamevote
    - typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamerefu
    - typingsJapgolly.trezorConnect.anon.EosTxActionCommonnameupda
    - typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamedeleAccount
    - typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamelink
    - typingsJapgolly.trezorConnect.anon.EosTxActionCommonnameunli
    - typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamenewa
  */
  trait EosTxAction extends StObject
  object EosTxAction {
    
    inline def EosTxActionCommonnamebuyr(account: String, authorization: js.Array[EosPermissionLevel], data: Payer): typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamebuyr = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "buyram")
      __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamebuyr]
    }
    
    inline def EosTxActionCommonnamebuyrAccount(account: String, authorization: js.Array[EosPermissionLevel], data: EosActionBuyRamBytes): typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamebuyrAccount = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "buyrambytes")
      __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamebuyrAccount]
    }
    
    inline def EosTxActionCommonnamedele(account: String, authorization: js.Array[EosPermissionLevel], data: Receiver): typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamedele = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "delegatebw")
      __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamedele]
    }
    
    inline def EosTxActionCommonnamedeleAccount(account: String, authorization: js.Array[EosPermissionLevel], data: EosActionDeleteAuth): typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamedeleAccount = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "deleteauth")
      __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamedeleAccount]
    }
    
    inline def EosTxActionCommonnamelink(account: String, authorization: js.Array[EosPermissionLevel], data: EosActionLinkAuth): typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamelink = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "linkauth")
      __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamelink]
    }
    
    inline def EosTxActionCommonnamenewa(account: String, authorization: js.Array[EosPermissionLevel], data: Active): typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamenewa = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "newaccount")
      __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamenewa]
    }
    
    inline def EosTxActionCommonnamerefu(account: String, authorization: js.Array[EosPermissionLevel], data: EosActionRefund): typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamerefu = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "refund")
      __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamerefu]
    }
    
    inline def EosTxActionCommonnamesell(account: String, authorization: js.Array[EosPermissionLevel], data: EosActionSellRam): typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamesell = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "sellram")
      __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamesell]
    }
    
    inline def EosTxActionCommonnametran(account: String, authorization: js.Array[EosPermissionLevel], data: From): typingsJapgolly.trezorConnect.anon.EosTxActionCommonnametran = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "transfer")
      __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.EosTxActionCommonnametran]
    }
    
    inline def EosTxActionCommonnameunde(account: String, authorization: js.Array[EosPermissionLevel], data: Unstakecpuquantity): typingsJapgolly.trezorConnect.anon.EosTxActionCommonnameunde = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "undelegatebw")
      __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.EosTxActionCommonnameunde]
    }
    
    inline def EosTxActionCommonnameunli(account: String, authorization: js.Array[EosPermissionLevel], data: EosActionUnlinkAuth): typingsJapgolly.trezorConnect.anon.EosTxActionCommonnameunli = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "unlinkauth")
      __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.EosTxActionCommonnameunli]
    }
    
    inline def EosTxActionCommonnameupda(account: String, authorization: js.Array[EosPermissionLevel], data: Account): typingsJapgolly.trezorConnect.anon.EosTxActionCommonnameupda = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "updateauth")
      __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.EosTxActionCommonnameupda]
    }
    
    inline def EosTxActionCommonnamevote(account: String, authorization: js.Array[EosPermissionLevel], data: Producers): typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamevote = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "voteproducer")
      __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.EosTxActionCommonnamevote]
    }
  }
  
  trait EosTxActionCommon extends StObject {
    
    var account: String
    
    var authorization: js.Array[EosPermissionLevel]
  }
  object EosTxActionCommon {
    
    inline def apply(account: String, authorization: js.Array[EosPermissionLevel]): EosTxActionCommon = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any])
      __obj.asInstanceOf[EosTxActionCommon]
    }
    
    extension [Self <: EosTxActionCommon](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAuthorization(value: js.Array[EosPermissionLevel]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationVarargs(value: EosPermissionLevel*): Self = StObject.set(x, "authorization", js.Array(value*))
    }
  }
  
  trait EosTxHeader extends StObject {
    
    var delaySec: Double
    
    var expiration: UintType
    
    var maxCpuUsageMs: Double
    
    var maxNetUsageWords: Double
    
    var refBlockNum: Double
    
    var refBlockPrefix: Double
  }
  object EosTxHeader {
    
    inline def apply(
      delaySec: Double,
      expiration: UintType,
      maxCpuUsageMs: Double,
      maxNetUsageWords: Double,
      refBlockNum: Double,
      refBlockPrefix: Double
    ): EosTxHeader = {
      val __obj = js.Dynamic.literal(delaySec = delaySec.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], maxCpuUsageMs = maxCpuUsageMs.asInstanceOf[js.Any], maxNetUsageWords = maxNetUsageWords.asInstanceOf[js.Any], refBlockNum = refBlockNum.asInstanceOf[js.Any], refBlockPrefix = refBlockPrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[EosTxHeader]
    }
    
    extension [Self <: EosTxHeader](x: Self) {
      
      inline def setDelaySec(value: Double): Self = StObject.set(x, "delaySec", value.asInstanceOf[js.Any])
      
      inline def setExpiration(value: UintType): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setMaxCpuUsageMs(value: Double): Self = StObject.set(x, "maxCpuUsageMs", value.asInstanceOf[js.Any])
      
      inline def setMaxNetUsageWords(value: Double): Self = StObject.set(x, "maxNetUsageWords", value.asInstanceOf[js.Any])
      
      inline def setRefBlockNum(value: Double): Self = StObject.set(x, "refBlockNum", value.asInstanceOf[js.Any])
      
      inline def setRefBlockPrefix(value: Double): Self = StObject.set(x, "refBlockPrefix", value.asInstanceOf[js.Any])
    }
  }
}
