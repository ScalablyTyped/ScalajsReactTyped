package typingsJapgolly.inquirer

import typingsJapgolly.inquirer.inquirerMod.Answers
import typingsJapgolly.inquirer.inquirerMod.DistinctQuestion
import typingsJapgolly.inquirer.inquirerMod.KeyUnion
import typingsJapgolly.inquirer.inquirerMod.UnionToIntersection
import typingsJapgolly.inquirer.libUtilsUtilsMod.QuestionProperty
import typingsJapgolly.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inquirer/lib/utils/utils", JSImport.Namespace)
@js.native
object libUtilsUtilsMod extends js.Object {
  def fetchAsyncQuestionPropertyQuestionProperty(question: DistinctQuestion[Answers], prop: QuestionProperty, answers: Answers): Observable[DistinctQuestion[Answers]] = js.native
  /**
    * Represents a property-name of any question-type.
    */
  type QuestionProperty = KeyUnion[UnionToIntersection[DistinctQuestion[Answers]]]
  /**
    * Unpacks a question-property.
    */
  type UnpackQuestionProperty[T] = T | js.Any
}

