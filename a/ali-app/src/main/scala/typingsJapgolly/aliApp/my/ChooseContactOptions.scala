package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonContactsDicArray
import typingsJapgolly.aliApp.aliAppStrings.all
import typingsJapgolly.aliApp.aliAppStrings.known
import typingsJapgolly.aliApp.aliAppStrings.multi
import typingsJapgolly.aliApp.aliAppStrings.none
import typingsJapgolly.aliApp.aliAppStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseContactOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 选择类型，值为single（单选）或者 multi（多选） */
  var chooseType: single | multi | String
  /** 是否包含自己 */
  var includeMe: js.UndefOr[Boolean] = js.undefined
  /** 包含手机通讯录联系人的模式：默认为不包含（none）、或者仅仅包含双向通讯录联系人（known）、或者包含手机通讯录联系人（all） */
  var includeMobileContactMode: js.UndefOr[none | known | all | String] = js.undefined
  /** 最大选择人数，仅 chooseType 为 multi 时才有效 */
  var multiChooseMax: js.UndefOr[Double] = js.undefined
  /** 多选达到上限的文案，仅 chooseType 为 multi 时才有效 */
  var multiChooseMaxTips: js.UndefOr[String] = js.undefined
  @JSName("success")
  def success_MChooseContactOptions(result: AnonContactsDicArray): Unit
}

object ChooseContactOptions {
  @scala.inline
  def apply(
    chooseType: single | multi | String,
    success: AnonContactsDicArray => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    includeMe: js.UndefOr[Boolean] = js.undefined,
    includeMobileContactMode: none | known | all | String = null,
    multiChooseMax: Int | Double = null,
    multiChooseMaxTips: String = null
  ): ChooseContactOptions = {
    val __obj = js.Dynamic.literal(chooseType = chooseType.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.aliApp.AnonContactsDicArray) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (!js.isUndefined(includeMe)) __obj.updateDynamic("includeMe")(includeMe.asInstanceOf[js.Any])
    if (includeMobileContactMode != null) __obj.updateDynamic("includeMobileContactMode")(includeMobileContactMode.asInstanceOf[js.Any])
    if (multiChooseMax != null) __obj.updateDynamic("multiChooseMax")(multiChooseMax.asInstanceOf[js.Any])
    if (multiChooseMaxTips != null) __obj.updateDynamic("multiChooseMaxTips")(multiChooseMaxTips.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseContactOptions]
  }
}

