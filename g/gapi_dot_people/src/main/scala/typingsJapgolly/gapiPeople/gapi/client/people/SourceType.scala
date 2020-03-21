package typingsJapgolly.gapiPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gapiPeople.gapiPeopleStrings.SOURCE_TYPE_UNSPECIFIED
  - typingsJapgolly.gapiPeople.gapiPeopleStrings.ACCOUNT
  - typingsJapgolly.gapiPeople.gapiPeopleStrings.PROFILE
  - typingsJapgolly.gapiPeople.gapiPeopleStrings.DOMAIN_PROFILE
  - typingsJapgolly.gapiPeople.gapiPeopleStrings.CONTACT
*/
trait SourceType extends js.Object

object SourceType {
  @scala.inline
  def ACCOUNT: typingsJapgolly.gapiPeople.gapiPeopleStrings.ACCOUNT = this.cast("ACCOUNT")
  @scala.inline
  def CONTACT: typingsJapgolly.gapiPeople.gapiPeopleStrings.CONTACT = this.cast("CONTACT")
  @scala.inline
  def DOMAIN_PROFILE: typingsJapgolly.gapiPeople.gapiPeopleStrings.DOMAIN_PROFILE = this.cast("DOMAIN_PROFILE")
  @scala.inline
  def PROFILE: typingsJapgolly.gapiPeople.gapiPeopleStrings.PROFILE = this.cast("PROFILE")
  @scala.inline
  def SOURCE_TYPE_UNSPECIFIED: typingsJapgolly.gapiPeople.gapiPeopleStrings.SOURCE_TYPE_UNSPECIFIED = this.cast("SOURCE_TYPE_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

