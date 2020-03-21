package typingsJapgolly.ol.polylineMod

import typingsJapgolly.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var factor: js.UndefOr[Double] = js.undefined
  var geometryLayout: js.UndefOr[GeometryLayout] = js.undefined
}

object Options {
  @scala.inline
  def apply(factor: Int | Double = null, geometryLayout: GeometryLayout = null): Options = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (geometryLayout != null) __obj.updateDynamic("geometryLayout")(geometryLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

