package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jweixin.jweixinStrings.`0`
import typingsJapgolly.jweixin.jweixinStrings.`1`
import typingsJapgolly.jweixin.jweixinStrings.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================微信扫一扫================================*/
/*=============================微信小店================================*/
trait IopenProductSpecificView extends BaseParams {
  var productId: String
   // 商品id
  var viewType: `0` | `1` | `2`
}

object IopenProductSpecificView {
  @scala.inline
  def apply(
    productId: String,
    viewType: `0` | `1` | `2`,
    complete: /* repeated */ js.Any => Callback = null,
    fail: /* repeated */ js.Any => Callback = null,
    success: /* repeated */ js.Any => Callback = null
  ): IopenProductSpecificView = {
    val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], viewType = viewType.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[IopenProductSpecificView]
  }
}

