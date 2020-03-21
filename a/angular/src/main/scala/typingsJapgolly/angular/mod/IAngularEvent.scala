package typingsJapgolly.angular.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAngularEvent extends js.Object {
  /**
    * the scope that is currently handling the event. Once the event propagates through the scope hierarchy, this property is set to null.
    */
  var currentScope: IScope
  /**
    * true if preventDefault was called.
    */
  var defaultPrevented: Boolean
  /**
    * name of the event.
    */
  var name: String
  /**
    * calling stopPropagation function will cancel further event propagation (available only for events that were $emit-ed).
    */
  var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * the scope on which the event was $emit-ed or $broadcast-ed.
    */
  var targetScope: IScope
  /**
    * calling preventDefault sets defaultPrevented flag to true.
    */
  def preventDefault(): Unit
}

object IAngularEvent {
  @scala.inline
  def apply(
    currentScope: IScope,
    defaultPrevented: Boolean,
    name: String,
    preventDefault: Callback,
    targetScope: IScope,
    stopPropagation: js.UndefOr[Callback] = js.undefined
  ): IAngularEvent = {
    val __obj = js.Dynamic.literal(currentScope = currentScope.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], targetScope = targetScope.asInstanceOf[js.Any])
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    stopPropagation.foreach(p => __obj.updateDynamic("stopPropagation")(p.toJsFn))
    __obj.asInstanceOf[IAngularEvent]
  }
}

