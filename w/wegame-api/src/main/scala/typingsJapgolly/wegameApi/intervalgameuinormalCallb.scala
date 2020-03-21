package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.wegameApiStrings.game
import typingsJapgolly.wegameApi.wegameApiStrings.normal
import typingsJapgolly.wegameApi.wegameApiStrings.ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  interval  :'game' | 'ui' | 'normal'} & wegame-api.wx.types.Callbacks */
trait intervalgameuinormalCallb extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 开始监听设备方向的变化。默认值normal，
    * game - 适用于更新游戏的回调频率，在 20ms/次 左右
    * ui - 适用于更新 UI 的回调频率，在 60ms/次 左右
    * normal - 普通的回调频率，在 200ms/次 左右
    */
  var interval: game | ui | normal
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object intervalgameuinormalCallb {
  @scala.inline
  def apply(
    interval: game | ui | normal,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: js.UndefOr[Callback] = js.undefined
  ): intervalgameuinormalCallb = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[intervalgameuinormalCallb]
  }
}

