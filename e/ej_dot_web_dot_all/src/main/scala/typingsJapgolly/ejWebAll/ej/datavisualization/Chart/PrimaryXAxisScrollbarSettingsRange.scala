package typingsJapgolly.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryXAxisScrollbarSettingsRange extends js.Object {
  /** Maximum value for the scrollbar range .
    * @Default {null}
    */
  var max: js.UndefOr[Double] = js.undefined
  /** Minimum value of the scrollbar range.
    * @Default {null}
    */
  var min: js.UndefOr[Double] = js.undefined
}

object PrimaryXAxisScrollbarSettingsRange {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null): PrimaryXAxisScrollbarSettingsRange = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryXAxisScrollbarSettingsRange]
  }
}

