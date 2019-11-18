package typingsJapgolly.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.aix
  - typings.node.nodeStrings.android
  - typings.node.nodeStrings.darwin
  - typings.node.nodeStrings.freebsd
  - typings.node.nodeStrings.linux
  - typings.node.nodeStrings.openbsd
  - typings.node.nodeStrings.sunos
  - typings.node.nodeStrings.win32
  - typings.node.nodeStrings.cygwin
  - typings.node.nodeStrings.netbsd
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  def aix: typingsJapgolly.node.nodeStrings.aix = this.cast("aix")
  @scala.inline
  def android: typingsJapgolly.node.nodeStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cygwin: typingsJapgolly.node.nodeStrings.cygwin = this.cast("cygwin")
  @scala.inline
  def darwin: typingsJapgolly.node.nodeStrings.darwin = this.cast("darwin")
  @scala.inline
  def freebsd: typingsJapgolly.node.nodeStrings.freebsd = this.cast("freebsd")
  @scala.inline
  def linux: typingsJapgolly.node.nodeStrings.linux = this.cast("linux")
  @scala.inline
  def netbsd: typingsJapgolly.node.nodeStrings.netbsd = this.cast("netbsd")
  @scala.inline
  def openbsd: typingsJapgolly.node.nodeStrings.openbsd = this.cast("openbsd")
  @scala.inline
  def sunos: typingsJapgolly.node.nodeStrings.sunos = this.cast("sunos")
  @scala.inline
  def win32: typingsJapgolly.node.nodeStrings.win32 = this.cast("win32")
}

