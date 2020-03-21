package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 接口
trait Logger extends js.Object {
  /**
  		 * 写debug日志，参数同log方法
  		 */
  def debug(args: js.Any*): Unit
  /**
  		 * 写info日志，参数同log方法
  		 */
  def info(args: js.Any*): Unit
  /**
  		 * 写log日志，可以提供任意个参数，每个参数的类型为Object/Array/Number/String，参数p1到pN的内容会写入日志
  		 */
  def log(args: js.Any*): Unit
  /**
  		 * 写warn日志，参数同log方法
  		 */
  def warn(args: js.Any*): Unit
}

object Logger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Callback,
    info: /* repeated */ js.Any => Callback,
    log: /* repeated */ js.Any => Callback,
    warn: /* repeated */ js.Any => Callback
  ): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => debug(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => info(t0).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => log(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => warn(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
}

