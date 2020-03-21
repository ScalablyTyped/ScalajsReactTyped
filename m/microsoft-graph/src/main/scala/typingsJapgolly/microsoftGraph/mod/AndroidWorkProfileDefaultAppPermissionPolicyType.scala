package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.deviceDefault
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.prompt
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.autoGrant
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.autoDeny
*/
trait AndroidWorkProfileDefaultAppPermissionPolicyType extends js.Object

object AndroidWorkProfileDefaultAppPermissionPolicyType {
  @scala.inline
  def autoDeny: typingsJapgolly.microsoftGraph.microsoftGraphStrings.autoDeny = this.cast("autoDeny")
  @scala.inline
  def autoGrant: typingsJapgolly.microsoftGraph.microsoftGraphStrings.autoGrant = this.cast("autoGrant")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceDefault: typingsJapgolly.microsoftGraph.microsoftGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def prompt: typingsJapgolly.microsoftGraph.microsoftGraphStrings.prompt = this.cast("prompt")
}

