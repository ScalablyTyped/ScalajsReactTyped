package typingsJapgolly.ipAddress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ipAddress.ipAddressStrings.Reserved
  - typingsJapgolly.ipAddress.ipAddressStrings.`Interface local`
  - typingsJapgolly.ipAddress.ipAddressStrings.`Link local`
  - typingsJapgolly.ipAddress.ipAddressStrings.`Admin local`
  - typingsJapgolly.ipAddress.ipAddressStrings.`Site local`
  - typingsJapgolly.ipAddress.ipAddressStrings.`Organization local`
  - typingsJapgolly.ipAddress.ipAddressStrings.Global
*/
trait IPv6Scope extends js.Object

object IPv6Scope {
  @scala.inline
  def `Admin local`: typingsJapgolly.ipAddress.ipAddressStrings.`Admin local` = this.cast("Admin local")
  @scala.inline
  def Global: typingsJapgolly.ipAddress.ipAddressStrings.Global = this.cast("Global")
  @scala.inline
  def `Interface local`: typingsJapgolly.ipAddress.ipAddressStrings.`Interface local` = this.cast("Interface local")
  @scala.inline
  def `Link local`: typingsJapgolly.ipAddress.ipAddressStrings.`Link local` = this.cast("Link local")
  @scala.inline
  def `Organization local`: typingsJapgolly.ipAddress.ipAddressStrings.`Organization local` = this.cast("Organization local")
  @scala.inline
  def Reserved: typingsJapgolly.ipAddress.ipAddressStrings.Reserved = this.cast("Reserved")
  @scala.inline
  def `Site local`: typingsJapgolly.ipAddress.ipAddressStrings.`Site local` = this.cast("Site local")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

