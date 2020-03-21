package typingsJapgolly.riotjsDomBindings.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expression[Scope] extends js.Object {
  var node: HTMLElement
  var `type`: ExpressionType
  var value: js.Any
  def mount(scope: Scope): Expression[_]
  def unmount(scope: Scope): Expression[_]
  def update(scope: Scope): Expression[_]
}

object Expression {
  @scala.inline
  def apply[Scope](
    mount: Scope => CallbackTo[Expression[js.Any]],
    node: HTMLElement,
    `type`: ExpressionType,
    unmount: Scope => CallbackTo[Expression[js.Any]],
    update: Scope => CallbackTo[Expression[js.Any]],
    value: js.Any
  ): Expression[Scope] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("mount")(js.Any.fromFunction1((t0: Scope) => mount(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("unmount")(js.Any.fromFunction1((t0: Scope) => unmount(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: Scope) => update(t0).runNow()))
    __obj.asInstanceOf[Expression[Scope]]
  }
}

