package typingsJapgolly.jsbn.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reduction extends js.Object {
  def convert(x: BigInteger): BigInteger
  def mulTo(x: BigInteger, y: BigInteger, r: BigInteger): Unit
  def reduce(x: BigInteger): Unit
  def revert(x: BigInteger): BigInteger
  def sqrTo(x: BigInteger, r: BigInteger): Unit
}

object Reduction {
  @scala.inline
  def apply(
    convert: BigInteger => CallbackTo[BigInteger],
    mulTo: (BigInteger, BigInteger, BigInteger) => Callback,
    reduce: BigInteger => Callback,
    revert: BigInteger => CallbackTo[BigInteger],
    sqrTo: (BigInteger, BigInteger) => Callback
  ): Reduction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convert")(js.Any.fromFunction1((t0: typingsJapgolly.jsbn.mod.BigInteger) => convert(t0).runNow()))
    __obj.updateDynamic("mulTo")(js.Any.fromFunction3((t0: typingsJapgolly.jsbn.mod.BigInteger, t1: typingsJapgolly.jsbn.mod.BigInteger, t2: typingsJapgolly.jsbn.mod.BigInteger) => mulTo(t0, t1, t2).runNow()))
    __obj.updateDynamic("reduce")(js.Any.fromFunction1((t0: typingsJapgolly.jsbn.mod.BigInteger) => reduce(t0).runNow()))
    __obj.updateDynamic("revert")(js.Any.fromFunction1((t0: typingsJapgolly.jsbn.mod.BigInteger) => revert(t0).runNow()))
    __obj.updateDynamic("sqrTo")(js.Any.fromFunction2((t0: typingsJapgolly.jsbn.mod.BigInteger, t1: typingsJapgolly.jsbn.mod.BigInteger) => sqrTo(t0, t1).runNow()))
    __obj.asInstanceOf[Reduction]
  }
}

