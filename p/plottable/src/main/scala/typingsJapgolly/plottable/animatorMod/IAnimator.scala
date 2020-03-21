package typingsJapgolly.plottable.animatorMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.d3Transition.mod.Transition_
import typingsJapgolly.plottable.interfacesMod.AttributeToAppliedProjector
import typingsJapgolly.plottable.interfacesMod.SimpleSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimator extends js.Object {
  /**
    * Applies the supplied attributes to a d3.Selection with some animation.
    *
    * @param {d3.Selection} selection The update selection or transition selection that we wish to animate.
    * @param {AttributeToAppliedProjector} attrToAppliedProjector The set of
    *     AppliedProjectors that we will use to set attributes on the selection.
    * @return {any} Animators should return the selection or
    *     transition object so that plots may chain the transitions between
    *     animators.
    */
  def animate(selection: SimpleSelection[_], attrToAppliedProjector: AttributeToAppliedProjector): SimpleSelection[_] | (Transition_[_, _, _, _])
  /**
    * Given the number of elements, return the total time the animation requires
    *
    * @param {number} numberofIterations The number of elements that will be drawn
    * @returns {number}
    */
  def totalTime(numberOfIterations: Double): Double
}

object IAnimator {
  @scala.inline
  def apply(
    animate: (SimpleSelection[js.Any], AttributeToAppliedProjector) => CallbackTo[SimpleSelection[js.Any] | (Transition_[js.Any, js.Any, js.Any, js.Any])],
    totalTime: Double => CallbackTo[Double]
  ): IAnimator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animate")(js.Any.fromFunction2((t0: typingsJapgolly.plottable.interfacesMod.SimpleSelection[js.Any], t1: typingsJapgolly.plottable.interfacesMod.AttributeToAppliedProjector) => animate(t0, t1).runNow()))
    __obj.updateDynamic("totalTime")(js.Any.fromFunction1((t0: scala.Double) => totalTime(t0).runNow()))
    __obj.asInstanceOf[IAnimator]
  }
}

