package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.immediate
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.diskSpaceThreshold
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.diskSpaceThresholdOrInactiveThreshold
*/
trait SharedPCAccountDeletionPolicyType extends js.Object

object SharedPCAccountDeletionPolicyType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def diskSpaceThreshold: typingsJapgolly.microsoftGraph.microsoftGraphStrings.diskSpaceThreshold = this.cast("diskSpaceThreshold")
  @scala.inline
  def diskSpaceThresholdOrInactiveThreshold: typingsJapgolly.microsoftGraph.microsoftGraphStrings.diskSpaceThresholdOrInactiveThreshold = this.cast("diskSpaceThresholdOrInactiveThreshold")
  @scala.inline
  def immediate: typingsJapgolly.microsoftGraph.microsoftGraphStrings.immediate = this.cast("immediate")
}

