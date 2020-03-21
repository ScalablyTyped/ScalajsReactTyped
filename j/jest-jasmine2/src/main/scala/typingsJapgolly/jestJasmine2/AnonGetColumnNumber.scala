package typingsJapgolly.jestJasmine2

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetColumnNumber extends js.Object {
  def getColumnNumber(): Double
  def getLineNumber(): Double
}

object AnonGetColumnNumber {
  @scala.inline
  def apply(getColumnNumber: CallbackTo[Double], getLineNumber: CallbackTo[Double]): AnonGetColumnNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getColumnNumber")(getColumnNumber.toJsFn)
    __obj.updateDynamic("getLineNumber")(getLineNumber.toJsFn)
    __obj.asInstanceOf[AnonGetColumnNumber]
  }
}

