package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefineGlobals extends js.Object {
  /** The userScript global */
  var global: js.Any
  /** The userScript metadata (as set in userScripts.register) */
  var metadata: js.Any
  /**
    * Exports all the properties of a given plain object as userScript globals
    * @param sourceObject A plain object whose properties are exported as userScript globals
    */
  def defineGlobals(sourceObject: js.Object): Unit
  /**
    * Convert a given value to make it accessible to the userScript code
    * @param value A value to convert into an object accessible to the userScript
    */
  def export(value: js.Any): js.Any
}

object AnonDefineGlobals {
  @scala.inline
  def apply(
    defineGlobals: js.Object => Callback,
    export: js.Any => CallbackTo[js.Any],
    global: js.Any,
    metadata: js.Any
  ): AnonDefineGlobals = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("defineGlobals")(js.Any.fromFunction1((t0: js.Object) => defineGlobals(t0).runNow()))
    __obj.updateDynamic("export")(js.Any.fromFunction1((t0: js.Any) => export(t0).runNow()))
    __obj.asInstanceOf[AnonDefineGlobals]
  }
}

