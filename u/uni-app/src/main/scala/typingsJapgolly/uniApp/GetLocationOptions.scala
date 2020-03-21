package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocationOptions extends js.Object {
  /**
    * 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度
    */
  var altitude: js.UndefOr[Boolean] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 传入 true 会解析地址
    */
  var geocode: js.UndefOr[Boolean] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ GetLocationSuccess, Unit]] = js.undefined
  /**
    * 默认为 wgs84 返回 gps 坐标，gcj02 返回可用于uni.openLocation的坐标
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object GetLocationOptions {
  @scala.inline
  def apply(
    altitude: js.UndefOr[Boolean] = js.undefined,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    geocode: js.UndefOr[Boolean] = js.undefined,
    success: /* result */ GetLocationSuccess => Callback = null,
    `type`: String = null
  ): GetLocationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (!js.isUndefined(geocode)) __obj.updateDynamic("geocode")(geocode.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.GetLocationSuccess) => success(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocationOptions]
  }
}

