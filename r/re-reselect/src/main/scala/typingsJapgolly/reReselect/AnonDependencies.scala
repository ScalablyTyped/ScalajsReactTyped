package typingsJapgolly.reReselect

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDependencies[C, D] extends js.Object {
  var dependencies: D
  var resultFunc: C
  def recomputations(): Double
  def resetRecomputations(): Double
}

object AnonDependencies {
  @scala.inline
  def apply[C, D](
    dependencies: D,
    recomputations: CallbackTo[Double],
    resetRecomputations: CallbackTo[Double],
    resultFunc: C
  ): AnonDependencies[C, D] = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], resultFunc = resultFunc.asInstanceOf[js.Any])
    __obj.updateDynamic("recomputations")(recomputations.toJsFn)
    __obj.updateDynamic("resetRecomputations")(resetRecomputations.toJsFn)
    __obj.asInstanceOf[AnonDependencies[C, D]]
  }
}

