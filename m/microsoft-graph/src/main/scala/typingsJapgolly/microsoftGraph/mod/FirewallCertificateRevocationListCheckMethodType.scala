package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.deviceDefault
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.attempt
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.require
*/
trait FirewallCertificateRevocationListCheckMethodType extends js.Object

object FirewallCertificateRevocationListCheckMethodType {
  @scala.inline
  def attempt: typingsJapgolly.microsoftGraph.microsoftGraphStrings.attempt = this.cast("attempt")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceDefault: typingsJapgolly.microsoftGraph.microsoftGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def require: typingsJapgolly.microsoftGraph.microsoftGraphStrings.require = this.cast("require")
}

