package typingsJapgolly.bip174.interfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bip174.AnonInputCount
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  def addInput(objectArg: js.Any): Unit
  def addOutput(objectArg: js.Any): Unit
  def getInputOutputCounts(): AnonInputCount
  def toBuffer(): Buffer
}

object Transaction {
  @scala.inline
  def apply(
    addInput: js.Any => Callback,
    addOutput: js.Any => Callback,
    getInputOutputCounts: CallbackTo[AnonInputCount],
    toBuffer: CallbackTo[Buffer]
  ): Transaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addInput")(js.Any.fromFunction1((t0: js.Any) => addInput(t0).runNow()))
    __obj.updateDynamic("addOutput")(js.Any.fromFunction1((t0: js.Any) => addOutput(t0).runNow()))
    __obj.updateDynamic("getInputOutputCounts")(getInputOutputCounts.toJsFn)
    __obj.updateDynamic("toBuffer")(toBuffer.toJsFn)
    __obj.asInstanceOf[Transaction]
  }
}

