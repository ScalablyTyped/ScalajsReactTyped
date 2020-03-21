package typingsJapgolly.vegaTypings.bindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseBinding extends js.Object {
  var debounce: js.UndefOr[Double] = js.undefined
  var element: js.UndefOr[Element] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object BaseBinding {
  @scala.inline
  def apply(debounce: Int | Double = null, element: Element = null, name: String = null, `type`: String = null): BaseBinding = {
    val __obj = js.Dynamic.literal()
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseBinding]
  }
}

