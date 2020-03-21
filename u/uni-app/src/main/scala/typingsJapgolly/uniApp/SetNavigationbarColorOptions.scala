package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetNavigationbarColorOptions extends js.Object {
  /**
    * 动画效果
    */
  var animation: js.UndefOr[NavigationBarAnimation] = js.undefined
  /**
    * 背景颜色值，有效值为十六进制颜色
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 前景颜色值，包括按钮、标题、状态栏的颜色
    */
  var frontColor: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SetNavigationbarColorOptions {
  @scala.inline
  def apply(
    animation: NavigationBarAnimation = null,
    backgroundColor: String = null,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    frontColor: String = null,
    success: js.UndefOr[Callback] = js.undefined
  ): SetNavigationbarColorOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (frontColor != null) __obj.updateDynamic("frontColor")(frontColor.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[SetNavigationbarColorOptions]
  }
}

