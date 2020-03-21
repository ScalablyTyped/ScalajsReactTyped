package typingsJapgolly.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.fridaGumStrings.default
  - typingsJapgolly.fridaGum.fridaGumStrings.sysv
  - typingsJapgolly.fridaGum.fridaGumStrings.stdcall
  - typingsJapgolly.fridaGum.fridaGumStrings.thiscall
  - typingsJapgolly.fridaGum.fridaGumStrings.fastcall
  - typingsJapgolly.fridaGum.fridaGumStrings.mscdecl
  - typingsJapgolly.fridaGum.fridaGumStrings.win64
  - typingsJapgolly.fridaGum.fridaGumStrings.unix64
  - typingsJapgolly.fridaGum.fridaGumStrings.vfp
*/
trait NativeABI extends js.Object

object NativeABI {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.fridaGum.fridaGumStrings.default = this.cast("default")
  @scala.inline
  def fastcall: typingsJapgolly.fridaGum.fridaGumStrings.fastcall = this.cast("fastcall")
  @scala.inline
  def mscdecl: typingsJapgolly.fridaGum.fridaGumStrings.mscdecl = this.cast("mscdecl")
  @scala.inline
  def stdcall: typingsJapgolly.fridaGum.fridaGumStrings.stdcall = this.cast("stdcall")
  @scala.inline
  def sysv: typingsJapgolly.fridaGum.fridaGumStrings.sysv = this.cast("sysv")
  @scala.inline
  def thiscall: typingsJapgolly.fridaGum.fridaGumStrings.thiscall = this.cast("thiscall")
  @scala.inline
  def unix64: typingsJapgolly.fridaGum.fridaGumStrings.unix64 = this.cast("unix64")
  @scala.inline
  def vfp: typingsJapgolly.fridaGum.fridaGumStrings.vfp = this.cast("vfp")
  @scala.inline
  def win64: typingsJapgolly.fridaGum.fridaGumStrings.win64 = this.cast("win64")
}

