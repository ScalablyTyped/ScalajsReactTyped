package typingsJapgolly.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.fridaGumStrings.call
  - typingsJapgolly.fridaGum.fridaGumStrings.ret
  - typingsJapgolly.fridaGum.fridaGumStrings.exec
  - typingsJapgolly.fridaGum.fridaGumStrings.block
  - typingsJapgolly.fridaGum.fridaGumStrings.compile
*/
trait StalkerEventType extends js.Object

object StalkerEventType {
  @scala.inline
  def block: typingsJapgolly.fridaGum.fridaGumStrings.block = this.cast("block")
  @scala.inline
  def call: typingsJapgolly.fridaGum.fridaGumStrings.call = this.cast("call")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compile: typingsJapgolly.fridaGum.fridaGumStrings.compile = this.cast("compile")
  @scala.inline
  def exec: typingsJapgolly.fridaGum.fridaGumStrings.exec = this.cast("exec")
  @scala.inline
  def ret: typingsJapgolly.fridaGum.fridaGumStrings.ret = this.cast("ret")
}

