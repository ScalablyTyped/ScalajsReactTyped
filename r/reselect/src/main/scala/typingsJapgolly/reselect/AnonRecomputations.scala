package typingsJapgolly.reselect

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecomputations[C] extends js.Object {
  var resultFunc: C
  def recomputations(): Double
  def resetRecomputations(): Double
}

object AnonRecomputations {
  @scala.inline
  def apply[C](recomputations: CallbackTo[Double], resetRecomputations: CallbackTo[Double], resultFunc: C): AnonRecomputations[C] = {
    val __obj = js.Dynamic.literal(resultFunc = resultFunc.asInstanceOf[js.Any])
    __obj.updateDynamic("recomputations")(recomputations.toJsFn)
    __obj.updateDynamic("resetRecomputations")(resetRecomputations.toJsFn)
    __obj.asInstanceOf[AnonRecomputations[C]]
  }
}

