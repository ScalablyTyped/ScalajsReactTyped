package typingsJapgolly.reduxStorage.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageEngine extends js.Object {
  /**
    * Load
    */
  def load(): js.Thenable[_]
  /**
    * Save
    * @param state
    */
  def save(state: js.Any): js.Thenable[_]
}

object StorageEngine {
  @scala.inline
  def apply(load: CallbackTo[js.Thenable[js.Any]], save: js.Any => CallbackTo[js.Thenable[js.Any]]): StorageEngine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("load")(load.toJsFn)
    __obj.updateDynamic("save")(js.Any.fromFunction1((t0: js.Any) => save(t0).runNow()))
    __obj.asInstanceOf[StorageEngine]
  }
}

