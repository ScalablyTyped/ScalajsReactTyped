package typingsJapgolly.mathjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unit extends _MathType {
  def abs(unit: Unit): Unit
  def divide(unit: Unit): Unit
  def equalBase(unit: Unit): Boolean
  def equals(unit: Unit): Boolean
  def format(options: FormatOptions): String
  def formatUnits(): String
  def hasBase(base: js.Any): Boolean
  def multiply(unit: Unit): Unit
  def pow(unit: Unit): Unit
  def splitUnit(parts: js.Array[String | Unit]): js.Array[Unit]
  def to(unit: String): Unit
  def toJSON(): MathJSON
  def toNumber(unit: String): Double
  def toNumeric(unit: String): Double | Fraction | BigNumber
  def toSI(): Unit
}

object Unit {
  @scala.inline
  def apply(
    abs: Unit => CallbackTo[Unit],
    divide: Unit => CallbackTo[Unit],
    equalBase: Unit => CallbackTo[Boolean],
    equals: Unit => CallbackTo[Boolean],
    format: FormatOptions => CallbackTo[String],
    formatUnits: CallbackTo[String],
    hasBase: js.Any => CallbackTo[Boolean],
    multiply: Unit => CallbackTo[Unit],
    pow: Unit => CallbackTo[Unit],
    splitUnit: js.Array[String | Unit] => CallbackTo[js.Array[Unit]],
    to: String => CallbackTo[Unit],
    toJSON: CallbackTo[MathJSON],
    toNumber: String => CallbackTo[Double],
    toNumeric: String => CallbackTo[Double | Fraction | BigNumber],
    toSI: CallbackTo[Unit]
  ): Unit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abs")(js.Any.fromFunction1((t0: typingsJapgolly.mathjs.mod.Unit) => abs(t0).runNow()))
    __obj.updateDynamic("divide")(js.Any.fromFunction1((t0: typingsJapgolly.mathjs.mod.Unit) => divide(t0).runNow()))
    __obj.updateDynamic("equalBase")(js.Any.fromFunction1((t0: typingsJapgolly.mathjs.mod.Unit) => equalBase(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.mathjs.mod.Unit) => equals(t0).runNow()))
    __obj.updateDynamic("format")(js.Any.fromFunction1((t0: typingsJapgolly.mathjs.mod.FormatOptions) => format(t0).runNow()))
    __obj.updateDynamic("formatUnits")(formatUnits.toJsFn)
    __obj.updateDynamic("hasBase")(js.Any.fromFunction1((t0: js.Any) => hasBase(t0).runNow()))
    __obj.updateDynamic("multiply")(js.Any.fromFunction1((t0: typingsJapgolly.mathjs.mod.Unit) => multiply(t0).runNow()))
    __obj.updateDynamic("pow")(js.Any.fromFunction1((t0: typingsJapgolly.mathjs.mod.Unit) => pow(t0).runNow()))
    __obj.updateDynamic("splitUnit")(js.Any.fromFunction1((t0: js.Array[java.lang.String | typingsJapgolly.mathjs.mod.Unit]) => splitUnit(t0).runNow()))
    __obj.updateDynamic("to")(js.Any.fromFunction1((t0: java.lang.String) => to(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toNumber")(js.Any.fromFunction1((t0: java.lang.String) => toNumber(t0).runNow()))
    __obj.updateDynamic("toNumeric")(js.Any.fromFunction1((t0: java.lang.String) => toNumeric(t0).runNow()))
    __obj.updateDynamic("toSI")(toSI.toJsFn)
    __obj.asInstanceOf[Unit]
  }
}

