package typingsJapgolly.electronPackager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.electronPackager.electronPackagerStrings.ia32
  - typingsJapgolly.electronPackager.electronPackagerStrings.x64
  - typingsJapgolly.electronPackager.electronPackagerStrings.armv7l
  - typingsJapgolly.electronPackager.electronPackagerStrings.arm64
  - typingsJapgolly.electronPackager.electronPackagerStrings.mips64el
  - typingsJapgolly.electronPackager.electronPackagerStrings.all
*/
trait arch extends js.Object

object arch {
  @scala.inline
  def all: typingsJapgolly.electronPackager.electronPackagerStrings.all = this.cast("all")
  @scala.inline
  def arm64: typingsJapgolly.electronPackager.electronPackagerStrings.arm64 = this.cast("arm64")
  @scala.inline
  def armv7l: typingsJapgolly.electronPackager.electronPackagerStrings.armv7l = this.cast("armv7l")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ia32: typingsJapgolly.electronPackager.electronPackagerStrings.ia32 = this.cast("ia32")
  @scala.inline
  def mips64el: typingsJapgolly.electronPackager.electronPackagerStrings.mips64el = this.cast("mips64el")
  @scala.inline
  def x64: typingsJapgolly.electronPackager.electronPackagerStrings.x64 = this.cast("x64")
}

