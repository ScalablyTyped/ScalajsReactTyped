package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weappApi.AnonTapIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetOptions extends js.Object {
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  // 按钮的文字颜色
  var itemColor: js.UndefOr[String] = js.undefined
  // 必填，按钮的文字数组，数组长度最大为 6
  var itemList: js.Array[String]
  var success: js.UndefOr[ActionSheetSuccessCallback] = js.undefined
}

object ActionSheetOptions {
  @scala.inline
  def apply(
    itemList: js.Array[String],
    complete: /* res */ js.Any => Callback = null,
    fail: /* res */ js.Any => Callback = null,
    itemColor: String = null,
    success: /* res */ AnonTapIndex => Callback = null
  ): ActionSheetOptions = {
    val __obj = js.Dynamic.literal(itemList = itemList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (itemColor != null) __obj.updateDynamic("itemColor")(itemColor.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weappApi.AnonTapIndex) => success(t0).runNow()))
    __obj.asInstanceOf[ActionSheetOptions]
  }
}

