package typingsJapgolly.angularRouter.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamMap extends js.Object {
  /** Names of the parameters in the map. */
  val keys: js.Array[String]
  /**
    * Retrieves a single value for a parameter.
    * @param name The parameter name.
    * @return The parameter's single value,
    * or the first value if the parameter has multiple values,
    * or `null` when there is no such parameter.
    */
  def get(name: String): String | Null
  /**
    * Retrieves multiple values for a parameter.
    * @param name The parameter name.
    * @return An array containing one or more values,
    * or an empty array if there is no such parameter.
    *
    */
  def getAll(name: String): js.Array[String]
  /**
    * Reports whether the map contains a given parameter.
    * @param name The parameter name.
    * @returns True if the map contains the given parameter, false otherwise.
    */
  def has(name: String): Boolean
}

object ParamMap {
  @scala.inline
  def apply(
    get: String => CallbackTo[String | Null],
    getAll: String => CallbackTo[js.Array[String]],
    has: String => CallbackTo[Boolean],
    keys: js.Array[String]
  ): ParamMap = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("getAll")(js.Any.fromFunction1((t0: java.lang.String) => getAll(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.asInstanceOf[ParamMap]
  }
}

