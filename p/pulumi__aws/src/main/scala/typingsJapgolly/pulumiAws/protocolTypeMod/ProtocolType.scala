package typingsJapgolly.pulumiAws.protocolTypeMod

import typingsJapgolly.pulumiAws.pulumiAwsStrings.all_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.all_
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.icmp
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.tcp
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.udp
*/
trait ProtocolType extends js.Object

object ProtocolType {
  @scala.inline
  def all: all_ = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def icmp: typingsJapgolly.pulumiAws.pulumiAwsStrings.icmp = this.cast("icmp")
  @scala.inline
  def tcp: typingsJapgolly.pulumiAws.pulumiAwsStrings.tcp = this.cast("tcp")
  @scala.inline
  def udp: typingsJapgolly.pulumiAws.pulumiAwsStrings.udp = this.cast("udp")
}

