package typingsJapgolly.config.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  var util: IUtil
  def get[T](setting: String): T
  def has(setting: String): Boolean
}

object IConfig {
  @scala.inline
  def apply(get: String => CallbackTo[js.Any], has: String => CallbackTo[Boolean], util: IUtil): IConfig = {
    val __obj = js.Dynamic.literal(util = util.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.asInstanceOf[IConfig]
  }
}

