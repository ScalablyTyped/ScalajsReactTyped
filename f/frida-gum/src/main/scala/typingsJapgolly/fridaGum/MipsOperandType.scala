package typingsJapgolly.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.fridaGumStrings.reg
  - typingsJapgolly.fridaGum.fridaGumStrings.imm
  - typingsJapgolly.fridaGum.fridaGumStrings.mem
*/
trait MipsOperandType extends js.Object

object MipsOperandType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imm: typingsJapgolly.fridaGum.fridaGumStrings.imm = this.cast("imm")
  @scala.inline
  def mem: typingsJapgolly.fridaGum.fridaGumStrings.mem = this.cast("mem")
  @scala.inline
  def reg: typingsJapgolly.fridaGum.fridaGumStrings.reg = this.cast("reg")
}

