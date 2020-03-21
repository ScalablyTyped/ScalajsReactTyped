package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined wegame-api.wx.types.Callbacks & {  muteConfig  :{  muteMicrophone ? :boolean,   muteEarphone ? :boolean}} */
trait CallbacksmuteConfigmuteMi extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 静音设置
    */
  var muteConfig: AnonMuteEarphone
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object CallbacksmuteConfigmuteMi {
  @scala.inline
  def apply(
    muteConfig: AnonMuteEarphone,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: js.UndefOr[Callback] = js.undefined
  ): CallbacksmuteConfigmuteMi = {
    val __obj = js.Dynamic.literal(muteConfig = muteConfig.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[CallbacksmuteConfigmuteMi]
  }
}

