package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.multiRouter.MultiRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoutePanel extends js.Object {
  var options: IOptionManager
  var state: IDataManager
  def getRoute(): MultiRoute
  def switchPoints(): Unit
}

object IRoutePanel {
  @scala.inline
  def apply(
    getRoute: CallbackTo[MultiRoute],
    options: IOptionManager,
    state: IDataManager,
    switchPoints: Callback
  ): IRoutePanel = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("getRoute")(getRoute.toJsFn)
    __obj.updateDynamic("switchPoints")(switchPoints.toJsFn)
    __obj.asInstanceOf[IRoutePanel]
  }
}

