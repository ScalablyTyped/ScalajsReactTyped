package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendSocketMessageOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需要发送的内容：普通的文本内容 String 或者经 base64 编码后的 String
  		 */
  var data: String | scala.scalajs.js.typedarray.ArrayBuffer
  /**
  		 * 如果需要发送二进制数据，需要将入参数据经 base64 编码成 String 后赋值 data，同时将此字段设置为true，否则如果是普通的文本内容 String，不需要设置此字段
  		 */
  var isBuffer: js.UndefOr[Boolean] = js.undefined
}

object SendSocketMessageOptions {
  @scala.inline
  def apply(
    data: String | scala.scalajs.js.typedarray.ArrayBuffer,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    isBuffer: js.UndefOr[Boolean] = js.undefined,
    success: js.Any => Callback = null
  ): SendSocketMessageOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (!js.isUndefined(isBuffer)) __obj.updateDynamic("isBuffer")(isBuffer.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[SendSocketMessageOptions]
  }
}

