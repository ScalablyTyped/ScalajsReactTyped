package typingsJapgolly.yandexMoneySdk.mod

import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.Wallet.AccountInfoResult
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-money-sdk", "Wallet")
@js.native
class WalletCls protected () extends Wallet {
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
  override def sendAuthenticatedRequest(params: SendAuthenticatedRequestParams, callback: ResponseCallback[_]): Unit = js.native
}

