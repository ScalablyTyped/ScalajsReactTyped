package typingsJapgolly.yandexMoneySdk.mod

import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.ExternalPayment.ProcessOptions
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.ExternalPayment.ProcessResult
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.ExternalPayment.RequestOptions
import typingsJapgolly.yandexMoneySdk.YandexMoneySDK.ExternalPayment.RequestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-money-sdk", "ExternalPayment")
@js.native
class ExternalPaymentCls protected () extends ExternalPayment {
  def this(instanceId: String) = this()
  /* CompleteClass */
  override def process(options: ProcessOptions, callback: ResponseCallback[ProcessResult]): Unit = js.native
  /* CompleteClass */
  override def request(options: RequestOptions, callback: ResponseCallback[RequestResult]): Unit = js.native
}

