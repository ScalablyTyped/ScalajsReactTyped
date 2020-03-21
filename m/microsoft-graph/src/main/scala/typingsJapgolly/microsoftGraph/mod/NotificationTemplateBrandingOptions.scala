package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.includeCompanyLogo
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.includeCompanyName
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.includeContactInformation
*/
trait NotificationTemplateBrandingOptions extends js.Object

object NotificationTemplateBrandingOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def includeCompanyLogo: typingsJapgolly.microsoftGraph.microsoftGraphStrings.includeCompanyLogo = this.cast("includeCompanyLogo")
  @scala.inline
  def includeCompanyName: typingsJapgolly.microsoftGraph.microsoftGraphStrings.includeCompanyName = this.cast("includeCompanyName")
  @scala.inline
  def includeContactInformation: typingsJapgolly.microsoftGraph.microsoftGraphStrings.includeContactInformation = this.cast("includeContactInformation")
  @scala.inline
  def none: none_ = this.cast("none")
}

