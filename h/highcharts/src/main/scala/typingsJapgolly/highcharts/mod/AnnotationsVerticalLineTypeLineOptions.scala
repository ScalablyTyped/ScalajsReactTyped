package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsVerticalLineTypeLineOptions extends js.Object {
  var fill: js.UndefOr[String] = js.undefined
}

object AnnotationsVerticalLineTypeLineOptions {
  @scala.inline
  def apply(fill: String = null): AnnotationsVerticalLineTypeLineOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsVerticalLineTypeLineOptions]
  }
}

