package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonApFilePaths
import typingsJapgolly.aliApp.aliAppNumbers.`0`
import typingsJapgolly.aliApp.aliAppNumbers.`1`
import typingsJapgolly.aliApp.aliAppNumbers.`2`
import typingsJapgolly.aliApp.aliAppNumbers.`3`
import typingsJapgolly.aliApp.aliAppNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressImageOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 要压缩的图片地址数组
  		 */
  var apFilePaths: js.Array[String]
  /**
  		 * 压缩级别，支持 0 ~ 4 的整数，默认 4。详见「compressLevel表 说明表」
  		 * compressLevel表
  		 * compressLevel | 说明
  		 * --------------|-----
  		 * 0 | 低质量
  		 * 1 | 中等质量
  		 * 2 | 高质量
  		 * 3 | 不压缩
  		 * 4 | 根据网络适应
  		 */
  var compressLevel: js.UndefOr[`0` | `1` | `2` | `3` | `4`] = js.undefined
  @JSName("success")
  var success_CompressImageOptions: js.UndefOr[js.Function1[/* res */ AnonApFilePaths, Unit]] = js.undefined
}

object CompressImageOptions {
  @scala.inline
  def apply(
    apFilePaths: js.Array[String],
    complete: /* res */ js.Any => Callback = null,
    compressLevel: `0` | `1` | `2` | `3` | `4` = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonApFilePaths => Callback = null
  ): CompressImageOptions = {
    val __obj = js.Dynamic.literal(apFilePaths = apFilePaths.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (compressLevel != null) __obj.updateDynamic("compressLevel")(compressLevel.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.aliApp.AnonApFilePaths) => success(t0).runNow()))
    __obj.asInstanceOf[CompressImageOptions]
  }
}

