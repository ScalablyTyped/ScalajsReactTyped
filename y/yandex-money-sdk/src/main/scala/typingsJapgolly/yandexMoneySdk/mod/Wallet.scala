package typingsJapgolly.yandexMoneySdk.mod

import org.scalablytyped.runtime.TopLevel
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

trait Wallet extends js.Object {
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
  def sendAuthenticatedRequest(params: SendAuthenticatedRequestParams, callback: ResponseCallback[_]): Unit
}

@JSImport("yandex-money-sdk", "Wallet")
@js.native
object Wallet extends TopLevel[WalletStatic]

