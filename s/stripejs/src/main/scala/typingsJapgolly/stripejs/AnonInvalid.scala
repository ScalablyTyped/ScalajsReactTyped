package typingsJapgolly.stripejs

import typingsJapgolly.stripejs.elementMod.StyleAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvalid extends js.Object {
  var base: js.UndefOr[StyleAttributes] = js.undefined
  var complete: js.UndefOr[StyleAttributes] = js.undefined
  var empty: js.UndefOr[StyleAttributes] = js.undefined
  var invalid: js.UndefOr[StyleAttributes] = js.undefined
}

object AnonInvalid {
  @scala.inline
  def apply(
    base: StyleAttributes = null,
    complete: StyleAttributes = null,
    empty: StyleAttributes = null,
    invalid: StyleAttributes = null
  ): AnonInvalid = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (invalid != null) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInvalid]
  }
}

