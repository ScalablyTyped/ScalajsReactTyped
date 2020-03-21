package typingsJapgolly.gapiClientPrediction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOutput extends js.Object {
  /** The input features for this instance. */
  var csvInstance: js.UndefOr[js.Array[_]] = js.undefined
  /** The generic output value - could be regression or class label. */
  var output: js.UndefOr[String] = js.undefined
}

object AnonOutput {
  @scala.inline
  def apply(csvInstance: js.Array[_] = null, output: String = null): AnonOutput = {
    val __obj = js.Dynamic.literal()
    if (csvInstance != null) __obj.updateDynamic("csvInstance")(csvInstance.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOutput]
  }
}

