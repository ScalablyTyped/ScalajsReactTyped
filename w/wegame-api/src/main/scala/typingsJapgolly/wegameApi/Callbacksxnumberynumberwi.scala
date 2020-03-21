package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.wegameApiStrings.auto
import typingsJapgolly.wegameApi.wegameApiStrings.back
import typingsJapgolly.wegameApi.wegameApiStrings.front
import typingsJapgolly.wegameApi.wegameApiStrings.large
import typingsJapgolly.wegameApi.wegameApiStrings.medium
import typingsJapgolly.wegameApi.wegameApiStrings.off
import typingsJapgolly.wegameApi.wegameApiStrings.on
import typingsJapgolly.wegameApi.wegameApiStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined wegame-api.wx.types.Callbacks & {  x ? :number,   y ? :number,   width ? :number,   height ? :number,   devicePosition ? :'front' | 'back',   flash ? :'auto' | 'on' | 'off',   size ? :'small' | 'medium' | 'large'} */
trait Callbacksxnumberynumberwi extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 摄像头朝向，值为 front, back，默认值back
    */
  var devicePosition: js.UndefOr[front | back] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 闪光灯，值为 auto, on, off，默认值auto
    */
  var flash: js.UndefOr[auto | on | off] = js.undefined
  /**
    * 相机的高度，默认值150
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * 帧数据图像尺寸，值为 small, medium, large，默认值small
    */
  var size: js.UndefOr[small | medium | large] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 相机的宽度，默认值300
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * 相机的左上角横坐标，默认值0
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * 相机的左上角纵坐标，默认值0
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Callbacksxnumberynumberwi {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    devicePosition: front | back = null,
    fail: js.UndefOr[Callback] = js.undefined,
    flash: auto | on | off = null,
    height: Int | Double = null,
    size: small | medium | large = null,
    success: js.UndefOr[Callback] = js.undefined,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): Callbacksxnumberynumberwi = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (devicePosition != null) __obj.updateDynamic("devicePosition")(devicePosition.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (flash != null) __obj.updateDynamic("flash")(flash.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callbacksxnumberynumberwi]
  }
}

