package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraContextStartRecordOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 超过30s或页面onHide时会结束录像
    */
  var timeoutCallback: js.UndefOr[js.Function1[/* result */ CameraContextStopRecordResult, Unit]] = js.undefined
}

object CameraContextStartRecordOptions {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: js.UndefOr[Callback] = js.undefined,
    timeoutCallback: /* result */ CameraContextStopRecordResult => Callback = null
  ): CameraContextStartRecordOptions = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    if (timeoutCallback != null) __obj.updateDynamic("timeoutCallback")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.CameraContextStopRecordResult) => timeoutCallback(t0).runNow()))
    __obj.asInstanceOf[CameraContextStartRecordOptions]
  }
}

