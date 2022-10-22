package typingsJapgolly.xummSdk

import japgolly.scalajs.react.Callback
import typingsJapgolly.xummSdk.distSrcMetaMod.Meta
import typingsJapgolly.xummSdk.distSrcPayloadMod.Payload
import typingsJapgolly.xummSdk.distSrcStorageMod.Storage
import typingsJapgolly.xummSdk.distSrcTypesMetaApplicationDetailsMod.ApplicationDetails
import typingsJapgolly.xummSdk.distSrcTypesMetaCuratedAssetsResponseMod.CuratedAssetsResponse
import typingsJapgolly.xummSdk.distSrcTypesMetaRatesResponseMod.RatesResponse
import typingsJapgolly.xummSdk.distSrcTypesMetaUserTokensMod.UserTokenValidity
import typingsJapgolly.xummSdk.distSrcTypesMetaXrplTransactionMod.XrplTransaction
import typingsJapgolly.xummSdk.distSrcTypesXAppXAppJwtOttMod.xAppJwtOtt
import typingsJapgolly.xummSdk.distSrcTypesXAppXAppOttDataMod.xAppOttData
import typingsJapgolly.xummSdk.xummSdkStrings.IN_PROGRESS
import typingsJapgolly.xummSdk.xummSdkStrings.NONE
import typingsJapgolly.xummSdk.xummSdkStrings.REJECTED
import typingsJapgolly.xummSdk.xummSdkStrings.SUCCESSFUL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xumm-sdk", "XummSdk")
  @js.native
  open class XummSdk () extends StObject {
    def this(apiKey: String) = this()
    def this(apiKey: String, apiSecret: String) = this()
    def this(apiKey: Unit, apiSecret: String) = this()
    
    /* private */ var Meta: Any = js.native
    
    def caught(error: js.Error): Unit = js.native
    
    def getCuratedAssets(): js.Promise[CuratedAssetsResponse] = js.native
    
    /* private */ var getEnv: Any = js.native
    
    def getKycStatus(userTokenOrAccount: String): js.Promise[NONE | IN_PROGRESS | REJECTED | SUCCESSFUL] = js.native
    
    def getRates(currencyCode: String): js.Promise[RatesResponse] = js.native
    
    def getTransaction(txHash: String): js.Promise[XrplTransaction] = js.native
    
    var payload: Payload = js.native
    
    /**
      * Proxy methods to Meta class below
      */
    def ping(): js.Promise[ApplicationDetails] = js.native
    
    def setEndpoint(endpoint: String): Boolean = js.native
    
    var storage: Storage = js.native
    
    def verifyUserToken(token: String): js.Promise[UserTokenValidity | Null] = js.native
    
    def verifyUserTokens(userTokens: js.Array[String]): js.Promise[js.Array[UserTokenValidity]] = js.native
    
    var xApp: typingsJapgolly.xummSdk.distSrcXAppMod.xApp = js.native
  }
  
  @JSImport("xumm-sdk", "XummSdkJwt")
  @js.native
  open class XummSdkJwt protected () extends XummSdk {
    def this(apiKeyOrJwt: String) = this()
    def this(apiKeyOrJwt: String, ott: String) = this()
    def this(apiKeyOrJwt: String, ott: String, options: XummSdkJwtOptions) = this()
    def this(apiKeyOrJwt: String, ott: Unit, options: XummSdkJwtOptions) = this()
    
    def _jwtStore(invoker: Meta, persistJwt: js.Function1[/* jwt */ String, Unit]): XummJwtOptionsStore = js.native
    
    var fatalHandler: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
    
    def getOttData(): js.Promise[xAppOttData] = js.native
    
    /* private */ var ottResolved: Any = js.native
    
    /* private */ var reject: Any = js.native
    
    /* private */ var resolve: Any = js.native
    
    /* private */ var store: Any = js.native
  }
  
  trait XummJwtOptionsStore extends StObject {
    
    def get(ott: String): xAppJwtOtt | Unit
    
    def set(ott: String, ottData: xAppJwtOtt): Unit
  }
  object XummJwtOptionsStore {
    
    inline def apply(get: String => xAppJwtOtt | Unit, set: (String, xAppJwtOtt) => Callback): XummJwtOptionsStore = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2((t0: String, t1: xAppJwtOtt) => (set(t0, t1)).runNow()))
      __obj.asInstanceOf[XummJwtOptionsStore]
    }
    
    extension [Self <: XummJwtOptionsStore](x: Self) {
      
      inline def setGet(value: String => xAppJwtOtt | Unit): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, xAppJwtOtt) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: xAppJwtOtt) => (value(t0, t1)).runNow()))
    }
  }
  
  trait XummSdkJwtOptions extends StObject {
    
    var fatalHandler: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    var store: js.UndefOr[XummJwtOptionsStore] = js.undefined
  }
  object XummSdkJwtOptions {
    
    inline def apply(): XummSdkJwtOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XummSdkJwtOptions]
    }
    
    extension [Self <: XummSdkJwtOptions](x: Self) {
      
      inline def setFatalHandler(value: /* error */ js.Error => Callback): Self = StObject.set(x, "fatalHandler", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
      
      inline def setFatalHandlerUndefined: Self = StObject.set(x, "fatalHandler", js.undefined)
      
      inline def setStore(value: XummJwtOptionsStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
}
