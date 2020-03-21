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
  - typingsJapgolly.fridaGum.fridaGumStrings.`reg-mrs`
  - typingsJapgolly.fridaGum.fridaGumStrings.`reg-msr`
  - typingsJapgolly.fridaGum.fridaGumStrings.pstate
  - typingsJapgolly.fridaGum.fridaGumStrings.sys
  - typingsJapgolly.fridaGum.fridaGumStrings.prefetch
  - typingsJapgolly.fridaGum.fridaGumStrings.barrier
*/
trait Arm64OperandType extends js.Object

object Arm64OperandType {
  @scala.inline
  def barrier: typingsJapgolly.fridaGum.fridaGumStrings.barrier = this.cast("barrier")
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
  def prefetch: typingsJapgolly.fridaGum.fridaGumStrings.prefetch = this.cast("prefetch")
  @scala.inline
  def pstate: typingsJapgolly.fridaGum.fridaGumStrings.pstate = this.cast("pstate")
  @scala.inline
  def reg: typingsJapgolly.fridaGum.fridaGumStrings.reg = this.cast("reg")
  @scala.inline
  def `reg-mrs`: typingsJapgolly.fridaGum.fridaGumStrings.`reg-mrs` = this.cast("reg-mrs")
  @scala.inline
  def `reg-msr`: typingsJapgolly.fridaGum.fridaGumStrings.`reg-msr` = this.cast("reg-msr")
  @scala.inline
  def sys: typingsJapgolly.fridaGum.fridaGumStrings.sys = this.cast("sys")
}

