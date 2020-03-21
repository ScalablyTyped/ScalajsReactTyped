package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/slider.html#javascript-reference
trait Slider extends js.Object {
  def destroy(): Unit
}

object Slider {
  @scala.inline
  def apply(destroy: Callback): Slider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.asInstanceOf[Slider]
  }
}

