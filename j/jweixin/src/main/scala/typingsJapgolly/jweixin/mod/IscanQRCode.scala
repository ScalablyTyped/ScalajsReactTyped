package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jweixin.AnonResultStr
import typingsJapgolly.jweixin.jweixinNumbers.`0`
import typingsJapgolly.jweixin.jweixinNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IscanQRCode extends BaseParams {
  var needResult: `0` | `1`
   // 默认为0，扫描结果由微信处理，1则直接返回扫描结果，
  var scanType: js.Array[typingsJapgolly.jweixin.mod.scanType]
   // 可以指定扫二维码还是一维码，默认二者都有
  // 当needResult 为 1 时，扫码返回的结果
  @JSName("success")
  def success_MIscanQRCode(res: AnonResultStr): Unit
}

object IscanQRCode {
  @scala.inline
  def apply(
    needResult: `0` | `1`,
    scanType: js.Array[scanType],
    success: AnonResultStr => Callback,
    complete: /* repeated */ js.Any => Callback = null,
    fail: /* repeated */ js.Any => Callback = null
  ): IscanQRCode = {
    val __obj = js.Dynamic.literal(needResult = needResult.asInstanceOf[js.Any], scanType = scanType.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.jweixin.AnonResultStr) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[IscanQRCode]
  }
}

