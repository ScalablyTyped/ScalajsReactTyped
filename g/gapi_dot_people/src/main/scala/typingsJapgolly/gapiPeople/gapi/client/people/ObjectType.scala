package typingsJapgolly.gapiPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gapiPeople.gapiPeopleStrings.OBJECT_TYPE_UNSPECIFIED
  - typingsJapgolly.gapiPeople.gapiPeopleStrings.PERSON
  - typingsJapgolly.gapiPeople.gapiPeopleStrings.PAGE
*/
trait ObjectType extends js.Object

object ObjectType {
  @scala.inline
  def OBJECT_TYPE_UNSPECIFIED: typingsJapgolly.gapiPeople.gapiPeopleStrings.OBJECT_TYPE_UNSPECIFIED = this.cast("OBJECT_TYPE_UNSPECIFIED")
  @scala.inline
  def PAGE: typingsJapgolly.gapiPeople.gapiPeopleStrings.PAGE = this.cast("PAGE")
  @scala.inline
  def PERSON: typingsJapgolly.gapiPeople.gapiPeopleStrings.PERSON = this.cast("PERSON")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

