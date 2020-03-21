package typingsJapgolly.bleno.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bleno.blenoStrings.poweredOn
  - typingsJapgolly.bleno.blenoStrings.poweredOff
  - typingsJapgolly.bleno.blenoStrings.unauthorized
  - typingsJapgolly.bleno.blenoStrings.unsupported
  - typingsJapgolly.bleno.blenoStrings.unknown
  - typingsJapgolly.bleno.blenoStrings.resetting
*/
trait State extends js.Object

object State {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def poweredOff: typingsJapgolly.bleno.blenoStrings.poweredOff = this.cast("poweredOff")
  @scala.inline
  def poweredOn: typingsJapgolly.bleno.blenoStrings.poweredOn = this.cast("poweredOn")
  @scala.inline
  def resetting: typingsJapgolly.bleno.blenoStrings.resetting = this.cast("resetting")
  @scala.inline
  def unauthorized: typingsJapgolly.bleno.blenoStrings.unauthorized = this.cast("unauthorized")
  @scala.inline
  def unknown: typingsJapgolly.bleno.blenoStrings.unknown = this.cast("unknown")
  @scala.inline
  def unsupported: typingsJapgolly.bleno.blenoStrings.unsupported = this.cast("unsupported")
}

