package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.student
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.teacher
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait EducationUserRole extends js.Object

object EducationUserRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def student: typingsJapgolly.microsoftGraph.microsoftGraphStrings.student = this.cast("student")
  @scala.inline
  def teacher: typingsJapgolly.microsoftGraph.microsoftGraphStrings.teacher = this.cast("teacher")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

