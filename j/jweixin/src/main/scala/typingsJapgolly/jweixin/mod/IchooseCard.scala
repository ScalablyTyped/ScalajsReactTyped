package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jweixin.AnonCardList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================微信卡券================================*/
trait IchooseCard extends BaseParams {
   // 卡券类型
  var cardId: String
   // 签名方式，默认'SHA1'
  var cardSign: String
   // 门店Id
  var cardType: String
   // 卡券签名时间戳
  var nonceStr: String
  var shopId: String
   // 卡券签名随机串
  var signType: String
   // 卡券Id
  var timestamp: Double
   // 卡券签名
  @JSName("success")
  def success_MIchooseCard(res: AnonCardList): Unit
}

object IchooseCard {
  @scala.inline
  def apply(
    cardId: String,
    cardSign: String,
    cardType: String,
    nonceStr: String,
    shopId: String,
    signType: String,
    success: AnonCardList => Callback,
    timestamp: Double,
    complete: /* repeated */ js.Any => Callback = null,
    fail: /* repeated */ js.Any => Callback = null
  ): IchooseCard = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], cardSign = cardSign.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], shopId = shopId.asInstanceOf[js.Any], signType = signType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.jweixin.AnonCardList) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[IchooseCard]
  }
}

