package typingsJapgolly.appRootDir.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppRootDir extends js.Object {
  // Get the application's root directory
  def get(): String
  /**
    * Set the application's root directory
    *    this will set a global so that no matter
    *    how many instances of app-root-dir module are installed,
    *    they will all return the same directory
    */
  def set(dirname: String): Unit
}

object AppRootDir {
  @scala.inline
  def apply(get: CallbackTo[String], set: String => Callback): AppRootDir = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: java.lang.String) => set(t0).runNow()))
    __obj.asInstanceOf[AppRootDir]
  }
}

