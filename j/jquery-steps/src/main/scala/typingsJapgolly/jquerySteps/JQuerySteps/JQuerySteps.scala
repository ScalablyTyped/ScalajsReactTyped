package typingsJapgolly.jquerySteps.JQuerySteps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuerySteps extends js.Object {
  /**
    * Adds a new step. (chainable)
    */
  def add(step: Step): typingsJapgolly.jquerySteps.JQuerySteps.JQuerySteps
  /**
    * Removes the control functionality completely and transforms the current state to the initial HTML structure.
    */
  def destroy(): Unit
  /**
    * Triggers the onFinishing and onFinished event.
    */
  def finish(): Unit
  /**
    * Gets the current step index.
    */
  def getCurrentIndex(): Double
  /**
    * Gets the current step object.
    */
  def getCurrentStep(): Step
  /**
    * Gets a specific step object by index.
    */
  def getStep(index: Double): Step
  /**
    * Inserts a new step to a specific position. (chainable)
    */
  def insert(index: Double, step: Step): typingsJapgolly.jquerySteps.JQuerySteps.JQuerySteps
  /**
    * Routes to the previous step.
    */
  def next(): Boolean
  /**
    * Routes to the next step.
    */
  def previous(): Boolean
  /**
    * Removes a specific step by an given index.
    */
  def remove(index: Double): Boolean
  /**
    * Skips a certain amount of steps. Not yet implemented!
    */
  def skip(count: Double): Boolean
}

object JQuerySteps {
  @scala.inline
  def apply(
    add: Step => CallbackTo[typingsJapgolly.jquerySteps.JQuerySteps.JQuerySteps],
    destroy: Callback,
    finish: Callback,
    getCurrentIndex: CallbackTo[Double],
    getCurrentStep: CallbackTo[Step],
    getStep: Double => CallbackTo[Step],
    insert: (Double, Step) => CallbackTo[typingsJapgolly.jquerySteps.JQuerySteps.JQuerySteps],
    next: CallbackTo[Boolean],
    previous: CallbackTo[Boolean],
    remove: Double => CallbackTo[Boolean],
    skip: Double => CallbackTo[Boolean]
  ): JQuerySteps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.jquerySteps.JQuerySteps.Step) => add(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("finish")(finish.toJsFn)
    __obj.updateDynamic("getCurrentIndex")(getCurrentIndex.toJsFn)
    __obj.updateDynamic("getCurrentStep")(getCurrentStep.toJsFn)
    __obj.updateDynamic("getStep")(js.Any.fromFunction1((t0: scala.Double) => getStep(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.jquerySteps.JQuerySteps.Step) => insert(t0, t1).runNow()))
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("previous")(previous.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: scala.Double) => remove(t0).runNow()))
    __obj.updateDynamic("skip")(js.Any.fromFunction1((t0: scala.Double) => skip(t0).runNow()))
    __obj.asInstanceOf[JQuerySteps]
  }
}

