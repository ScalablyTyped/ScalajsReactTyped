package typingsJapgolly.emberRouting.transitionMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.emberRouting.routeInfoMod.RouteInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transition extends js.Object {
  /**
    * This property is a `RouteInfo` object that represents where transition originated from.
    * It's important to note that a `RouteInfo` is a linked list and this property is simply the head node of the list.
    * In the case of an initial render, `from` will be set to `null`.
    */
  val from: RouteInfo | Null
  /**
    * This property is a `RouteInfo` object that represents where the router is transitioning to.
    * It's important to note that a `RouteInfo` is a linked list and this property is simply the leafmost route.
    */
  val to: RouteInfo
  /**
    * Aborts the Transition. Note you can also implicitly abort a transition
    * by initiating another transition while a previous one is underway.
    */
  def abort(): Transition
  /**
    * Retries a previously-aborted transition (making sure to abort the
    * transition if it's still active). Returns a new transition that
    * represents the new attempt to transition.
    */
  def retry(): Transition
}

object Transition {
  @scala.inline
  def apply(
    abort: CallbackTo[Transition],
    retry: CallbackTo[Transition],
    to: RouteInfo,
    from: RouteInfo = null
  ): Transition = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("retry")(retry.toJsFn)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transition]
  }
}

