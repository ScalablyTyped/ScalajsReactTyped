package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/drilldown-menu.html#javascript-reference
trait Drilldown extends js.Object {
  def destroy(): Unit
}

object Drilldown {
  @scala.inline
  def apply(destroy: Callback): Drilldown = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.asInstanceOf[Drilldown]
  }
}

