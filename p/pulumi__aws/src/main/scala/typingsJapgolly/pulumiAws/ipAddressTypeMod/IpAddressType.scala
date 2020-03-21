package typingsJapgolly.pulumiAws.ipAddressTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.ipv4
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.dualstack
*/
trait IpAddressType extends js.Object

object IpAddressType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dualstack: typingsJapgolly.pulumiAws.pulumiAwsStrings.dualstack = this.cast("dualstack")
  @scala.inline
  def ipv4: typingsJapgolly.pulumiAws.pulumiAwsStrings.ipv4 = this.cast("ipv4")
}

