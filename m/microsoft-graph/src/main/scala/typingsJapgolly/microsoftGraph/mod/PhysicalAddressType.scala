package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.home
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.business
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.other
*/
trait PhysicalAddressType extends js.Object

object PhysicalAddressType {
  @scala.inline
  def business: typingsJapgolly.microsoftGraph.microsoftGraphStrings.business = this.cast("business")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def home: typingsJapgolly.microsoftGraph.microsoftGraphStrings.home = this.cast("home")
  @scala.inline
  def other: typingsJapgolly.microsoftGraph.microsoftGraphStrings.other = this.cast("other")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

