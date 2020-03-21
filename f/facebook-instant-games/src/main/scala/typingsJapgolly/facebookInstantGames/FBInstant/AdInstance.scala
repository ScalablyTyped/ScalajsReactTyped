package typingsJapgolly.facebookInstantGames.FBInstant

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an instance of an ad.
  */
trait AdInstance extends js.Object {
  /**
    * Return the Audience Network placement ID of this ad instance.
    */
  def getPlacementID(): String
  /**
    * Preload the ad. The returned promise resolves when the preload completes, and rejects if it failed.
    * @throws ADS_FREQUENT_LOAD
    * @throws ADS_NO_FILL
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    */
  def loadAsync(): js.Promise[Unit]
  /**
    * Present the ad. The returned promise resolves when user finished watching the ad, and rejects if it failed to present or was closed during the ad.
    * @throws ADS_NOT_LOADED
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    * @throws INVALID_OPERATION
    */
  def showAsync(): js.Promise[Unit]
}

object AdInstance {
  @scala.inline
  def apply(
    getPlacementID: CallbackTo[String],
    loadAsync: CallbackTo[js.Promise[Unit]],
    showAsync: CallbackTo[js.Promise[Unit]]
  ): AdInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPlacementID")(getPlacementID.toJsFn)
    __obj.updateDynamic("loadAsync")(loadAsync.toJsFn)
    __obj.updateDynamic("showAsync")(showAsync.toJsFn)
    __obj.asInstanceOf[AdInstance]
  }
}

