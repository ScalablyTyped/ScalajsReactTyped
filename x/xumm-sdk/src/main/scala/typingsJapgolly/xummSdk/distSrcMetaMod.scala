package typingsJapgolly.xummSdk

import typingsJapgolly.xummSdk.distSrcTypesMetaAnyJsonMod.AnyJson
import typingsJapgolly.xummSdk.distSrcTypesMetaApplicationDetailsMod.ApplicationDetails
import typingsJapgolly.xummSdk.distSrcTypesMetaCuratedAssetsResponseMod.CuratedAssetsResponse
import typingsJapgolly.xummSdk.distSrcTypesMetaRatesResponseMod.RatesResponse
import typingsJapgolly.xummSdk.distSrcTypesMetaUserTokensMod.UserTokenValidity
import typingsJapgolly.xummSdk.distSrcTypesMetaXrplTransactionMod.XrplTransaction
import typingsJapgolly.xummSdk.distSrcTypesXummApiMod.CreatePayload
import typingsJapgolly.xummSdk.mod.XummSdk
import typingsJapgolly.xummSdk.xummSdkStrings.IN_PROGRESS
import typingsJapgolly.xummSdk.xummSdkStrings.NONE
import typingsJapgolly.xummSdk.xummSdkStrings.REJECTED
import typingsJapgolly.xummSdk.xummSdkStrings.SUCCESSFUL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMetaMod {
  
  @JSImport("xumm-sdk/dist/src/Meta", "Meta")
  @js.native
  open class Meta protected () extends StObject {
    def this(apiKey: String, apiSecret: String) = this()
    
    def _inject(Invoker: XummSdk): Unit = js.native
    
    /* private */ var apiKey: Any = js.native
    
    /* private */ var apiSecret: Any = js.native
    
    /* private */ var authorize: Any = js.native
    
    def call[T](endpoint: String): js.Promise[T] = js.native
    def call[T](endpoint: String, httpMethod: String): js.Promise[T] = js.native
    def call[T](endpoint: String, httpMethod: String, data: AnyJson): js.Promise[T] = js.native
    def call[T](endpoint: String, httpMethod: String, data: CreatePayload): js.Promise[T] = js.native
    def call[T](endpoint: String, httpMethod: Unit, data: AnyJson): js.Promise[T] = js.native
    def call[T](endpoint: String, httpMethod: Unit, data: CreatePayload): js.Promise[T] = js.native
    
    var endpoint: String = js.native
    
    def getCuratedAssets(): js.Promise[CuratedAssetsResponse] = js.native
    
    def getKycStatus(userTokenOrAccount: String): js.Promise[
        /* keyof xumm-sdk.xumm-sdk/dist/src/types/Meta/KycStatusResponse.PossibleKycStatuses */ NONE | IN_PROGRESS | REJECTED | SUCCESSFUL
      ] = js.native
    
    def getRates(currencyCode: String): js.Promise[RatesResponse] = js.native
    
    def getTransaction(txHash: String): js.Promise[XrplTransaction] = js.native
    
    /* private */ var injected: Any = js.native
    
    /* private */ var invoker: Any = js.native
    
    /* private */ var isBrowser: Any = js.native
    
    /* private */ var jwt: Any = js.native
    
    /* private */ var jwtFlow: Any = js.native
    
    def ping(): js.Promise[ApplicationDetails] = js.native
    
    def setEndpoint(endpoint: String): Boolean = js.native
    
    def verifyUserTokens(userTokens: js.Array[String]): js.Promise[js.Array[UserTokenValidity]] = js.native
  }
}
