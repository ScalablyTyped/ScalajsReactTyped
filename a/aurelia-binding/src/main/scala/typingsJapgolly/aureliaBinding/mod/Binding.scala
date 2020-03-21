package typingsJapgolly.aureliaBinding.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binding extends js.Object {
  /**
    * Calls the source method with the specified args object. This method is present in event bindings like trigger/delegate.
    */
  var callSource: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Whether the binding is data-bound.
    */
  var isBound: Boolean
  /**
    * The directionality of the binding.
    */
  var mode: js.UndefOr[bindingMode] = js.undefined
  /**
    * The binding's source.
    */
  var source: Scope
  /**
    * The expression to access/assign/connect the binding source property.
    */
  var sourceExpression: js.UndefOr[Expression] = js.undefined
  /**
    * Assigns a value to the source.
    */
  var updateSource: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  /**
    * Assigns a value to the target.
    */
  var updateTarget: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  /**
    * Connects the binding to a scope.
    */
  def bind(source: Scope): Unit
  /**
    * Disconnects the binding from a scope.
    */
  def unbind(): Unit
}

object Binding {
  @scala.inline
  def apply(
    bind: Scope => Callback,
    isBound: Boolean,
    source: Scope,
    unbind: Callback,
    callSource: /* event */ js.Any => CallbackTo[js.Any] = null,
    mode: bindingMode = null,
    sourceExpression: Expression = null,
    updateSource: /* value */ js.Any => Callback = null,
    updateTarget: /* value */ js.Any => Callback = null
  ): Binding = {
    val __obj = js.Dynamic.literal(isBound = isBound.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("bind")(js.Any.fromFunction1((t0: typingsJapgolly.aureliaBinding.mod.Scope) => bind(t0).runNow()))
    __obj.updateDynamic("unbind")(unbind.toJsFn)
    if (callSource != null) __obj.updateDynamic("callSource")(js.Any.fromFunction1((t0: /* event */ js.Any) => callSource(t0).runNow()))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (sourceExpression != null) __obj.updateDynamic("sourceExpression")(sourceExpression.asInstanceOf[js.Any])
    if (updateSource != null) __obj.updateDynamic("updateSource")(js.Any.fromFunction1((t0: /* value */ js.Any) => updateSource(t0).runNow()))
    if (updateTarget != null) __obj.updateDynamic("updateTarget")(js.Any.fromFunction1((t0: /* value */ js.Any) => updateTarget(t0).runNow()))
    __obj.asInstanceOf[Binding]
  }
}

