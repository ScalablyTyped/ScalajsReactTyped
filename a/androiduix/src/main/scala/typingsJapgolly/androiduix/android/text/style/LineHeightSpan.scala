package typingsJapgolly.androiduix.android.text.style

import typingsJapgolly.androiduix.android.graphics.Paint.FontMetricsInt
import typingsJapgolly.androiduix.android.text.TextPaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineHeightSpan extends ParagraphStyle {
  def chooseHeight(text: String, start: Double, end: Double, spanstartv: Double, v: Double, fm: FontMetricsInt): Unit
}

@JSGlobal("android.text.style.LineHeightSpan")
@js.native
object LineHeightSpan extends js.Object {
  @js.native
  trait WithDensity extends LineHeightSpan {
    def chooseHeight(
      text: String,
      start: Double,
      end: Double,
      spanstartv: Double,
      v: Double,
      fm: FontMetricsInt,
      paint: TextPaint
    ): Unit = js.native
  }
  
  var `type`: js.Symbol = js.native
}

