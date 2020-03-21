package typingsJapgolly.winrtUwp.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Refers to the density of a typeface, in terms of the lightness or heaviness of the strokes. */
trait FontWeight extends js.Object {
  /** The font weight expressed as a numeric value. See Remarks. */
  var weight: Double
}

object FontWeight {
  @scala.inline
  def apply(weight: Double): FontWeight = {
    val __obj = js.Dynamic.literal(weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FontWeight]
  }
}

