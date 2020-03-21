package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//  字体
trait FontFaceOptions extends CommonCallbackOptions {
  //  可选的字体描述符
  var desc: js.UndefOr[FontDescOptions] = js.undefined
  //  定义的字体名称
  var family: String
  //  字体资源的地址。建议格式为 TTF 和 WOFF，WOFF2 在低版本的iOS上会不兼容。
  var source: String
}

object FontFaceOptions {
  @scala.inline
  def apply(
    family: String,
    source: String,
    complete: /* res */ js.Any => Callback = null,
    desc: FontDescOptions = null,
    fail: /* res */ js.Any => Callback = null,
    success: /* res */ js.Any => Callback = null
  ): FontFaceOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[FontFaceOptions]
  }
}

