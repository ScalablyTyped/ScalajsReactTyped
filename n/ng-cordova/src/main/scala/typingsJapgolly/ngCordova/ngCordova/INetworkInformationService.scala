package typingsJapgolly.ngCordova.ngCordova

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkInformationService extends js.Object {
  def clearOfflineWatch(): Unit
  def clearOnlineWatch(): Unit
  def getNetwork(): String
  def isOffline(): Boolean
  def isOnline(): Boolean
}

object INetworkInformationService {
  @scala.inline
  def apply(
    clearOfflineWatch: Callback,
    clearOnlineWatch: Callback,
    getNetwork: CallbackTo[String],
    isOffline: CallbackTo[Boolean],
    isOnline: CallbackTo[Boolean]
  ): INetworkInformationService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearOfflineWatch")(clearOfflineWatch.toJsFn)
    __obj.updateDynamic("clearOnlineWatch")(clearOnlineWatch.toJsFn)
    __obj.updateDynamic("getNetwork")(getNetwork.toJsFn)
    __obj.updateDynamic("isOffline")(isOffline.toJsFn)
    __obj.updateDynamic("isOnline")(isOnline.toJsFn)
    __obj.asInstanceOf[INetworkInformationService]
  }
}

