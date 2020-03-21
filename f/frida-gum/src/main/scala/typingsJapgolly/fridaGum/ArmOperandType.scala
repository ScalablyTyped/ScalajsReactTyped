package typingsJapgolly.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.fridaGumStrings.reg
  - typingsJapgolly.fridaGum.fridaGumStrings.imm
  - typingsJapgolly.fridaGum.fridaGumStrings.mem
  - typingsJapgolly.fridaGum.fridaGumStrings.fp
  - typingsJapgolly.fridaGum.fridaGumStrings.cimm
  - typingsJapgolly.fridaGum.fridaGumStrings.pimm
  - typingsJapgolly.fridaGum.fridaGumStrings.setend
  - typingsJapgolly.fridaGum.fridaGumStrings.sysreg
*/
trait ArmOperandType extends js.Object

object ArmOperandType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cimm: typingsJapgolly.fridaGum.fridaGumStrings.cimm = this.cast("cimm")
  @scala.inline
  def fp: typingsJapgolly.fridaGum.fridaGumStrings.fp = this.cast("fp")
  @scala.inline
  def imm: typingsJapgolly.fridaGum.fridaGumStrings.imm = this.cast("imm")
  @scala.inline
  def mem: typingsJapgolly.fridaGum.fridaGumStrings.mem = this.cast("mem")
  @scala.inline
  def pimm: typingsJapgolly.fridaGum.fridaGumStrings.pimm = this.cast("pimm")
  @scala.inline
  def reg: typingsJapgolly.fridaGum.fridaGumStrings.reg = this.cast("reg")
  @scala.inline
  def setend: typingsJapgolly.fridaGum.fridaGumStrings.setend = this.cast("setend")
  @scala.inline
  def sysreg: typingsJapgolly.fridaGum.fridaGumStrings.sysreg = this.cast("sysreg")
}

