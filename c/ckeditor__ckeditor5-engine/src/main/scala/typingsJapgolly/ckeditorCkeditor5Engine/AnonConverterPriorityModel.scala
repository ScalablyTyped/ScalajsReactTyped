package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalajs.dom.raw.Element
import typingsJapgolly.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import typingsJapgolly.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConverterPriorityModel extends js.Object {
  var converterPriority: js.UndefOr[PriorityString] = js.undefined
  var model: String | Element | js.Function
  var view: MatcherPattern
}

object AnonConverterPriorityModel {
  @scala.inline
  def apply(
    model: String | Element | js.Function,
    view: MatcherPattern,
    converterPriority: PriorityString = null
  ): AnonConverterPriorityModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    if (converterPriority != null) __obj.updateDynamic("converterPriority")(converterPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConverterPriorityModel]
  }
}

