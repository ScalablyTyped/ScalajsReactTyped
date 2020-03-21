package typingsJapgolly.inversify.interfacesMod.interfaces

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryableString extends js.Object {
  def contains(searchString: String): Boolean
  def endsWith(searchString: String): Boolean
  def equals(compareString: String): Boolean
  def startsWith(searchString: String): Boolean
  def value(): String
}

object QueryableString {
  @scala.inline
  def apply(
    contains: String => CallbackTo[Boolean],
    endsWith: String => CallbackTo[Boolean],
    equals: String => CallbackTo[Boolean],
    startsWith: String => CallbackTo[Boolean],
    value: CallbackTo[String]
  ): QueryableString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: java.lang.String) => contains(t0).runNow()))
    __obj.updateDynamic("endsWith")(js.Any.fromFunction1((t0: java.lang.String) => endsWith(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: java.lang.String) => equals(t0).runNow()))
    __obj.updateDynamic("startsWith")(js.Any.fromFunction1((t0: java.lang.String) => startsWith(t0).runNow()))
    __obj.updateDynamic("value")(value.toJsFn)
    __obj.asInstanceOf[QueryableString]
  }
}

