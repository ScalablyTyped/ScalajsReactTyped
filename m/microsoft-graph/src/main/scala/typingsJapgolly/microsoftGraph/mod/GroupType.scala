package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unifiedGroups
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.azureAD
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait GroupType extends js.Object

object GroupType {
  @scala.inline
  def azureAD: typingsJapgolly.microsoftGraph.microsoftGraphStrings.azureAD = this.cast("azureAD")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def unifiedGroups: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unifiedGroups = this.cast("unifiedGroups")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

