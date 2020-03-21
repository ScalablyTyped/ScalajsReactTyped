package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.other
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.home
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.work
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.blog
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.profile
*/
trait WebsiteType extends js.Object

object WebsiteType {
  @scala.inline
  def blog: typingsJapgolly.microsoftGraph.microsoftGraphStrings.blog = this.cast("blog")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def home: typingsJapgolly.microsoftGraph.microsoftGraphStrings.home = this.cast("home")
  @scala.inline
  def other: typingsJapgolly.microsoftGraph.microsoftGraphStrings.other = this.cast("other")
  @scala.inline
  def profile: typingsJapgolly.microsoftGraph.microsoftGraphStrings.profile = this.cast("profile")
  @scala.inline
  def work: typingsJapgolly.microsoftGraph.microsoftGraphStrings.work = this.cast("work")
}

