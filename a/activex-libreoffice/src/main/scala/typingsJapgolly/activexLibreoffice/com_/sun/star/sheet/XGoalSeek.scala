package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides seeking a goal value for a cell. */
trait XGoalSeek
  extends StObject
     with XInterface {
  
  /**
    * calculates a value which gives a specified result in a formula.
    * @param aFormulaPosition is the address of the formula cell used for the calculation.
    * @param aVariablePosition is the address of the cell that is used in the formula as variable.
    * @param aGoalValue is the value which should be reached during the goal seek.
    * @returns the result of the goal seek, including the value that results in the specified goal, using the specified formula.
    */
  def seekGoal(aFormulaPosition: CellAddress, aVariablePosition: CellAddress, aGoalValue: String): GoalResult
}
object XGoalSeek {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    seekGoal: (CellAddress, CellAddress, String) => GoalResult
  ): XGoalSeek = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, seekGoal = js.Any.fromFunction3(seekGoal))
    __obj.asInstanceOf[XGoalSeek]
  }
  
  extension [Self <: XGoalSeek](x: Self) {
    
    inline def setSeekGoal(value: (CellAddress, CellAddress, String) => GoalResult): Self = StObject.set(x, "seekGoal", js.Any.fromFunction3(value))
  }
}
