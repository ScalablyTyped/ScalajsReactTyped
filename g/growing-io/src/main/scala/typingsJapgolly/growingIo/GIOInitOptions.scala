package typingsJapgolly.growingIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GIOInitOptions extends js.Object {
  /** 配置imp类型的数据关闭发送 */
  var imp: js.UndefOr[Boolean] = js.undefined
}

object GIOInitOptions {
  @scala.inline
  def apply(imp: js.UndefOr[Boolean] = js.undefined): GIOInitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(imp)) __obj.updateDynamic("imp")(imp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GIOInitOptions]
  }
}

