package typingsJapgolly.yandexMoneySdk

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.ExternalPayment.GetInstanceIdResult
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.ExternalPayment.ProcessOptions
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.ExternalPayment.ProcessResult
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.ExternalPayment.RequestOptions
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.ExternalPayment.RequestResult
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.Wallet.AccountInfoResult
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.Wallet.GetAccessTokenResult
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.Wallet.IncomingTransferAcceptResult
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.Wallet.IncomingTransferRejectResult
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.Wallet.OperationDetailsResult
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.Wallet.OperationHistoryOptions
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.Wallet.OperationHistoryResult
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.Wallet.ProcessPaymentOptions
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.Wallet.ProcessPaymentResult
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.Wallet.RequestPaymentOptions
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.Wallet.RequestPaymentResult
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.Wallet.SendAuthenticatedRequestParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Config extends StObject {
    
    var MONEY_URL: String
    
    var SP_MONEY_URL: String
  }
  object Config {
    
    @JSImport("yandex-money-sdk", "Config")
    @js.native
    val ^ : Config = js.native
    
    extension [Self <: Config](x: Self) {
      
      inline def setMONEY_URL(value: String): Self = StObject.set(x, "MONEY_URL", value.asInstanceOf[js.Any])
      
      inline def setSP_MONEY_URL(value: String): Self = StObject.set(x, "SP_MONEY_URL", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExternalPayment extends StObject {
    
    def process(options: ProcessOptions, callback: ResponseCallback[ProcessResult]): Unit
    
    def request(options: RequestOptions, callback: ResponseCallback[RequestResult]): Unit
  }
  object ExternalPayment {
    
    @JSImport("yandex-money-sdk", "ExternalPayment")
    @js.native
    val ^ : ExternalPaymentStatic = js.native
    
    extension [Self <: ExternalPayment](x: Self) {
      
      inline def setProcess(value: (ProcessOptions, ResponseCallback[ProcessResult]) => Callback): Self = StObject.set(x, "process", js.Any.fromFunction2((t0: ProcessOptions, t1: ResponseCallback[ProcessResult]) => (value(t0, t1)).runNow()))
      
      inline def setRequest(value: (RequestOptions, ResponseCallback[RequestResult]) => Callback): Self = StObject.set(x, "request", js.Any.fromFunction2((t0: RequestOptions, t1: ResponseCallback[RequestResult]) => (value(t0, t1)).runNow()))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("yandex-money-sdk", "ExternalPayment")
  @js.native
  open class ExternalPaymentCls protected ()
    extends StObject
       with ExternalPayment {
    def this(instanceId: String) = this()
    
    /* CompleteClass */
    override def process(options: ProcessOptions, callback: ResponseCallback[ProcessResult]): Unit = js.native
    
    /* CompleteClass */
    override def request(options: RequestOptions, callback: ResponseCallback[RequestResult]): Unit = js.native
  }
  
  trait Wallet extends StObject {
    
    def accountInfo(callback: ResponseCallback[AccountInfoResult]): Unit
    
    def incomingTransferAccept(
      operation_id: String,
      protectionCode: String,
      callback: ResponseCallback[IncomingTransferAcceptResult]
    ): Unit
    
    def incomingTransferReject(operation_id: String, callback: ResponseCallback[IncomingTransferRejectResult]): Unit
    
    def operationDetails(operation_id: String, callback: ResponseCallback[OperationDetailsResult]): Unit
    
    def operationHistory(options: OperationHistoryOptions, callback: ResponseCallback[OperationHistoryResult]): Unit
    
    def processPayment(options: ProcessPaymentOptions, callback: ResponseCallback[ProcessPaymentResult]): Unit
    
    def requestPayment(options: RequestPaymentOptions, callback: ResponseCallback[RequestPaymentResult]): Unit
    
    def sendAuthenticatedRequest(params: SendAuthenticatedRequestParams, callback: ResponseCallback[Any]): Unit
  }
  object Wallet {
    
    @JSImport("yandex-money-sdk", "Wallet")
    @js.native
    val ^ : WalletStatic = js.native
    
    extension [Self <: Wallet](x: Self) {
      
      inline def setAccountInfo(value: ResponseCallback[AccountInfoResult] => Callback): Self = StObject.set(x, "accountInfo", js.Any.fromFunction1((t0: ResponseCallback[AccountInfoResult]) => value(t0).runNow()))
      
      inline def setIncomingTransferAccept(value: (String, String, ResponseCallback[IncomingTransferAcceptResult]) => Callback): Self = StObject.set(x, "incomingTransferAccept", js.Any.fromFunction3((t0: String, t1: String, t2: ResponseCallback[IncomingTransferAcceptResult]) => (value(t0, t1, t2)).runNow()))
      
      inline def setIncomingTransferReject(value: (String, ResponseCallback[IncomingTransferRejectResult]) => Callback): Self = StObject.set(x, "incomingTransferReject", js.Any.fromFunction2((t0: String, t1: ResponseCallback[IncomingTransferRejectResult]) => (value(t0, t1)).runNow()))
      
      inline def setOperationDetails(value: (String, ResponseCallback[OperationDetailsResult]) => Callback): Self = StObject.set(x, "operationDetails", js.Any.fromFunction2((t0: String, t1: ResponseCallback[OperationDetailsResult]) => (value(t0, t1)).runNow()))
      
      inline def setOperationHistory(value: (OperationHistoryOptions, ResponseCallback[OperationHistoryResult]) => Callback): Self = StObject.set(x, "operationHistory", js.Any.fromFunction2((t0: OperationHistoryOptions, t1: ResponseCallback[OperationHistoryResult]) => (value(t0, t1)).runNow()))
      
      inline def setProcessPayment(value: (ProcessPaymentOptions, ResponseCallback[ProcessPaymentResult]) => Callback): Self = StObject.set(x, "processPayment", js.Any.fromFunction2((t0: ProcessPaymentOptions, t1: ResponseCallback[ProcessPaymentResult]) => (value(t0, t1)).runNow()))
      
      inline def setRequestPayment(value: (RequestPaymentOptions, ResponseCallback[RequestPaymentResult]) => Callback): Self = StObject.set(x, "requestPayment", js.Any.fromFunction2((t0: RequestPaymentOptions, t1: ResponseCallback[RequestPaymentResult]) => (value(t0, t1)).runNow()))
      
      inline def setSendAuthenticatedRequest(value: (SendAuthenticatedRequestParams, ResponseCallback[Any]) => Callback): Self = StObject.set(x, "sendAuthenticatedRequest", js.Any.fromFunction2((t0: SendAuthenticatedRequestParams, t1: ResponseCallback[Any]) => (value(t0, t1)).runNow()))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("yandex-money-sdk", "Wallet")
  @js.native
  open class WalletCls protected ()
    extends StObject
       with Wallet {
    def this(accessToken: String) = this()
    
    /* CompleteClass */
    override def accountInfo(callback: ResponseCallback[AccountInfoResult]): Unit = js.native
    
    /* CompleteClass */
    override def incomingTransferAccept(
      operation_id: String,
      protectionCode: String,
      callback: ResponseCallback[IncomingTransferAcceptResult]
    ): Unit = js.native
    
    /* CompleteClass */
    override def incomingTransferReject(operation_id: String, callback: ResponseCallback[IncomingTransferRejectResult]): Unit = js.native
    
    /* CompleteClass */
    override def operationDetails(operation_id: String, callback: ResponseCallback[OperationDetailsResult]): Unit = js.native
    
    /* CompleteClass */
    override def operationHistory(options: OperationHistoryOptions, callback: ResponseCallback[OperationHistoryResult]): Unit = js.native
    
    /* CompleteClass */
    override def processPayment(options: ProcessPaymentOptions, callback: ResponseCallback[ProcessPaymentResult]): Unit = js.native
    
    /* CompleteClass */
    override def requestPayment(options: RequestPaymentOptions, callback: ResponseCallback[RequestPaymentResult]): Unit = js.native
    
    /* CompleteClass */
    override def sendAuthenticatedRequest(params: SendAuthenticatedRequestParams, callback: ResponseCallback[Any]): Unit = js.native
  }
  
  @js.native
  trait ExternalPaymentStatic
    extends StObject
       with Instantiable1[/* instanceId */ String, ExternalPayment] {
    
    def getInstanceId(clientId: String, callback: ResponseCallback[GetInstanceIdResult]): Unit = js.native
  }
  
  type ResponseCallback[TBody] = js.Function3[/* err */ Any, /* body */ TBody, /* response */ IncomingMessage, Any]
  
  @js.native
  trait WalletStatic
    extends StObject
       with Instantiable1[/* accessToken */ String, Wallet] {
    
    def buildObtainTokenUrl(clientId: String, redirectURI: String, scope: js.Array[String]): String = js.native
    
    def getAccessToken(
      clientId: String,
      code: String,
      redirectURI: String,
      clientSecret: String,
      callback: ResponseCallback[GetAccessTokenResult]
    ): Unit = js.native
    
    def revokeToken(token: String, revoke_all: Any, callback: ResponseCallback[Any]): Unit = js.native
  }
}
