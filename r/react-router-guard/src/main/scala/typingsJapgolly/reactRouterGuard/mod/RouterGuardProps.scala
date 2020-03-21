package typingsJapgolly.reactRouterGuard.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterGuardProps extends js.Object {
  var config: js.Array[RouterGuardConfigProps]
  var history: js.UndefOr[History[LocationState]] = js.undefined
  var loading: js.UndefOr[Boolean | Element] = js.undefined
}

object RouterGuardProps {
  @scala.inline
  def apply(
    config: js.Array[RouterGuardConfigProps],
    history: History[LocationState] = null,
    loading: Boolean | Element = null
  ): RouterGuardProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterGuardProps]
  }
}

