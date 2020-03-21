package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.noProtection
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.encryptAndAuditOnly
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.encryptAuditAndPrompt
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.encryptAuditAndBlock
*/
trait WindowsInformationProtectionEnforcementLevel extends js.Object

object WindowsInformationProtectionEnforcementLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def encryptAndAuditOnly: typingsJapgolly.microsoftGraph.microsoftGraphStrings.encryptAndAuditOnly = this.cast("encryptAndAuditOnly")
  @scala.inline
  def encryptAuditAndBlock: typingsJapgolly.microsoftGraph.microsoftGraphStrings.encryptAuditAndBlock = this.cast("encryptAuditAndBlock")
  @scala.inline
  def encryptAuditAndPrompt: typingsJapgolly.microsoftGraph.microsoftGraphStrings.encryptAuditAndPrompt = this.cast("encryptAuditAndPrompt")
  @scala.inline
  def noProtection: typingsJapgolly.microsoftGraph.microsoftGraphStrings.noProtection = this.cast("noProtection")
}

