package typingsJapgolly.angularDynamicLocale.mod.tmh

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.ILocaleService
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDynamicLocale extends js.Object {
  def get(): String
  def set(locale: String): IPromise[ILocaleService]
}

object IDynamicLocale {
  @scala.inline
  def apply(get: CallbackTo[String], set: String => CallbackTo[IPromise[ILocaleService]]): IDynamicLocale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: java.lang.String) => set(t0).runNow()))
    __obj.asInstanceOf[IDynamicLocale]
  }
}

