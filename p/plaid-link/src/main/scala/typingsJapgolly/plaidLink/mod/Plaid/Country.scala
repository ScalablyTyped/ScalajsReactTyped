package typingsJapgolly.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.plaidLink.plaidLinkStrings.US
  - typingsJapgolly.plaidLink.plaidLinkStrings.CA
  - typingsJapgolly.plaidLink.plaidLinkStrings.GB
*/
trait Country extends js.Object

object Country {
  @scala.inline
  def CA: typingsJapgolly.plaidLink.plaidLinkStrings.CA = this.cast("CA")
  @scala.inline
  def GB: typingsJapgolly.plaidLink.plaidLinkStrings.GB = this.cast("GB")
  @scala.inline
  def US: typingsJapgolly.plaidLink.plaidLinkStrings.US = this.cast("US")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

