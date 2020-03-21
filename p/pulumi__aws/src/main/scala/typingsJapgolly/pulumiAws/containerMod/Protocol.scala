package typingsJapgolly.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.tcp
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.udp
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tcp: typingsJapgolly.pulumiAws.pulumiAwsStrings.tcp = this.cast("tcp")
  @scala.inline
  def udp: typingsJapgolly.pulumiAws.pulumiAwsStrings.udp = this.cast("udp")
}

