package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.deviceDefault
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.clean
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.quarantine
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.remove
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.allow
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.block
*/
trait DefenderThreatAction extends js.Object

object DefenderThreatAction {
  @scala.inline
  def allow: typingsJapgolly.microsoftGraph.microsoftGraphStrings.allow = this.cast("allow")
  @scala.inline
  def block: typingsJapgolly.microsoftGraph.microsoftGraphStrings.block = this.cast("block")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clean: typingsJapgolly.microsoftGraph.microsoftGraphStrings.clean = this.cast("clean")
  @scala.inline
  def deviceDefault: typingsJapgolly.microsoftGraph.microsoftGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def quarantine: typingsJapgolly.microsoftGraph.microsoftGraphStrings.quarantine = this.cast("quarantine")
  @scala.inline
  def remove: typingsJapgolly.microsoftGraph.microsoftGraphStrings.remove = this.cast("remove")
  @scala.inline
  def userDefined: typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

