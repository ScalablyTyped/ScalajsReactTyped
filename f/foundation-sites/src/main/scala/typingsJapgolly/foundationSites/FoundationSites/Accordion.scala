package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import typingsJapgolly.foundationSites.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/accordion.html#javascript-reference
trait Accordion extends js.Object {
  def destroy(): Unit
  def down($target: JQuery, firstTime: Boolean): Unit
  def toggle($target: JQuery): Unit
  def up($target: JQuery): Unit
}

object Accordion {
  @scala.inline
  def apply(
    destroy: Callback,
    down: (JQuery, Boolean) => Callback,
    toggle: JQuery => Callback,
    up: JQuery => Callback
  ): Accordion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("down")(js.Any.fromFunction2((t0: typingsJapgolly.foundationSites.JQuery, t1: scala.Boolean) => down(t0, t1).runNow()))
    __obj.updateDynamic("toggle")(js.Any.fromFunction1((t0: typingsJapgolly.foundationSites.JQuery) => toggle(t0).runNow()))
    __obj.updateDynamic("up")(js.Any.fromFunction1((t0: typingsJapgolly.foundationSites.JQuery) => up(t0).runNow()))
    __obj.asInstanceOf[Accordion]
  }
}

