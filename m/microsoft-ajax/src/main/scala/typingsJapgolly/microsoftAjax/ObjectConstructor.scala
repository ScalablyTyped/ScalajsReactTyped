package typingsJapgolly.microsoftAjax

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectConstructor extends js.Object {
  /**
    * Formats a number by using the invariant culture.
    */
  def getType(instance: js.Any): Type
  /**
    * Returns a string that identifies the run-time type name of an object.
    */
  def getTypeName(instance: js.Any): java.lang.String
}

object ObjectConstructor {
  @scala.inline
  def apply(getType: js.Any => CallbackTo[Type], getTypeName: js.Any => CallbackTo[java.lang.String]): ObjectConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getType")(js.Any.fromFunction1((t0: js.Any) => getType(t0).runNow()))
    __obj.updateDynamic("getTypeName")(js.Any.fromFunction1((t0: js.Any) => getTypeName(t0).runNow()))
    __obj.asInstanceOf[ObjectConstructor]
  }
}

