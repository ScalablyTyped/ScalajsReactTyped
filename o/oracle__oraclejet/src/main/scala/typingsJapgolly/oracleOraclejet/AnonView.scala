package typingsJapgolly.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonView
  extends /* propName */ StringDictionary[js.Any] {
  var view: js.Array[Node]
  var viewModel: js.Object
}

object AnonView {
  @scala.inline
  def apply(
    view: js.Array[Node],
    viewModel: js.Object,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonView = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any], viewModel = viewModel.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonView]
  }
}

