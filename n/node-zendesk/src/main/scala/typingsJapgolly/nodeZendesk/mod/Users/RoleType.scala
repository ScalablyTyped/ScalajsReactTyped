package typingsJapgolly.nodeZendesk.mod.Users

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an agent type
  * 0 - Custom
  * 1 - Light
  * 2 - Chat
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeZendesk.nodeZendeskNumbers.`0`
  - typingsJapgolly.nodeZendesk.nodeZendeskNumbers.`1`
  - typingsJapgolly.nodeZendesk.nodeZendeskNumbers.`2`
*/
trait RoleType extends js.Object

object RoleType {
  @scala.inline
  def `0`: typingsJapgolly.nodeZendesk.nodeZendeskNumbers.`0` = this.cast(0)
  @scala.inline
  def `1`: typingsJapgolly.nodeZendesk.nodeZendeskNumbers.`1` = this.cast(1)
  @scala.inline
  def `2`: typingsJapgolly.nodeZendesk.nodeZendeskNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

