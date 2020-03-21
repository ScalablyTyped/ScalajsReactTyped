package typingsJapgolly.angularDeferredBootstrap.angular

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeferredBootstrapperStatic extends js.Object {
  def bootstrap(configParam: IConfigParam): IPromise[Boolean]
}

object IDeferredBootstrapperStatic {
  @scala.inline
  def apply(bootstrap: IConfigParam => CallbackTo[IPromise[Boolean]]): IDeferredBootstrapperStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bootstrap")(js.Any.fromFunction1((t0: typingsJapgolly.angularDeferredBootstrap.angular.IConfigParam) => bootstrap(t0).runNow()))
    __obj.asInstanceOf[IDeferredBootstrapperStatic]
  }
}

