package typingsJapgolly.reactOnsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifiersNumber extends js.Object {
  var default: js.UndefOr[Double] = js.undefined
  var material: js.UndefOr[Double] = js.undefined
}

object ModifiersNumber {
  @scala.inline
  def apply(default: Int | Double = null, material: Int | Double = null): ModifiersNumber = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifiersNumber]
  }
}

