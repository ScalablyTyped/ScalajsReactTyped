package typingsJapgolly.ngCordova.ngCordova

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEmailComposerService extends js.Object {
  def addAlias(app: String, schema: String): Unit
  def isAvailable(): IPromise[Boolean]
  def open(properties: IEmailComposerOptions): IPromise[_]
}

object IEmailComposerService {
  @scala.inline
  def apply(
    addAlias: (String, String) => Callback,
    isAvailable: CallbackTo[IPromise[Boolean]],
    open: IEmailComposerOptions => CallbackTo[IPromise[js.Any]]
  ): IEmailComposerService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addAlias")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => addAlias(t0, t1).runNow()))
    __obj.updateDynamic("isAvailable")(isAvailable.toJsFn)
    __obj.updateDynamic("open")(js.Any.fromFunction1((t0: typingsJapgolly.ngCordova.ngCordova.IEmailComposerOptions) => open(t0).runNow()))
    __obj.asInstanceOf[IEmailComposerService]
  }
}

