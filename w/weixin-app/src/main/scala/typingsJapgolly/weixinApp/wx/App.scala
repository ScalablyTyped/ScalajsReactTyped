package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  /**
  		 * 获取当前页面
  		 */
  def getCurrentPage(): Page[js.Object, js.Object]
}

object App {
  @scala.inline
  def apply(getCurrentPage: CallbackTo[Page[js.Object, js.Object]]): App = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCurrentPage")(getCurrentPage.toJsFn)
    __obj.asInstanceOf[App]
  }
}

