package typingsJapgolly.cachefactory.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils_ extends js.Object {
  var Promise: js.UndefOr[PromiseConstructor] = js.undefined
  def equals(a: js.Any, b: js.Any): Boolean
  def fromJson(value: String): js.Any
  def isFunction(value: js.Any): Boolean
  def isNumber(value: js.Any): Boolean
  def isObject(value: js.Any): Boolean
  def isString(value: js.Any): Boolean
}

object Utils_ {
  @scala.inline
  def apply(
    equals: (js.Any, js.Any) => CallbackTo[Boolean],
    fromJson: String => CallbackTo[js.Any],
    isFunction: js.Any => CallbackTo[Boolean],
    isNumber: js.Any => CallbackTo[Boolean],
    isObject: js.Any => CallbackTo[Boolean],
    isString: js.Any => CallbackTo[Boolean],
    Promise: PromiseConstructor = null
  ): Utils_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("equals")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => equals(t0, t1).runNow()))
    __obj.updateDynamic("fromJson")(js.Any.fromFunction1((t0: java.lang.String) => fromJson(t0).runNow()))
    __obj.updateDynamic("isFunction")(js.Any.fromFunction1((t0: js.Any) => isFunction(t0).runNow()))
    __obj.updateDynamic("isNumber")(js.Any.fromFunction1((t0: js.Any) => isNumber(t0).runNow()))
    __obj.updateDynamic("isObject")(js.Any.fromFunction1((t0: js.Any) => isObject(t0).runNow()))
    __obj.updateDynamic("isString")(js.Any.fromFunction1((t0: js.Any) => isString(t0).runNow()))
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Utils_]
  }
}

