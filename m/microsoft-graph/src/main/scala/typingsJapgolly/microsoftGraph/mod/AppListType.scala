package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.appsInListCompliant
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.appsNotInListCompliant
*/
trait AppListType extends js.Object

object AppListType {
  @scala.inline
  def appsInListCompliant: typingsJapgolly.microsoftGraph.microsoftGraphStrings.appsInListCompliant = this.cast("appsInListCompliant")
  @scala.inline
  def appsNotInListCompliant: typingsJapgolly.microsoftGraph.microsoftGraphStrings.appsNotInListCompliant = this.cast("appsNotInListCompliant")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: none_ = this.cast("none")
}

