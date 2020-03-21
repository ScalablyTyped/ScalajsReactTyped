package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IASTSpan extends js.Object {
  var _end: Double
  var _start: Double
  def end(): Double
  def start(): Double
}

object IASTSpan {
  @scala.inline
  def apply(_end: Double, _start: Double, end: CallbackTo[Double], start: CallbackTo[Double]): IASTSpan = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any])
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.asInstanceOf[IASTSpan]
  }
}

