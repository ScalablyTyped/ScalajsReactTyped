package typingsJapgolly.mapboxGl.mod

import typingsJapgolly.mapboxGl.mapboxGlStrings.bevel
import typingsJapgolly.mapboxGl.mapboxGlStrings.butt
import typingsJapgolly.mapboxGl.mapboxGlStrings.miter
import typingsJapgolly.mapboxGl.mapboxGlStrings.round
import typingsJapgolly.mapboxGl.mapboxGlStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineLayout
  extends Layout
     with _AnyLayout {
  var `line-cap`: js.UndefOr[butt | round | square] = js.undefined
  var `line-join`: js.UndefOr[bevel | round | miter | Expression] = js.undefined
  var `line-miter-limit`: js.UndefOr[Double | Expression] = js.undefined
  var `line-round-limit`: js.UndefOr[Double | Expression] = js.undefined
}

object LineLayout {
  @scala.inline
  def apply(
    `line-cap`: butt | round | square = null,
    `line-join`: bevel | round | miter | Expression = null,
    `line-miter-limit`: Double | Expression = null,
    `line-round-limit`: Double | Expression = null,
    visibility: Visibility = null
  ): LineLayout = {
    val __obj = js.Dynamic.literal()
    if (`line-cap` != null) __obj.updateDynamic("line-cap")(`line-cap`.asInstanceOf[js.Any])
    if (`line-join` != null) __obj.updateDynamic("line-join")(`line-join`.asInstanceOf[js.Any])
    if (`line-miter-limit` != null) __obj.updateDynamic("line-miter-limit")(`line-miter-limit`.asInstanceOf[js.Any])
    if (`line-round-limit` != null) __obj.updateDynamic("line-round-limit")(`line-round-limit`.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineLayout]
  }
}

