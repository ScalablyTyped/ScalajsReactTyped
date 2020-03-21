package typingsJapgolly.ngCordova.ngCordova

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionSheetService extends js.Object {
  def hide(): IPromise[Unit]
  def show(options: ShowOptions): IPromise[Double]
}

object IActionSheetService {
  @scala.inline
  def apply(hide: CallbackTo[IPromise[Unit]], show: ShowOptions => CallbackTo[IPromise[Double]]): IActionSheetService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(js.Any.fromFunction1((t0: typingsJapgolly.ngCordova.ngCordova.ShowOptions) => show(t0).runNow()))
    __obj.asInstanceOf[IActionSheetService]
  }
}

