package typingsJapgolly.hexo.mod.extend

import japgolly.scalajs.react.Callback
import typingsJapgolly.hexo.mod.extend.Deployer.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployer_ extends js.Object {
  def register(name: String, fn: js.Function1[/* args */ Config, Unit]): Unit
}

object Deployer_ {
  @scala.inline
  def apply(register: (String, js.Function1[/* args */ Config, Unit]) => Callback): Deployer_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* args */ typingsJapgolly.hexo.mod.extend.Deployer.Config, scala.Unit]) => register(t0, t1).runNow()))
    __obj.asInstanceOf[Deployer_]
  }
}

