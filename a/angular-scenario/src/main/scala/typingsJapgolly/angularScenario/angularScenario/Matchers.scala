package typingsJapgolly.angularScenario.angularScenario

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers extends js.Object {
  def toBe(value: js.Any): Unit
  def toBeDefined(): Unit
  def toBeFalsy(): Unit
  def toBeGreaterThan(value: js.Any): Unit
  def toBeLessThan(value: js.Any): Unit
  def toBeNull(): Unit
  def toBeTruthy(): Unit
  def toContain(value: js.Any): Unit
  def toEqual(value: js.Any): Unit
  def toMatch(regularExpression: js.Any): Unit
}

object Matchers {
  @scala.inline
  def apply(
    toBe: js.Any => Callback,
    toBeDefined: Callback,
    toBeFalsy: Callback,
    toBeGreaterThan: js.Any => Callback,
    toBeLessThan: js.Any => Callback,
    toBeNull: Callback,
    toBeTruthy: Callback,
    toContain: js.Any => Callback,
    toEqual: js.Any => Callback,
    toMatch: js.Any => Callback
  ): Matchers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toBe")(js.Any.fromFunction1((t0: js.Any) => toBe(t0).runNow()))
    __obj.updateDynamic("toBeDefined")(toBeDefined.toJsFn)
    __obj.updateDynamic("toBeFalsy")(toBeFalsy.toJsFn)
    __obj.updateDynamic("toBeGreaterThan")(js.Any.fromFunction1((t0: js.Any) => toBeGreaterThan(t0).runNow()))
    __obj.updateDynamic("toBeLessThan")(js.Any.fromFunction1((t0: js.Any) => toBeLessThan(t0).runNow()))
    __obj.updateDynamic("toBeNull")(toBeNull.toJsFn)
    __obj.updateDynamic("toBeTruthy")(toBeTruthy.toJsFn)
    __obj.updateDynamic("toContain")(js.Any.fromFunction1((t0: js.Any) => toContain(t0).runNow()))
    __obj.updateDynamic("toEqual")(js.Any.fromFunction1((t0: js.Any) => toEqual(t0).runNow()))
    __obj.updateDynamic("toMatch")(js.Any.fromFunction1((t0: js.Any) => toMatch(t0).runNow()))
    __obj.asInstanceOf[Matchers]
  }
}

