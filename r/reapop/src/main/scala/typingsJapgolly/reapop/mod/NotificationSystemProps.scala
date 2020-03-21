package typingsJapgolly.reapop.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSystemProps extends js.Object {
  var filter: js.UndefOr[js.Function1[/* notification */ Notification, Boolean]] = js.undefined
  var theme: NotificationSystemTheme
}

object NotificationSystemProps {
  @scala.inline
  def apply(
    theme: NotificationSystemTheme,
    filter: /* notification */ Notification => CallbackTo[Boolean] = null
  ): NotificationSystemProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* notification */ typingsJapgolly.reapop.mod.Notification) => filter(t0).runNow()))
    __obj.asInstanceOf[NotificationSystemProps]
  }
}

