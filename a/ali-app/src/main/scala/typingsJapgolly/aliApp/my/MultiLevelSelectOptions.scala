package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiLevelSelectOptions
  extends BaseOptions[js.Any, js.Any] {
  						// 标题
  var list: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.undefined
  		// 选择数据列表
  var name: js.UndefOr[String] = js.undefined
  						// 条目名称
  var subList: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.undefined
  	// 子条目列表
  @JSName("success")
  var success_MultiLevelSelectOptions: js.UndefOr[js.Function1[/* res */ AnonResult, Unit]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object MultiLevelSelectOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    list: js.Array[MultiLevelSelectItem] = null,
    name: String = null,
    subList: js.Array[MultiLevelSelectItem] = null,
    success: /* res */ AnonResult => Callback = null,
    title: String = null
  ): MultiLevelSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subList != null) __obj.updateDynamic("subList")(subList.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.aliApp.AnonResult) => success(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiLevelSelectOptions]
  }
}

