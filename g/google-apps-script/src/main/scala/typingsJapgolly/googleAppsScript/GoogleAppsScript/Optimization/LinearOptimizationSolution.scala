package typingsJapgolly.googleAppsScript.GoogleAppsScript.Optimization

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The solution of a linear program. The example below solves the following linear program:
  *
  * Two variables, x and y:
  *
  * 0 ≤ x ≤ 10
  *
  * 0 ≤ y ≤ 5
  *
  * Constraints:
  *
  * 0 ≤ 2 * x + 5 * y ≤ 10
  *
  * 0 ≤ 10 * x + 3 * y ≤ 20
  *
  * Objective:
  * Maximize x + y
  *
  *     var engine = LinearOptimizationService.createEngine();
  *
  *     // Add variables, constraints and define the objective with addVariable(), addConstraint(), etc.
  *     // Add two variables, 0 <= x <= 10 and 0 <= y <= 5
  *     engine.addVariable('x', 0, 10);
  *     engine.addVariable('y', 0, 5);
  *
  *     // Create the constraint: 0 <= 2 * x + 5 * y <= 10
  *     var constraint = engine.addConstraint(0, 10);
  *     constraint.setCoefficient('x', 2);
  *     constraint.setCoefficient('y', 5);
  *
  *     // Create the constraint: 0 <= 10 * x + 3 * y <= 20
  *     var constraint = engine.addConstraint(0, 20);
  *     constraint.setCoefficient('x', 10);
  *     constraint.setCoefficient('y', 3);
  *
  *     // Set the objective to be x + y
  *     engine.setObjectiveCoefficient('x', 1);
  *     engine.setObjectiveCoefficient('y', 1);
  *
  *     // Engine should maximize the objective
  *     engine.setMaximization();
  *
  *     // Solve the linear program
  *     var solution = engine.solve();
  *     if (!solution.isValid()) {
  *       Logger.log('No solution ' + solution.getStatus());
  *     } else {
  *       Logger.log('Objective  value: ' + solution.getObjectiveValue());
  *       Logger.log('Value of x: ' + solution.getVariableValue('x'));
  *       Logger.log('Value of y: ' + solution.getVariableValue('y'));
  *     }
  */
trait LinearOptimizationSolution extends js.Object {
  def getObjectiveValue(): Double
  def getStatus(): Status
  def getVariableValue(variableName: String): Double
  def isValid(): Boolean
}

object LinearOptimizationSolution {
  @scala.inline
  def apply(
    getObjectiveValue: CallbackTo[Double],
    getStatus: CallbackTo[Status],
    getVariableValue: String => CallbackTo[Double],
    isValid: CallbackTo[Boolean]
  ): LinearOptimizationSolution = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getObjectiveValue")(getObjectiveValue.toJsFn)
    __obj.updateDynamic("getStatus")(getStatus.toJsFn)
    __obj.updateDynamic("getVariableValue")(js.Any.fromFunction1((t0: java.lang.String) => getVariableValue(t0).runNow()))
    __obj.updateDynamic("isValid")(isValid.toJsFn)
    __obj.asInstanceOf[LinearOptimizationSolution]
  }
}

