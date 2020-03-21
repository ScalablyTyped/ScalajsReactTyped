package typingsJapgolly.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModalService extends js.Object {
  /**
    * @returns {IPromise}
    */
  def getPromiseChain(): IPromise[_]
  /**
    * @param {IModalSettings} options
    * @returns {IModalInstanceService}
    */
  def open(options: IModalSettings): IModalInstanceService
}

object IModalService {
  @scala.inline
  def apply(
    getPromiseChain: CallbackTo[IPromise[js.Any]],
    open: IModalSettings => CallbackTo[IModalInstanceService]
  ): IModalService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPromiseChain")(getPromiseChain.toJsFn)
    __obj.updateDynamic("open")(js.Any.fromFunction1((t0: typingsJapgolly.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap.IModalSettings) => open(t0).runNow()))
    __obj.asInstanceOf[IModalService]
  }
}

