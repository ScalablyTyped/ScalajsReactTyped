package typingsJapgolly.restify.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterRegistryRadix extends js.Object {
  /**
    * Adds a route.
    */
  def add(route: Route): Boolean
  /**
    * Get registry.
    */
  def get(): js.Array[Route]
  /**
    * Registry for route.
    */
  def lookup(method: String, pathname: String): js.UndefOr[Chain]
  /**
    * Removes a route.
    */
  def remove(name: String): js.UndefOr[Route]
}

object RouterRegistryRadix {
  @scala.inline
  def apply(
    add: Route => CallbackTo[Boolean],
    get: CallbackTo[js.Array[Route]],
    lookup: (String, String) => CallbackTo[js.UndefOr[Chain]],
    remove: String => CallbackTo[js.UndefOr[Route]]
  ): RouterRegistryRadix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.restify.mod.Route) => add(t0).runNow()))
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("lookup")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => lookup(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.asInstanceOf[RouterRegistryRadix]
  }
}

