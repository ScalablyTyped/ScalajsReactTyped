package typingsJapgolly.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  var selected: js.UndefOr[Double] = js.undefined
}

object AnonClassName {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    labels: js.Array[String] = null,
    selected: Int | Double = null
  ): AnonClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassName]
  }
}

