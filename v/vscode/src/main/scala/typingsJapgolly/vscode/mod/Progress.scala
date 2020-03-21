package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress[T] extends js.Object {
  /**
  		 * Report a progress update.
  		 * @param value A progress item, like a message and/or an
  		 * report on how much work finished
  		 */
  def report(value: T): Unit
}

object Progress {
  @scala.inline
  def apply[T](report: T => Callback): Progress[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("report")(js.Any.fromFunction1((t0: T) => report(t0).runNow()))
    __obj.asInstanceOf[Progress[T]]
  }
}

