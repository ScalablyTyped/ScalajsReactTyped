package typingsJapgolly.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.fridaGumStrings.byte
  - typingsJapgolly.fridaGum.fridaGumStrings.dword
  - typingsJapgolly.fridaGum.fridaGumStrings.qword
*/
trait X86PointerTarget extends js.Object

object X86PointerTarget {
  @scala.inline
  def byte: typingsJapgolly.fridaGum.fridaGumStrings.byte = this.cast("byte")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dword: typingsJapgolly.fridaGum.fridaGumStrings.dword = this.cast("dword")
  @scala.inline
  def qword: typingsJapgolly.fridaGum.fridaGumStrings.qword = this.cast("qword")
}

