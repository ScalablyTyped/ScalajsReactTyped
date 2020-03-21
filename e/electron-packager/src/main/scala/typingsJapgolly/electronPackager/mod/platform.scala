package typingsJapgolly.electronPackager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.electronPackager.electronPackagerStrings.linux
  - typingsJapgolly.electronPackager.electronPackagerStrings.win32
  - typingsJapgolly.electronPackager.electronPackagerStrings.darwin
  - typingsJapgolly.electronPackager.electronPackagerStrings.mas
  - typingsJapgolly.electronPackager.electronPackagerStrings.all
*/
trait platform extends js.Object

object platform {
  @scala.inline
  def all: typingsJapgolly.electronPackager.electronPackagerStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def darwin: typingsJapgolly.electronPackager.electronPackagerStrings.darwin = this.cast("darwin")
  @scala.inline
  def linux: typingsJapgolly.electronPackager.electronPackagerStrings.linux = this.cast("linux")
  @scala.inline
  def mas: typingsJapgolly.electronPackager.electronPackagerStrings.mas = this.cast("mas")
  @scala.inline
  def win32: typingsJapgolly.electronPackager.electronPackagerStrings.win32 = this.cast("win32")
}

