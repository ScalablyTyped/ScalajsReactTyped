package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsFibonacciTypeLineOptions extends js.Object {
  var fill: js.UndefOr[String] = js.undefined
}

object AnnotationsFibonacciTypeLineOptions {
  @scala.inline
  def apply(fill: String = null): AnnotationsFibonacciTypeLineOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsFibonacciTypeLineOptions]
  }
}

