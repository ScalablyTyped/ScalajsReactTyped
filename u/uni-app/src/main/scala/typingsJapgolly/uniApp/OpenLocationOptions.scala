package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenLocationOptions extends js.Object {
  /**
    * 地址的详细说明
    */
  var address: js.UndefOr[String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 纬度，范围为-90~90，负数表示南纬
    */
  var latitude: js.UndefOr[Double] = js.undefined
  /**
    * 经度，范围为-180~180，负数表示西经
    */
  var longitude: js.UndefOr[Double] = js.undefined
  /**
    * 位置名称
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * 缩放比例，范围5~18，默认为18
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object OpenLocationOptions {
  @scala.inline
  def apply(
    address: String = null,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    name: String = null,
    scale: Int | Double = null,
    success: js.UndefOr[Callback] = js.undefined
  ): OpenLocationOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[OpenLocationOptions]
  }
}

