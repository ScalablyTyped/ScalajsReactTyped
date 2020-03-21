package typingsJapgolly.inboxsdk.mod.ButterBar

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageButtonDescriptor extends js.Object {
  var title: String
  def onClick(event: js.Any): Unit
}

object MessageButtonDescriptor {
  @scala.inline
  def apply(onClick: js.Any => Callback, title: String): MessageButtonDescriptor = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: js.Any) => onClick(t0).runNow()))
    __obj.asInstanceOf[MessageButtonDescriptor]
  }
}

