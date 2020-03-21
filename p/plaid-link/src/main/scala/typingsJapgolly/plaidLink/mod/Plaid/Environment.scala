package typingsJapgolly.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.plaidLink.plaidLinkStrings.development
  - typingsJapgolly.plaidLink.plaidLinkStrings.sandbox
  - typingsJapgolly.plaidLink.plaidLinkStrings.production
*/
trait Environment extends js.Object

object Environment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def development: typingsJapgolly.plaidLink.plaidLinkStrings.development = this.cast("development")
  @scala.inline
  def production: typingsJapgolly.plaidLink.plaidLinkStrings.production = this.cast("production")
  @scala.inline
  def sandbox: typingsJapgolly.plaidLink.plaidLinkStrings.sandbox = this.cast("sandbox")
}

