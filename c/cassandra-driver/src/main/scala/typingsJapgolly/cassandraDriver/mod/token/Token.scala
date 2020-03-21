package typingsJapgolly.cassandraDriver.mod.token

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cassandraDriver.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  def compare(other: Token): Double
  def equals(other: Token): Boolean
  def getType(): AnonCode
  def getValue(): js.Any
}

object Token {
  @scala.inline
  def apply(
    compare: Token => CallbackTo[Double],
    equals: Token => CallbackTo[Boolean],
    getType: CallbackTo[AnonCode],
    getValue: CallbackTo[js.Any]
  ): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compare")(js.Any.fromFunction1((t0: typingsJapgolly.cassandraDriver.mod.token.Token) => compare(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.cassandraDriver.mod.token.Token) => equals(t0).runNow()))
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.asInstanceOf[Token]
  }
}

