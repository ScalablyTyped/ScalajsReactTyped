package typingsJapgolly.jasmineNode.jasmine

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineNode extends js.Object {
  def executeSpecsInFolder(options: ExecuteSpecsOptions): Unit
  def loadHelpersInFolder(path: String, pattern: js.RegExp): Unit
}

object JasmineNode {
  @scala.inline
  def apply(
    executeSpecsInFolder: ExecuteSpecsOptions => Callback,
    loadHelpersInFolder: (String, js.RegExp) => Callback
  ): JasmineNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("executeSpecsInFolder")(js.Any.fromFunction1((t0: typingsJapgolly.jasmineNode.jasmine.ExecuteSpecsOptions) => executeSpecsInFolder(t0).runNow()))
    __obj.updateDynamic("loadHelpersInFolder")(js.Any.fromFunction2((t0: java.lang.String, t1: js.RegExp) => loadHelpersInFolder(t0, t1).runNow()))
    __obj.asInstanceOf[JasmineNode]
  }
}

