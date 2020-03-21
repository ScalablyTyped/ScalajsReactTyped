package typingsJapgolly.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.fridaGumStrings.ia32
  - typingsJapgolly.fridaGum.fridaGumStrings.x64
  - typingsJapgolly.fridaGum.fridaGumStrings.arm
  - typingsJapgolly.fridaGum.fridaGumStrings.arm64
  - typingsJapgolly.fridaGum.fridaGumStrings.mips
*/
trait Architecture extends js.Object

object Architecture {
  @scala.inline
  def arm: typingsJapgolly.fridaGum.fridaGumStrings.arm = this.cast("arm")
  @scala.inline
  def arm64: typingsJapgolly.fridaGum.fridaGumStrings.arm64 = this.cast("arm64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ia32: typingsJapgolly.fridaGum.fridaGumStrings.ia32 = this.cast("ia32")
  @scala.inline
  def mips: typingsJapgolly.fridaGum.fridaGumStrings.mips = this.cast("mips")
  @scala.inline
  def x64: typingsJapgolly.fridaGum.fridaGumStrings.x64 = this.cast("x64")
}

