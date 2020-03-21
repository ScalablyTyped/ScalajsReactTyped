package typingsJapgolly.aureliaTemplating.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.aureliaBinding.mod.Expression
import typingsJapgolly.aureliaBinding.mod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LetBinding extends js.Object {
  /**
    * The expression to access/assign/connect the binding source property.
    */
  var sourceExpression: Expression
  /**
    * Connects the binding to a scope.
    */
  def bind(source: Scope): Unit
  /**
    * Disconnects the binding from a scope.
    */
  def unbind(): Unit
  /**
    * Assigns a value to the target.
    */
  def updateTarget(value: js.Any): Unit
}

object LetBinding {
  @scala.inline
  def apply(
    bind: Scope => Callback,
    sourceExpression: Expression,
    unbind: Callback,
    updateTarget: js.Any => Callback
  ): LetBinding = {
    val __obj = js.Dynamic.literal(sourceExpression = sourceExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("bind")(js.Any.fromFunction1((t0: typingsJapgolly.aureliaBinding.mod.Scope) => bind(t0).runNow()))
    __obj.updateDynamic("unbind")(unbind.toJsFn)
    __obj.updateDynamic("updateTarget")(js.Any.fromFunction1((t0: js.Any) => updateTarget(t0).runNow()))
    __obj.asInstanceOf[LetBinding]
  }
}

