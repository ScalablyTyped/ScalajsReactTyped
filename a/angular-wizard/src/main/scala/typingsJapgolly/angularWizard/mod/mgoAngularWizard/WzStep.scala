package typingsJapgolly.angularWizard.mod.mgoAngularWizard

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WzStep extends js.Object {
  var description: String
  var selected: Boolean
  var title: String
  var wzData: js.Any
  var wzTitle: String
  def canenter(args: js.Any*): Boolean
  def canexit(args: js.Any*): Boolean
}

object WzStep {
  @scala.inline
  def apply(
    canenter: /* repeated */ js.Any => CallbackTo[Boolean],
    canexit: /* repeated */ js.Any => CallbackTo[Boolean],
    description: String,
    selected: Boolean,
    title: String,
    wzData: js.Any,
    wzTitle: String
  ): WzStep = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wzData = wzData.asInstanceOf[js.Any], wzTitle = wzTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("canenter")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => canenter(t0).runNow()))
    __obj.updateDynamic("canexit")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => canexit(t0).runNow()))
    __obj.asInstanceOf[WzStep]
  }
}

