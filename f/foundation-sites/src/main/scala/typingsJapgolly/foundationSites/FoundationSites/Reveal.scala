package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/reveal.html#javascript-reference
trait Reveal extends js.Object {
  def close(): Unit
  def destroy(): Unit
  def open(): Unit
  def toggle(): Unit
}

object Reveal {
  @scala.inline
  def apply(close: Callback, destroy: Callback, open: Callback, toggle: Callback): Reveal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("open")(open.toJsFn)
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.asInstanceOf[Reveal]
  }
}

