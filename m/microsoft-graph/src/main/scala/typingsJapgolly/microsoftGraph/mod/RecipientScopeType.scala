package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.internal
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.external
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.externalPartner
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.externalNonPartner
*/
trait RecipientScopeType extends js.Object

object RecipientScopeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def external: typingsJapgolly.microsoftGraph.microsoftGraphStrings.external = this.cast("external")
  @scala.inline
  def externalNonPartner: typingsJapgolly.microsoftGraph.microsoftGraphStrings.externalNonPartner = this.cast("externalNonPartner")
  @scala.inline
  def externalPartner: typingsJapgolly.microsoftGraph.microsoftGraphStrings.externalPartner = this.cast("externalPartner")
  @scala.inline
  def internal: typingsJapgolly.microsoftGraph.microsoftGraphStrings.internal = this.cast("internal")
  @scala.inline
  def none: none_ = this.cast("none")
}

