package typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniColorMapping extends js.Object {
  /** Specifies the uniform color mapping of the treemap
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
}

object UniColorMapping {
  @scala.inline
  def apply(color: String = null): UniColorMapping = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniColorMapping]
  }
}

