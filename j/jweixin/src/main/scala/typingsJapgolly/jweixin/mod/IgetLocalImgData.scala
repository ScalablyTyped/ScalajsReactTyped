package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jweixin.AnonLocalData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgetLocalImgData extends BaseParams {
  var localId: String
   // 图片的localID
  // localData是图片的base64数据，可以用img标签显示
  @JSName("success")
  def success_MIgetLocalImgData(res: AnonLocalData): Unit
}

object IgetLocalImgData {
  @scala.inline
  def apply(
    localId: String,
    success: AnonLocalData => Callback,
    complete: /* repeated */ js.Any => Callback = null,
    fail: /* repeated */ js.Any => Callback = null
  ): IgetLocalImgData = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.jweixin.AnonLocalData) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[IgetLocalImgData]
  }
}

