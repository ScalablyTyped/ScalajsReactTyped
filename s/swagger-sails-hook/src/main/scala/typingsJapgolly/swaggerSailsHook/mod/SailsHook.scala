package typingsJapgolly.swaggerSailsHook.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.swaggerSailsHook.AnonAfter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * `swagger-sails-hook` object implementing the Sails' hook specification.
	 *
	 * @see {@link http://sailsjs.com/documentation/concepts/extending-sails/hooks/hook-specification|Sails Hook Docs}
	 * @see {@link http://sailsjs.com/documentation/anatomy/api/hooks/my-hook/index-js|Sails Hook Example}
	 */
trait SailsHook extends js.Object {
  /**
  		 * `swagger-sails-hook` specific route bound to a Sails app at load time.
  		 *
  		 * It handles any unhandled requests (any routes that aren't bound in the app via a
  		 * custom route configuration or a blueprint) via the swagger middleware.
  		 */
  var routes: AnonAfter
  /**
  		 * Perform startup tasks.
  		 * All Sails configuration is guaranteed to be completed before a hook’s initialize function runs.
  		 * @param done - called when `swagger-sails-hook`'s startup tasks have finished.
  		 */
  def initialize(done: js.Function0[_]): Unit
}

object SailsHook {
  @scala.inline
  def apply(initialize: js.Function0[js.Any] => Callback, routes: AnonAfter): SailsHook = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: js.Function0[js.Any]) => initialize(t0).runNow()))
    __obj.asInstanceOf[SailsHook]
  }
}

