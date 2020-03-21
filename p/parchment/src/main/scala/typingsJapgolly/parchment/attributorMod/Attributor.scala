package typingsJapgolly.parchment.attributorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.parchment.registryMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributor extends js.Object {
  var attrName: String
  var keyName: String
  var scope: Scope
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
  def add(node: HTMLElement, value: String): Boolean
  def canAdd(node: HTMLElement, value: js.Any): Boolean
  def remove(node: HTMLElement): Unit
  def value(node: HTMLElement): String
}

object Attributor {
  @scala.inline
  def apply(
    add: (HTMLElement, String) => CallbackTo[Boolean],
    attrName: String,
    canAdd: (HTMLElement, js.Any) => CallbackTo[Boolean],
    keyName: String,
    remove: HTMLElement => Callback,
    scope: Scope,
    value: HTMLElement => CallbackTo[String],
    whitelist: js.Array[String] = null
  ): Attributor = {
    val __obj = js.Dynamic.literal(attrName = attrName.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String) => add(t0, t1).runNow()))
    __obj.updateDynamic("canAdd")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: js.Any) => canAdd(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => remove(t0).runNow()))
    __obj.updateDynamic("value")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => value(t0).runNow()))
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributor]
  }
}

