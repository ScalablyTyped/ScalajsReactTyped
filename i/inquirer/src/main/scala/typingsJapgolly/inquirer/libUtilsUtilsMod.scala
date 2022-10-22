package typingsJapgolly.inquirer

import typingsJapgolly.inquirer.mod.Answers
import typingsJapgolly.inquirer.mod.DistinctQuestion
import typingsJapgolly.inquirer.mod.KeyUnion
import typingsJapgolly.inquirer.mod.UnionToIntersection
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsUtilsMod {
  
  @JSImport("inquirer/lib/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetchAsyncQuestionProperty(question: DistinctQuestion[Answers], prop: QuestionProperty, answers: Answers): Observable_[DistinctQuestion[Answers]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchAsyncQuestionProperty")(question.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], answers.asInstanceOf[js.Any])).asInstanceOf[Observable_[DistinctQuestion[Answers]]]
  
  /**
    * Represents a property-name of any question-type.
    */
  type QuestionProperty = KeyUnion[UnionToIntersection[DistinctQuestion[Answers]]]
}
