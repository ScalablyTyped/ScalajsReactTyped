package typingsJapgolly.configurable.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configurable[T] extends js.Object {
  var settings: StringDictionary[js.Any]
  def disable(name: String): T with Configurable[T]
  def disabled(name: String): Boolean
  def enable(name: String): T with Configurable[T]
  def enabled(name: String): Boolean
  def get(name: String): js.Any
  def set(name: String, `val`: js.Any): T with Configurable[T]
}

object Configurable {
  @scala.inline
  def apply[T](
    disable: String => CallbackTo[T with Configurable[T]],
    disabled: String => CallbackTo[Boolean],
    enable: String => CallbackTo[T with Configurable[T]],
    enabled: String => CallbackTo[Boolean],
    get: String => CallbackTo[js.Any],
    set: (String, js.Any) => CallbackTo[T with Configurable[T]],
    settings: StringDictionary[js.Any]
  ): Configurable[T] = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("disable")(js.Any.fromFunction1((t0: java.lang.String) => disable(t0).runNow()))
    __obj.updateDynamic("disabled")(js.Any.fromFunction1((t0: java.lang.String) => disabled(t0).runNow()))
    __obj.updateDynamic("enable")(js.Any.fromFunction1((t0: java.lang.String) => enable(t0).runNow()))
    __obj.updateDynamic("enabled")(js.Any.fromFunction1((t0: java.lang.String) => enabled(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => set(t0, t1).runNow()))
    __obj.asInstanceOf[Configurable[T]]
  }
}

