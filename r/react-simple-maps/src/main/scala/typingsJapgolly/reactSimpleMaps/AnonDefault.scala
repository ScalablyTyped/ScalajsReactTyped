package typingsJapgolly.reactSimpleMaps

import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  var default: js.UndefOr[CSSProperties] = js.undefined
  var hover: js.UndefOr[CSSProperties] = js.undefined
  var pressed: js.UndefOr[CSSProperties] = js.undefined
}

object AnonDefault {
  @scala.inline
  def apply(default: CSSProperties = null, hover: CSSProperties = null, pressed: CSSProperties = null): AnonDefault = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (pressed != null) __obj.updateDynamic("pressed")(pressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefault]
  }
}

