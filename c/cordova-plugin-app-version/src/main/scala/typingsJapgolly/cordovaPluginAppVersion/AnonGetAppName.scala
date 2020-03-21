package typingsJapgolly.cordovaPluginAppVersion

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetAppName extends js.Object {
  def getAppName(): js.Promise[String]
  def getPackageName(): js.Promise[String]
  def getVersionCode(): js.Promise[String]
  def getVersionNumber(): js.Promise[String]
}

object AnonGetAppName {
  @scala.inline
  def apply(
    getAppName: CallbackTo[js.Promise[String]],
    getPackageName: CallbackTo[js.Promise[String]],
    getVersionCode: CallbackTo[js.Promise[String]],
    getVersionNumber: CallbackTo[js.Promise[String]]
  ): AnonGetAppName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAppName")(getAppName.toJsFn)
    __obj.updateDynamic("getPackageName")(getPackageName.toJsFn)
    __obj.updateDynamic("getVersionCode")(getVersionCode.toJsFn)
    __obj.updateDynamic("getVersionNumber")(getVersionNumber.toJsFn)
    __obj.asInstanceOf[AnonGetAppName]
  }
}

