package typingsJapgolly.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPrompted extends js.Object {
  /**
    * Clears flag which indicates if user has already been prompted whether to remember their choice a preferred navigator app.
    * @param callback - function to call once operation is complete.
    */
  def clear(callback: js.Function0[Unit]): Unit
  /**
    * Indicates whether user has already been prompted whether to remember their choice a preferred navigator app.
    * @param callback - function to pass result to: will receive a boolean argument.
    */
  def get(callback: js.Function1[/* exists */ Boolean, Unit]): Unit
  /**
    * Sets flag indicating user has already been prompted whether to remember their choice a preferred navigator app.
    * @param callback - function to call once operation is complete.
    */
  def set(callback: js.Function0[Unit]): Unit
}

object UserPrompted {
  @scala.inline
  def apply(
    clear: js.Function0[Unit] => Callback,
    get: js.Function1[/* exists */ Boolean, Unit] => Callback,
    set: js.Function0[Unit] => Callback
  ): UserPrompted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => clear(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: js.Function1[/* exists */ scala.Boolean, scala.Unit]) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => set(t0).runNow()))
    __obj.asInstanceOf[UserPrompted]
  }
}

