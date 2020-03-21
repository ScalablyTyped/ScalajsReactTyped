package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTestability extends js.Object {
  def addToWindow(registry: TestabilityRegistry): Unit
  def findTestabilityInTree(registry: TestabilityRegistry, elem: js.Any, findInAncestors: Boolean): Testability | Null
}

object GetTestability {
  @scala.inline
  def apply(
    addToWindow: TestabilityRegistry => Callback,
    findTestabilityInTree: (TestabilityRegistry, js.Any, Boolean) => CallbackTo[Testability | Null]
  ): GetTestability = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addToWindow")(js.Any.fromFunction1((t0: typingsJapgolly.angularCore.mod.TestabilityRegistry) => addToWindow(t0).runNow()))
    __obj.updateDynamic("findTestabilityInTree")(js.Any.fromFunction3((t0: typingsJapgolly.angularCore.mod.TestabilityRegistry, t1: js.Any, t2: scala.Boolean) => findTestabilityInTree(t0, t1, t2).runNow()))
    __obj.asInstanceOf[GetTestability]
  }
}

