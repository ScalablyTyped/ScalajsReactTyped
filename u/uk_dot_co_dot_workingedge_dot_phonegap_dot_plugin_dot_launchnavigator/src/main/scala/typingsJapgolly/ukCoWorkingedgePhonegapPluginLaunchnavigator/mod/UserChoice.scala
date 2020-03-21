package typingsJapgolly.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserChoice extends js.Object {
  /**
    * Clears the current user choice of preferred navigator app.
    * @param callback - function to call once operation is complete.
    */
  def clear(callback: js.Function0[Unit]): Unit
  /**
    * Indicates whether a user choice exists for a preferred navigator app.
    * @param callback - function to pass result to: will receive a boolean argument.
    */
  def exists(callback: js.Function1[/* exists */ Boolean, Unit]): Unit
  /**
    * Returns current user choice of preferred navigator app.
    * @param callback - function to pass result to: will receive a string argument indicating the app, which is a constant in `launchnavigator.APP`.
    */
  def get(callback: js.Function1[/* app */ String, Unit]): Unit
  /**
    * Sets the current user choice of preferred navigator app.
    * @param app - app to set as preferred choice as a constant in `launchnavigator.APP`.
    * @param callback - function to call once operation is complete.
    */
  def set(app: String, callback: js.Function0[Unit]): Unit
}

object UserChoice {
  @scala.inline
  def apply(
    clear: js.Function0[Unit] => Callback,
    exists: js.Function1[/* exists */ Boolean, Unit] => Callback,
    get: js.Function1[/* app */ String, Unit] => Callback,
    set: (String, js.Function0[Unit]) => Callback
  ): UserChoice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => clear(t0).runNow()))
    __obj.updateDynamic("exists")(js.Any.fromFunction1((t0: js.Function1[/* exists */ scala.Boolean, scala.Unit]) => exists(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: js.Function1[/* app */ java.lang.String, scala.Unit]) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => set(t0, t1).runNow()))
    __obj.asInstanceOf[UserChoice]
  }
}

