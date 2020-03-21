package typingsJapgolly.vscodeLanguageserver.uuidMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UUID extends js.Object {
  /**
    * @returns the canonical representation in sets of hexadecimal numbers separated by dashes.
    */
  def asHex(): String
  def equals(other: UUID): Boolean
}

object UUID {
  @scala.inline
  def apply(asHex: CallbackTo[String], equals: UUID => CallbackTo[Boolean]): UUID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asHex")(asHex.toJsFn)
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.vscodeLanguageserver.uuidMod.UUID) => equals(t0).runNow()))
    __obj.asInstanceOf[UUID]
  }
}

