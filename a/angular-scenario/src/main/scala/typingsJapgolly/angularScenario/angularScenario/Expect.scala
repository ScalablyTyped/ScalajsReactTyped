package typingsJapgolly.angularScenario.angularScenario

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expect extends Matchers {
  def not(): CustomMatchers
}

object Expect {
  @scala.inline
  def apply(
    not: CallbackTo[CustomMatchers],
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
  ): Expect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("not")(not.toJsFn)
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
    __obj.asInstanceOf[Expect]
  }
}

