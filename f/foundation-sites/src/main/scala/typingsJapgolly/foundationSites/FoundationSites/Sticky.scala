package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/sticky.html#javascript-reference
trait Sticky extends js.Object {
  def destroy(): Unit
}

object Sticky {
  @scala.inline
  def apply(destroy: Callback): Sticky = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.asInstanceOf[Sticky]
  }
}

