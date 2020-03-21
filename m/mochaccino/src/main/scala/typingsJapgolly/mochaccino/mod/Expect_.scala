package typingsJapgolly.mochaccino.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expect_ extends js.Object {
  var not: Expect_
  def toBe(arg: js.Any): Unit
  def toBeDefined(): Unit
  def toBeFalsy(): Unit
  def toBeGreaterThan(other: Double): Unit
  def toBeLessThan(other: Double): Unit
  def toBeNull(): Unit
  def toBeTruthy(): Unit
  def toBeUndefined(): Unit
  def toContain(arg: js.Any): Unit
  def toEqual(arg: js.Any): Unit
  def toHaveBeenCalled(): Unit
  def toHaveBeenCalledTimes(callCount: Double): Unit
  def toHaveBeenCalledWith(arg: js.Any*): Unit
  def toMatch(matchExpression: js.Any): Unit
  def toThrow(): Unit
  def toThrowError(errType: js.Any): Unit
}

object Expect_ {
  @scala.inline
  def apply(
    not: Expect_,
    toBe: js.Any => Callback,
    toBeDefined: Callback,
    toBeFalsy: Callback,
    toBeGreaterThan: Double => Callback,
    toBeLessThan: Double => Callback,
    toBeNull: Callback,
    toBeTruthy: Callback,
    toBeUndefined: Callback,
    toContain: js.Any => Callback,
    toEqual: js.Any => Callback,
    toHaveBeenCalled: Callback,
    toHaveBeenCalledTimes: Double => Callback,
    toHaveBeenCalledWith: /* repeated */ js.Any => Callback,
    toMatch: js.Any => Callback,
    toThrow: Callback,
    toThrowError: js.Any => Callback
  ): Expect_ = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
    __obj.updateDynamic("toBe")(js.Any.fromFunction1((t0: js.Any) => toBe(t0).runNow()))
    __obj.updateDynamic("toBeDefined")(toBeDefined.toJsFn)
    __obj.updateDynamic("toBeFalsy")(toBeFalsy.toJsFn)
    __obj.updateDynamic("toBeGreaterThan")(js.Any.fromFunction1((t0: scala.Double) => toBeGreaterThan(t0).runNow()))
    __obj.updateDynamic("toBeLessThan")(js.Any.fromFunction1((t0: scala.Double) => toBeLessThan(t0).runNow()))
    __obj.updateDynamic("toBeNull")(toBeNull.toJsFn)
    __obj.updateDynamic("toBeTruthy")(toBeTruthy.toJsFn)
    __obj.updateDynamic("toBeUndefined")(toBeUndefined.toJsFn)
    __obj.updateDynamic("toContain")(js.Any.fromFunction1((t0: js.Any) => toContain(t0).runNow()))
    __obj.updateDynamic("toEqual")(js.Any.fromFunction1((t0: js.Any) => toEqual(t0).runNow()))
    __obj.updateDynamic("toHaveBeenCalled")(toHaveBeenCalled.toJsFn)
    __obj.updateDynamic("toHaveBeenCalledTimes")(js.Any.fromFunction1((t0: scala.Double) => toHaveBeenCalledTimes(t0).runNow()))
    __obj.updateDynamic("toHaveBeenCalledWith")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => toHaveBeenCalledWith(t0).runNow()))
    __obj.updateDynamic("toMatch")(js.Any.fromFunction1((t0: js.Any) => toMatch(t0).runNow()))
    __obj.updateDynamic("toThrow")(toThrow.toJsFn)
    __obj.updateDynamic("toThrowError")(js.Any.fromFunction1((t0: js.Any) => toThrowError(t0).runNow()))
    __obj.asInstanceOf[Expect_]
  }
}

