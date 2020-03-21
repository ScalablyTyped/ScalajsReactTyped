package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/toggler.html#javascript-reference
trait Toggler extends js.Object {
  def destroy(): Unit
  def toggle(): Unit
}

object Toggler {
  @scala.inline
  def apply(destroy: Callback, toggle: Callback): Toggler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.asInstanceOf[Toggler]
  }
}

