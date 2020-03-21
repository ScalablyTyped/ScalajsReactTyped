package typingsJapgolly.cassandraDriver.mod.token

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenRange extends js.Object {
  var end: Token
  var start: Token
  def compare(other: TokenRange): Double
  def contains(token: Token): Boolean
  def equals(other: TokenRange): Boolean
  def isEmpty(): Boolean
  def isWrappedAround(): Boolean
  def splitEvenly(numberOfSplits: Double): js.Array[TokenRange]
  def unwrap(): js.Array[TokenRange]
}

object TokenRange {
  @scala.inline
  def apply(
    compare: TokenRange => CallbackTo[Double],
    contains: Token => CallbackTo[Boolean],
    end: Token,
    equals: TokenRange => CallbackTo[Boolean],
    isEmpty: CallbackTo[Boolean],
    isWrappedAround: CallbackTo[Boolean],
    splitEvenly: Double => CallbackTo[js.Array[TokenRange]],
    start: Token,
    unwrap: CallbackTo[js.Array[TokenRange]]
  ): TokenRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("compare")(js.Any.fromFunction1((t0: typingsJapgolly.cassandraDriver.mod.token.TokenRange) => compare(t0).runNow()))
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: typingsJapgolly.cassandraDriver.mod.token.Token) => contains(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.cassandraDriver.mod.token.TokenRange) => equals(t0).runNow()))
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("isWrappedAround")(isWrappedAround.toJsFn)
    __obj.updateDynamic("splitEvenly")(js.Any.fromFunction1((t0: scala.Double) => splitEvenly(t0).runNow()))
    __obj.updateDynamic("unwrap")(unwrap.toJsFn)
    __obj.asInstanceOf[TokenRange]
  }
}

