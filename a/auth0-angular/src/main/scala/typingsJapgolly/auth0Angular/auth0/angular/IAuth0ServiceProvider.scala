package typingsJapgolly.auth0Angular.auth0.angular

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuth0ServiceProvider extends js.Object {
  /**
    * Configures the auth service
    * @param options Client options passed into Auth0
    */
  def init(options: IAuth0ClientOptions): Unit
  /**
    * @param event Name of the event to handle.
    * @param handler Event handler
    */
  def on(event: String, handler: js.Function1[/* repeated */ js.Any, _]): Unit
}

object IAuth0ServiceProvider {
  @scala.inline
  def apply(
    init: IAuth0ClientOptions => Callback,
    on: (String, js.Function1[/* repeated */ js.Any, js.Any]) => Callback
  ): IAuth0ServiceProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.auth0Angular.auth0.angular.IAuth0ClientOptions) => init(t0).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => on(t0, t1).runNow()))
    __obj.asInstanceOf[IAuth0ServiceProvider]
  }
}

