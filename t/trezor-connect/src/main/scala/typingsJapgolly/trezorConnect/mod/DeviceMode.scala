package typingsJapgolly.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.trezorConnect.trezorConnectStrings.normal
  - typingsJapgolly.trezorConnect.trezorConnectStrings.bootloader
  - typingsJapgolly.trezorConnect.trezorConnectStrings.initialize
  - typingsJapgolly.trezorConnect.trezorConnectStrings.seedless
*/
trait DeviceMode extends js.Object

object DeviceMode {
  @scala.inline
  def bootloader: typingsJapgolly.trezorConnect.trezorConnectStrings.bootloader = this.cast("bootloader")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def initialize: typingsJapgolly.trezorConnect.trezorConnectStrings.initialize = this.cast("initialize")
  @scala.inline
  def normal: typingsJapgolly.trezorConnect.trezorConnectStrings.normal = this.cast("normal")
  @scala.inline
  def seedless: typingsJapgolly.trezorConnect.trezorConnectStrings.seedless = this.cast("seedless")
}

