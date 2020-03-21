package typingsJapgolly.storybookUi

import japgolly.scalajs.react.Callback
import typingsJapgolly.storybookAddonActions.handlerFunctionMod.HandlerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var onClick: HandlerFunction
  var title: String
}

object AnonId {
  @scala.inline
  def apply(id: String, onClick: /* repeated */ js.Any => Callback, title: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClick(t0).runNow()))
    __obj.asInstanceOf[AnonId]
  }
}

