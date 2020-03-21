package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  tmplIds  :std.ReadonlyArray<string>} & wegame-api.wx.types.CallbacksWithType2<{  errMsg  :string, [TEMPLATE_ID: string] : 'accept' | 'reject' | 'ban' | string}, {  errMsg  :string,   errCode  :number}> */
trait tmplIdsReadonlyArraystrin extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrCode, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ AnonDictTEMPLATEID, Unit]] = js.undefined
  /**
    * 需要订阅的消息模板的id的集合（注意：iOS客户端7.0.6版本、Android客户端7.0.7版本之后的一次订阅才支持多个模板消息，iOS客户端7.0.5版本、Android客户端7.0.6版本之前的一次订阅
    * 只支持一个模板消息）消息模板id在[微信公众平台(mp.weixin.qq.com)-功能-订阅消息]中配置
    */
  var tmplIds: js.Array[String]
}

object tmplIdsReadonlyArraystrin {
  @scala.inline
  def apply(
    tmplIds: js.Array[String],
    complete: js.UndefOr[Callback] = js.undefined,
    fail: /* res */ AnonErrCode => Callback = null,
    success: /* res */ AnonDictTEMPLATEID => Callback = null
  ): tmplIdsReadonlyArraystrin = {
    val __obj = js.Dynamic.literal(tmplIds = tmplIds.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonErrCode) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonDictTEMPLATEID) => success(t0).runNow()))
    __obj.asInstanceOf[tmplIdsReadonlyArraystrin]
  }
}

