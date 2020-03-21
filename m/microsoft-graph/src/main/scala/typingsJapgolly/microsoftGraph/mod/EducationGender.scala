package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.female
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.male
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.other
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait EducationGender extends js.Object

object EducationGender {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def female: typingsJapgolly.microsoftGraph.microsoftGraphStrings.female = this.cast("female")
  @scala.inline
  def male: typingsJapgolly.microsoftGraph.microsoftGraphStrings.male = this.cast("male")
  @scala.inline
  def other: typingsJapgolly.microsoftGraph.microsoftGraphStrings.other = this.cast("other")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

