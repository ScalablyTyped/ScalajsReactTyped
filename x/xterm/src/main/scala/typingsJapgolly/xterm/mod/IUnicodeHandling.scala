package typingsJapgolly.xterm.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUnicodeHandling extends js.Object {
  /**
    * Getter/setter for active Unicode version.
    */
  var activeVersion: String
  /**
    * Registered Unicode versions.
    */
  val versions: js.Array[String]
  /**
    * Register a custom Unicode version provider.
    */
  def register(provider: IUnicodeVersionProvider): Unit
}

object IUnicodeHandling {
  @scala.inline
  def apply(activeVersion: String, register: IUnicodeVersionProvider => Callback, versions: js.Array[String]): IUnicodeHandling = {
    val __obj = js.Dynamic.literal(activeVersion = activeVersion.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.xterm.mod.IUnicodeVersionProvider) => register(t0).runNow()))
    __obj.asInstanceOf[IUnicodeHandling]
  }
}

