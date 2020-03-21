package typingsJapgolly.ipaddrJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ipaddrJs.ipaddrJsStrings.unicast
  - typingsJapgolly.ipaddrJs.ipaddrJsStrings.unspecified
  - typingsJapgolly.ipaddrJs.ipaddrJsStrings.broadcast
  - typingsJapgolly.ipaddrJs.ipaddrJsStrings.multicast
  - typingsJapgolly.ipaddrJs.ipaddrJsStrings.linkLocal
  - typingsJapgolly.ipaddrJs.ipaddrJsStrings.loopback
  - typingsJapgolly.ipaddrJs.ipaddrJsStrings.carrierGradeNat
  - typingsJapgolly.ipaddrJs.ipaddrJsStrings.`private`
  - typingsJapgolly.ipaddrJs.ipaddrJsStrings.reserved
*/
trait IPv4Range extends js.Object

object IPv4Range {
  @scala.inline
  def broadcast: typingsJapgolly.ipaddrJs.ipaddrJsStrings.broadcast = this.cast("broadcast")
  @scala.inline
  def carrierGradeNat: typingsJapgolly.ipaddrJs.ipaddrJsStrings.carrierGradeNat = this.cast("carrierGradeNat")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linkLocal: typingsJapgolly.ipaddrJs.ipaddrJsStrings.linkLocal = this.cast("linkLocal")
  @scala.inline
  def loopback: typingsJapgolly.ipaddrJs.ipaddrJsStrings.loopback = this.cast("loopback")
  @scala.inline
  def multicast: typingsJapgolly.ipaddrJs.ipaddrJsStrings.multicast = this.cast("multicast")
  @scala.inline
  def `private`: typingsJapgolly.ipaddrJs.ipaddrJsStrings.`private` = this.cast("private")
  @scala.inline
  def reserved: typingsJapgolly.ipaddrJs.ipaddrJsStrings.reserved = this.cast("reserved")
  @scala.inline
  def unicast: typingsJapgolly.ipaddrJs.ipaddrJsStrings.unicast = this.cast("unicast")
  @scala.inline
  def unspecified: typingsJapgolly.ipaddrJs.ipaddrJsStrings.unspecified = this.cast("unspecified")
}

