package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.squareConnect.squareConnectStrings.ORDER
  - typingsJapgolly.squareConnect.squareConnectStrings.LINE_ITEM
  - typingsJapgolly.squareConnect.squareConnectStrings.OTHER_TAX_SCOPE
*/
trait TaxApplicationScopeType extends js.Object

object TaxApplicationScopeType {
  @scala.inline
  def LINE_ITEM: typingsJapgolly.squareConnect.squareConnectStrings.LINE_ITEM = this.cast("LINE_ITEM")
  @scala.inline
  def ORDER: typingsJapgolly.squareConnect.squareConnectStrings.ORDER = this.cast("ORDER")
  @scala.inline
  def OTHER_TAX_SCOPE: typingsJapgolly.squareConnect.squareConnectStrings.OTHER_TAX_SCOPE = this.cast("OTHER_TAX_SCOPE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

