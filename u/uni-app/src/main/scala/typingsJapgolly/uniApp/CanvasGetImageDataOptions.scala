package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasGetImageDataOptions extends js.Object {
  /**
    * 画布标识，传入 <canvas/> 的 canvas-id
    */
  var canvasId: js.UndefOr[String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 将要被提取的图像数据矩形区域的高度
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ CanvasGetImageDataRes, Unit]] = js.undefined
  /**
    * 将要被提取的图像数据矩形区域的宽度
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * 将要被提取的图像数据矩形区域的左上角 x 坐标
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * 将要被提取的图像数据矩形区域的左上角 y 坐标
    */
  var y: js.UndefOr[Double] = js.undefined
}

object CanvasGetImageDataOptions {
  @scala.inline
  def apply(
    canvasId: String = null,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    height: Int | Double = null,
    success: /* result */ CanvasGetImageDataRes => Callback = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): CanvasGetImageDataOptions = {
    val __obj = js.Dynamic.literal()
    if (canvasId != null) __obj.updateDynamic("canvasId")(canvasId.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.CanvasGetImageDataRes) => success(t0).runNow()))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasGetImageDataOptions]
  }
}

