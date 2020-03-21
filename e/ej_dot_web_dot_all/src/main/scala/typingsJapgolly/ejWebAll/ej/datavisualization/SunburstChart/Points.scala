package typingsJapgolly.ejWebAll.ej.datavisualization.SunburstChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Points extends js.Object {
  /** Points fill color of the sunburst.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Points text of the sunburst.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
  /** Points x value of the sunburst.
    * @Default {null}
    */
  var x: js.UndefOr[String] = js.undefined
  /** Points y value of the sunburst.
    * @Default {null}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Points {
  @scala.inline
  def apply(fill: String = null, text: String = null, x: String = null, y: Int | Double = null): Points = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Points]
  }
}

