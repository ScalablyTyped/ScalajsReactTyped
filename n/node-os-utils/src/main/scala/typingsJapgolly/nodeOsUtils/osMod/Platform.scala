package typingsJapgolly.nodeOsUtils.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.aix
  - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.android
  - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.darwin
  - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.freebsd
  - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.linux
  - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.openbsd
  - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.sunos
  - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.win32
  - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.cygwin
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  def aix: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.aix = this.cast("aix")
  @scala.inline
  def android: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cygwin: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.cygwin = this.cast("cygwin")
  @scala.inline
  def darwin: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.darwin = this.cast("darwin")
  @scala.inline
  def freebsd: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.freebsd = this.cast("freebsd")
  @scala.inline
  def linux: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.linux = this.cast("linux")
  @scala.inline
  def openbsd: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.openbsd = this.cast("openbsd")
  @scala.inline
  def sunos: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.sunos = this.cast("sunos")
  @scala.inline
  def win32: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.win32 = this.cast("win32")
}

