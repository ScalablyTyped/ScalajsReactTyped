package typingsJapgolly.angularEnvironment.angular.environment

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  /**
    * Retrieve the current environment
    */
  def get(): String
  /**
    * Evaluates current environment against
    * environment parameter.
    */
  def is(environment: String): Boolean
  /**
    * Retrieves the correct version of a
    * variable for the current environment.
    */
  def read(key: String): js.Any
  /**
    * Force sets the current environment
    */
  def set(environment: String): Unit
}

object Service {
  @scala.inline
  def apply(
    get: CallbackTo[String],
    is: String => CallbackTo[Boolean],
    read: String => CallbackTo[js.Any],
    set: String => Callback
  ): Service = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("is")(js.Any.fromFunction1((t0: java.lang.String) => is(t0).runNow()))
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: java.lang.String) => read(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: java.lang.String) => set(t0).runNow()))
    __obj.asInstanceOf[Service]
  }
}

