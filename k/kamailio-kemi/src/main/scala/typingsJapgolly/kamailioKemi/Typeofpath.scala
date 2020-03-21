package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpath extends js.Object {
  def add_path(): Double
  def add_path_received(): Double
  def add_path_received_user(_user: String): Double
  def add_path_received_user_params(_user: String, _params: String): Double
  def add_path_user(_user: String): Double
  def add_path_user_params(_user: String, _params: String): Double
}

object Typeofpath {
  @scala.inline
  def apply(
    add_path: CallbackTo[Double],
    add_path_received: CallbackTo[Double],
    add_path_received_user: String => CallbackTo[Double],
    add_path_received_user_params: (String, String) => CallbackTo[Double],
    add_path_user: String => CallbackTo[Double],
    add_path_user_params: (String, String) => CallbackTo[Double]
  ): Typeofpath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add_path")(add_path.toJsFn)
    __obj.updateDynamic("add_path_received")(add_path_received.toJsFn)
    __obj.updateDynamic("add_path_received_user")(js.Any.fromFunction1((t0: java.lang.String) => add_path_received_user(t0).runNow()))
    __obj.updateDynamic("add_path_received_user_params")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => add_path_received_user_params(t0, t1).runNow()))
    __obj.updateDynamic("add_path_user")(js.Any.fromFunction1((t0: java.lang.String) => add_path_user(t0).runNow()))
    __obj.updateDynamic("add_path_user_params")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => add_path_user_params(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofpath]
  }
}

