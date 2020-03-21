package typingsJapgolly.androiduix.android.text.style

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.graphics.Canvas
import typingsJapgolly.androiduix.android.graphics.Paint
import typingsJapgolly.androiduix.android.text.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeadingMarginSpan_ extends ParagraphStyle {
  def drawLeadingMargin(
    c: Canvas,
    p: Paint,
    x: Double,
    dir: Double,
    top: Double,
    baseline: Double,
    bottom: Double,
    text: String,
    start: Double,
    end: Double,
    first: Boolean,
    layout: Layout
  ): Unit
  def getLeadingMargin(first: Boolean): Double
}

object LeadingMarginSpan_ {
  @scala.inline
  def apply(
    drawLeadingMargin: (Canvas, Paint, Double, Double, Double, Double, Double, String, Double, Double, Boolean, Layout) => Callback,
    getLeadingMargin: Boolean => CallbackTo[Double]
  ): LeadingMarginSpan_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("drawLeadingMargin")(js.Any.fromFunction12((t0: typingsJapgolly.androiduix.android.graphics.Canvas, t1: typingsJapgolly.androiduix.android.graphics.Paint, t2: scala.Double, t3: scala.Double, t4: scala.Double, t5: scala.Double, t6: scala.Double, t7: java.lang.String, t8: scala.Double, t9: scala.Double, t10: scala.Boolean, t11: typingsJapgolly.androiduix.android.text.Layout) => drawLeadingMargin(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11).runNow()))
    __obj.updateDynamic("getLeadingMargin")(js.Any.fromFunction1((t0: scala.Boolean) => getLeadingMargin(t0).runNow()))
    __obj.asInstanceOf[LeadingMarginSpan_]
  }
}

