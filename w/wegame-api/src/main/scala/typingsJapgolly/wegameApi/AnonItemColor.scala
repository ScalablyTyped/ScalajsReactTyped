package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemColor extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 按钮的文字颜色，默认值#000000
    */
  var itemColor: js.UndefOr[String] = js.undefined
  /**
    * 按钮的文字数组，数组长度最大为 6
    */
  var itemList: js.Array[String]
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonItemColor {
  @scala.inline
  def apply(
    itemList: js.Array[String],
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    itemColor: String = null,
    success: js.UndefOr[Callback] = js.undefined
  ): AnonItemColor = {
    val __obj = js.Dynamic.literal(itemList = itemList.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (itemColor != null) __obj.updateDynamic("itemColor")(itemColor.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[AnonItemColor]
  }
}

