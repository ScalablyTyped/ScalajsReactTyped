package typingsJapgolly.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "FunctionOperand")
@js.native
class FunctionOperand protected () extends Operand {
  def this(origionalValue: String, parameters: ArrayOperand) = this()
  val isReady: Boolean = js.native
  def evaluateAsync(processValue: ProcessValue): Unit = js.native
  def onAsyncReady(): Unit = js.native
}

