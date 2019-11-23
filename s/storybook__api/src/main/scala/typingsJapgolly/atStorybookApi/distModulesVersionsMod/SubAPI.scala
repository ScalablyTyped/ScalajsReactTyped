package typingsJapgolly.atStorybookApi.distModulesVersionsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAPI extends js.Object {
  def getCurrentVersion(): Version
  def getLatestVersion(): Version
  def versionUpdateAvailable(): Boolean
}

object SubAPI {
  @scala.inline
  def apply(
    getCurrentVersion: CallbackTo[Version],
    getLatestVersion: CallbackTo[Version],
    versionUpdateAvailable: CallbackTo[Boolean]
  ): SubAPI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCurrentVersion")(getCurrentVersion.toJsFn)
    __obj.updateDynamic("getLatestVersion")(getLatestVersion.toJsFn)
    __obj.updateDynamic("versionUpdateAvailable")(versionUpdateAvailable.toJsFn)
    __obj.asInstanceOf[SubAPI]
  }
}

