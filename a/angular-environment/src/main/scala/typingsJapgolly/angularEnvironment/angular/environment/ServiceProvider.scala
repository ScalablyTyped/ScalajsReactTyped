package typingsJapgolly.angularEnvironment.angular.environment

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceProvider extends js.Object {
  /**
    * Evaluates the current domain and
    * loads the correct environment variables.
    */
  def check(): Unit
  /**
    * Sets the configuration object
    */
  def config(config: Config): Unit
  /**
    * Retrieves the correct version of a
    * variable for the current environment.
    */
  def read(key: String): js.Any
}

object ServiceProvider {
  @scala.inline
  def apply(check: Callback, config: Config => Callback, read: String => CallbackTo[js.Any]): ServiceProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("check")(check.toJsFn)
    __obj.updateDynamic("config")(js.Any.fromFunction1((t0: typingsJapgolly.angularEnvironment.angular.environment.Config) => config(t0).runNow()))
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: java.lang.String) => read(t0).runNow()))
    __obj.asInstanceOf[ServiceProvider]
  }
}

