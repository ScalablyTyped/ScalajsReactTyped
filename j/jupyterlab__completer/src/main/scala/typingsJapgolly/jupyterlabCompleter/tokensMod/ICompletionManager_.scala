package typingsJapgolly.jupyterlabCompleter.tokensMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCompleter.tokensMod.ICompletionManager.ICompletable
import typingsJapgolly.jupyterlabCompleter.tokensMod.ICompletionManager.ICompletableAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompletionManager_ extends js.Object {
  /**
    * Register a completable object with the completion manager.
    *
    * @returns A completable object whose attributes can be updated as necessary.
    */
  def register(completable: ICompletable): ICompletableAttributes
}

object ICompletionManager_ {
  @scala.inline
  def apply(register: ICompletable => CallbackTo[ICompletableAttributes]): ICompletionManager_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabCompleter.tokensMod.ICompletionManager.ICompletable) => register(t0).runNow()))
    __obj.asInstanceOf[ICompletionManager_]
  }
}

