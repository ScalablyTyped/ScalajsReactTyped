package typingsJapgolly.jsforce

import typingsJapgolly.jsforce.connectionMod.Callback
import typingsJapgolly.jsforce.salesforceObjectMod.ApprovalLayoutInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallClear extends js.Object {
  /** Returns a value from the cache if it exists, otherwise calls SObject.approvalLayouts */
  def apply(): ApprovalLayoutInfo = js.native
  def apply(callback: Callback[ApprovalLayoutInfo]): ApprovalLayoutInfo = js.native
  def clear(): Unit = js.native
}

