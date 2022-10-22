package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Optimization {
  
  @js.native
  sealed trait Status extends StObject
  /**
    * Status of the solution. Before solving a problem the status will be NOT_SOLVED;
    * afterwards it will take any of the other values depending if it successfully found a solution and
    * if the solution is optimal.
    */
  @JSGlobal("GoogleAppsScript.Optimization.Status")
  @js.native
  object Status extends StObject {
    
    @js.native
    sealed trait ABNORMAL
      extends StObject
         with Status
    
    @js.native
    sealed trait FEASIBLE
      extends StObject
         with Status
    
    @js.native
    sealed trait INFEASIBLE
      extends StObject
         with Status
    
    @js.native
    sealed trait MODEL_INVALID
      extends StObject
         with Status
    
    @js.native
    sealed trait NOT_SOLVED
      extends StObject
         with Status
    
    @js.native
    sealed trait OPTIMAL
      extends StObject
         with Status
    
    @js.native
    sealed trait UNBOUNDED
      extends StObject
         with Status
  }
  
  @js.native
  sealed trait VariableType extends StObject
  /**
    * Type of variables created by the engine.
    */
  @JSGlobal("GoogleAppsScript.Optimization.VariableType")
  @js.native
  object VariableType extends StObject {
    
    @js.native
    sealed trait CONTINUOUS
      extends StObject
         with VariableType
    
    @js.native
    sealed trait INTEGER
      extends StObject
         with VariableType
  }
  
  /**
    * Object storing a linear constraint of the form lowerBound ≤ Sum(a(i) x(i)) ≤ upperBound
    * where lowerBound and upperBound are constants, a(i) are constant
    * coefficients and x(i) are variables (unknowns).
    *
    * The example below creates one variable x with values between 0 and 5
    * and creates the constraint 0 ≤ 2 * x ≤ 5. This is done by first creating a constraint
    * with the lower bound 5 and upper bound 5. Then the coefficient for variable
    * x in this constraint is set to 2.
    *
    *     var engine = LinearOptimizationService.createEngine();
    *     // Create a variable so we can add it to the constraint
    *     engine.addVariable('x', 0, 5);
    *     // Create a linear constraint with the bounds 0 and 10
    *     var constraint = engine.addConstraint(0, 10);
    *     // Set the coefficient of the variable in the constraint. The constraint is now:
    *     // 0 <= 2 * x <= 5
    *     constraint.setCoefficient('x', 2);
    */
  trait LinearOptimizationConstraint extends StObject {
    
    def setCoefficient(variableName: String, coefficient: Double): LinearOptimizationConstraint
  }
  object LinearOptimizationConstraint {
    
    inline def apply(setCoefficient: (String, Double) => LinearOptimizationConstraint): LinearOptimizationConstraint = {
      val __obj = js.Dynamic.literal(setCoefficient = js.Any.fromFunction2(setCoefficient))
      __obj.asInstanceOf[LinearOptimizationConstraint]
    }
    
    extension [Self <: LinearOptimizationConstraint](x: Self) {
      
      inline def setSetCoefficient(value: (String, Double) => LinearOptimizationConstraint): Self = StObject.set(x, "setCoefficient", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * The engine used to model and solve a linear program. The example below solves the following
    * linear program:
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
    *     // Add variables, constraints and define the objective with addVariable(), addConstraint(), etc
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
    *       Logger.log('Value of x: ' + solution.getVariableValue('x'));
    *       Logger.log('Value of y: ' + solution.getVariableValue('y'));
    *     }
    */
  @js.native
  trait LinearOptimizationEngine extends StObject {
    
    def addConstraint(lowerBound: Double, upperBound: Double): LinearOptimizationConstraint = js.native
    
    def addConstraints(
      lowerBounds: js.Array[Double],
      upperBounds: js.Array[Double],
      variableNames: js.Array[js.Array[String]],
      coefficients: js.Array[js.Array[Double]]
    ): LinearOptimizationEngine = js.native
    
    def addVariable(name: String, lowerBound: Double, upperBound: Double): LinearOptimizationEngine = js.native
    def addVariable(name: String, lowerBound: Double, upperBound: Double, `type`: VariableType): LinearOptimizationEngine = js.native
    def addVariable(
      name: String,
      lowerBound: Double,
      upperBound: Double,
      `type`: VariableType,
      objectiveCoefficient: Double
    ): LinearOptimizationEngine = js.native
    
    def addVariables(
      names: js.Array[String],
      lowerBounds: js.Array[Double],
      upperBounds: js.Array[Double],
      types: js.Array[VariableType],
      objectiveCoefficients: js.Array[Double]
    ): LinearOptimizationEngine = js.native
    
    def setMaximization(): LinearOptimizationEngine = js.native
    
    def setMinimization(): LinearOptimizationEngine = js.native
    
    def setObjectiveCoefficient(variableName: String, coefficient: Double): LinearOptimizationEngine = js.native
    
    def solve(): LinearOptimizationSolution = js.native
    def solve(seconds: Double): LinearOptimizationSolution = js.native
  }
  
  /**
    * The linear optimization service, used to model and solve linear and mixed-integer linear
    * programs. The example below solves the following linear program:
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
    *     // Add variables, constraints and define the objective using addVariable(), addConstraint(), etc.
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
    *     // Engine should maximize the objective.
    *     engine.setMaximization();
    *
    *     // Solve the linear program
    *     var solution = engine.solve();
    *     if (!solution.isValid()) {
    *       Logger.log('No solution ' + solution.getStatus());
    *     } else {
    *       Logger.log('Value of x: ' + solution.getVariableValue('x'));
    *       Logger.log('Value of y: ' + solution.getVariableValue('y'));
    *     }
    */
  trait LinearOptimizationService extends StObject {
    
    var Status: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Status */ Any
    
    var VariableType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VariableType */ Any
    
    def createEngine(): LinearOptimizationEngine
  }
  object LinearOptimizationService {
    
    inline def apply(
      Status: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Status */ Any,
      VariableType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VariableType */ Any,
      createEngine: CallbackTo[LinearOptimizationEngine]
    ): LinearOptimizationService = {
      val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any], VariableType = VariableType.asInstanceOf[js.Any], createEngine = createEngine.toJsFn)
      __obj.asInstanceOf[LinearOptimizationService]
    }
    
    extension [Self <: LinearOptimizationService](x: Self) {
      
      inline def setCreateEngine(value: CallbackTo[LinearOptimizationEngine]): Self = StObject.set(x, "createEngine", value.toJsFn)
      
      inline def setStatus(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Status */ Any): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      inline def setVariableType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VariableType */ Any): Self = StObject.set(x, "VariableType", value.asInstanceOf[js.Any])
    }
  }
  
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
  trait LinearOptimizationSolution extends StObject {
    
    def getObjectiveValue(): Double
    
    def getStatus(): Status
    
    def getVariableValue(variableName: String): Double
    
    def isValid(): Boolean
  }
  object LinearOptimizationSolution {
    
    inline def apply(
      getObjectiveValue: CallbackTo[Double],
      getStatus: CallbackTo[Status],
      getVariableValue: String => Double,
      isValid: CallbackTo[Boolean]
    ): LinearOptimizationSolution = {
      val __obj = js.Dynamic.literal(getObjectiveValue = getObjectiveValue.toJsFn, getStatus = getStatus.toJsFn, getVariableValue = js.Any.fromFunction1(getVariableValue), isValid = isValid.toJsFn)
      __obj.asInstanceOf[LinearOptimizationSolution]
    }
    
    extension [Self <: LinearOptimizationSolution](x: Self) {
      
      inline def setGetObjectiveValue(value: CallbackTo[Double]): Self = StObject.set(x, "getObjectiveValue", value.toJsFn)
      
      inline def setGetStatus(value: CallbackTo[Status]): Self = StObject.set(x, "getStatus", value.toJsFn)
      
      inline def setGetVariableValue(value: String => Double): Self = StObject.set(x, "getVariableValue", js.Any.fromFunction1(value))
      
      inline def setIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "isValid", value.toJsFn)
    }
  }
}
