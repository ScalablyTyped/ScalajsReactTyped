package typingsJapgolly.ngCordova.ngCordova

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAppAvailabilityService extends js.Object {
  def check(urlScheme: String): IPromise[_]
}

object IAppAvailabilityService {
  @scala.inline
  def apply(check: String => CallbackTo[IPromise[js.Any]]): IAppAvailabilityService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("check")(js.Any.fromFunction1((t0: java.lang.String) => check(t0).runNow()))
    __obj.asInstanceOf[IAppAvailabilityService]
  }
}

