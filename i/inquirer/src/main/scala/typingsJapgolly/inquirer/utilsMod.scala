package typingsJapgolly.inquirer

import typingsJapgolly.inquirer.mod.Answers
import typingsJapgolly.inquirer.mod.DistinctQuestion
import typingsJapgolly.inquirer.mod.KeyUnion
import typingsJapgolly.inquirer.mod.UnionToIntersection
import typingsJapgolly.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inquirer/lib/utils/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def fetchAsyncQuestionPropertyQuestionProperty(question: DistinctQuestion[Answers], prop: QuestionProperty, answers: Answers): Observable_[DistinctQuestion[Answers]] = js.native
  /**
    * Represents a property-name of any question-type.
    */
  type QuestionProperty = KeyUnion[UnionToIntersection[DistinctQuestion[Answers]]]
  /**
    * Unpacks a question-property.
    */
  type UnpackQuestionProperty[T] = T | js.Any
}

