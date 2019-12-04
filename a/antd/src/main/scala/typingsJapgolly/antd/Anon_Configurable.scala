package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Configurable extends js.Object {
  var configurable: Boolean
  def get(): js.Any
}

object Anon_Configurable {
  @scala.inline
  def apply(configurable: Boolean, get: CallbackTo[js.Any]): Anon_Configurable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.asInstanceOf[Anon_Configurable]
  }
}

