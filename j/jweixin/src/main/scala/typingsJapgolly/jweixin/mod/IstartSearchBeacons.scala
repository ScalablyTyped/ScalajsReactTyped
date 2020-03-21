package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================地理位置================================*/
/*=============================摇一摇周边================================*/
trait IstartSearchBeacons extends BaseParams {
  var ticket: String
    // 摇周边的业务ticket, 系统自动添加在摇出来的页面链接后面
  // 开启查找完成后的回调函数
  @JSName("complete")
  def complete_MIstartSearchBeacons(argv: js.Any): Unit
}

object IstartSearchBeacons {
  @scala.inline
  def apply(
    complete: js.Any => Callback,
    ticket: String,
    fail: /* repeated */ js.Any => Callback = null,
    success: /* repeated */ js.Any => Callback = null
  ): IstartSearchBeacons = {
    val __obj = js.Dynamic.literal(ticket = ticket.asInstanceOf[js.Any])
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[IstartSearchBeacons]
  }
}

