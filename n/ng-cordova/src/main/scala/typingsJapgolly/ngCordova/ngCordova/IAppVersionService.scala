package typingsJapgolly.ngCordova.ngCordova

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAppVersionService extends js.Object {
  def getVersionCode(): IPromise[String]
  def getVersionNumber(): IPromise[String]
}

object IAppVersionService {
  @scala.inline
  def apply(getVersionCode: CallbackTo[IPromise[String]], getVersionNumber: CallbackTo[IPromise[String]]): IAppVersionService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getVersionCode")(getVersionCode.toJsFn)
    __obj.updateDynamic("getVersionNumber")(getVersionNumber.toJsFn)
    __obj.asInstanceOf[IAppVersionService]
  }
}

